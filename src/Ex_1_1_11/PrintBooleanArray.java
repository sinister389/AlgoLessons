package Ex_1_1_11;

import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

/**
 * Created by Ilya on 06.04.2017.
 */
public class PrintBooleanArray {
    public static void printBooleanArray(boolean[][] array) {
        if (array.length==0) {
            StdOut.printf("Array is empty!");
            return;
        }
        int N = array.length;
        int M = array[0].length;

        // Вывод строки с номерами столбцов
        StdOut.print("   ");
        for (int i = 0; i < M; i++) StdOut.printf("%2d ", i);
        StdOut.print("\n");
        // Вывод массива с указанием номера строки
        for (int i = 0; i < array.length; i++) {
            StdOut.printf("%-3d", i);
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j]) StdOut.print(" * ");
                else StdOut.print("   ");
            }
            StdOut.print("\n");
        }
    }

    public static void main(String[] args) {
        int K = 10;
        int L = 9;
        boolean [][] barray = new boolean[K][L];
        // Рандомная генерация тестового массива чуть поменяю
        for (int i = 0; i < K; i++)
            for (int j = 0; j < L; j++) barray[i][j]= StdRandom.bernoulli(.5);
        printBooleanArray(barray);

    }
}

