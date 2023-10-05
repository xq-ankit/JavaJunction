package Pattern;
public class pattern_3 {
    public static void main(String args[]){
        int n=5;
        int r=1;
        int star=5;
        while(r<=n){
            int i=1;
            while(i<=star){
                System.out.print("* ");
                i++;
            }
            r++;
            star--;
            System.out.println();
        }
    }
}
