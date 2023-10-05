package Pattern;
import java.util.*;
public class pattern_27 {
public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int r=1;
    int space=n-1;
    int star=1;
    while(r<=n){
        int val=1;
        int i=1,j=1;
        while(i<=space){
            System.out.print("\t");
            i++;
        }
        
        while(j<=star){
            System.out.print(val+"\t");
            if(j<=star/2){
                val++;}
                else{
                    val--;
                }
                j++;
        }
    System.out.println();
r++;
star+=2;
space--;    
}
}
}
