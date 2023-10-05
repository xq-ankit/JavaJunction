package Basics;
import java.util.Scanner;
public class sumofeven {
    public static void main(String args[]){
     Scanner obj=new Scanner(System.in);
     int n=obj.nextInt();
     int i=1;
     int sum=0;
    while(i<=n){
     if(i%2==0){
            sum+=n;
        }
        i++;
     }
     System.out.println(sum);
    }
    
}
