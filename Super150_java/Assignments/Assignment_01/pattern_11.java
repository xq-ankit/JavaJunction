/*
 Take as input N, a number. Print the pattern according to given input and output section.
*
**
***
 */
package Assignment_01;
import java.util.*;
public class pattern_11 {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int r=1;
        int star=1;
        while(r<=n){
            int i=1;
            while(i<=star){
                System.out.print("*");
                i++;
            }
            System.out.println();
            r++;
            star++;
        }
    }
}
