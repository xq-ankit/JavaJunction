package Sorting;

import java.util.Arrays;

public class bubbleSort_01{
    public static void main(String[] args) {
        int[] arr={1,25,2,4,5};
        bubblesort(arr);
    }
    public static void bubblesort(int[] arr){
        for(int turn=1;turn<arr.length;turn++){
            for(int i=0;i<arr.length-turn;i++){
                if(arr[i]>arr[i+1]){
                    int temp=arr[i];
                    arr[i]=arr[i+1];
                    arr[i+1]=temp;
                }
            }
            
        }
        System.out.println(Arrays.toString(arr));
    }
}
