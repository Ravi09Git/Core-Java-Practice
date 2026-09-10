import java.util.*;
class Employee{
  private String id ;
  private String name ;
  private int baseSalary ;
  Employee(){}

  Employee(String id,String name,int baseSalary){
    this.id = id ;
    this.name = name ;
    this.baseSalary = baseSalary ;
  }

  String getId(){return id;}
  String getName(){return name;}

  //setter
  void setBaseSalary(int salary){
    if(salary > 0){
      this.baseSalary = salary ;
    }
    else{
      System.out.println("invalid salary");
      System.out.println("---------------------------------");
      return ;
    }
    
  }
  //getter
  int getBaseSalary(){
    return baseSalary ;
  }
  
  void displayEmployeeInfo(){
    System.out.println("---------------------------------");
    System.out.println("Name: "+name);
    System.out.println("Id: "+id);
    System.out.println("Base Salary: Rs."+baseSalary);
    System.out.println("---------------------------------");
  }
}
class Developer extends Employee{
  private int bonus ;
  Developer(){}
  Developer(String Id,String Name,int baseSalary){
    super(Id,Name,baseSalary);
    this.bonus = bonus ;
  }

  void setBonus(int bonus){
    if(bonus > 0){
      this.bonus = bonus ;
    }
    else{
      System.out.println("Invalid Bonus!");
      return ;
    }
    
  }

  int calculateTotalSalary(){
     return (super.getBaseSalary()+this.bonus) ;
  }
  
}

public class Company {
    public static void main(String[] args) {
      Employee e = new Employee();
      

      Developer d = new Developer("A01","Raj Kpoor",20000);
      d.displayEmployeeInfo();
      
      System.out.println("---------------------------------");

      d.setBonus(500);
      
      System.out.println("Base Salary: Rs."+d.getBaseSalary());
      System.out.println("Total Salary: Rs."+d.calculateTotalSalary());

      System.out.println("---------------------------------");
      
    }
}
