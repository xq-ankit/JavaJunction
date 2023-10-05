package Basics;

public class datatype {
    /* primative and non-primative
    byte     - 1  byte  -128 to 127
    short    - 2  byte
    integer  - 4  byte
    long     - 8  byte 
    float    - 4  byte
    double   - 8  byte
    char     - 2  byte (256 character are there in eng lang,in java we use unicode but the ascii value of character till 265 are same.)
    boolean  - 1  bit
    */
    
    public static void main(String[] args) {
        // int a=45;
        // System.out.println(a);
        char ch='A';
        int b=075;
       System.out.println(ch);
       for(byte i=0;i<128;i++){
        System.out.println(i); //when i=128 it will be typecasted as the number is out of range so 127--->-128
       }
        
    }
}
