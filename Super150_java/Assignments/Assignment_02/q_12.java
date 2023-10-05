/*Given a longeger as a input and replace all the '0' with '5' in the longeger */

import java.util.Scanner;

public class q_12{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long n=sc.nextLong();
         System.out.println(replace(n));
    }
    public static long replace(long n){
        long sum=0;
        long k=1;
        if (n == 0) {
            return 5; // Special case for when the input is 0.
        }
       while(n!=0){
        long rev=n%10;
        if(rev==0){
            rev=5;
        }
        sum+=rev*k;
        k*=10;
        n/=10;

       }
       return sum;
    }
}