package Pattern;
public class pattern_2 {
    public static void main(String args[]){
        //declare initial value  
        int n=5;
        int r=1;
        int star=1;
        //loop for the no of row
        while(r<=n){
        //print the fist row
            int i=1;
            while(i<=star){
                System.out.print("* ");
                i++;
            }
        //next line preperation
            r++;
            star++;
            System.out.println();

        }
    }
}
