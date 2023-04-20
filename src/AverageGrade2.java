import java.util.Scanner;

public class AverageGrade2 {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);

        int matematik, fizik, turkce, kimya, muzik, count = 0;
        double total = 0, average;

        System.out.print("Matematik notunuz: ");
        matematik = input.nextInt();
        if (matematik <= 100 && matematik > 0 ) {
            total = total + matematik;
            count++;
        }

        System.out.print("Fizik notunuz: ");
        fizik = input.nextInt();
        if (fizik <= 100 && fizik > 0 ) {
            total = total + fizik;
            count++;
        }

        System.out.print("Türkçe notunuz: ");
        turkce = input.nextInt();
        if (turkce <= 100 && turkce > 0 ) {
            total = total + turkce;
            count++;
        }

        System.out.print("Kimya notunuz: ");
        kimya = input.nextInt();
        if (kimya <= 100 && kimya > 0 ) {
            total = total + kimya;
            count++;
        }

        System.out.print("Müzik notunuz: ");
        muzik = input.nextInt();
        if (muzik <= 100 && muzik > 0 ) {
            total = total + muzik;
            count++;
        }

        average = total/count;
        System.out.print("Ortalamanız: " + average);
        if (average < 55) {
            System.out.print("Sınıfta kaldınız. ");
        } else {
            System.out.print("Sınıfı geçtiniz. ");
        }
    }
}
