/*
Take N (number of rows), print the following pattern (for N = 3).

1
2 3 2
3 4 5 4 3
2 3 2
1
*/

package Assignment_01;
import java.util.Scanner;

public class pattern_06{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r=1;
        int star=1;
        int space=n-1;
        int val=1;
        while(r<=2*n-1){
            int i=1,j=1,k=1;
            while(j<=space){
                System.out.print("\t");
                j++;
            }int temp=val;
            while(i<=star){
                System.out.print(temp+"\t");
                i++;
                temp++;
            }
            int temp2=temp-2;
            while(k<=star-1){
                System.out.print(temp2+"\t");
                k++;
                temp2--;
            }
            if(r<=(2*n-1)/2){
                star++;
                space--;
                val++;
            }
            else{
                star--;
                space++;
                val--;
            }
            System.out.println();
            r++;
            
        }
    }
}

