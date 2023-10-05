package Sorting;
import java.util.*;
public class SelectionSort_02 {
    public static void main(String[] args) {
        int[] arr={1,25,2,4,5};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void sort(int[] arr){
        for(int i=0;i<arr.length;i++){
            int idx=Min_Value_Index(arr, i);
            int temp=arr[i];
            arr[i]=arr[idx];
            arr[idx]=temp;
        }
    }
    public static int Min_Value_Index(int[] arr,int i){
        int mini=i;
        for(int j=i+1;j<arr.length;j++){
            if(arr[j]<arr[mini]){
                mini=j;
            }
        }
        return mini;
    }
}
