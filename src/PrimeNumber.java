public class PrimeNumber {
    public static void main(String[] args) {
        System.out.println("Asal sayılar: ");
        for (int i = 2; i <= 100; i++){
            int n = 0;
            for(int j = 2; j <= 100; j++){
                if (i % j == 0){
                    n++;
                }
            }
            if (n < 2){
                System.out.print(i + " ");
            }
        }
    }
}
