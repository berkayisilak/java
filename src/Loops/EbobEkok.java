package Loops;

import java.util.Scanner;

public class EbobEkok {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1, num2, ekok, ebob;

        System.out.print("Birinci sayıyı giriniz: ");
        num1 = input.nextInt();

        System.out.print("İkinci sayıyı giriniz: ");
        num2 = input.nextInt();

        //ebob calculating
        ebob = num1;
        while (num1 != 0) {
            ebob--;
            if (num1 % ebob == 0 && num2 % ebob == 0) {
                System.out.println(ebob);
                break;
            }
        }

        //ekok calculating
        ekok = num1 * num2;
        while (num1 < ekok) {
            if (ekok % num1 == 0 && ekok % num2 == 0) {
                System.out.println(ekok/ebob);
                break;
            }
        }
    }
}
