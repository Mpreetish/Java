import java.util.*;
class arrayjava{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of array:");
        int a=sc.nextInt();
        int[] arr=new int[a];
        for(int i=0;i<a;i++){
            arr[i]=sc.nextInt();
        }
        for(int b:arr){
            System.out.print(b+" ");
        }
        System.out.println();
        System.out.println(Arrays.toString(arr));
    
        
    }
   
}