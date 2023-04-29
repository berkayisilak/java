import java.util.Arrays;

public class FrequencyOfArrayElements {

    public static void main(String[] args) {
        int[] list = {10, 20, 20, 10, 10, 20, 5, 20};
        System.out.println("Dizi: " + Arrays.toString(list));
        Arrays.sort(list);
        System.out.println("Tekrar Sayıları");
        for (int i = 0; i < list.length; i++) {
            int count = 1;
            if (i == 0) {
                for (int j = 0; j < list.length; j++) {
                    if (i != j && list[i] == list[j]) {
                        count++;
                    }
                }
                System.out.println(list[i] + " sayısı " + count + " kere tekrar edildi.");
            } else if (list[i] != list[i - 1]) {
                for (int j = 0; j < list.length; j++) {
                    if (i != j && list[i] == list[j]) {
                        count++;
                    }
                }
                System.out.println(list[i] + " sayısı " + count + " kere tekrar edildi.");
            }
        }
    }
}
