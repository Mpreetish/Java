import java.util.*;
class twoD{

// this for 2d array creation and printing.....

    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the Array row size:");
    int row=sc.nextInt();
    System.out.print("Enter the Array colum size:");
    int colum=sc.nextInt();
    int[][] arr=new int[row][colum];
    arr= dummy(arr,sc);


    // using for each 


     /* for(int[] ro:arr){
        
        System.out.println(Arrays.toString(ro));
        
    }*/
    

    // useing for loops


    /*  for (int i=0;i<arr.length;i++){
        for(int j=0;j<arr[i].length;j++){
            System.out.print(arr[i][j]+" ");
        }
        System.out.println();
      }*/
      
    }
    static int[][] dummy(int[][] arr,Scanner sc){
      for (int i=0;i<arr.length;i++){
        for(int j=0;j<arr[i].length;j++){
            arr[i][j]=sc.nextInt();
        }
      }
      return arr;

    }
   

}