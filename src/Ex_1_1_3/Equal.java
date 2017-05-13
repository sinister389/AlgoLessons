package Ex_1_1_3;

import edu.princeton.cs.algs4.StdOut;

/**
 * Created by Ilya on 06.04.2017.
 */
public class Equal {
    public static void isEqual(String[] args) {
        if (args.length!=3) {
            StdOut.printf("The number of arguments is not equal to three");
            return;
        }
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);
        if ((a == b)&&(b == c)) StdOut.println("Равны");
        else StdOut.println("Не равны");
    }

    public static void main(String[] args) {
        // Задача 1.1.3 - проверка
        isEqual(args);
    }
}
