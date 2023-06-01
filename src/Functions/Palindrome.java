package Functions;

import java.util.Scanner;

public class Palindrome {

    static boolean isPalindrom (int num) {
        int temp = num, reverseNumber = 0, lastNumber;

        //Reverse the number
        while (temp != 0) {
            lastNumber = temp % 10;
            reverseNumber = (reverseNumber * 10) + lastNumber;
            temp /= 10;
        }

        //Checking if the number is palindrome
        if (reverseNumber == num) {
            return true;
        } else {
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;

        System.out.print("Bir sayı giriniz: ");
        num = input.nextInt();
        System.out.println(isPalindrom(num));
    }
}
