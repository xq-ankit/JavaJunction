/*Take N (number in binary format).]
 Write a function that converts it to decimal format and Print the value returned. */

import java.util.Scanner;

public class q_04 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(bintodec(n));

    }
    public static int bintodec(int n){
        int dec=0;
        int k=0;
        while(n!=0){
            int rem=n%10;
            dec+=(int)rem*Math.pow(2,k);
            k++;
            n/=10;
        }
        return dec;

    }
    
}
