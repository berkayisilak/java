import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String userName, password;
        int count = 3, select, price, balance = 8500;

        do {
            System.out.print("Kullanıcı adınızı giriniz: ");
            userName = input.nextLine();

            System.out.print("Şifrenizi giriniz: ");
            password = input.nextLine();

            if (userName.equals("patika") && password.equals("java123")) {
                System.out.println("Sisteme giriş yaptınız. ");
                
                do {
                    System.out.print(
                            "1-Para yatırma\n" +
                            "2-Para Çekme\n" +
                            "3-Bakiye Sorgula\n" +
                            "4-Çıkış Yap\n");
                    System.out.print("Yapmak istediğiniz işlemi seçiniz: ");
                    select = input.nextInt();

                    switch (select) {
                        case 1:
                            System.out.print("Para miktarı : ");
                            price = input.nextInt();
                            balance += price;
                            System.out.println("Bakiyeniz : " + balance);
                            break;

                        case 2:
                            System.out.print("Para miktarı : ");
                            price = input.nextInt();

                            if (balance >= price) {
                                balance -= price;
                                System.out.println("Bakiyeniz : " + balance);
                            } else {
                                System.out.println("Bakiye yetersiz.");
                            }
                            break;

                        case 3:
                            System.out.println("Bakiyeniz : " + balance);
                            break;
                    }
                } while (select != 4);
                System.out.println("Tekrar görüşmek üzere.");
                break;
            } else {
                count--;
                System.out.println("Giriş bilgilerinizi kontrol ediniz. ");
                if (count == 0) {
                    System.out.println("Hesabınız bloke olmuştur lütfen banka ile iletişime geçiniz.");
                } else {
                    System.out.println("Kalan Hakkınız : " + count);
                }
            }
        } while (count > 0);
    }
}
