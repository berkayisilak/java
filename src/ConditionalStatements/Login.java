package ConditionalStatements;

import java.util.Scanner;

public class Login {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        String userName, password, newPassword, resetToken;
        boolean reset = false;

        System.out.print("Kullanıcı Adınız: ");
        userName = input.nextLine();

        System.out.print("Şifreniz: ");
        password = input.nextLine();

        if (userName.equals("patika") && password.equals("java1234")) {
            System.out.print("Giriş yaptınız! ");
        } else {
            System.out.println("Şifreniz yanlış ");
            reset = true;
        }

        if (reset == true) {
            System.out.println("Şifrenizi sıfırlamak ister misiniz? ");
            System.out.println("1 - Evet\n2 - Hayır");
            resetToken = input.nextLine();
            if (resetToken.equals("1")) {
                System.out.print("Yeni şifrenizi giriniz: ");
                newPassword = input.nextLine();

                if (newPassword.equals("java123")) {
                    System.out.println("Yeni belirlediğiniz şifre eskisinden farklı olmalıdır. Lütfen başka şifre giriniz");
                } else {
                    System.out.println("Şifre oluşturuldu");
                }
            } else {
                System.out.println("Bye");
            }
        }
    }
}
