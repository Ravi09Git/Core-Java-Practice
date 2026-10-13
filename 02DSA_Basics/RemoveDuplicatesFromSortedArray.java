public class RemoveDuplicatesFromSortedArray {

    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;

        int i = 0; // Unique elements tracker

        for (int j = 1; j < nums.length; j++) { // Poore array tak chalega
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }
            // Agar duplicate hai (nums[j] == nums[i]), toh kuch nahi karna!
        }

        return i + 1;
    }

    public static void main(String[] args) {
        int[] nums = {1, 1, 2, 2, 3, 4, 4};

        int k = removeDuplicates(nums);

        System.out.println("Total Unique Elements: " + k);
        System.out.print("Array with unique elements: ");
        for (int x = 0; x < k; x++) {
            System.out.print(nums[x] + " ");
        }
    }
}