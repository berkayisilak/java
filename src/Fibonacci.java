import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n, num, num1 = 0, num2 = 1;

        System.out.print("Basamak sayısını giriniz: ");
        n = input.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println(num1 + " + " + num2);
            num = num1 + num2;
            num1 = num2;
            num2 = num;
        }

    }
}
