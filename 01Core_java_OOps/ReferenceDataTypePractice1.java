class Address{
    String city ;
    String state ;
    Address(String city,String state){
      this.city = city ;
      this.state = state ;
    }
}
class Employee{
    int id ;
    String name ;
    Address empAdress ;
    Employee(int id ,String name ,Address empAdress ){
        this.id = id ;
        this.name = name ;
        this.empAdress = empAdress ;
  }
  public void showDetail(){
    System.out.println("Id -:"+id);
    System.out.println("Name -:"+name);
    System.out.println("City -:"+empAdress.city+" , "+"State:- "+empAdress.state);
  } 
}
public class ReferenceDataTypePractice1 {
    public static void main(String[] args) {
        Address ad1 = new Address("Bokaro","Jharkhand" );
        Employee ad2 = new Employee(01, "Ravi Kumar", ad1);
        ad2.showDetail();
    }
}
