class RemoveDuplicatesFromSortedArray{
    public static int removeDuplicates(int nums[]){
        int i = 0 ; //unique element
        for(int j = 1 ; j < nums.length ;j++){
            if(nums[j] != nums[i]){
                i++ ;
                nums[i]=nums[j];
            }
        }
        return i+1 ;
    }
    public static void main(String[] args) {
        int nums[] = {1,1,2,2,3,4,4,5};
        int k = removeDuplicates(nums);
        System.out.println("Total unique element : "+k);
        for(int i = 0 ;i< k ;i++){
            System.out.print(nums[i]+" ");
        }

    }
}