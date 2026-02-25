
    // THIS IS ROW VISE SORTED AND COLUM VISE SORTED


import java.util.*;
class rowcolumsort{
    public static void main(String[] args){
        int [][] arr={
            {10,20,30,40},
            {12,23,38,43},
            {25,34,45,54},
            {30,45,56,67}
        };
        int target=6;
        int[]  b=a(arr,target);
        System.out.println(Arrays.toString(b));
        //System.out.println(b);
    }
    static int[] a(int[][] m,int target){
        int  r=0;
        int c=m.length-1;
        while(r<m.length && c>=0){
            if(m[r][c] == target){
                return new int[]{r,c};
            }
            if(m[r][c] < target){
                r++;
            }
            else{
                c--;
            }
        }
        return new int[]{-1,-1};
        
    }
}