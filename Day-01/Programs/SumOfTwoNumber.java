
import java.util.* ;
public class SumOfTwoNumber {
    public static void main(String[]args){
    Scanner scn = new Scanner(System.in);
    System.out.println("Enter first number");
    int a = scn.nextInt();
    System.out.println("Enter second number");
    int b = scn.nextInt();
    int sumOfNumber = a + b ;
    System.out.println("Sum of two number is = "+sumOfNumber);
    scn.close();
  }
}
