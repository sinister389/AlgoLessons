package Ex_1_1_15;

import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

/**
 * Created by Ilya on 06.04.2017.
 */
public class Histogram {
    /* Решение задачи 1.1.15
       Напишите статический метод histogram(), который принимает в качестве аргументов массив a[] значений типа int
       и целое число M и возвращает массив длиной M, i-ый элемент которого равен количеству появлений числа i
       в массиве-аргументе. Если значениея a[] находятся между 0 и М-1, то сумма значений полученного массива
       должна быть равна a.length
   */
    public static int[] histogram(int[] a, int M) {
        int[] b = new int [M];
        //for (int i = 0; i < b.length; i++) b[i]=0;
        for (int i = 0; i < M; i++)
            for (int j = 0; j < a.length; j++) if (a[j] == i) b[i]++;
        return b;
    }

    public static void main(String[] args) {
        // Задача 1.1.15
        int M = 5;
        int[] a = new int[30];
        for (int i = 0; i < a.length; i++) StdOut.printf("[%2d] ", i);
        StdOut.println();
        for (int i = 0; i < a.length; i++) {
            a[i] = StdRandom.uniform(4);
            StdOut.printf("%3d  ", a[i]);
        }
        int[] b = histogram(a, M);
        StdOut.println("\nНовый массив после выполнения функции histogram:");
        for (int i = 0; i < b.length; i++) StdOut.printf("[%2d] ", i);
        StdOut.println();
        for (int i = 0; i < b.length; i++) StdOut.printf("%3d  ", b[i]);
    }
}
