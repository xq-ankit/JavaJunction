/*Take N (number of rows), print the following pattern (for N = 4)
0
1 1
2 3 5
8 13 21 34 */
package Assignment_01;

import java.util.Scanner;

public class pattern_08 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int star=1;
        int r=1;
        int a=0;
        int b=1;
        int c=a+b;
        while(r<=n){
            int i=1;
            while(i<=star){
                if(r==1){
                System.out.print(a+"\t");}
                else{
                    System.out.print(c+"\t");
                
                c=a+b;
                a=b;
                b=c;
            }
                i++;
            }
                
                   
            System.out.println();
            star++;
            r++;
         
        }
    }
    
}

