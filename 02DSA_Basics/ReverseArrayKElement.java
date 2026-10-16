import java.util.*;

public class ReverseArrayKElement {
  public static void reverseArray(int arr[] , int left , int rigth){
    
    
    while(left < rigth){
      int temp = arr[left];
      arr[left] = arr[rigth];
      arr[rigth] = temp ;
      left++ ;
      rigth-- ;
    }
    
  }
    public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      if(n == 0)return ;
      int k = scn.nextInt();
      int []arr = new int[n];
      for(int i = 0 ; i < n ;i++){
        arr[i] = scn.nextInt();
      }
      k = k % n ; // edge case for if(k>n)
      System.out.println("Original Array -> "+Arrays.toString(arr));
      reverseArray(arr,0,n-1); // all element reverseArray first
      
      reverseArray(arr, k , n-1);// right part reverse without k element
      reverseArray(arr , 0 , k-1); // left part , k element reverse
      System.out.println("Reversed Array  -> "+Arrays.toString(arr));
    }
}