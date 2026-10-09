// check string palindrome
import java.util.*;


public class CheckPalindrome {
  public static boolean isPalindrome(String word){
    
    int start = 0 ;
    int end = word.length() - 1;
    while(start < end){
      
      if(word.charAt(start) != word.charAt(end)) {
        return false ;
      }
      else{ 
        start++ ;
        end--;
        
        } 
      
    }
    return true ;
  }
    public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      String word = scn.nextLine();
      // checking word isPlindrome
      boolean answer  = isPalindrome(word); 

      if(answer)System.out.println(word+" : yes! this is Palindrome");
      else System.out.println(word+" :Not! this is not Palindrome");
      scn.close();
    }
}