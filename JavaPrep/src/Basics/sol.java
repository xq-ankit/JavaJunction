import java.util.*;
public class Sol {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(minOperations(n));

    }
    
    public static int minOperations(int n) {
        int sumarr=0;
        for(int i=0;i<=n;i+=2){
            sumarr++;
            }
            System.out.print(sumarr);
            int req=0;

       if(n%2!=0)
      req=sumarr/n+1;
       else
       req=sumarr/n;

        int noofoperation=0;
        for(int i=0;i<=n/2;i+=2){
            noofoperation+=Math.abs(i-req);
            
            }
            return noofoperation;
                
    }
}