// Take as input a number N, print "Prime" if it is prime if not Print "Not Prime".
import java.util.Scanner;

public class q_09{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(checkprime(n));

    }
    public static String checkprime(int n){
        int i;
        for(i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                return "Not Prime";
            }
        }
        if(i>Math.sqrt(n)){
            return "Prime";
        }
        return ""; //mandatory since a String return function but it will never be executed
       
               
        }

    }
