

import java.util.Scanner;

/*
 base se divide;
 destination base se multiply;
 */
public class q_16 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        System.out.println(conversion(a,b,c));
       
    }
    public static int conversion(int a,int b,int c){
        int dec=0;
        int k=0;
        while(c!=0){
           int  rem=c%10;
           dec+=(int)(rem*Math.pow(a,k));
           k++;
           c=c/10;

        }
    }
}

