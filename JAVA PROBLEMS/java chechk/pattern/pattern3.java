/*
       Pattern 3

       1
       1 2
       1 2 3
       1 2 3 4
       1 2 3 4 5

*/

import java.util.*;

class pattern3 {
    public static void main(String[] args) {

        int n = 6;
        a(n);
    }

    static void a(int n) {
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < i + 1; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

    }
}
