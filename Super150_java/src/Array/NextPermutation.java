import java.util.*;

public class NextPermutation {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        nextPermutation(arr);

        // System.out.print(Arrays.toString(arr));

        //for(int i:arr) System.out.print(i+" ");
        
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        
    }

    public static void nextPermutation(int[] nums) {
        int n = nums.length;
        int index = -1;
        
        for (int i = n - 2; i >= 0; i--) {
            if (nums[i] < nums[i + 1]) {
                index = i;
                break;
            }
        }

        if (index == -1)
            reverse(nums, 0, n - 1);
        else {
            for (int i = n - 1; i > index; i--) {
                if (nums[i] > nums[index]) {
                    int temp = nums[i];
                    nums[i] = nums[index];
                    nums[index] = temp;
                    break; // Add a break statement here
                }
            }

            reverse(nums, index + 1, n - 1);
        }
    }

    public static void reverse(int[] arr, int start, int end) {
        if (arr == null || start < 0 || end >= arr.length || start >= end) {
            // Handle invalid inputs
            return;
        }

        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    }
}
