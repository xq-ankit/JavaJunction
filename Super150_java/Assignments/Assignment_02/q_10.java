/*/*Take the following as input.
A number (N1)
A number (N2)
Write a function which returns the LCM of N1 and N2. Print the value returned. */

import java.util.Scanner;

public class q_10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        System.out.println(hcf(n1,n2));
    }
    public static int hcf(int x,int y){
        int hcf=0;
        for(int i=Math.min(x,y);i>=2;i--){
            if(x%i==0 && y%i==0){
                hcf=i;
                break;

            }
        }
        return hcf;

    }
    
}
 */

import java.util.Scanner;

public class q_10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        System.out.println(lcm(n1,n2));
    }
    public static int lcm(int x,int y){
        int hcf=0;
        for(int i=Math.min(x,y);i>=2;i--){
            if(x%i==0 && y%i==0){
                hcf=i;
                break;

            }
        }
        return (x*y)/hcf;

    }
    
}
