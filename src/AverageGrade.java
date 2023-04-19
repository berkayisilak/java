import java.util.Scanner;
public class AverageGrade {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);

        int mat, fizik, kimya, turkce, tarih;
        double averageGrade;
        System.out.print("Matematik notunu giriniz: ");
        mat = input.nextInt();

        System.out.print("Fizik notunu giriniz: ");
        fizik = input.nextInt();

        System.out.print("Kimya notunu giriniz: ");
        kimya = input.nextInt();

        System.out.print("Türkçe notunu giriniz: ");
        turkce = input.nextInt();

        System.out.print("Tarih notunu giriniz: ");
        tarih = input.nextInt();

        averageGrade = (mat + fizik + kimya + turkce + tarih)/5;
        System.out.println("Ortalamanız :" + averageGrade);

        System.out.println(averageGrade < 60 ? "Sınıfta kaldınız." : "Sınıfı geçtiniz.");
    }
}
