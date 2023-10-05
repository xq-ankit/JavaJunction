package Basics;
import java.util.Scanner;

public class checkprime {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i;
        for(i=2;i<=n/2;i++){
            if(n%i==0){
                System.out.println("Not Prime");
                break;
            }
        }
        if(i>n/2){
            System.out.println("Prime");
        }
    }
    
}
