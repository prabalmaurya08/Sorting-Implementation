public class HeapSort {
   public static void main(String[] args) {
    int[] array = { 8, 7, 21, 4, 5, 9 };
    Heap(array);
        display(array);
   } 
   private static void display(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
        System.out.print(arr[i]+" ");
       }

}
   static void Heap(int[] array){
        int n=array.length-1;
        //build max heap
        for (int i = n/ 2 - 1; i >=0; i--) {
            heapify(array, n, i);
        }
        //delete 
        for (int i = n; i >0; i--) {
            swap(array,i,0);
            heapify(array, i-1, 0);
        }
   }
   static void swap(int[] array,int n,int i){
        int temp=array[i];
        array[i]=array[n];
        array[n]=temp;
   }
//    static void heapify(int[] array,int n,int i){
//             int largest=i;
//             int left=(2*i)+1;
//             int right=(2*i)+2;

//             if(left<n &&array[left]>array[largest]){
//                 largest=left;
//             }
//             if(right<n && array[right]>array[largest]){
//                 largest=right;
//             }
//             if(largest!=i){
//                 swap(array, largest, i);
//                 heapify(array, n, largest);
//             }

//    }


  
    static void heapify(int[] array,int n,int i){
                    int largest=i;
                    int left=(2*i)+1;
                    int right=(2*i)+2;
        
                    if(left<n &&array[left]>array[largest]){
                        largest=left;
                    }
                    if(right<n && array[right]>array[largest]){
                        largest=right;
                    }
                    if(largest!=i){
                        swap(array, largest, i);
                        heapify(array, n, largest);
                     }
        
                    }

}
