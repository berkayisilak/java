import java.util.Scanner;

public class RecursiveFibonacci {
    static int fib(int number) {

        if (number == 1 || number == 2) {
            return 1;
        }
        return fib(number - 1) + fib(number - 2);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;

        System.out.print("Bir sayı giriniz: ");
        num = input.nextInt();
        System.out.print(fib(num));
    }
}
