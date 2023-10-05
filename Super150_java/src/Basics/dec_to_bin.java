package Basics;
/*
 base se divide;
 destination base se multiply;
 */
public class dec_to_bin {
    public static void main(String[] args) {
        int n=57;
        int sum=0;
        while(n!=0){
            int rem=n%2;
            sum=sum*10+rem;
            n/=2;
        }
        System.out.println(sum);
    }
}
