import java.util.Scanner;

public class RecursivePattern {
    static void pattern (int n, int temp) {

        if (n > 0) {
            System.out.print(n + " ");
            pattern(n - 5, temp);
        } else {
            pattern1(n, temp);
        }
    }

    static void pattern1 (int n, int temp) {
        if (temp >= n) {
            System.out.print(n + " ");
            pattern1(n + 5, temp);
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num, temp;

        System.out.print("Bir sayı giriniz: ");
        num = scan.nextInt();
        temp = num;

        pattern(num, temp);
    }
}
