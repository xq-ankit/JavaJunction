import java.util.Scanner;

public class Syntax_00 {
    /*
    Acess modifer returntype name(){
        //body
        return statement
    }
     */

    public static void printhello(){
        System.out.println("Hello Programmeer");
       
    }

    /*
    
     return type name(type param1,type patam2){
        body
        return type
     }
     */
    public static int sum(int a,int b){ //parameters or formal parameter
        return a+b;

    }
    public static void main(String[] args) {
        //body to call function
        printhello();
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        System.out.println(sum(x,y)); //value passed while function calling is called: Argument,Actual parameter;
    }
}
