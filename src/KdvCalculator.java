import java.util.Scanner;

public class KdvCalculator {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        double kdvsizTutar, kdvOrani, kdvTutari, kdvliTutar;
        System.out.print("Ücret tutarını giriniz: ");
        kdvsizTutar = input.nextDouble();
        kdvOrani = kdvsizTutar < 1000 & kdvsizTutar > 0 ? 0.18 : 0.08;

        kdvTutari = kdvsizTutar * kdvOrani;
        kdvliTutar = kdvsizTutar + kdvTutari;

        System.out.println("Kdv'siz tutar: " + kdvsizTutar);
        System.out.println("Kdv oranı: " + kdvOrani);
        System.out.println("Kdv tutarı: " + kdvTutari);
        System.out.println("Kdv'li tutar: " + kdvliTutar);

    }
}
