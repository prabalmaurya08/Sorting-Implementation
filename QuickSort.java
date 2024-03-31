public class QuickSort {

    public static void main(String[] args) {
        int[] array = { 8, 7, 21, 4, 5, 9 };
        display(array);
        System.out.println();
        quickSort(array, 0, array.length - 1);
        display(array);
    }


    static void display(int[] arr){
       for (int i = 0; i < arr.length; i++) {
        System.out.print(arr[i]+" ");
       }
    }
    static void quickSort(int[] arr, int start, int end) {
        if (start >= end)
            return;

        int pi = partition(arr, start, end);
        quickSort(arr, start, pi - 1);
        quickSort(arr, pi + 1, end);
    }

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    

    
  

    static int partition(int[] arr, int start, int end) {

        int pivot=arr[start];
        int i=start+1;
        int j=end;
        while(i<=j){
            while(i <=end &&arr[i]<=pivot){
                i++;
            }
            while(j>start &&arr[j]>pivot){
                j--;
            }
            if(i<j){
                swap(arr, i, j);
            }

        }
        swap(arr, start, j);
        return j;
    }
}