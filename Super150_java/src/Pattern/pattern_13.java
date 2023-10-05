package Pattern;
import java.util.Scanner;
public class pattern_13 {
    public static void main(String args[]){
    Scanner sc =new Scanner(System.in);
    int n=sc.nextInt();
    int row=1;
    int star=1;
//loop for the row 
    while(row<=2*n-1){
        int i=1,j=1;
//star
        while(i<=star){
            System.out.print("* ");
            i++;
        }
//mirror 
//if row in above mirror code then (row>n) 
if(row>=n){
    star--; //star ++;if(n<row)
}
else{
    star++;
}
row++; 
        System.out.println();

    }


    }
    
}
