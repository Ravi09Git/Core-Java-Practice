import java.util.*;

public class FindIndex {

  public static void findTarget(int arr[],int target){
    // finding 2 indices
    for(int i = 0 ; i < arr.length ;i++){
        for(int j = 1 ; j < arr.length ;j++){
          if((arr[i] + arr[j])== target){
            System.out.println("Indices "+arr[i]+" & "+arr[j]);
            return ;
          }
        }
    }
  }
  
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter Size of Array");
      int n = sc.nextInt();
      int arr[] = new int[n];
      for(int i = 0 ; i < n ;i++){
        arr[i] =sc.nextInt();
      }
      System.out.println("Enter Target");
      int target = sc.nextInt();
      findTarget(arr,target);
    }
}