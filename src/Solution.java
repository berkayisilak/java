import java.util.Scanner;
class Solution{
    public static void main(String []argh){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] list = new int[n];
        int count = 0;

        for (int i = 0; i < list.length; i++){
            list[i] = scan.nextInt();
        }

        for (int i = 0; i < list.length; i++) {
            int sum = 0;
            for (int j = i; j < list.length; j++) {
                sum += list[j];
                if (sum < 0) {
                    count++;
                    System.out.println(count + ". [" + i + " : "+ j + "] = " + sum);
                }
            }
        }
        System.out.println("Thus, we print " + count + " on a new line.");


    }
}