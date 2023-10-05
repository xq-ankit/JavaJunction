/*A Boston number is a composite number, the sum of whose digits is the sum of the digits 
of its prime factors obtained as a result of prime factorization (excluding 1 ). The first 
few such numbers are 4,22 ,27 ,58 ,85 ,94 and 121 . For example, 378 = 2 × 3 × 3 × 3 × 7 is 
a Boston number since 3 + 7 + 8 = 2 + 3 + 3 + 3 + 7. Write a program to check whether a given 
integer is a Boston number.
1 if the number is a Boston number. 0 if the number is a not Boston number. */
import java.util.Scanner;

public class q_17 {
    static int digitsum;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        digitsum = countdigit(n);
        System.out.println(CheckBoston(n));

    }

    public static int CheckBoston(int n) {
        int sum = 0;
        while (n % 2 == 0) {
            sum += 2;
            n /= 2;
        }
    for (int i = 3; i <= Math.sqrt(n); i += 2) {
        while (n % i == 0) {
            sum += countdigit(i);
            n /= i;
        }
    }

        if (n > 1) {
            sum += countdigit(n);
        }

        if (digitsum == sum) {
            return 1;
        } else {
            return 0;
        }
    }

    public static int countdigit(int n) {
        int sum = 0;
        while (n != 0) {
            int rem = n % 10;
            sum += rem;
            n /= 10;
        }
        return sum;

    }
}
