package RecursionPractice;

import java.util.Scanner;

public class FindMaxDigit {
    static int findMax(int n){
        if(n == 0) return 9 ; // base case

        int last = n % 10 ;
        return Math.max(last , findMax(n/10)); // recursive call
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int max = findMax(n);
        System.out.println("Max digit of "+n+" : "+max);
    }
}
