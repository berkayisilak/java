import java.util.Scanner;

public class Calculator {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        int num1, num2, operator;

        System.out.print("İlk sayıyı giriniz: ");
        num1 = input.nextInt();

        System.out.print("İkinci sayıyı giriniz: ");
        num2 = input.nextInt();

        System.out.print("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme ");
        operator= input.nextInt();

        switch (operator){
            case 1:
                System.out.print("Toplama: " + (num1 + num2));
                break;
            case 2:
                System.out.print("Çıkarma: " + (num1 - num2));
                break;
            case 3:
                System.out.print("Çarpma: " + (num1 * num2));
                break;
            case 4:
                System.out.print("Bölme: " + (num1 / num2));
                break;
        }
    }
}
