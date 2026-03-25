import java.util.*;

class problem_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size:");
        int size = sc.nextInt();
        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {

            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.println(Arrays.toString(rotate(arr)));

    }

    public static int[] rotate(int[] nums) {

        for (int i = 0; i < nums.length; i++) {
            int temp = nums[nums.length - 1];
            nums[nums.length - 1] = nums[i];
            nums[i] = temp;

        }

        return nums;
    }
}