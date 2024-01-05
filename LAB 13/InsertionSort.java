public class InsertionSort {
    public static void sort(int [] arr){
        int n = arr.length;
        for(int i =1;i<n;i++){
            int temp =arr[i];
            int j = i-1;
            while(j>=0 && arr[j]>temp){
                arr[j+1]=arr[j];
                j = j-1;
            }
            arr[j+1]=temp;
        }
    }

    public static void recursiveInsertionSort(int[] arr, int n) {
        if (n <= 1) {
            return;
        }

        recursiveInsertionSort(arr, n - 1);

        int temp = arr[n - 1];
        int j = n - 2;

        while (j >= 0 && arr[j] > temp) {
            arr[j + 1] = arr[j];
            j = j - 1;
        }

        arr[j + 1] = temp;
    }
    public class Main {
        public static void main(String[] args) {
            int[] arr = {5,1,9,2,10};
            System.out.println("Array before sorting");
            Display(arr);
    //        InsertionSort.sort(arr);
    //        System.out.println();
            InsertionSort.recursiveInsertionSort(arr,arr.length - 1);
            System.out.println();
            System.out.println("Array after sorting");
            Display(arr);
        }
        public static void Display(int [] arr) {
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}