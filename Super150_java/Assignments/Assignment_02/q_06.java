//Take N as input. Print Nth Fibonacci Number, given that the first two numbers 
//in the Fibonacci Series are 0 and 1.

import java.util.Scanner;

public class q_06 {
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    printfibonacci(n);
    }
    public static void printfibonacci(int n){
        int num=0;
        int a=0,b=1;
        if (n==0){
            num=0;}
        else if (n==1){
            num=1;
        }
        else{

            for(int i=1;i<=n-1;i++){
                num=a+b;
                a=b;
                b=num;
            }
        }
        System.out.println(num);
    }
    
}

