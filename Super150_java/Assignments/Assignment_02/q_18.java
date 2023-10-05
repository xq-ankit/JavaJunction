/*Faculty at CodingBlocks loves to purchase smartphones and 
decides to play a game. Aayush and Harshit decides to shop for
smartphones. Aayush purchases 1 smartphone, then Harshit purchases 
2 smartphones, then Aayush purchases 3 smartphones, then Harshit
purchases 4 smartphones, and so on. Once someone can't purchase
more smartphones, he loses.
Aayush can purchase at most M smartphones and Harshit can
purchase at most N smartphones. Who will win ? Print "Aayush"
 and "Harshit" accordingly. */
 import java.util.*;
public class q_18 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t!=0){
            int a=sc.nextInt();
            int h=sc.nextInt();
            System.out.println(winner(a,h));
            t--;
            }
    }
    public static String winner(int a,int h){
        int sumA=0,sumH=0;
        int i=1;
        while(true){
            if(i%2!=0){
                if(sumA+i<=a){
                    sumA+=i;
                    }
                    else{
                       return "Harshit";
                    }
            }

            else{
                if(sumH+i<=h)
                {
                sumH+=i;
                }
                else{
                    return "Aayush";
                }
            }
           
            i++;

        }
    }
    
}
