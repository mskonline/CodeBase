package tutorial.basics;

public class PrimitiveArray {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int[][] dArray = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};


        for (int[] sArray : dArray) {
            System.out.println(sArray[0] + " " + sArray[1] + " " + sArray[2]);
        }
    }
}
