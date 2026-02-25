
//   NOT SLOVEDDDDDDDDD



import java.util.*;
class insert{
    public static void main(String[] args){
        int[][] arr={
            {1,2,3},
            {4,5,6},
            {7,8}
        };
        int insert = 9;
       int[] b=s(arr,insert);
       System.out.println(Arrays.toString(b));
       
        


    }
    static int[] s(int[][] arr,int insert){
     arr[2][2]=insert;
     return new int[]{2,2};
    }
}