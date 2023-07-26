package AdventureGame;

import java.util.Random;

public abstract class BattleLoc extends Location{
    private Obstacle obstacle;
    private String award;
    private int maxObstacle;
    public BattleLoc(Player player, String name, Obstacle obstacle, String award, int maxObstacle) {
        super(player, name);
        this.obstacle = obstacle;
        this.award = award;
        this.maxObstacle = maxObstacle;
    }

    @Override
    public boolean onLocation() {
        int obsNumber = this.randomObstacleRandom();
        System.out.println("Şuan buradasınız: " + this.getName());
        System.out.println("Dikkatli Ol! Burada " + obsNumber + " " + this.getObstacle().getName() + " yaşıyor!");
        System.out.print("Savaşmak için (S), Kaçmak için (K): ");
        String selectCase = scan.nextLine();
        selectCase = selectCase.toUpperCase();
        if (selectCase.equals("S")) {
            if (combat(obsNumber)){
                System.out.println(this.getName() + " tüm düşmanları yendiniz");
                return true;
            }
        }
        if (this.getPlayer().getHealth() <= 0) {
            System.out.println("Öldünüz");
            return false;
        }
        return true;
    }

    public boolean combat(int obsNumber) {
        for (int i = 1; i <= obsNumber; i++) {
            this.getObstacle().setHealth(this.getObstacle().getOrjinalHealth());
            playerStats();
            obstaclesStats(i);
            while (this.getPlayer().getHealth() > 0 && this.getObstacle().getHealth() > 0) {
                System.out.print("Vurmak için (V), Kaçmak için (K): ");
                String selectCombat = scan.nextLine().toUpperCase();
                boolean first = isFirst();
                System.out.println(first);
                if (first) {
                    if (selectCombat.equals("V")) {
                        System.out.println("Siz vurdunuz!");
                        this.getObstacle().setHealth(this.obstacle.getHealth() - this.getPlayer().getTotalDamage());
                        afterHit();
                        if (this.getObstacle().getHealth() > 0) {
                            System.out.println("Canavar size vurdu!");
                            int obstacleDamage = this.getObstacle().getDamage() - this.getPlayer().getInventory().getArmor().getBlock();
                            if (obstacleDamage < 0) {
                                obstacleDamage = 0;
                            }
                            this.getPlayer().setHealth(this.getPlayer().getHealth() - obstacleDamage);
                            afterHit();
                        }
                    } else {
                        return false;
                    }
                } else {
                    if (selectCombat.equals("V")) {
                        System.out.println("Canavar size vurdu!");
                        if (this.getObstacle().getHealth() > 0) {
                            int obstacleDamage = this.getObstacle().getDamage() - this.getPlayer().getInventory().getArmor().getBlock();
                            if (obstacleDamage < 0) {
                                obstacleDamage = 0;
                            }
                            this.getPlayer().setHealth(this.getPlayer().getHealth() - obstacleDamage);
                            afterHit();
                        }
                        System.out.println("Siz vurdunuz!");
                        this.getObstacle().setHealth(this.obstacle.getHealth() - this.getPlayer().getTotalDamage());
                        afterHit();
                    } else {
                        return false;
                    }
                }
            }
            if (this.getObstacle().getHealth() < this.getPlayer().getHealth()) {
                System.out.println("Düşmanı yendiniz!");
                switch (this.getAward()) {
                    case "food":
                        this.getPlayer().getInventory().setFood(true);
                        break;
                    case "firewood":
                        this.getPlayer().getInventory().setFirewood(true);
                        break;
                    case "water":
                        this.getPlayer().getInventory().setWater(true);
                        break;
                    case "award":
                        if(this.getObstacle().getId() == 4){
                            System.out.println(this.getObstacle().getName() + " alt edildi!!!");
                            int yy = randomNumber();
                            if(yy >= 0 && yy <= 14){
                                System.out.println("Tebrikler bu yılandan silah itemi düştü.");
                                int zz = randomNumber();
                                if(zz >= 0 && zz <= 19){

                                    int selectWeaponID = 3;
                                    Weapon selectedWeapon = Weapon.getWeaponObjById(selectWeaponID);
                                    this.getPlayer().getInventory().setWeapon(selectedWeapon);
                                    System.out.println("Kazanılan silah: " + this.getPlayer().getInventory().getWeapon().getName());
                                }
                                else if(zz >=20 && zz <=49){

                                    int selectWeaponID = 2;
                                    Weapon selectedWeapon = Weapon.getWeaponObjById(selectWeaponID);
                                    this.getPlayer().getInventory().setWeapon(selectedWeapon);
                                    System.out.println("Kazanılan silah: " + this.getPlayer().getInventory().getWeapon().getName());
                                }
                                else{

                                    int selectWeaponID = 1;
                                    Weapon selectedWeapon = Weapon.getWeaponObjById(selectWeaponID);
                                    this.getPlayer().getInventory().setWeapon(selectedWeapon);
                                    System.out.println("Kazanılan silah: " + this.getPlayer().getInventory().getWeapon().getName());
                                }
                            }
                            else if(yy >=15 && yy <=29){
                                System.out.println("Tebrikler bu yılandan zırh itemi düştü.");
                                int zz = randomNumber();
                                if(zz >= 0 && zz <= 19){

                                    int selectArmorID = 3;
                                    Armor selectedArmor = Armor.getArmorObjById(selectArmorID);
                                    this.getPlayer().getInventory().setArmor(selectedArmor);
                                    System.out.println("Kazanılan zırh: " + this.getPlayer().getInventory().getArmor().getName());
                                }
                                else if(zz >=20 && zz <=49){

                                    int selectArmorID = 2;
                                    Armor selectedArmor = Armor.getArmorObjById(selectArmorID);
                                    this.getPlayer().getInventory().setArmor(selectedArmor);
                                    System.out.println("Kazanılan zırh: " + this.getPlayer().getInventory().getArmor().getName());
                                }
                                else{

                                    int selectArmorID = 1;
                                    Armor selectedArmor = Armor.getArmorObjById(selectArmorID);
                                    this.getPlayer().getInventory().setArmor(selectedArmor);
                                    System.out.println("Kazanılan zırh: " + this.getPlayer().getInventory().getArmor().getName());
                                }
                            }
                            else if(yy >= 30 && yy <= 54){
                                System.out.println("Tebrikler bu yılandan para düştü.");
                                int zz = randomNumber();
                                if(zz >= 0 && zz <= 19){
                                    this.getPlayer().setMoney(this.getPlayer().getMoney() + 10);
                                    System.out.println("Kazanılan para: 10");
                                }
                                else if(zz >=20 && zz <=49){
                                    this.getPlayer().setMoney(this.getPlayer().getMoney() + 5);
                                    System.out.println("Kazanılan para: 5");
                                }
                                else{
                                    this.getPlayer().setMoney(this.getPlayer().getMoney() + 1);
                                    System.out.println("Kazanılan para: 1");
                                }
                            }
                            else{
                                System.out.println("Bu yılandan hiçbir eşya veya para düşmedi :(");
                            }
                        }
                        else if(this.getObstacle().getHealth() < this.getPlayer().getHealth()){
                            System.out.println(this.getObstacle().getName() + " alt edildi!!!");
                            System.out.println(this.getObstacle().getAward() + " para kazandınız!!!");
                            this.getPlayer().setMoney(this.getPlayer().getMoney() + this.getObstacle().getAward());
                            System.out.println("Güncel paranız: " + this.getPlayer().getMoney());
                        }
                        else{
                            return false;
                        }
                        break;
                }
                System.out.println(this.getObstacle().getAward() + " para kazandınız!");
                this.getPlayer().setMoney(this.getPlayer().getMoney() + this.getObstacle().getAward());
                System.out.println("Güncel paranız: " + this.getPlayer().getMoney());
            } else {
                return false;
            }
        }
        return false;
    }

