// Given a list of numbers, stop processing input after the 
// cumulative sum of all the input becomes negative.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        
        while (true) {
            int n = sc.nextInt();
            sum += n;
            
            if (sum < 0) {
                break;
            }
            
            System.out.println(n);
        }
    }
}

