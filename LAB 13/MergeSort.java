public class MergeSort {
    public static void merge(int[] arr, int[] temp, int low, int high,int mid) {
        for (int i = low; i <= high; i++) {
            temp[i] = arr[i];
        }
        int i = low;
        int j = mid + 1;
        int k = low;
        while (i <= mid && j <= high) {
            if (temp[i] <= temp[j]) {
                arr[k] = temp[i];
                i++;
            } else {
                arr[k] = temp[j];
                j++;
            }
            k++;
        }
        while (i <=mid){
            arr[k]=temp[i];
            i++;
            k++;
        }
    }
    public static void Sort(int[] arr, int[] temp, int low, int high){
        if(low<high){
            int mid = low+(high-low)/2;
            Sort(arr,temp,low,mid);
            Sort(arr,temp,mid+1,high);
            merge( arr, temp, low, high, mid);
        }
    }
    public class Main{
        public static void main(String[] args){
            int[] arr = {73 , 93 , 68 , 43 , 45 , 78 , 5 , 17 , 97 , 71 , 69 , 61 , 88};
            System.out.println("Array before sorting");
            Display(arr);
            MergeSort.Sort(arr,new int [arr.length],0, arr.length-1);
            System.out.println("Array after sorting");
            Display(arr);
        }
        public static void Display(int[] arr){
            for(int i =0;i< arr.length;i++){
                System.out.print(arr[i]+" ");
            }
            System.out.println();
        }
    }
}