
/*      Patter 1;

          * * * * * * *
          *           *
          *           *
          *           *
          *           *
          * * * * * * * 

*/

import java.util.*;

class pattern1 {
    public static void main(String[] args) {
        int n = 6;
        a(n);

    }

    static void a(int n) {
        String space = "  ";
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                if (i == 0 || j == 0) {
                    System.out.print("* ");
                } else if (i == n - 1 || j == n - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print(space);
                }

            }
            System.out.println();
        }

    }

}
