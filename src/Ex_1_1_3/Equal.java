package Ex_1_1_3;

import edu.princeton.cs.algs4.StdOut;

/**
 * Created by Ilya on 06.04.2017.
 */
public class Equal {
    public static void isEqual(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);
        if (a == b) if (b == c) {
            StdOut.println("Равны");
            return;
        }
        ;
        StdOut.println("Не равны");
        return;
    }

    public static void main(String[] args) {
        // Задача 1.1.3
        isEqual(args);
    }
}
