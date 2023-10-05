import java.util.*;

public class ReverseArray_08 {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int start=sc.nextInt();
        int end=sc.nextInt();
        reverse(arr,start,end);
        System.out.println(Arrays.toString(arr));
    }
    public static int[] reverse(int[] arr,int start,int end){
        int i=start;
        int j=end;
        while(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
        return arr;

        
    }
}


