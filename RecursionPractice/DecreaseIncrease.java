package RecursionPractice;

import java.util.*;

public class DecreaseIncrease{
  public static void recursive(int n){
    if(n==0){
      
      return ;
    }
    else{
      System.out.print(n+" ");
      recursive(n-1);
      System.out.print(n+" ");
    }
  }
    public static void main(String[] args) {
      int N = 4 ;
      recursive(N);
    }
}
