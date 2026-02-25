import java.util.*;
class twoDS{
    public static void main(String[] args){
        int[][] arr={
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        int target=6;
       
       int[] a=dummy(arr,target);

       // For Loop

      /* for(int h=0;h<a.length;h++){
        
            System.out.print(a[h]+" ");
       
       }*/

      //For each loop

       /*for(int b:a){
        System.out.print(b+" ");

       }*/

       // Arrays String method

       //System.out.println(Arrays.toString(a));
    }
    static int[] dummy(int[][] arr,int target){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(arr[i][j] == target){
                   return new int[]{i,j};
                }
            }
        }
        return new int[]{0};

    }
}