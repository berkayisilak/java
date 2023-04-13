import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        /* Kitle Indeks
        int kilo;
        double boy, indeks;

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen boyunuzu (metre cinsinde) girin : ");
        boy = input.nextDouble();
        System.out.println("Lütfen kilonuzu girin : ");
        kilo = input.nextInt();
        indeks = (kilo) / (boy * boy);

        System.out.print("Vücut kitle indeksiniz : " + indeks);

        */
        
        /* Manav Programı
        double armut = 2.14, elma = 3.67, domates = 1.11, muz = 0.95, patlican = 5, total = 0;
        int quantity;

        Scanner input = new Scanner(System.in);

        System.out.println("Armut :");
        quantity = input.nextInt();
        total += (armut * quantity);
        System.out.println("Elma :");
        quantity = input.nextInt();
        total += (elma * quantity);
        System.out.println("Domates :");
        quantity = input.nextInt();
        total += (domates * quantity);
        System.out.println("Muz :");
        quantity = input.nextInt();
        total += (muz * quantity);
        System.out.println("Patlıcan :");
        quantity = input.nextInt();
        total += (patlican * quantity);

        System.out.println(total);

        */

        /* Uçak Bileti Fiyatı Hesaplama
        int km, age, type;
        double amount = 0;
        boolean isError = false;


        Scanner input = new Scanner(System.in);
        System.out.print("Mesafeyi km türünden giriniz : ");
        km = input.nextInt();

        if(km > 0) {
            amount = km * (0.10);

        } else {
            isError = true;
        }

        System.out.print("Yaşınızı giriniz : ");
        age = input.nextInt();

        if(age > 0) {
            if (age < 13) {
                amount -= (amount * 0.5);

            } else if (age > 12 && age < 25) {
                amount -= (amount * 0.1);

            } else if (age >= 65) {
                amount -= (amount * 0.3);

            }
        } else {
            isError = true;
        }

        System.out.print("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş ): ");
        type = input.nextInt();

        if(type == 1) {
            amount = amount;
        } else if (type == 2) {
            amount -= (amount * 0.2);
            amount *= 2;
        } else {
            isError = true;
        }

        if (isError) {
            System.out.println("Hatalı Veri Girdiniz !");

        } else {
            System.out.println("Toplam tutar : " + amount);
        }
        */

        /* Çin Zodyağı Hesaplama
        int year, burc;
        String name = "";
        boolean isError = false;

        System.out.print("Doğum Yılınızı Giriniz : ");
        year = input.nextInt();

        isError = (year < 0 || year > 2024) ? true : false;

        burc = year % 12;

        switch (burc) {
            case 0:
                name = "Maymun";
                break;

            case 1:
                name = "Horoz";
                break;

            case 2:
                name = "Köpek";
                break;

            case 3:
                name = "Domuz";
                break;

            case 4:
                name = "Fare";
                break;

            case 5:
                name = "Öküz";
                break;

            case 6:
                name = "Kaplan";
                break;

            case 7:
                name = "Tavşan";
                break;

            case 8:
                name = "Ejderha";
                break;

            case 9:
                name = "Yılan";
                break;

            case 10:
                name = "At";
                break;

            case 11:
                name = "Koyun";
                break;

        }
        if (isError) {
            System.out.println("Hatalı giriş");
        } else {
            System.out.println(name);
        }
        */

        /* Girilen Sayılardan Min ve Max Değerleri Bulma
        int count, number, min = 0, max = 0;
        System.out.print("Kaç tane sayı gireceksiniz: ");
        count = input.nextInt();
        for (int i = 1; i <= count; i++) {
            System.out.print(i + " Sayıyı giriniz: ");
            number = input.nextInt();
            if(number < min) {
                min = number;
            } else if (number > max) {
                max = number;
            }
        }
        System.out.println("En büyük sayı : " + max);
        System.out.print("En küçük sayı : " + min);
        */

        /* Mükemmel Sayı Bulan Program
        int number, total = 0;
        System.out.print("Bir sayı giriniz : ");
        number = input.nextInt();

        for (int i = 1; i <number; i++) {
            if (number %i == 0) {
                total += i;
            }
        }
        if (total == number) {
            System.out.print(number + " Mükemmel sayıdır");
        } else {
            System.out.print(number + " Mükemmel sayı değildir.");
        }
        */

        /* Ters Üçgen Yapımı
        int number;
        System.out.print("Basamak sayısını giriniz : ");
        number = input.nextInt();
        for (int i = number; i >= 1; i--) {
            for (int j = 1; j <= (i * 2) - 1; j++){
                System.out.print("*");
            }
            System.out.println();

            for (int k = number - i; k >= 0; k--) {
                System.out.print(" ");
            }
        }
        */

        /* 1-100 Arasındaki Asal Sayıları Bulan Program
        int sayac = 0;
        for (int n = 1; n < 200; n++) {
            for (int i = 1; i < n; i++) {
                if (n % i == 0) {
                    sayac++;
                }
            }
            if (sayac == 1) {
                System.out.print(n + " ");
            }
            sayac = 0;
        }
        */

        /* Fibonacci Serisi
        int total, last = 1, first = 0;
        System.out.println(first + "\n" + last);
        for (int i = 0; i < 10; i++) {


            total = first + last;
            first = last;
            last = total;
            System.out.println(total);
        }
        */
    }
}