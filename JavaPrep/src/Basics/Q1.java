// In a program, input 3 numbers : A, B and C. You have to output the average of
// these 3 numbers.
import java.util.Scanner;
public class Q1{
    public static void main(String args[]){
        Scanner obj =new Scanner(System.in);
        System.out.print("Enter a: ");
        int a=obj.nextInt();
        System.out.print("Enter b: ");
        int b=obj.nextInt();
         System.out.print("Enter c: ");
        int c=obj.nextInt();
        // integer divided by a integer gives a integer,hence a floating number (3.0f) is used 
        float avg=(a+b+c)/3.0f;
         System.out.println("Average :"+String.format("%.2f",avg));


    }
}