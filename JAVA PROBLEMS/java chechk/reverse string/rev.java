import java.util.*;
class rev{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String A=sc.nextLine();
       /* String b=new StringBuilder(A).reverse().toString();*/
        String r="";

       for(int i=A.length()-1;i>=0;i--){
         r=r+A.charAt(i);
        
        
       }
       System.out.println(r);
       
    
    }


}