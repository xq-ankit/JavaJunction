package Basics;
import java.util.Scanner;
public class grade {
    public static void main(String args[]){
        System.out.println("Enter the marks: ");
        Scanner obj=new Scanner(System.in);
        int x=obj.nextInt();
        if(x>75){
            System.out.println("GRADE:: A");
        }
        else if(x>65 && x<=75){
            System.out.println("GRADE:: B");

        }
        else if(x>=50 && x<=65){
            System.out.println("GRADE:: C");
        } 
        else
        System.out.println("fail");

    }
    
}
