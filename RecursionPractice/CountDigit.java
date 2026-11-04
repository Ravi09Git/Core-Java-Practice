package RecursionPractice;
import java.util.*;
public class CountDigit {
    static int countDigit(int n){
        if(n == 0)return 1 ; // base case
        else{
            int last = n % 10 ;
            return last * countDigit(n/10); // recursive call
        }
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int product = countDigit(n);
        System.out.println("Product of "+n+": "+product);
    }
}
