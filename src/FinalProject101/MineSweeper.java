package FinalProject101;

import java.util.Random;
import java.util.Scanner;

public class MineSweeper {
    int row;
    int col;
    int mine;
    boolean isAlive = true;
    MineSweeper(int row, int col) {
        this.row = row;
        this.col = col;
        this.mine = row * col / 4;
    }

    void run() {
        String[][] matrix = new String[this.row][this.col];
        String[][] mineMatrix = new String[this.row][this.col];
        Random rand = new Random();
        Scanner scan = new Scanner(System.in);

        System.out.println("Mayın Tarlası Oyuna Hoşgeldiniz !");
        for (int i = 0; i < this.row; i++) {
            for (int j = 0; j < this.col; j++) {
                matrix[i][j] = " - ";
                mineMatrix[i][j] = " - ";
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }

        for (int i = 0; i < this.mine; i++) {
            int randomRow = rand.nextInt(0,this.row);
            int randomCol = rand.nextInt(0,this.col);
            if (!mineMatrix[randomRow][randomCol].equals(" * "))
            {
                mineMatrix[randomRow][randomCol] = " * ";
            } else {
                i--;
            }
        }

        int win = (this.row * this.col) - this.mine;
        while (isAlive) {
            if (win <= 0) {
                System.out.print("Oyunu Kazandınız !");
                break;
            } else {
                System.out.print("Satır Giriniz : ");
                int inputRow = scan.nextInt();
                System.out.print("Sütun Giriniz : ");
                int inputCol = scan.nextInt();
                if (mineMatrix[inputRow][inputCol].equals(" * ")) {
                    this.isAlive = false;
                    System.out.println("Game Over!!");
                    break;
                } else {
                    int bombCount = 0;
                    if ((inputRow - 1 >= 0) && (inputCol - 1 > 0) && (mineMatrix[inputRow - 1][inputCol - 1].equals(" * "))) {
                        bombCount++;
                    }
                    if ((inputRow - 1 >= 0) && (mineMatrix[inputRow - 1][inputCol].equals(" * "))) {
                        bombCount++;
                    }
                    if ((inputRow - 1 >= 0) && (inputCol + 1 < this.col) && (mineMatrix[inputRow - 1][inputCol + 1].equals(" * "))) {
                        bombCount++;
                    }
                    if ((inputCol -1 >= 0) && (mineMatrix[inputRow][inputCol - 1].equals(" * "))) {
                        bombCount++;
                    }
                    if ((inputCol + 1 < this.col) && (mineMatrix[inputRow][inputCol + 1].equals(" * "))) {
                        bombCount++;
                    }
                    if ((inputRow + 1 < this.row) && (inputCol - 1 >= 0) && (mineMatrix[inputRow + 1][inputCol - 1].equals(" * "))) {
                        bombCount++;
                    }
                    if ((inputRow + 1 < this.row) && (mineMatrix[inputRow + 1][inputCol].equals(" * "))) {
                        bombCount++;
                    }
                    if ((inputRow + 1 < this.row) && (inputCol + 1 < this.col) && (mineMatrix[inputRow + 1][inputCol + 1].equals(" * "))) {
                        bombCount++;
                    }
                    matrix[inputRow][inputCol] = " " + bombCount + " ";
                    System.out.println();
                    for (int i = 0; i < this.row; i++) {
                        for (int j = 0; j < this.col; j++) {
                            System.out.print(matrix[i][j]);
                        }
                        System.out.println();
                    }
                }
                win--;
            }
        }
    }
}
