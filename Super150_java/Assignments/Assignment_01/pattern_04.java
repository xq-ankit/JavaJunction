

/* Take N (number of rows), print the following pattern (for N = 4)

1
2 3
4 5 6
7 8 9 10 */
package Assignment_01;
import java.util.Scanner;
public class pattern_04{
    
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int r=1;
        int star=1;
        int val=1;
        while(r<=n){
            int i=1;
            while(i<=star){
                System.out.print(val+"\t");
                val++;
                i++;
            }
            System.out.println();
            r++;
            star++;
        }
    }}

