import java.util.*;

class binary2d {
    public static void main(String[] args) {
        int[][] arr = {
                { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 }
        };
        int target = 10;
        int[] b = a(arr, target);
        System.out.println(Arrays.toString(b));

    }

    static int[] a(int[][] arr, int target) {
        int row = arr.length - 1;
        int colum = arr[row].length - 1;

        return new int[] { row, colum };
    }

}