public class QuickSort {
    public void quickSort(int[] arr, int low, int high){
        if(low < high){
            int pidx = partition(arr,low,high);

            quickSort(arr,low, pidx - 1);
            quickSort(arr, pidx + 1, high);
        }
    }
    public int partition(int[] arr, int low, int high){
        int pivot = arr[high];
        int i = low - 1;

        for(int j = low; j < high; j++){
            if(arr[j] < pivot){
                i++;
                //Swaping
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        i++;
        int temp = pivot;          //pivot == arr[high]
        arr[high] = arr[i];
        arr[i] = temp;

        return i;
    }
    public class Main {
        public static void main(String[] args) {
            QuickSort obj = new QuickSort();
    
            int[] arr = {6,3,9,5,2,8};
            int n = arr.length - 1;
    
            //Printing unsorted array
            System.out.println("UNSORTED ARRAY:");
            System.out.print("{");
            for(int i = 0; i < arr.length; i++){
                if(i < arr.length - 1) {
                    System.out.print(arr[i] + ",");
                } else{
                    System.out.println(arr[i] +"}");
                }
            }
            System.out.println();
    
            obj.quickSort(arr,0,n);
    
            //Printing Sorted Array
            System.out.println("-SORTED ARRAY:");
            System.out.print("{");
            for(int i = 0; i < arr.length; i++){
                if(i < arr.length - 1) {
                    System.out.print(arr[i] + ",");
                } else{
                    System.out.println(arr[i] +"}");
                }
            }
            System.out.println();
        }
    }
}
