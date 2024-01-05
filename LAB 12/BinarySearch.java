public class BinarySearch {

    public static int binarySearch(int[] arr, int val) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == val) {
                return mid;
            }

            if (arr[mid] < val) {
                left = mid + 1;
            }else {
                right = mid - 1;
            }
        }
        return -1; 
    }

    public static void main(String[] args) {
        int[] sortedArray = {2, 5, 7, 10, 20, 30, 40};
        int val = 20;

        int result = binarySearch(sortedArray, val);

        if (result != -1) {
            System.out.println("Element " +val + " found at index " + result);
        } else {
            System.out.println("Element " +val + " not found in the array");
        }
    }
}
