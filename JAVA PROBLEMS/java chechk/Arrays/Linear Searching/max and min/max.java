
class max {
     public static void main(String[] args){
        int[] arr={10,2,5377,11,334,543,809};
        int a= valu(arr);
        if(a==-1){
            System.out.println("The give array is empty");
        }
        else{
            System.out.println("the max value is :"+ a);
        }
        

    }
    static int valu(int[] arr){
        int max=arr[0];
        if(arr.length==0){
            return -1;
        }
        for(int i=1;i<arr.length;i++){
           if(arr[i]>max){
            max=arr[i];
           } 
        }
        return max;
    }
    
}
