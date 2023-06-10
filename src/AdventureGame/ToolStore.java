package AdventureGame;

public class ToolStore extends NormalLoc{
    public ToolStore(Player player) {
        super(player, "Mağaza");
    }

    @Override
    public boolean onLocation() {
        System.out.println("Mağazaya Hoşgeldiniz!");
        boolean showMenu = true;
        while (showMenu) {
            System.out.println("1 - Silahşar");
            System.out.println("2 - Zırhlar");
            System.out.println("3 - Çıkış Yap");
            System.out.print("Seçiminiz: ");
            int selectCase = scan.nextInt();
            while (selectCase < 1 || selectCase > 3) {
                System.out.println("Geçersiz değer, tekrar giriniz: ");
                selectCase = scan.nextInt();
            }
            switch (selectCase) {
                case 1:
                    printWeapon();
                    buyWeapon();
                    break;
                case 2:
                    printArmor();
                    buyArmor();
                    break;
                case 3:
                    System.out.println("Bir daha bekleriz!");
                    showMenu = false;
                    break;
            }
        }
        return true;
    }

    public void printWeapon() {
        System.out.println("\nSilahlar\n");
        for (Weapon weapon: Weapon.weapons()) {
            System.out.println(weapon.getId() + " - " + weapon.getName() + ", Para: " + weapon.getPrice() + ", Hasar: " + weapon.getDamage());
        }
        System.out.println("0 - Çıkış yap");
    }

    public void buyWeapon() {
        System.out.print("Bir silah seçiniz: ");

        int selectWeaponID = scan.nextInt();
        while (selectWeaponID < 0 || selectWeaponID > Weapon.weapons().length) {
            System.out.println("Geçersiz değer, tekrar giriniz: ");
            selectWeaponID = scan.nextInt();
        }
        if (selectWeaponID != 0) {
            Weapon selectedWeapon = Weapon.getWeaponObjById(selectWeaponID);

            if (selectedWeapon != null) {
                if (selectedWeapon.getPrice() > this.getPlayer().getMoney()) {
                    System.out.println("Yeterli paranız bulunmamaktadır!");
                } else {
                    //Purchase Weapon
                    System.out.println(selectedWeapon.getName() + " silahını satın alındı");
                    int balance = this.getPlayer().getMoney() - selectedWeapon.getPrice();
                    this.getPlayer().setMoney(balance);
                    System.out.println("Kalan bakiyeniz: " + this.getPlayer().getMoney());
                    this.getPlayer().getInventory().setWeapon(selectedWeapon);
                }
            }
        }


    }

    public void printArmor() {
        System.out.println("\nZırhlar\n");
        for (Armor armor: Armor.armors()) {
            System.out.println(armor.getId() + " - " + armor.getName() + ", Para: " + armor.getPrice() + ", Zırh: " + armor.getBlock());
        }
        System.out.println("0 - Çıkış yap");
    }

    public void buyArmor() {
        System.out.print("Bir zırh seçiniz: ");
        int selectedArmorId = scan.nextInt();

        while (selectedArmorId < 0 || selectedArmorId > Armor.armors().length) {
            System.out.println("Geçersiz değer, tekrar giriniz: ");
            selectedArmorId = scan.nextInt();
        }
        if (selectedArmorId != 0) {
            Armor selectedArmor = Armor.getArmorObjById(selectedArmorId);

            if (selectedArmor != null) {
                if (selectedArmor.getPrice() > this.getPlayer().getMoney()) {
                    System.out.println("Yeterli paranız bulunmamaktadır!");
                } else {
                    //Purchase Armor
                    System.out.println(selectedArmor.getName() + " zırhını satın alındı");
                    this.getPlayer().setMoney(this.getPlayer().getMoney() - selectedArmor.getPrice());
                    System.out.println("Kalan bakiyeniz: " + this.getPlayer().getMoney());
                    this.getPlayer().getInventory().setArmor(selectedArmor);
                }
            }
        }
    }
}
