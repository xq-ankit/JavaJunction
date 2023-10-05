package Pattern;
public class pattern_5 {
    public static void main(String args[]){
        int n=5;
        int row=1;
        int space=0;
        int star=n;
        while(row<=n){
            int i=1;
            int j=1;
        while(i<=space){
            System.out.print("  ");
            i++;
        }
        while(j<=star){
            System.out.print("* ");
            j++;
        }
        row++;
        space++;
        star--;
        System.out.println();

        }
    }
    
}
