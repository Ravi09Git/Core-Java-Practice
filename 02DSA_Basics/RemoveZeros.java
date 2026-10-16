import java.util.* ;
public class RemoveZeros {
    public static int []shiftZero (int nums[]){
        int insertPos = 0 ;
        for(int j = 0 ;j < nums.length ;j++){
            if(nums[j] != 0){
                nums[insertPos] = nums[j];
                insertPos++;
            }
        }
        while(insertPos < nums.length){
            nums[insertPos] = 0 ;
            insertPos++;
        }
        return nums ;
    }
    public static void main(String[] args) {
        int []nums ={0,1,0,0,2,3,0};
        System.out.println("Original Array: "+Arrays.toString(nums));

        System.out.println("Arrays after shiftZero: "+Arrays.toString(shiftZero(nums)));
    }
}
