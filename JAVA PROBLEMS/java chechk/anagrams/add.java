import java.util.*;
class add{
    static boolean isAnagram(String a,String b){
        int A=a.length();
        int B=b.length();
        if(A!=B){
            return false;
        }
        a=a.toLowerCase();
        b=b.toLowerCase();
        char[] arr1=a.toCharArray();
        char[] arr2=b.toCharArray();
        return Arrays.equals(arr1,arr2);
    
        
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        String b=sc.nextLine();
        sc.close();
        System.out.println(isAnagram(a,b));
        Boolean result=isAnagram(a,b);
        if(result){
            System.out.println("Anagaram");
        }
        else{
            System.out.println("No Anagaram");
        }

    }
}