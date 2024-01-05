public class BubbleSort {
    public static int[] bubbleSort(int[] arr){
        int i,j;
        for(i = 0; i < arr.length - 1; i++){
            for(j = 0; j < arr.length - 1; j++){
                if(arr[j] > arr[j + 1]){
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }

    public static void recursiveBubbleSort(int[] arr, int n) {
        if (n == 1) {
            return;
        }

        for (int j = 0; j < n - 1; j++) {
            if (arr[j] > arr[j + 1]) {
                // Swap arr[j] and arr[j + 1]
                int temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
            }
        }

        // Recursively call for the remaining elements
        recursiveBubbleSort(arr, n - 1);
    }

    public class Main {
        public static void main(String[] args) {
            int[] arr = {64,25,12,22,11};
            System.out.println("UNSORTED ARRAY:");
            display(arr);
    
    //        arr = BubbleSort.bubbleSort(arr);
    //        System.out.println("SORTED ARRAY:");
    //        display(arr);
            BubbleSort.recursiveBubbleSort(arr,arr.length);
            System.out.println("SORTED ARRAY");
            display(arr);
        }
        public static void display(int[] arr){
            for (int i = 0; i < arr.length; i++){
                System.out.print(arr[i] +" ");
            }
            System.out.println();
        }
    }
}
