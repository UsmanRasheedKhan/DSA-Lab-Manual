public class SelectionSort {
    public static int[] selectionSort(int[] arr){
        int min;
        for(int i = 0; i < arr.length - 1; i++){
            min = i;
            for(int j = i + 1; j < arr.length; j++){
                if(arr[j] < arr[min]){
                    min = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
        return arr;
    }

    public static int[] seclectionSortRecursive(int[] arr,int i,int j) {
        //int j = i + 1;
        if (i == arr.length - 1) {
            return arr;
        } else if (j == arr.length) {
            seclectionSortRecursive(arr, i + 1,i + 2);
        } else {
            if (arr[j] < arr[i]) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
            seclectionSortRecursive(arr, i,j + 1);
        }
        return arr;
    }
    public class Main {
        public static void main(String[] args) {
            int[] arr = {64,25,12,22,11};
            System.out.println("UNSORTED ARRAY");
            display(arr);
    
            arr = SelectionSort.selectionSort(arr);
            System.out.println("SORTED ARRAY");
            display(arr);
    
    //        arr = SelectionSort.seclectionSortRecursive(arr,0,arr.length - 1);
    //        System.out.println("SORTED ARRAY");
    //        display(arr);
        }
        public static void display(int[] arr){
            for(int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }
}