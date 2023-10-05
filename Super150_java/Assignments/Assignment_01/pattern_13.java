package Assignment_01;
/* Take N (number of rows), print the following pattern (for N = 6)
1
1 1
1 2 1
1 3 3 1
1 4 6 4 1
1 5 10 10 5 1 */ 
import java.util.Scanner;
public class pattern_13 {
    public static void main(String[] a){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
    int r=0;
    while(r<n){
        int i=0;
        int val=1;
        while(i<=r){
            System.out.print(val+" ");
            val=val*(r-i)/(i+1);
            i++;
        }
        System.out.println();
        r++;
    }    
}
    
}
hello world!
