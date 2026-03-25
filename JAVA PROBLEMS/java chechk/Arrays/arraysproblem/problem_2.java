import java.util.*;

public class problem_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size:");
        int size = sc.nextInt();
        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {

            arr[i] = sc.nextInt();
        }
        int s = nums(arr);
        System.out.println(arr[s]);

    }

    public static int nums(int[] num) {

        int a = num.length;
        int b = a / 2;
        int index = b;
        for (int i = b + 1; i < a; i++) {
            if (num[i] < num[index]) {
                continue;
            } else if (num[i] > num[index]) {
                index = i;
            }
        }
        return index;

    }

}
