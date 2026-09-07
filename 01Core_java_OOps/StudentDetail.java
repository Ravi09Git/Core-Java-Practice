import java.util.*;

class Student {
    String id;
    String name;
    String course;
    int marks;
    Student(){
        System.out.println("Detail Of student");
    }

    Student(String id, String name, String course, int marks) {
        this.id = id ;
        this.name = name;
        this.course = course;
        this.marks = marks;
    }

    void displayDetail() {
        System.out.println("id: " + id + ", Name: " + name + ", Course: " + course + ", Marks: " + marks);
    }
    void calculateGrad(){
        if(marks > 100 || marks < 0)System.out.println("Marks should be 1 to 100");
        else if(marks >80)System.out.println("Grade A");
        else if(marks >60)System.out.println("Grade B");
        else if(marks >40)System.out.println("Grade C");
        else System.out.println("Yout marks less than: "+marks+" You are not promoted at this time");
    }
}

public class StudentDetail {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter Your ID:");
        String id = scn.nextLine();
        System.out.println("Enter Your NAME:");
        String name = scn.nextLine();
        System.out.println("Enter Your COURSE:");
        String course = scn.nextLine();
        System.out.println("Enter Your MARKS:");
        int marks = scn.nextInt();
        Student s1 = new Student(id,name,course,marks);
        s1.displayDetail();
        s1.calculateGrad();
    }
}