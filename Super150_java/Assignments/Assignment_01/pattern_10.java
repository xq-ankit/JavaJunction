package Assignment_01;
/*You will be given a number N. You have to code a hollow diamond looking pattern.
The output for N=5 is given in the following image.
*********
**** ****
***   ***
**     **
*       *
**     **
***   ***
**** ****
*********
*/
import java.util.*;
public class pattern_10{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int r=1;
        int star=5;
        int space=-1;
        while(r<=2*n-1){
            int i=1,j=1;
            if(r==1||r==2*n-1){
                i++;
            }
            while(i<=star){
            System.out.print("*");
            i++;
            }
            while(j<=space){
                System.out.print(" ");
                j++;
            }
            int k=1;
            while(k<=star){
            System.out.print("*");
            k++;
            }
            if(r<=(2*n-1)/2){
                star--;
                space+=2;
            }
            else{
                star++;
                space-=2;
            }
            System.out.println();
            r++;
            
        }

    }
    
}
