package Pattern;
import java.util.*;
public class pattern_10 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int r=1;
        int star=2*n-1;
        int space=0;
        while(r<=n){
            int i=1;
            int j=1;
            while(j<=space){
                System.out.print("  ");
                j++;
            }
            while(i<=star){
                System.out.print("* ");
                i++;
            }
            System.out.println();
            r++;
            star-=2;
            space++;
        }

    }
    
}
