import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num, digit1, digit2, sum = 0;

        System.out.print("Bir sayı giriniz: ");
        num = input.nextInt();
        digit1 = num;
        while (digit1 != 0) {
            digit2 = digit1 % 10;
            digit1 = digit1 / 10;
            sum += digit2;
        }
        System.out.println(num + " sayısının basamak sayıları toplamı: " + sum);
    }
}
