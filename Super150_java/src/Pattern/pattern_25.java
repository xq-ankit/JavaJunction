package Pattern;
import java.util.Scanner;
public class pattern_25 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int r=1;
        int space=n-1;
        int star=1;
        int num=1;
        while(r<=n){
            int i=1,j=1;
            while(i<=space){
                System.out.print("\t");
                i++;
            }
            while(j<=star){
                System.out.print(num+"\t");  
                j++;
                num++;
            }
            System.out.println();
            r++;
            star+=2;
            space--;

        }
    }

    
}
