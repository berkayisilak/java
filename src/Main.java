import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Kitle Indeks
        int kilo;
        double boy, indeks;
        System.out.println("Lütfen boyunuzu (metre cinsinde) girin : ");
        boy = input.nextDouble();
        System.out.println("Lütfen kilonuzu girin : ");
        kilo = input.nextInt();
        indeks = (kilo) / (boy * boy);

        System.out.print("Vücut kitle indeksiniz : " + indeks);


    }
}