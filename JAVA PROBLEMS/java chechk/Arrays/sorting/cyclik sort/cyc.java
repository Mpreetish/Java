import java.util.*;

class cyc {
    public static void main(String[] args) {
        int[] arr = { 3, 4, 2, 1, 5 };

        arr = a(arr);
        System.out.println(Arrays.toString(arr));

    }

    static int[] a(int[] arr) {
        int i = 0;
        while (i < arr.length - 1) {
            int ci = arr[i] - 1;
            if (arr[i] != arr[ci]) {
                int temp = arr[i];
                arr[i] = arr[ci];
                arr[ci] = temp;
            } else {
                i++;
            }
        }
        return arr;

    }
}