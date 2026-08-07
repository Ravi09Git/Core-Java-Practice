
import java.util.*;
public class SwapTwoNumber {
    public static void main(String[]args){
    Scanner scn = new Scanner(System.in);
    System.out.println("Enter first number");
    int a = scn.nextInt();
    System.out.println("Enter second number");
    int b = scn.nextInt();
    // Using temp variable for save number 
    System.out.println("Befor swapping");
    System.out.println("a = "+a);
    System.out.println("b = "+b);
    int temp = a ;
    a = b ;
    b = temp ;
    System.out.println("After swapping");
    System.out.println("a = "+a);
    System.out.println("b = "+b);
  
  scn.close();
    }
}
