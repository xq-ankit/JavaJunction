import java.util.Arrays;
import java.util.Scanner;

public class RotateArray_09 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int [] arr={1,2,4,3,5,7,6};
        int k=3;
        Rotate(arr,k);
        System.out.println(Arrays.toString(arr));
    }
    public static void Rotate(int[] nums,int k){
        k=k%nums.length;
        while(k!=0){
        int temp=nums[nums.length-1];
        for(int i=nums.length-2;i>=0;i--){
            nums[i+1]=nums[i];
        }
        nums[0]=temp;
        k--;
    }
    
}
    
}
