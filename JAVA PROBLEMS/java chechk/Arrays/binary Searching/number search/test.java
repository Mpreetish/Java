import java.util.*;
class test{
    public static void main(String[] args){
        int[] a={1,2,3,4,5,6,7,8,9,10,11,12,14};
        int t =10;
        int start=0;
        int end=a.length-1;
        int s=d(a,t,start,end);        // to print numbers
      //   String s=d(a,t,start,end);  // to print words
      //   System.out.println(s);
       if(0<s){
        System.out.println("target finded at "+s+" index.");

       }
       else{
        System.out.println("Not found");
       }
    }
    static int d(int[] a,int t,int start,int end){   //to print number
    //static String d(int[] a,int t,int start,int end){   //to print string
        
        while (start <= end){
            int m=(start+end)/2;
            if(a[m]==t){
                return m;
               // return "Finded";s
            }
            else if(a[m]>t){
                end=m-1;
               
            }
            else if(a[m]<t){
               start=m+1;
            }
            else{
                return -1;
                //return "Not find";
            }
        }
          return  -1;
       // return "No";

    }
}