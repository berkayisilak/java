import java.util.Scanner;

public class Taximeter {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        int minAmount = 20, taximeterFee = 10;
        double perKm = 2.20, km, amount;

        System.out.print("Mesafeyi KM cinsinden giriniz: ");
        km = input.nextDouble();

        amount = (taximeterFee + (km * perKm)) > 20 ? taximeterFee + (km * perKm) : minAmount;
        System.out.println("Toplam tutar: " + amount);
    }
}
