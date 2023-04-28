import java.util.Arrays;
public class AverageOfHarmonicSeries {
    public static void main(String[] args) {
        double[] list = {15, 6, 7, 12, 7, 9, 3};
        double sum = 0;

        for (int i = 0; i < list.length; i++) {
            sum += 1 / list[i];
        }
        double average = list.length / sum;
        System.out.println(Arrays.toString(list) + " dizisinin harmonik ortalaması: " + average);
    }
}
