package Loops;

import java.util.Scanner;

public class FindingMinMax {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int max, min, n, num;

        //How many numbers enter the system
        System.out.print("Kaç tane sayı gireceksiniz: ");
        n = input.nextInt();

        System.out.print("1. Sayıyı giriniz: ");
        num = input.nextInt();
        max = num;
        min = num;

        //Taking the numbers from user
        for (int i = 2; i <= n; i++) {
            System.out.print(i + ". Sayıyı giriniz: ");
            num = input.nextInt();

            //Finding max number
            if (max < num) {
                max = num;
            }

            //Finding min number
            if (min > num) {
                min = num;
            }
        }
        //Display the output
        System.out.println("En büyük sayı: " + max);
        System.out.println("En küçük sayı: " + min);
    }
}
