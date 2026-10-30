package RecursionPractice;

import java.util.*;

public class CheckPalindrome {
  static int reverseNum(int n ,int reverse){
    if(n==0){
      return reverse ; // base case
    }
    else{
      int last = n % 10 ;
      reverse = reverse * 10 + last ;
      
      return reverseNum(n/10,reverse);
    }
  }
  
    public static void main(String[] args) {
      // 12321
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      int palindrome = reverseNum(n,0); // recursive call
      
      if(n == palindrome){
        System.out.println(n+" : is palindrome");
      }
      else{
        System.out.println(n+" : is not palindrome");
      }
      
      
      

    }
}
