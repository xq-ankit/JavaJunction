package Assignment_01;
/*Take N as input. For a value of N=7, we wish to draw the following pattern :

                            1 
                        2 1   1 2 
                    3 2 1       1 2 3 
                4 3 2 1           1 2 3 4 
                    3 2 1       1 2 3 
                        2 1   1 2 
                            1 
 */
import java.util.Scanner;
public class pattern_12 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int space=n-1;
        int star=1;
        int space2=-1;
        int val=1;
        int r=1;
        while(r<=n){
            int i=1,j=1,k=1,l=1;;
            while(i<=space){
                System.out.print("  ");
                i++;
            }
            int temp2=val;
            while(j<=star){
                System.out.print(temp2+" ");
                j++;
                temp2--;
            }
            while(k<=space2){
                System.out.print("  ");
                k++;
            }
            if(r==1||r==n){
                l+=1;
            }
            int temp=1;
            while(l<=star){
                System.out.print(temp+" ");
                l++;
                temp++;
            }

            if(r<=n/2){
                star++;
                space-=2;
                space2+=2;
                val++;
            }
            else{
                star--;
                space+=2;
                space2-=2;
                val--;
            }
            System.out.println();
            r++;
        }    
    }
}

