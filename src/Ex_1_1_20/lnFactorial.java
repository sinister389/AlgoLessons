package Ex_1_1_20;
import edu.princeton.cs.algs4.StdOut;

public class lnFactorial {
    public static double fact(int N){
        if (N < 0){
            StdOut.println("ERROR: N < 0");
            return -1;
        }
        if ((N == 1)||(N == 0)) return 0;
        return Math.log(N) + fact(N-1);

    }

    public static void main(String[] args) {
        int N=10;
        for (int i=1; i<=10; i++){
            StdOut.println("Fact("+i+") = "+fact(i));
        }
    }
}
