package Ex_1_1_14;

import edu.princeton.cs.algs4.StdOut;

/**
 * Created by Ilya on 06.04.2017.
 */
public class Lg2 {
    public static int lg(int N) {
        int rez = 0;
        while (N / 2 >= 1) {
            N /= 2;
            rez++;
        }
        return rez;
    }

    public static void main(String[] args) {
        // Проверка работы путём вывода решения для 0<=N<=32
        int Nmax = 32;
        for (int i=0; i<=Nmax; i++) StdOut.print("lg для "+ i + " = " +lg(i) + "\n");
    }
}
