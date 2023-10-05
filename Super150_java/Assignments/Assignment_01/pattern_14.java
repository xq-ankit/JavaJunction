package Assignment_01;
/*Take N as input. For a value of N=5, we wish to draw the following pattern :

             5                   5 
             5 4               4 5 
             5 4 3           3 4 5 
             5 4 3 2       2 3 4 5 
             5 4 3 2 1   1 2 3 4 5 
             5 4 3 2 1 0 1 2 3 4 5 
             5 4 3 2 1   1 2 3 4 5 
             5 4 3 2       2 3 4 5 
             5 4 3           3 4 5 
             5 4               4 5 
             5                   5 */
import java.util.Scanner;
public class pattern_14{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int r=1;
        int star=1;
        int space=2*n-1;
        int val,temp;
        while(r<=2*n+1){
            int i=1,j=1,k=1;
            val=n;
            while(i<=star){
                System.out.print(val+" ");
                val--;
                i++;

            }
            while(j<=space){
                System.out.print("  ");
                j++;

            }
            temp=val+1;
            if(temp==0){
                temp=val+2;
                k++;
            }
            while(k<=star){
                System.out.print(temp+" ");
                k++;
                temp++;

            } 
            if(r<=n){          
            star++;
            space-=2;}
            else{
                star--;
                space+=2;
            }
            System.out.println();
            r++;
        }
    }
}