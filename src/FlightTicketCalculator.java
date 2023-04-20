import java.util.Scanner;

public class FlightTicketCalculator {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        int km, age, type;
        double amount;

        System.out.print("Mesafeyi km türünden giriniz: ");
        km = input.nextInt();

        System.out.print("Yaşınızı giriniz: ");
        age = input.nextInt();

        System.out.print("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş ): ");
        type = input.nextInt();

        amount = km * 0.10;
        if (age < 12) {
            amount -= (amount * 0.5);
            if (type == 1) {
                amount = amount;
                System.out.print("Toplam tutar: " + amount + " TL");
            } else if (type == 2) {
                amount -= (amount * 0.2);
                amount *= 2;
                System.out.print("Toplam tutar: " + amount + " TL");
            } else {
                System.out.print("Hatalı veri girdiniz! ");
            }
        } else if (age >=12 && age < 24) {
            amount -= (amount * 0.1);
            if (type == 1) {
                amount = amount;
                System.out.print("Toplam tutar: " + amount + " TL");
            } else if (type == 2) {
                amount -= (amount * 0.2);
                amount *= 2;
                System.out.print("Toplam tutar: " + amount + " TL");
            } else {
                System.out.print("Hatalı veri girdiniz! ");
            }
        } else if (age > 65) {
            amount -= (amount * 0.3);
            if (type == 1) {
                amount = amount;
                System.out.print("Toplam tutar: " + amount + " TL");
            } else if (type == 2) {
                amount -= (amount * 0.2);
                amount *= 2;
                System.out.print("Toplam tutar: " + amount + " TL");
            } else {
                System.out.print("Hatalı veri girdiniz! ");
            }
        }

    }
}
