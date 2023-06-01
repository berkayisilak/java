package Loops;

import java.util.Scanner;

public class Combination {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n, r, nFak = 1, rFak = 1, nrFak = 1, combination;

        System.out.print("Kombinasyonun n değerini giriniz: ");
        n = input.nextInt();

        System.out.print("Kombinasyonun r değerini giriniz: ");
        r = input.nextInt();

        for (int i = 1; i <= n; i++) {
            nFak = nFak * i;
        }

        for (int i = 1; i <= r; i++) {
            rFak = rFak * i;
        }

        for (int i = 1; i <= n-r; i++) {
            nrFak = nrFak * i;
        }

        combination = nFak / (rFak * nrFak);
        System.out.println("C(" + n + "," + r + "): " + combination);
    }
}
