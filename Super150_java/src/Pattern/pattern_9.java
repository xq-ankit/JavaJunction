package Pattern;
public class pattern_9 {
    public static void main(String args[]){
        int n=5;
        int r=1;
        int space=n-1;
        int star=1;
        while(r<=n){
            int i=1;
            while(i<=space){
                System.out.print("  ");
                i++;
            }
            int j=1;
            while(j<=star){
                System.out.print("* ");
                j++;
            }
            r++;
            space--;
            star+=2;
            System.out.println();
        }
    }
}
