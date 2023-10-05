package Pattern;
import java.util.Scanner;
public class pattern_17 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int row=1;
        int star=n/2;
        int space=1;
        //row
        while(row<=n){
            int i=1;
        //star
            while(i<=star){
                System.out.print("* ");
                i++;
            }
        //space
        int j=1;
        while(j<=space){
            System.out.print("  ");
                j++;
        }
        //second star
        int k=1;
        while(k<=star){
            System.out.print(" *");
            k++;
        }
        //mirror
        if(row<=n/2){
            star--;
            space+=2;}
        else{
            star++;
            space-=2;
        }
        row++;
        System.out.println();
        }

    }
    
}
