package RecursionPractice;
import java.util.* ;
public class NTimesNumberPrint {

    public static void recursive(int N){
        if(N == 0)return ; // base case
        else{
            recursive(N - 1);
            System.out.print(N+" ");
        }
    }
        public static void main(String[] args) {
        Scanner scn  = new Scanner(System.in);
        System.out.println("Enter Number: ");
        int N = scn.nextInt();
        recursive(N);
    }
}
