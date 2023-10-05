package Pattern;
import java.util.*;
public class pattern_11 {
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        int r=1;
        int star=1;
        int space=n-1;
        while(r<=n){
            int i=1,j=1;
          
            while(i<=space){
                System.out.print("   ");
                i++;
            }
            while(j<=star){
                System.out.print("  *   " );
                j++;
            }
            System.out.println();
            r++;
            star++;
            space--;
        }
    }
    
}
