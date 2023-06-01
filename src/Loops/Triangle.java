package Loops;

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num;

        //Taking digit number from user
        System.out.print("Basamak sayısını giriniz: ");
        num = scan.nextInt();

        for (int i = 0; i < num; i++) {

            //Fill in the blanks
            for (int j = 0; j < num - i; j++) {
                System.out.print(" ");
            }

            //Fill the stars
            for (int k = 0; k <= (2 * i); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
