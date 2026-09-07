import java.util.*;
class Solution{
    public void reverseArray1(int arr[]){
        System.out.println("Before Reverse :"+Arrays.toString(arr));
        int start = 0  ; 
        int end = arr.length - 1;
        int temp ;
        // traversing array from start to end
        while(start < end){
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp ;
            start++ ;
            end-- ;
        }
        System.out.println("After reverse :" +Arrays.toString(arr));
    }
}
public class ReverseArray {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int l = scn.nextInt();
        int arr[]=new int [l] ;
        for(int i = 0 ; i < l ;i++){
            arr[i] = scn.nextInt();
        }
        Solution solve = new Solution();
        solve.reverseArray1(arr);
    }
}
