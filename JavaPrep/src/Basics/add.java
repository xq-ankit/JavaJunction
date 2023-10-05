import java.util.Scanner; // to take the input from the user 


public class add {
    
    public static void main(String args[]) {
        Scanner obj =new Scanner(System.in);
        int a=obj.nextInt();
        int b=obj.nextInt();
        int sum=a+b;
        System.out.print("sum::"+sum);
    }
}
