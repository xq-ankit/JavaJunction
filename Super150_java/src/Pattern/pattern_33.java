import java.util.*;
public class pattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int space=n-1;
        int star=1;
        int row=1;
        int num=n-1;
        while(row<=n){
            int i=1;
            while(i<=space){
                System.out.print("  ");
                i++;
            }
            int j=1;
            int org=space+1;
            while(j<=star){
                if(j==star/2+1){
                    System.out.print("0 ");
                    org=num+1;
                }
                else{
                System.out.print(org +" ");
                }
                if(j<star/2){
                    org++;
                }
                else{
                    org--;
                }
                j++;

               
            }
            star+=2;
            space--;
            row++;
           System.out.println();
        }
    }
}
