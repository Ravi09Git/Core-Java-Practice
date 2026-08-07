
import java.util.* ;
public class SimpleInterest {
     public static void main(String[]args){
    Scanner scn = new Scanner(System.in);
    System.out.println("Enter Principal Ammount ");
    int P = scn.nextInt();
    System.out.println("Enter Rate of Interest ");
    int R = scn.nextInt();
    System.out.println("Enter Time in year");
    int T = scn.nextInt();
    // using simple interest formula SI = (P X R X T)/100
    double simpleInterest = (P * R * T) /100 ;
    System.out.println("SimpleInterest is = "+simpleInterest);
    scn.close();
  }
}
