// find the target elementt from the given array
// package Array;
import java.util.*;

public class TargetElement_04 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<arr.length;i++){
            int temp=sc.nextInt();
            arr[i]=temp;
        }
        int item=sc.nextInt();
        System.out.println(search(arr,item));
}
public static int search(int[] arr,int target){
    for(int i=0;i<arr.length;i++){
        if(arr[i]==target){
            return i;
        }
    }
    return -1;
}



    
}
