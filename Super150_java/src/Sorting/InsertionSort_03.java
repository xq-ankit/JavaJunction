package Sorting;

public class InsertionSort_03 {
    public static void main(String[] args) {
        int[] arr={2,4,56,5,32}
        
        
    }
    public static void sort(int[] arr,int j){
        for(int i=1;i<arr.length;i++){
            insert_element(arr,i);
        }

    }
    public static void insert_element (int[] arr,int i){
        int j=i-1;
        int item =arr[i];
        while(j>=0 && arr[j]>item){
            arr[j+1]=arr[j];
            j--;
        }
        arr[j+1]=item;
    }
    
}
