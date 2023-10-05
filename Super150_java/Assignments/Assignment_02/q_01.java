// Take N as input. Print the sum of its odd placed digits and sum of its even placed digits.
package Assignment_02;

import java.util.Scanner;

public class q_01{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sumO=0,sumE=0,i=1;
        while(n!=0){
            int rem=n%10;
            if(i%2!=0){
                sumO+=rem;
            }
            else{
                sumE+=rem;
            }
            n/=10;
            i++;

        }
        System.out.println(sumO);
        System.out.println(sumE);
    }
}