import java.util.*;
//import java.lang.*;

class p1 {
    public static void main(String[] args) {
        // pattern1(5);
        // pattern2(5);
        // pattern3(5);
        // pattern4a(5);
        // pattern4b(5);
        pattern5(4);

    }

    static void pattern1(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print("* ");

            }
            System.out.println();

        }
        System.out.println("__________________________________________________");

    }

    static void pattern2(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");

            }
            System.out.println();

        }
        System.out.println("__________________________________________________");

    }

    static void pattern3(int n) {
        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= i; j++) {

                System.out.print("* ");

            }
            System.out.println();
        }

        System.out.println("__________________________________________________");

    }

    static void pattern4a(int n) {
        for (int i = 1; i <= 2 * n - 1; i++) {

            int t = i <= n ? i : 10 - i;

            for (int j = 1; j <= t; j++) {

                System.out.print("* ");

            }
            System.out.println();
        }
        System.out.println("__________________________________________________");

    }

    static void pattern4b(int n) {
        for (int i = 1; i < n; i++) {

            for (int j = 1; j <= i; j++) {

                System.out.print("* ");

            }
            System.out.println();
        }
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print("* ");

            }
            System.out.println();

        }

        System.out.println("__________________________________________________");

    }

    static void pattern5(int n) {
        int size = 2 * n - 1;
        for (int i = 1; i <= size; i++) {

            for (int j = 1; j < size; j++) {

                int left = i;
                int top = j;
                int right = size - 1 - j;
                int bottom = size - 1 - i;
                int a = Math.min(right, bottom);
                int b = Math.min(top, left);
                int c = Math.min(a, b);

                System.out.print(n - c + " ");

            }
            System.out.println();
        }
        System.out.println("__________________________________________________");

    }

}
