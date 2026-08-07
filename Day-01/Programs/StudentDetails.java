
import java.util.*;
public class StudentDetails {
    public static void main(String[]args){
    Scanner scn = new Scanner(System.in);
    System.out.println("Enter your Name: ");
    String name = scn.nextLine();

    System.out.println("Enter your Father Name: ");
    String fatherName = scn.nextLine();

    System.out.println("Enter your Roll No. : ");
    int roll= scn.nextInt();
    scn.nextLine(); // Next String input after integer input
    System.out.println("Enter your class_section: ");
    String classNo = scn.nextLine();

    System.out.println("Enter your Address: ");
    String address = scn.nextLine();

  
    System.out.println("Name : "+name+"\n"+"Father Name: "+fatherName+"\n"+"Roll Number: "+roll+"\n"+"Class & Section: "+classNo+"\n"+"Address: "+address);
    scn.close();
  }
}
