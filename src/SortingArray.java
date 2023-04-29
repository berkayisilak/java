import java.util.Scanner;

public class SortingArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Dizinin boyutu n: ");
        int n = scan.nextInt();
        int[] list = new int[n];
        System.out.println("Dizinin elemanlarını giriniz: ");
        for (int i = 0; i < list.length; i++) {
            System.out.print((i + 1) + ". Elemanı: ");
            list[i] = scan.nextInt();
        }

        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list.length; j++) {
                if (i != j && list[i] < list[j]) {
                    int temp = list[j];
                    list[j] = list[i];
                    list[i] = temp;
                }
            }
        }
        System.out.print("Sıralama: ");
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + " ");
        }
    }
}
