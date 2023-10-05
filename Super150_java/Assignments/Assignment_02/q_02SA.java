/*Take the following as input.
A number
A digit
Write a function that returns the number of times digit is found in the number. Print the value returned. */
import java.util.Scanner;

public class q_02SA {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int d=sc.nextInt();
        System.out.println(cd(n,d));
        
    }
    public static int cd(int num,int dig) {
        String n=Integer.toString(num);
        int count=0;
        for(int i=0;i<n.length();i++){
            if(n.charAt(i)-'0'==dig){
                count++;
            }
        }
        return count;

        
    }
}
