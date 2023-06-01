package Other;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class NumberGuessGame {
    public static void main(String[] args) {
        Random rand = new Random();
        int number = rand.nextInt(100);
        Scanner scan = new Scanner(System.in);

        boolean isWin = false;
        boolean isWrong = false;
        int right = 0, selected;
        int[] wrong = new int[5];

        while (right < 5) {
            System.out.print("Lütfen tahmininizi giriniz: ");
            selected = scan.nextInt();
            if (selected < 0 || selected > 99) {
                System.out.println("Lütfen 0 - 100 arasında bir değer giriniz: ");
                if (!isWrong) {
                    isWrong = true;
                    System.out.println("Bir daha hatalı girişinizde hakkınızdan düşülecektir!");
                } else {
                    right++;
                    System.out.println("Çok fazla hatalı giriş yaptınız. Kalan hakkınız: " + (5 - right));

                }
                continue;
            }
            if (selected == number) {
                System.out.println("Tebrikler, doğru taahim!\nTahmin ettiğin sayı: " + number);
                isWin = true;
                break;
            } else {
                wrong[right++] = selected;
                System.out.println("Hatalı bir sayı girdiniz!");
                if (selected < number) {
                    System.out.println(selected + " sayısı, gizli sayıdan büyüktür.");
                } else {
                    System.out.println(selected + " sayısı, gizli sayıdan küçüktür.");
                }
                System.out.println("Kalan hakkınız: " + (5 - right));
            }
        }
        if (!isWin) {
            System.out.println("Kaybettiniz!");
            if (!isWrong) {
                System.out.println("Tahminleriniz: " + Arrays.toString(wrong));

            }
        }
    }
}
