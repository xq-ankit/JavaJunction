package Array;

public class Array_00{
    public static void main(String[] args){
        //int a;
     //inilizating null value to the whole array
        int[] arr=new int[5];
        System.out.println(arr);
        System.out.println(arr.length);
        // only one array is made but two reference variable in the stack memory
         //pointting towards the same memory in the heap memory
         int [] other=arr; 
    }

    
}
