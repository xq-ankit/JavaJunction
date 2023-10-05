package Pattern;
public class pattern_6 {
    public static void main(String args[]){
        int n=5;
        int r=1;
        int space=0;
        int star=n;
        //row
        while(r<=n){
            int i=1;
            //space
            while(i<=space){
                System.out.print("  ");
                i++;
            }
            int j=2;
            while(j<=star){
                System.out.print("* ");
                j++;
            }
            System.out.println();
            r++;
            space+=2;
            star--;
        }
    }
    
}
