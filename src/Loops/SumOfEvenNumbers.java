package Loops;

import java.util.Scanner;

public class SumOfEvenNumbers {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        int number, total = 0;

        System.out.print("Bir sayı giriniz: ");
        number = input.nextInt();

        while (number % 2 == 0) {
            if (number % 4 == 0) {
                total += number;
            }
            System.out.print("Bir sayı giriniz: ");
            number = input.nextInt();
        }
        System.out.println("Toplam: " + total);
    }
}
