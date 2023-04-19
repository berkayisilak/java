import java.util.Scanner;

public class GroceryStore {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        int kg;
        double armut = 2.14, elma = 3.67, domates = 1.11, muz = 0.95, patlican = 5, amount = 0;

        System.out.print("Armut Kaç Kilo: ");
        kg = input.nextInt();
        amount = amount + (armut * kg);

        System.out.print("Elma Kaç Kilo: ");
        kg = input.nextInt();
        amount = amount + (elma * kg);

        System.out.print("Domates Kaç Kilo: ");
        kg = input.nextInt();
        amount = amount + (domates * kg);

        System.out.print("Muz Kaç Kilo: ");
        kg = input.nextInt();
        amount = amount + (muz * kg);

        System.out.print("Patlıcan Kaç Kilo: ");
        kg = input.nextInt();
        amount = amount + (patlican * kg);

        System.out.println("Toplam Tutar: " + amount);
    }
}
