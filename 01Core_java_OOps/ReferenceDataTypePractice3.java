
import java.util.*;

class Node{
  int data ;
  Node next ;
  Node(int data ){
    this.data = data ;
    
    this.next = null ;
  }
}
public class ReferenceDataTypePractice3 {
    public static void main(String[] args) {
      Node first = new Node(10);
      Node second = new Node(20);
      first.next = second ;
      System.out.println(first.data); // first node data
      System.out.println(first.next.data); // first linking with second node 
    }
}
