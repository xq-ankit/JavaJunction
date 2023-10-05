package Pattern;
import java.util.*;
public class pattern_12 {
    /**
     * @param args
     */
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int space=n-1;
        int r=1;
        int star=1;
        while(r<=n){
            int i=1;
            int j=1;
            while(i<=space){
                System.out.print("  ");
                i++;
            }
            while(j<=star){
                if(j%2==0){
                    System.out.print("! ");}
                    else{
                        System.out.print("* ");
                    }
                j++;
                }
            System.out.println();
            r++;
            space--;
            star+=2;
            }
        }
    }


    

