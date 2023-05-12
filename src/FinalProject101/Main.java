package FinalProject101;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Board size giriniz: ");
        int x = scan.nextInt();
        int y = scan.nextInt();
        MineSweeper mine = new MineSweeper(x, y);
        mine.run();

    }
}
