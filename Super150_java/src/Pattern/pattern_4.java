package Pattern;
public class pattern_4 {
    public static void main(String args[]){
    //initial value setup
        int n=5;
        int row=1;
        int space=(n-1);
        int star=1;
    //loop for row
        while(row<=n){
            int i=1,j=1;
    //loop for space
            while(i<=space){
                System.out.print("  ");
                 i++;
        }
    //loop for star
            while(j<=star){
                System.out.print( "* ");
                j++;
        }
    //next row preperation
        System.out.println();
        row++;
        star++;
        space--;

    }
    
}
}
