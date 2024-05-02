public class LargestPositveIntegerWithItsNegative {
    public static int findMaxK(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        for (int i = n-1; i >= 0; i--) {
            if (nums[i] > 0 && Arrays.binarySearch(nums, -nums[i]) >= 0) {
                return nums[i];
            }
        }
        return -1;  // If no such pair found
    }
    public static void main(String[] args){
        int[] nums={-1,2,-3,3};
        System.out.println(findMaxK(nums));
    }
}
