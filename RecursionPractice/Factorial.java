package RecursionPractice;

import java.util.*;

public class Factorial {
 
  public static int recursive(int n){
    
    if(n == 0){// base case
      return 1; 
    }
    else{
      
     return n * recursive(n-1);
    }
    
  }
    
    public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      System.out.println("Factorial of "+n+" is :"+recursive(n));// recursion call
     
    }
}
