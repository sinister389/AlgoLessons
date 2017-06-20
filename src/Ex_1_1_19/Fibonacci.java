package Ex_1_1_19;
import edu.princeton.cs.algs4.StdOut;

public class Fibonacci {
    public static long Fib(int N) {
        if (N < 0) {
            StdOut.println("Error: N < 0");
            return -1;
        }
        if (N == 0) return 0;
        if (N == 1) return 1;
        long[] F = new long[N + 1];
        F[0] = 0;
        F[1] = 1;
        for (int i = 2; i <= N; i++) {
            F[i] = F[i - 1] + F[i - 2];
        }
        return F[N];
    }

    public static void main(String[] args) {
        int N = 20;
        for (int i = 0; i <= N; i++) {
            StdOut.println("Fib("+i+")= "+Fib(i));
        }
    }
}
