/*Given a integer as a input and replace all the '0' with '5' in the integer */

import java.util.Scanner;

public class q_12{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(replace(n));
    }
    public static int replace(int n){
        String temp=Integer.toString(n);
        for(int i=1;i<temp.length();i++){
            if(temp.charAt(i)-'0'==0){
                temp.charAt(i)='5';
            }
        }
        return temp-'0';

    }
}