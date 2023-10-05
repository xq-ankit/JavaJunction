/*Due to an immense rise in Pollution, Kejriwal is back with the Odd and Even Rule in Delhi. 
The scheme is as follows, each car will be allowed to run on Sunday if the sum of digits which 
are even is divisible by 4 or sum of digits which are odd in that number is divisible by 3. However
 to check every car for the above criteria can't be done by the Delhi Police. You need to help Delhi
  Police by finding out if a car numbered N will be allowed to run on Sunday? */

import java.util.Scanner;

public class q_19 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            int num=sc.nextInt();
            System.out.println(CarCheck(num));

        }
    }
    public static String CarCheck(int n){
        int sumO=0;
        int sumE=0;
        while(n!=0){
            int rem=n%10;
            if(rem%2==0){
            sumE+=rem;}
            else{
                sumO+=rem;
            }
            n/=10;
            }
        if(sumE%4==0 || sumO%3==0){
            return "Yes";
        }
       else{
            return "No";
        }
            
    }
    
}
