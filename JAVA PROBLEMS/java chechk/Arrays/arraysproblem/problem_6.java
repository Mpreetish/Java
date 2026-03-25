import java.util.*;

class problem_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size:");
        int size = sc.nextInt();
        System.out.print("Enter the sum K: ");
        int k = sc.nextInt();
        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {

            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);

        int count = nums(arr, k);
        System.out.println(count);

    }

    public static int nums(int[] num, int k) {
        int count = 0;

        for (int i = 0; i < num.length; i++) {
            for (int j = i + 1; j < num.length; j++) {
                if (num[i] + num[j] < k) {
                    count = count + 1;
                }
            }
        }
        return count;

    }
}