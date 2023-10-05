/*
Take N (number of rows), print the following pattern (for N = 5)
1
2 2
3 0 3
4 0 0 4
5 0 0 0 5
*/
package Assignment_01;
import java.util.Scanner;
public class pattern_07 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int val=1;
        int r=1;
        int star=1;
        while(r<=n){
            int i=1;
            while(i<=star){
                if(i==1 || i==star){
                    System.out.print(val+"\t");
                   
                }
                else{
                    System.out.print("0\t");
                }
                i++;
            }
            System.out.println();
            r++;
            star++;
            val++;
            
        }

        
    }
    
}