    public boolean isFirst() {
        double randomFirst = Math.random() * 100;
        return (randomFirst <= 50) ? true : false;
    }

    public void afterHit() {
        System.out.println("Canınız: " + this.getPlayer().getHealth());
        System.out.println(this.getObstacle().getName() + " Canı: " + this.getObstacle().getHealth());
        System.out.println("----------------------------------------------------------------------");
    }

    public void playerStats() {
        System.out.println("Oyuncu değerleri");
        System.out.println("----------------------------------------------------------------------");
        System.out.println("Sağlık: " + this.getPlayer().getHealth());
        System.out.println("Silah: " + this.getPlayer().getInventory().getWeapon().getName());
        System.out.println("Hasar: " + this.getPlayer().getTotalDamage());
        System.out.println("Zırh: " + this.getPlayer().getInventory().getArmor().getName());
        System.out.println("Engelleme: " + this.getPlayer().getInventory().getArmor().getBlock());
        System.out.println("Para: " + this.getPlayer().getMoney());
        System.out.println("----------------------------------------------------------------------");
    }

    public void obstaclesStats(int i) {
        System.out.println(i + "." + this.getObstacle().getName() + " değerleri");
        System.out.println("----------------------------------------------------------------------");
        System.out.println("Sağlık: " + this.getObstacle().getHealth());
        System.out.println("Hasar: " + this.getObstacle().getDamage());
        System.out.println("Para: " + this.getObstacle().getAward());
        System.out.println("----------------------------------------------------------------------");

    }

    public int randomObstacleRandom() {
        Random r = new Random();
        return r.nextInt(this.getMaxObstacle()) + 1;
    }

    public int randomNumber() {
        Random rand = new Random();
        int r = rand.nextInt(100);
        return r;
    }

    public Obstacle getObstacle() {
        return obstacle;
    }

    public void setObstacle(Obstacle obstacle) {
        this.obstacle = obstacle;
    }

    public String getAward() {
        return award;
    }

    public void setAward(String award) {
        this.award = award;
    }

    public int getMaxObstacle() {
        return maxObstacle;
    }

    public void setMaxObstacle(int maxObstacle) {
        this.maxObstacle = maxObstacle;
    }
}
