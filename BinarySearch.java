public class BinarySearch {
    public static int searchElement(int[] arr, int element) {
        int left = 0;
        int right = arr.length - 1;
        if (arr[left] < arr[right]) {
            while (left <= right) {
                int mid = left + (right - left) / 2;
                if (arr[mid] > element) {
                    right = mid - 1;
                } else if (arr[mid] < element) {
                    left = mid + 1;
                } else {
                    return mid;
                }
            }
        } else {
            while (left <= right) {
                int mid = left + (right - left) / 2;
                if (arr[mid] > element) {
                    left = mid + 1;
                } else if (arr[mid] < element) {
                    right = mid - 1;
                } else {
                    return mid;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = { 8, 12, 23, 32, 43, 45, 56, 67, 78, 89, 90 };
        int[] arr1 = { 90, 89, 78, 67, 56, 45, 43, 32, 23, 12, 8 };
        int element = 56;
        System.out.println(searchElement(arr, element));
        System.out.println(searchElement(arr1, element));
    }
}
