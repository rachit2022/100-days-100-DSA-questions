public class AntOnTheBoundary {
    public static int returnToBoundaryCount(int[] nums) {
        int l = nums.length;
        int a = 0;
        int count = 0;
        int i = 0;
        while (i < l) {
            a += nums[i];
            if (a == 0)
                count++;
            i++;
        }
        return count;
    }
    public static void main(String[] args){
        int[] arr={2,3,-5};
        System.out.println(returnToBoundaryCount(arr));
    }
}
