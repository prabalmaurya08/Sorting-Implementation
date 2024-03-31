public class SelectionSort {
    public static void main(String[] args) {
        int[] array = { 8, 7, 21, 4, 5, 9 };

        for (int i = 0; i < array.length; i++) {
            int smallest=i;
            for (int j = i+1; j < array.length; j++) {
                if(array[j] <array[smallest]){
                    smallest=j;
                }
            }
            int temp=array[smallest];
            array[smallest]=array[i];
            array[i]=temp;
        
    }
    display(array);
}
    static void display(int[] arr){
        for (int i = 0; i < arr.length; i++) {
         System.out.print(arr[i]+" ");
        }
     }

}
