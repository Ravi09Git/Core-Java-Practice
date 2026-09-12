class Account{
    int balance ;
    Account(int balance){
        this.balance = balance ;
    }
    void checkBalance(){
        System.out.println("Balance: Rs."+balance);
    }
}
public class ReferenceDataTypePractice2 {
    public static void main(String[] args) {
        Account a1 = new Account(5000);
        Account a2 = a1 ;
        a1.checkBalance();;
        a2.balance = 10000;
        a1.checkBalance();// a1.balace will be 10000 because both obj pointing same obj address
        
    }
}
