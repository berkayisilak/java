package Loops;

import java.util.Scanner;

public class InvertedTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;

        //Taking digit number from user
        System.out.print("Basamak sayısını giriniz: ");
        num = input.nextInt();

        for (int i = 0; i < num; i++) {
            //Fill in the blanks
            for (int j = 0; j <= i; j++) {
                System.out.print(" ");
            }
            //Fill the stars
            for (int k = (2 * num - 1); k >= (2 * i + 1); k--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
