package Pattern;
import java.util.Scanner;

public class pattern_23 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = 1;
        int star = 1;
        int space = n - 1;
        
        while (r <= n) {
            int i = 1, j = 1;
           
            while (i <= space) {
                System.out.print("   ");
                i++;
            }

            while (j <= star) {
                System.out.print(" 1 ");
                j++;
            }
            System.out.println();
            r++;
            space--;
            star += 2;
        }
    }
}
