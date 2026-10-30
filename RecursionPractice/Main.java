package RecursionPractice;

import java.util.*;

public class Main {
  static int sumDigit(int n){
    if( n== 0)return 0 ;//base case
    else{
      int last = n % 10 ;
      
      
      return last + sumDigit(n/10);
    }
  }
    public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      System.out.println("Sum of digit "+n+" is: "+sumDigit(n));// recursion call
      // 1234
    }
}
