// Given number of rows N, you have to print a Hollow Rhombus. See the output for corresponding given input.
//     *****
//    *   *
//   *   *
//  *   *
// *****
package Assignment_01;
import java.util.Scanner;

public class pattern_05 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int r=1;
        int star=1;
        int space=n-1;
        while(r<=n){
            int i=1;
            int j=1;
            while(i<=space){
                System.out.print(" ");
                i++;
                
            }
            while(j<=star){
                if(r==1||r==n){
                    System.out.print("*");
                    star=n;
                }
                else{
                    star=1;
                    System.out.print("*   *");
                }
                j++;
            }
            System.out.println();
            r++;
            space--;
        }
    }
    
}
