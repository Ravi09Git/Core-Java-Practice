import java.util.*;
interface BankingManagement{
  final String bankName = "State Bank Of India" ;
  final String ifsc = "SBIN0001234" ;
  
}
class BankCustomerCounter implements BankingManagement{
  private static int totalCustomer ;
  private String customerName ;
  final int accountNumber ;
  
  
  public BankCustomerCounter(String customerName ){
    totalCustomer += 1 ;
    accountNumber = (1000 + totalCustomer) ;
    this.customerName = customerName ;
  }
 
  public static int getTotalCustomer(){
    
    return totalCustomer ;
  }
 
  public void displayDetails(){
    System.out.println("--------------------------------");
    System.out.println("Customer Name: "+customerName);
    System.out.println("Bank: "+bankName+" ("+ifsc+")");
    System.out.println("Account Number: "+accountNumber);
    System.out.println("Total Customer so far: " +getTotalCustomer());
    
  }
  
 
}
 
public class BankingManagementSystem {
    public static void main(String[] args) {
      System.out.println("Intial Customer: "+BankCustomerCounter.getTotalCustomer());
      //object 1
      BankCustomerCounter c1 = new BankCustomerCounter("Ravi Kumar");
      c1.displayDetails();
      
      //object 2
      BankCustomerCounter c2 = new BankCustomerCounter("Rajeev Ranjan");
      c2.displayDetails();
     
      //object 3
      BankCustomerCounter c3 = new BankCustomerCounter("Shubham Kumar");
      c3.displayDetails();
      //check SUMMARY
      System.out.println("==================SUMMARY==================");
      System.out.println("Final Total Customer (via class)  :"+BankCustomerCounter.getTotalCustomer());
      System.out.println("Final Total Customer (via object)  :"+c1.getTotalCustomer());
 
      
 
    }
}
