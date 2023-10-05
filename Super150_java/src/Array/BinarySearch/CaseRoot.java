//WAP to find the maximum no which satisfy the given  condition.
import java.util.Scanner;
public class CaseRoot {
    public static void main(String[] args) {
        int k=3;
        int n=146;
        System.out.println(max(k , n));
        
    }
    public static int max(int k,int n){
        int start=0;
        int end=146;
        int ans=0;
        while(start<=end){
            int mid=end-(end-start)/2;
             if(Math.pow(mid , k)<=n){
                ans=mid;
                start=mid+1;
                
             }
             else{
                end=mid-1;
             }

        }
        return ans;

    }
}
