package Basics;
import java.util.Scanner;

public class max {

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter the number x: ");
		int x=obj.nextInt();
		System.out.println("Enter the number y: ");
		int y=obj.nextInt();
		if(x>=y) {
			System.out.print(x+"is greater than"+y);
		}
		else {
			System.out.print(y+"greater than"+x);
		}

	}

}
