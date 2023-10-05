package Pattern;
public class pattern_1 {
    public static void main(String args[]){
        int n=5;
        int row=1;
        int star=5;
        while(row<=n){
            //star
            int i=1;
            while(i<=star){
                System.out.print("* ");  //should be s.out.print()
                i++;
            }
            // next line preperation
            row++;
            System.out.println();  //next line

        }

    }
}
