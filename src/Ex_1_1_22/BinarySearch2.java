package Ex_1_1_22;
import java.util.Arrays;

import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

public class BinarySearch2 {
    public static int rank (int key, int[] a, int deep){
        int lo = 0;
        deep = 1;
        String str= new String();
        int hi = a.length - 1;
        while (lo <= hi){
            int mid = lo + (hi - lo) / 2;
            StdOut.printf("\nlo = %"+(deep)+"s %d",str,lo);
            StdOut.printf("\nhi = %"+(deep)+"s %d",str,hi);
            deep++;
            if (key < a[mid]) hi = mid - 1;
            else if (key > a[mid]) lo = mid + 1;
            else  return mid;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] list = new int[30];
        StdOut.println("Random array: ");
        for (int i = 0; i < list.length; i++){
            list[i]=StdRandom.uniform(100);
            StdOut.print(list[i]+" ");
        }
        Arrays.sort(list);
        StdOut.println("\nSorted array:");
        for (int i = 0; i < list.length; i++) StdOut.print(list[i] + " ");
        int key = list[StdRandom.uniform(list.length)];
        StdOut.println("\nLooking for "+key);
        int result = rank(key, list, 0);
        if (result != -1) StdOut.println("\nWe found it!\nlist["+result+"]=" + key);
    }
}
