import java.util.*;
class swap{
    public static void main(String[] args){
        int a=10;
        {
            int b=3;
            b=a;
            System.out.println(b);
        }

        {
            a=b;
            
        }
        b=a;
        System.out.println(a);
        
    }
}