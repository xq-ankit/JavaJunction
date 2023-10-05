// Take N (number of rows), print the following pattern (for N = 5).
/*
*   *   *   *   *		  
*	*	    *   *
*               *
*   *       *   *
*   *   *   *   *  
 */
package Assignment_01;
import java.util.Scanner;
public class pattern_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = 1;
        int star = n / 2 + 1;
        int space = -1;

        while (r <= n) {
            // Print stars
            int i = 1;
            if(r==1|| r==n){
                i++;
            }
            while (i <= star) {
                System.out.print("*\t");
                i++;
            }

            // Print spaces
            int j = 1;
            while (j <= space) {
                System.out.print("\t");
                j++;
            }

            // Print stars for the second half of the row
            int k = 1;
            i = 1; // Reusing i for the second set of stars
            while (k <= star) {
                if (i <= star) {
                    System.out.print("*\t");
                } else {
                    System.out.print("\t");
                }
                i++;
                k++;
            }

            // Move to the next line and adjust star and space count
            System.out.println();

            if (r <= n / 2) {
                star--;
                space += 2;
            } else {
                star++;
                space -= 2;
            }

            r++;
        }
    }
}
