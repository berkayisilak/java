package Loops;

import java.util.Scanner;

public class DivisiblleByThreeAndFour {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        int number, count = 0, average = 0;

        System.out.print("Bir sayı giriniz: ");
        number = input.nextInt();

        for (int i = 1; i <= number; i++) {
            if (i % 3 == 0 && i % 4 == 0) {
                average += i;
                count++;
            }
        }
        average = average / count;
        System.out.print("3 ve 4'e tam bölünen sayıların ortalaması: " + average);
    }
}
