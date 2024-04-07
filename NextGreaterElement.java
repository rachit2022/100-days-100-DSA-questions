public class NextGreaterElement {

    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int nge[] = new int[nums2.length];
        Stack<Integer> st = new Stack();
        for (int i = nums2.length - 1; i >= 0; i--) {
            while (st.size() > 0 && st.peek() < nums2[i])
                st.pop();
            if (st.size() > 0)
                nge[i] = (int) st.peek();
            else
                nge[i] = -1;
            st.push(nums2[i]);
        }
        HashMap h = new HashMap();
        for (int i = nums2.length - 1; i >= 0; i--)
            h.put(nums2[i], nge[i]);
        int ans[] = new int[nums1.length];
        int i = 0;
        for (int x : nums1) {
            if (h.containsKey(x)) {
                int help = (int) h.get(x);
                ans[i] = help;
                i++;
            }
        }
        return ans;
    }

    public static void main(String[] args) {

    }
}
