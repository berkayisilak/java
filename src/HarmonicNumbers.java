import java.util.Scanner;

public class HarmonicNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;
        double sum = 0;

        System.out.print("Bir sayı giriniz: ");
        num = input.nextInt();

        for (double i = 1.0; i <= num; i++) {
            sum += (1/i);
        }
        System.out.print("Harmonik serinin sonucu: " + sum);
    }
}
