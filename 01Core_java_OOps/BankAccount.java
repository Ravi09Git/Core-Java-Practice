import java.util.Scanner;

class Accounts{
    long AccountNumber ;
    String AccountHolderName ;
    long Balance ;
    Accounts(){
       
    }

    Accounts(long AccountNumber , String AccountHolderName ,long Balance){
        this.AccountNumber = AccountNumber ;
        this.AccountHolderName=AccountHolderName ;
        this.Balance = Balance ;
         System.out.println("-------------------------------------------\nBank Details");
        System.out.println("Account Number: "+AccountNumber+"\nAccount Holder: "+AccountHolderName+"\nBalance: Rs."+Balance+".00\n-------------------------------------------");
    }
    void deposite(long Ammounts){
        //System.out.println("Account Number: "+AccountNumber+"\nAccount Holder: "+AccountHolderName+"\nBalance: Rs."+Balance+".00");

        System.out.print("Rs."+Ammounts+" Added successfully ");
        Balance = Balance+ Ammounts ;
        System.out.println("\nAvailable Balance Rs."+(Balance));
    }
    void widraws(long Ammounts){

        
        if(Ammounts > Balance){
          System.out.println("-------------------------------------------\nTransaction Declined! \nInsufficient Balance Rs."+Balance+"\n-------------------------------------------");
        return ;
        }
        System.out.print("-------------------------------------------\nRs. "+Ammounts+" widraws successfully ");

        
        System.out.println("Available Balance Rs."+(Balance-Ammounts)+"\n-------------------------------------------");
        Balance = Balance-Ammounts ;
    }
    void checkBalance(){
        System.out.println("Available Balance Rs."+Balance);
        
    }
    
}
public class BankAccount {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter Your Account Number:");
        long AccountNumber = scn.nextLong();
        scn.nextLine();
        System.out.println("Enter Your Name:");
        String AccountHolderName = scn.nextLine();
        System.out.println("Enter Your Balance:");
        long Balance = scn.nextLong();
        
        Accounts a = new Accounts(AccountNumber,AccountHolderName,Balance);
        
        a.deposite(10);
        //a.widraws(100);
        a.checkBalance();
        a.widraws(500);
        a.deposite(500);
        a.widraws(500);
        a.checkBalance();
        a.widraws(500);
        
    }
}
