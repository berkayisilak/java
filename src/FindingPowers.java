import java.util.Scanner;

public class FindingPowers {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        int number;

        System.out.print("Bir sayı giriniz: ");
        number = input.nextInt();

        System.out.print("Dördün kuvveti olan sayılar: ");
        for (int i = 1; i <= number; i *= 4) {
            System.out.print(i + " ");
        }

        System.out.print("\nBeşin kuvveti olan sayılar: ");
        for (int i = 1; i <= number; i *= 5) {
            System.out.print(i + " ");
        }
    }
}
