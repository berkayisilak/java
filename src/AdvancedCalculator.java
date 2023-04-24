import java.util.Scanner;

public class AdvancedCalculator {
    static int sum (int a, int b) {
        int result = a + b;
        System.out.println(a + " + " + b + " = " + result);
        return result;
    }

    static int substraction (int a, int b) {
        int result = a - b;
        System.out.println(a + " - " + b + " = " + result);
        return result;
    }

    static int multiplication (int a, int b) {
        int result = a * b;
        System.out.println(a + " * " + b + " = " + result);
        return result;
    }

    static int division (int a, int b) {
        if (b == 0) {
            System.out.print("İkinci sayı sıfırdan farklı olmalı!!!");
            return 0;
        }
        int result = a / b;
        System.out.println(a + " / " + b + " = " + result);
        return result;
    }

    static int power (int a, int b) {
        int result = 1;
        for (int i = 1; i <= b; i++) {
            result *= a;
        }
        System.out.println(a + " ^ " + b + " = " + result);
        return result;
    }

    static int factorial (int a) {
        int result = 1;
        for (int i = 1; i <= a; i++) {
            result *= i;
        }
        System.out.println(a + "! = " + result);
        return result;
    }

    static int mod (int a, int b) {
        int result = a % b;
        System.out.println(a + " mode " + b + " = " + result);
        return result;
    }

    static int areaCircumference(int a, int b) {
        int area = a * b;
        int circumference = 2 * (a + b);
        System.out.println("Area: " + area + "\nCircumference: " + circumference);
        return area;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int select, num1, num2, result;
        String menu = "1- Toplama İşlemi\n" +
                "2- Çıkarma İşlemi\n" +
                "3- Çarpma İşlemi\n" +
                "4- Bölme işlemi\n" +
                "5- Üslü Sayı Hesaplama\n" +
                "6- Faktoriyel Hesaplama\n" +
                "7- Mod Alma\n" +
                "8- Dikdörtgen Alan ve Çevre Hesabı\n" +
                "0- Çıkış Yap\n";

        while (true) {
            System.out.print(menu);
            System.out.print("Bir işlem seçiniz: ");
            select = input.nextInt();
            if (select == 0) {
                break;
            }

            switch (select) {
                case 1:
                    System.out.print("Birinci sayıyı giriniz: ");
                    num1 = input.nextInt();

                    System.out.print("İkinci sayıyı giriniz: ");
                    num2 = input.nextInt();

                    sum(num1, num2);
                    break;
                case 2:
                    System.out.print("Birinci sayıyı giriniz: ");
                    num1 = input.nextInt();

                    System.out.print("İkinci sayıyı giriniz: ");
                    num2 = input.nextInt();
                    substraction(num1, num2);
                    break;
                case 3:
                    System.out.print("Birinci sayıyı giriniz: ");
                    num1 = input.nextInt();

                    System.out.print("İkinci sayıyı giriniz: ");
                    num2 = input.nextInt();
                    multiplication(num1, num2);
                    break;
                case 4:
                    System.out.print("Birinci sayıyı giriniz: ");
                    num1 = input.nextInt();

                    System.out.print("İkinci sayıyı giriniz: ");
                    num2 = input.nextInt();
                    division(num1, num2);
                    break;
                case 5:
                    System.out.print("Taban değeri giriniz: ");
                    num1 = input.nextInt();

                    System.out.print("Üs değeri giriniz : ");
                    num2 = input.nextInt();
                    power(num1, num2);
                    break;
                case 6:
                    System.out.print("Bir sayı giriniz: ");
                    num1 = input.nextInt();
                    factorial(num1);
                    break;
                case 7:
                    System.out.print("Birinci sayıyı giriniz: ");
                    num1 = input.nextInt();

                    System.out.print("İkinci sayıyı giriniz: ");
                    num2 = input.nextInt();
                    mod(num1, num2);
                    break;
                case 8:
                    System.out.print("Birinci sayıyı giriniz: ");
                    num1 = input.nextInt();

                    System.out.print("İkinci sayıyı giriniz: ");
                    num2 = input.nextInt();
                    areaCircumference(num1, num2);
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Yanlış bir değer girdiniz, tekrar deneyiniz.");

            }
        }
    }
}
