import java.util.Scanner;

public class RecursivePower {
    static int power (int n1, int n2) {
        int result = 1;
        result *= n1;

        if (n2 == 1) {
            return result;
        }

        return (n1 * power(n1, n2 - 1));
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num1, num2, result;

        System.out.print("Taban değeri giriniz: ");
        num1 = scan.nextInt();

        System.out.print("Üs değeri giriniz: ");
        num2 = scan.nextInt();

        result = power(num1, num2);
        System.out.println(num1 + " ^ " + num2 + " = " + result);
    }
}
