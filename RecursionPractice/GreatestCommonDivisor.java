package RecursionPractice;
import java.util.*;
 
public class GreatestCommonDivisor {
    static int GCD(int a , int b){
        if(b == 0 )return a ;  // base case
        return GCD(b , (a%b));
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a");
        int a = scn.nextInt();
        System.out.println("Enter b");
        int b = scn.nextInt();
        int ans = GCD(a,b);
        System.out.println("GCD of "+a+" & "+b+" : "+ans);
    }
}
