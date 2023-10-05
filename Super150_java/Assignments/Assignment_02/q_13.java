/*Take the following as input.

A number (N1)
A number (N2)
Write a function which prints first N1 terms of the series 3n + 2 which are not multiples of N2.*/

import java.util.Scanner;

public class q_13{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int y=sc.nextInt();
        int count=0;
        int i=0;
        while(count<n){
            if((3*i+2)%y!=0 && ((3*i+2)>y)){
                System.out.println(3*i+2);
                count++;
            }
            i++;

        }
    }
}