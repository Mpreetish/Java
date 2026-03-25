import java.util.*;

class problem_4 {
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

        boolean a = nums(arr, k);
        System.out.println(a);

    }

    public static boolean nums(int[] num, int k) {

        for (int i = 0; i < num.length; i++) {
            for (int j = 1; j < num.length; j++) {
                if (num[i] + num[j] == k) {
                    System.out.println(num[1] + "," + num[j]);
                    return true;
                }
            }
        }
        return false;

    }
}
