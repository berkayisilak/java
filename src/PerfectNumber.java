import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n, num, sum = 0;

        //How many numbers enter the system
        System.out.print("Kaç tane sayı gireceksiniz: ");
        n = input.nextInt();

        //Taking the numbers from user
        for (int i = 0; i < n; i++) {
            System.out.print("Bir sayı giriniz: ");
            num = input.nextInt();

            //Sum of divisors without remainder
            for (int j = 1; j <= num; j++) {
                if (num % j == 0) {
                    sum += j;
                }
            }

            //Checking perfect number and display the output
            if ((num * 2) == sum) {
                System.out.println(num + " Mükemmel sayıdır.");
            } else {
                System.out.println(num + " Mükemmel sayı değildir.");
            }
        }
    }
}
