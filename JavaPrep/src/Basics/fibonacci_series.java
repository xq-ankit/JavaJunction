package Basics;

import java.util.Scanner;

public class fibonacci_series{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a=0,b=1,c=0; // assuming 0 is the 1th term;
        // System.out.print(a+" "+b+" ");
        for(int i=1;i<=n-2;i++){
            // System.out.print(c+" ");
            c=a+b;
            a=b;
            b=c;
            }
            System.out.println(c);
    }
}