import java.util.Scanner;

public class ExponentiationCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1, num2, result = 1;

        System.out.print("Üssü alınacak sayıyı giriniz: ");
        num1 = input.nextInt();

        System.out.print("Üs olacak sayıyı giriniz: ");
        num2 = input.nextInt();

        for (int i = 1; i <= num2; i++) {
            result *= num1;
        }
        System.out.print(num1 + " üssü " + num2 + " :" + result);
    }
}
