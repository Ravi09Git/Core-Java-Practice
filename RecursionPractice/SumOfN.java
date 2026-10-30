package RecursionPractice;
import java.util.*;

public class SumOfN {
  
  public static int recursive(int n){
    if(n == 0)return 0 ;// base case
    else{
      return n + recursive(n-1);
      
    }
    
  }
    public static void main(String[] args) {
       Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      
      System.out.println("Sum of "+n+" natural number is : "+ recursive(n));// recursion call
    }
}