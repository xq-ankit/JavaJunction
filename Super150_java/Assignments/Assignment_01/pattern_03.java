/* Take N (number of rows - only odd numbers allowed), print the following pattern (for N = 5).
*
*  *  *  
*  *  *  *  *  
*  *  *
*

*/
package Assignment_01;
import java.util.Scanner;
public class pattern_03{
   public static void main(String[] args){
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int star=1;
      int r=1;
      int space=n/2;
      while(r<=n){
         int i=1;
         while(i<=space){
            System.out.print("\t");
            i++;
         }
         int j=1;
         while(j<=star){
            System.out.print("*\t");
            j++;
         }
         if(r<=n/2){
            star+=2;
            space--;
            
         }
         else{
            star-=2;
            space++;
         }
         System.out.println();
         r++;
      }



   }
}


