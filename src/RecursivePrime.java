import java.util.Scanner;

public class RecursivePrime {
    static boolean isPrime (int n, int i) {

        if (n <= 2) {
            return (n == 2) ? true : false;
        }

        if (n % i == 0) {
            return false;
        }

        if (i * i > n) {
            return true;
        }
        return isPrime(n, i + 1);
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num;

        System.out.print("Sayı giriniz: ");
        num = scan.nextInt();

        if (isPrime(num, 2)) {
            System.out.println(num + " sayısı asal sayıdır.");
        } else {
            System.out.println(num + " sayısı asal sayı değildir.");
        }
    }
}
