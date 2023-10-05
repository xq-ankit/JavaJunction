import java.util.*;
public class isarmstrong {
    public static void main(String args[]) {
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
System.out.println(isarmstrong(n));
    }
public static boolean isarmstrong(int n){
    String num=Integer.toString(n);   //to convert the number into string
    int org=n;
	int sum=0;
	while(n!=0){
		int rem=n%10;
		sum+=(int)(Math.pow(rem,num.length()));
		n/=10;
		}
		if(org==sum){
			return true;
		}
		else{
			return false;
		}
}
}