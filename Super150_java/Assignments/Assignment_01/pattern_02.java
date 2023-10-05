/*
 Take N (number of rows), print the following pattern (for N = 4).

                       1 
                     2 3 2
                   3 4 5 4 3
                 4 5 6 7 6 5 4
 */
package Assignment_01;
import java.util.Scanner;
public class pattern_02 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int star=1;
        int space=n-1;
        int r=1;
        while(r<=n){
            int i=1,j=1;
            while(i<=space){
                System.out.print("\t");
                i++;
            }
            int val=r;
            int temp=val;
            while(j<=star){
                System.out.print(temp+"\t");
                if(j<star/2+1){
                    temp++;
                    }
                else{
                    temp--;
                }
            j++;

        }
    
        System.out.println();
        r++;
        star+=2;
        space--;
    }
    }
    
}

