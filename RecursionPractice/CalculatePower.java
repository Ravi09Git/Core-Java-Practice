package RecursionPractice;

import java.util.*;

public class CalculatePower {
  
      public static int recursive(int n , int power){
        if(power == 0)return 1 ; // base case
        else{
          System.out.println(power+" <- power");
          return n * recursive(n,power-1);
        }
      }
      
      
    public static void main(String[] args) {
      
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      int power = scn.nextInt();
      System.out.println(n+" raised to the power "+power+" is : "+ recursive(n,power));// recursion call
      
    }
}
