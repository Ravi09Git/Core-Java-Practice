import java.util.*;
interface PaymentService{
  public void processPayment(double ammount);
}
class upiPayment implements PaymentService{
  private String upiId ;
  public upiPayment(String upiId){
    this.upiId = upiId ;
  }
  @Override
  public void processPayment(double ammount){
    System.out.println("Paid Rs."+ammount+" Using UPI Id:"+upiId);
  }
}
class CreditCardPayment implements PaymentService{
   String creditCarNumber ;
  public CreditCardPayment(String creditCarNumber){
    this.creditCarNumber = creditCarNumber ;
  }
  @Override
  public void processPayment(double ammount){
    System.out.println("Paid Rs."+ammount+" Using CreditCard:"+creditCarNumber);
  }
}

public class PaymentSystem {
    public static void main(String[] args) {
      PaymentService pay = new upiPayment("okSBI9931");
      pay.processPayment(1000);
      PaymentService cPay = new CreditCardPayment("72659165998");
      cPay.processPayment(50000);
      
      
    }
}
