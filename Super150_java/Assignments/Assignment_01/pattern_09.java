package Assignment_01;
/*
Take N (number of rows), print the following pattern (for N = 4).

                       1           1
                       1 2       2 1  
                       1 2 3   3 2 1
                       1 2 3 4 3 2 1   
 */
import java.util.Scanner;
public class pattern_09{
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int r=1;
        int star=1;
        int  space=n+1;
        int val,temp;
        while(r<=n){
            int i=1,j=1,k=1;
            val=1;
            while(i<=star){
                System.out.print(val+" ");
                val++;
                i++;
            }
            while(j<=space){
                System.out.print("  ");
                j++;
            }
            temp=val-1;
            if(temp==n){
                temp=val-2;
                k++;
            }
            while(k<=star){
                System.out.print(temp+" ");
                temp--;
                k++;
            }
            System.out.println();
            r++;
            star++;
            space-=2;

        }


    }
    
}

