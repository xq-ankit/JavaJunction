package SubArray;
import java.util.*;

public class Maxsubarray_01 {

    public static void main(String[] args) {
        int []arr={-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(arr));
    } 

    public static int maxSubArray(int[] nums) {
        int sum = Integer.MIN_VALUE;
        int n = nums.length;

        for(int i = 0; i < n; i++){
            int temp = 0;
            for(int j = i; j < n; j++){
                temp += nums[j];
                sum = Math.max(temp, sum);
            }
        }

        return sum;
    }
}
