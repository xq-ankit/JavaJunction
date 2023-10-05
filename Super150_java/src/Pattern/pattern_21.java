package Pattern;
import java.util.Scanner;
public class pattern_21 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int r=1;
        int star=1;
        int space=(2*n-3);
        while(r<=n){
            int i=1,j=1,k=1;
            if(r==n){
                k+=1;}
            
            
        while(i<=star){
            System.out.print("*");
            i++;
        }
        while(j<=space){
            System.out.print(" ");
            j++;
        }
        while(k<=star){
            System.out.print("*");
            k++;
        }
        System.out.println();
        r++;
        space-=2;
        star++;
        }

        

    }
}
    
