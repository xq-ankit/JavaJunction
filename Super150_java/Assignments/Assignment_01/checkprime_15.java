// Take as input a number N, print "Prime" if it is prime if not Print "Not Prime".
package Assignment_01;
import java.util.*;

public class checkprime_15 {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i=2;
        while(i<=(n/2)){
            if(n%i==0){
                System.out.print("Not Prime");
                break;
            }
            i++;

        }
        if (i > n / 2){
        System.out.print("Prime");
        }

    }
}
    


