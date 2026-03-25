import java.util.*;

class problem_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size:");
        int size = sc.nextInt();
        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {

            arr[i] = sc.nextInt();
        }
        int s = add(arr);
        System.out.println(arr[s]);

    }

    public static int add(int[] arr1) {
        int index = 1;
        for (int i = 0; i < arr1.length; i++) {
            if (i % 2 != 0) {
                if (arr1[i] > arr1[index]) {
                    index = i;
                }
            }

        }
        return index;
    }
}