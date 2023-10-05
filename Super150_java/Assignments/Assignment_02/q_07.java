/*Take the following as input.
Minimum Fahrenheit value
Maximum Fahrenheit value
Step
Print as output the Celsius conversions. Use the formula C = (5/9)(F – 32) E.g. 
for an input of 0, 100 and 20 the output is
0 -17
20 -6
40 4
60 15
80 26
100 37 */

import java.util.Scanner;

public class q_07 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int min=sc.nextInt();
        int max=sc.nextInt();
        int diff=sc.nextInt();
        printtemp(min,max,diff);
    }
    public static void printtemp(int min,int max,int diff){
        for(int i=min;i<=max;i+=diff){
            int c=(int)((5.0/9.0)*(i-32));
            System.out.println(i+" "+c);
        }
    }
    
}
