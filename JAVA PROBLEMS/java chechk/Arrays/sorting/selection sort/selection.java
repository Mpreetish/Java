import java.util.*;

class selection {
    public static void main(String[] args) {
        int[] arr = { 4, 5, 1, 2, 3 };
        arr = a(arr);
        System.out.println(Arrays.toString(arr));

    }

    static int[] a(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {

            int lastIndex = arr.length - i - 1;
            int maxIndex = 0;

            for (int j = 1; j <= lastIndex; j++) {
                if (arr[j] > arr[maxIndex]) {
                    maxIndex = j;
                }
            }

            // swap
            int temp = arr[maxIndex];
            arr[maxIndex] = arr[lastIndex];
            arr[lastIndex] = temp;
        }

        return arr;

    }

}
