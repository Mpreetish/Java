/*
     pattern4
 
     1 2 3 4 5
     1 2 3 4
     1 2 3 
     1 2 
     1


*/

import java.util.*;

class pattern4 {
    public static void main(String[] args) {
        int n = 6;
        a(n);
    }

    static void a(int n) {
        for (int i = 0; i < n - 1; i++) {
            for (int j = 1; j <= n - i - 1; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        /*
         * for (int i = n; i >= 1; i--) {
         * 
         * 
         * for (int j = 1; j <= i; j++) {
         * 
         * System.out.print(j + " ");
         * }
         * 
         * 
         * System.out.println();
         * }
         * 
         */
    }

}
