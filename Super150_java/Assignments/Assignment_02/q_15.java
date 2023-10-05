/*Take the following as input.

A number (N1)
A number (N2)
Write a function which prints all armstrong numbers between N1 and N2 (inclusive).

371 is an Armstrong number as 371 = 3^3 + 7^3 + 1^3 */
import java.util.*;
public class q_15{
    public static void main(String args[]) {
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int y=sc.nextInt();
isarmstrong(n,y);
    }
public static void isarmstrong(int n ,int y){
    for(int i=n;i<=y;i++){
    String num=Integer.toString(i);   //to convert the number into string
    int org=i;
	int sum=0;
	while(i!=0){
		int rem=i%10;
		sum+=(int)(Math.pow(rem,num.length()));
		i/=10;
		}
        if(org==sum){
			System.out.println(org);
		}
	}
}
}