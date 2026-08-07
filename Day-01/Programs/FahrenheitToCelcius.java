
import java.util.* ;
public class FahrenheitToCelcius {
      public static void main(String[]args){
    Scanner scn = new Scanner(System.in);
    System.out.println("Enter Temperature in Fahrenheit ");
    int fahreheit= scn.nextInt();
    double celcius = ( fahreheit - 32 ) * 5.0 / 9.0 ;
    System.out.println("Converted Temperature fahreheit into celcius is = "+ celcius);
    scn.close();
}
}
