package Basics;

import java.util.Scanner;

public class bin_to_dec{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        int k=0;
        while(n!=0){
           int  rem=n%10;
           sum+=(int)(rem*Math.pow(2,k));
           k++;
           n=n/10;

        }
        System.out.println(sum);
    }
    
}
