import java.util.Scanner;
public class pattern_3 {
 public static void main(String[] args){
        Scanner scc=new Scanner(System.in);
        int n=scc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");

            }
            System.out.println();
        }
    }
    
}


