package SubArray;

public class kadaneAlgo_02 {
    public static void main(String[] args) {
        int []arr={-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(arr));
    } 

    public static int maxSubArray(int[] nums) {
        int ans = Integer.MIN_VALUE;
        int n = nums.length;
        int sum = 0;
        for(int i = 0; i < n; i++){
            sum += nums[i];
            ans = Math.max(sum, ans);
            if(sum<0)
            sum=0;
            }
            
            return ans;
        }
    }
    

