import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num, count = 0;

        //Taking from user
        System.out.print("Bir sayı giriniz: ");
        num = input.nextInt();
//
//        //Number of divisors without remainder
//        for (int i = 2; i <= num; i++) {
//            for (int j = 2; j <= num; j++) {
//                if (i % j == 0) {
//                    count++;
//                }
//            }
//            //Checking prime number and display the output
//            if (count < 2) {
//                System.out.println(i + " ");
//            }
//        }
        System.out.println("Asal sayılar: ");
        for (int i = 2; i <= num; i++){
            for(int j = 2; j <= num; j++){
                if (i % j == 0){
                    count++;
                }
            }
            if (count < 2){
                System.out.print(i + " ");
            }
        }


    }
}
