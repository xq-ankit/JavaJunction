/*The goal is to understand various input's in java
next     :: string,end after a space
nextLine :: string with space
nextInt
nextByte
nextFloat
nextDouble
nextBoolean
nextShort
nextLong

*/
import java.util.*;
public class inputjava{
    /**
     * @param args
     */
    public static void main(String args[]){
        Scanner bj= new Scanner(System.in);
        System.out.print("ENTER NAME:");
        // String name=bj.next();// single word
        // System.out.println("NAME: "+name);
        String str= bj.nextLine(); // multiple words with space
        System.out.println(str);
    }
} 