public class RemoveDuplicates {
    public static int removeDuplicates(int[] nums) {
        int j = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[j] = nums[i];
                j++;
            }
        }
        return j;
    }
    public static void main(String[] args){
        int[] arr={1,2,3,4,5,6,2,3};
        System.out.println(removeDuplicates(arr));
    }
}
