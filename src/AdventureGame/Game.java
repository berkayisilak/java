package AdventureGame;

import java.util.Scanner;

public class Game {
    private Scanner scan = new Scanner(System.in);
    public Player player;
    public Location location;

    public void start() {
        System.out.println("Macera Oyununa Hoşgeldiniz!");
        System.out.print("Lütfen bir isim giriniz: ");
        String playerName = scan.nextLine();
        Player player = new Player(playerName);
        System.out.println(player.getName() + " Hoşgeldiniz !");
        System.out.println("Lütfen bir karakter seçiniz !");
        player.selectChar();

        Location location = null;
        while (true) {
            player.printInfo();
            System.out.println("\nBölgeler\n");
            System.out.println("1 - Güvenli Ev - Burası sizin için güvenli bir ev, düşman yoktur!");
            System.out.println("2 - Eşya Dükkanı - Silah veya zırh satın alabilirsiniz");
            System.out.println("3 - Mağara - Ödül - Yemek");
            System.out.println("4 - Orman - Ödül - Odun");
            System.out.println("5 - Nehir - Ödül - Su");
            System.out.println("0 - Çıkış Yap");
            System.out.print("Lütfen gitmek istediğiniz bölgeyi seçiniz: ");
            int selectLocation = scan.nextInt();
            switch (selectLocation) {
                case 0:
                location = null;
                break;
                case 1:
                    location = new SafeHouse(player);
                    break;
                case 2:
                    location = new ToolStore(player);
                    break;
                case 3:
                    location = new Cave(player);
                    break;
                case 4:
                    location = new Forest(player);
                    break;
                case 5:
                    location = new River(player);
                    break;
                default:
                    System.out.println("Geçerli bir bölge giriniz!");
            }
            if (location == null) {
                System.out.println("Görüşmek üzere");
                break;
            }
            if (!location.onLocation()) {
                System.out.println("Öldünüz");
                break;
            }
        }
    }
}
