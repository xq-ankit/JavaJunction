package Basics;
import java.util.Scanner;
public class sumofn {

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		System.out.print("Enter the n: ");
		int n=obj.nextInt();
		int sum=0;
		int i=1;
		while(i<=n) {
			sum+=i;
			i++;
		}
		System.out.print(sum);

	}
	

}
