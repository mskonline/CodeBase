package test;

import java.util.Arrays;

public class ArraySortTest {

    public static void main(String[] args) {

        int[][] arr = new int[][]{{4, 8}, {1, 2}, {7, 20}};

        Arrays.sort(arr, (a, b) -> Integer.compare(b[0] + b[1], a[0] + a[1]));

        for(int[] a : arr) {
            System.out.println("[" + a[0] + "," + a[1] + "]");
        }
    }
}
