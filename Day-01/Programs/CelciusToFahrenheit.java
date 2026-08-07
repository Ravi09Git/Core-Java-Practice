
import java.util.* ;
public class CelciusToFahrenheit {
    public static void main(String[]args){
    Scanner scn = new Scanner(System.in);
    System.out.println("Enter Temperature in Celsius ");
    int celcius = scn.nextInt();
    double fahrehheit = ( celcius * 9.0 / 5) + 32 ;
    System.out.println("Converted Temperature Celcius into Fahrenheit is = "+ fahrehheit);
    scn.close();
  }
}
