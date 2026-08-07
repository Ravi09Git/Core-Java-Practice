
import java.util.*;
public class AreaOfCircle {
    public static void main(String[]args){
    Scanner scn = new Scanner(System.in);
    System.out.println("Enter Radius of circle");
    int radius = scn.nextInt();
    // using Math.PI for better accuracy instead of 22/7
    double area = Math.PI * radius * radius ;
    System.out.println("Area of circle = "+area);
    scn.close();
  }
}
