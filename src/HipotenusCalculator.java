import java.util.Scanner;

public class HipotenusCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double a, b, c, u, circumference, area;
        System.out.print("1. Kenarı giriniz: ");
        a = input.nextDouble();

        System.out.print("2. Kenarı giriniz: ");
        b = input.nextDouble();

        c = Math.sqrt((a*a) + (b*b));
        System.out.println("3. Kenarın uzunluğu:" + c);

        u = (a + b + c) / 2;
        circumference = 2 * u;
        area = Math.sqrt(u * (u - a) * (u - b) * (u - c));

        System.out.println("Üçgenin Çevresi: " + circumference);
        System.out.println("Üçgenin Alanı: " + area);

    }
}
