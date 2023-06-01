package Arrays;

import java.util.Scanner;
import java.util.Arrays;

public class MinMaxValuesOfArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] list = {15, 12, 788, 1, -1, -778, 2, 0};
        int min = 0, max = 0;

        System.out.println("Dizi:" + Arrays.toString(list));
        System.out.print("Girilen Sayı: ");
        int num = scan.nextInt();

        Arrays.sort(list);
        for (int i = 0; i < list.length; i++) {
            if (list[i] < num) {
                min = list[i];
            } else {
                max = list[i];
                break;
            }
        }
        System.out.println("Girilen sayıdan küçük en yakın sayı: " + min + "\nGirilen sayıdan büyük en yakın sayı: " + max);
    }
}
