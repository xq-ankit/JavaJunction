package Basics;
import java.util.Scanner;
public class Primeno {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i=2;
        for(i=2;i<=n/2;i++){
            if(n%i==0){
                System.out.println("Not Prime");
                break;
            }

        }
            if(i>n/2){
                System.out.println("prime");
            }

        
    }

    
}
