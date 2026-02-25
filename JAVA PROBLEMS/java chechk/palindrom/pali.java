import java.util.*;
class pali{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String A=sc.nextLine();
        A=A.toLowerCase();
        String b=new StringBuilder(A).reverse().toString();
        if(b.equals(A)){
            System.out.println("Palidrom");
        }
        else{
            System.out.println("NOt a Palidrom");
        }


    }
}