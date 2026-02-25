import java.util.Arrays;
class numer{
    public static void main(String[] args){
        int[] arr={1,4,32,3,2,6};  
        int target=32;
        int ans=fin(arr,target);
    
        System.out.println("target find :"+ans);
       
    }
    static int fin(int[] a,int target){
      
        if(a.length==0){
            return -1;
        }
        for(int i=0;i<a.length;i++){
            if(a[i]==target){
              //  return i; this for index 
              //  return a[i]; this for printing the element 
                
            }
        }
        return -1;

    }
}
