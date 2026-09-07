import java.util.*;
class Solution{
    public void minMAx(int arr[]){
        int max = arr[0];
        int min = arr[0];
        if(arr == null ||arr.length == 0 ) return ;

        for(int i = 0 ; i < arr.length ;i++){
            if(arr[i] > max) max = arr[i];
            else if(arr[i] < min)min = arr[i];
        }
        System.out.println("Minimum: "+min);
        System.out.println("Maximun: "+max);
    }
}
public class FindMinMax {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int l = scn.nextInt();
        int arr[]=new int [l] ;
        for(int i = 0 ; i < l ;i++){
            arr[i] = scn.nextInt();
        }
        Solution solve = new Solution();
        solve.minMAx(arr);
    }
}
