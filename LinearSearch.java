public class LinearSearch {
    public static int searchElement(int[] arr, int element) {
        int index = -1;
        boolean bool = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == element) {
                index = i;
                bool = true;
                break;
            }
        }
        if (bool) {
            return index;
        }
        return index;
    }

    public static void main(String[] args) {
        int[] arr = { 8, 12, 23, 32, 43, 45, 56, 67, 78, 89, 90 };
        int element = 56;
        System.out.println(searchElement(arr, element));
    }
}
