import java.util.Scanner;

public class primefactorization {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        primefactorization(n);
    }
    public static void primefactorization(int n){
        while(n%2==0){
            int rem=n%2;
            System.out.print(2+" X ");
            n/=2;
        }
        for(int i=3;i<=n;i+=2){
            while(n%i==0){
            System.out.print(i+" X ");
            n/=i;}
        }
        if(n>1){
            System.out.print(n);
        }


    }
}
