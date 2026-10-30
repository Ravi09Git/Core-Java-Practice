package RecursionPractice;

import java.util.*;

public class Fibbonacchi {
  static int first = 0 ;
  static int second = 1 ;
  static int count = 2 ;
  static int fib = 0;
  public static void recursive(int n){
  if(n == 0 || n == 1){
    System.out.print(first+" ");
    return ;
  }
  
   if(n >= 2){
    
    if(n == count){
      System.out.print(first+" "+second+" ");
      return ; // base case
    }
    else{
      recursive(n-1); // recursion call
      fib = first + second ;
      first = second ;
      second = fib ;
      
      System.out.print(fib+" ");
    }
    
  }
 
  }
  
    public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      recursive(n);// recursion call

    }
}
