/*Take N as input. For a value of N=5, we wish to draw the following pattern :

                          5 4 3 2 1 0 1 2 3 4 5
                            4 3 2 1 0 1 2 3 4 
                              3 2 1 0 1 2 3 
                                2 1 0 1 2 
                                  1 0 1 
                                    0 
                                  1 0 1 
                                2 1 0 1 2 
                              3 2 1 0 1 2 3 
                            4 3 2 1 0 1 2 3 4 
                          5 4 3 2 1 0 1 2 3 4 5 */
package Assignment_01;                         
import java.util.Scanner;
public class pattern_16 {
    public static void main(String[] ank){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int r=1;
        int star=n+1;
        int space=0;
        int val=n;
        while(r<=2*n+1){
            int i=1,j=1,k=1;
            while(i<=space){
                System.out.print("  ");
                i++;
            }
            int temp=val;
            while(j<=star){
                System.out.print(temp+" ");
                j++;
                temp--;
                
            }
            int temp2=temp+2;
            while(k<=star-1){
                System.out.print(temp2+" ");
                k++;
                temp2++;
               
            }
            if(r<=n){
                star--;
                space++;
            val--;
        }
                else{
                    star++;
                    space--;
                    val++;
                }
            System.out.println();
            r++;

        }
        
    }
    
}

