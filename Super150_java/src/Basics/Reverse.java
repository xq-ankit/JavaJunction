package Basics;
import java.util.Scanner;
public class Reverse {
    public static void main (String args[]){
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        int sum=0;
        while(n>0){
            int rem=n%10;
            sum=sum*10+rem;
            n/=10;
        }
        System.out.println(sum);

    }
    
}
