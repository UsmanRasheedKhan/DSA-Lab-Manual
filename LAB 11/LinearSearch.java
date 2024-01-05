public class LinearSearch {

    // Function to perform linear search
    public static int linearSearch(int[] arr, int val) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == val) {
                return i; 
            }
        }
        return -1; 
    }

    public static void main(String[] args) {
        int[] arr = {10, 4, 7, 2, 8, 5};
        int val = 8;

        int result = linearSearch(arr, val);

        if (result != -1) {
            System.out.println("Element " +val + " found at index " +result);
        } else {
            System.out.println("Element " +val + " not found in the array");
        }
    }
}
