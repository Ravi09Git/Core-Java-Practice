
import java.util.*;
public class AreaOfRectangle {
    public static void main(String[]args){
    Scanner scn = new Scanner(System.in);
    System.out.println("Enter Length of rectangle");
    int Length = scn.nextInt();
    System.out.println("Enter Breath of rectangle");
    int Breath = scn.nextInt();
    // using area of recangle is l X b
    long area = Length * Breath ;
    System.out.println("Area of Rectangle is = "+area);
    scn.close();
  }
}
