import java.util.*;
class alpha {
     public static void main(String[] args){
        String a="hello";
        char target='l';
        int b= valu(a,target);
        if(b ==-1){
            System.out.println("error");
        }
        else{
            System.out.println("Target finded : "+ b +" "+target);
        }


    }
    static int valu(String a,char target){
        if(a.length()==0){
            return -1;
        }
        for(int i=0;i<a.length();i++){
            if(a.charAt(i) == target){
                return i;
            }
        }
        return -1;
      
    }
    
}
