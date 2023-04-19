import java.util.Scanner;
public class Circle {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        double r, pi = 3.14, area, circumference, angle;

        System.out.print("Dairenin yarıçapını giriniz: ");
        r = input.nextDouble();

        System.out.print("Dairenin merkez açısını giriniz (Tüm daire ise 360 giriniz): ");
        angle = input.nextDouble();

        area = pi * r * r * angle / 360;
        circumference = 2 * pi * r * angle / 360;

        System.out.println("Dairenin Alanı: " + area);
        System.out.println("Dairenin Çevresi: " + circumference);
    }
}
