class Node
{
    int data;
    Node next;
    Node(int key)
    {
        this.data = key;
        next = null;
    }
}

public class MergeSort {
    // public static void main(String[] args) {
    //     int[] array = { 8, 7, 21, 4, 5, 9 };
    //     display(array);
    //     System.out.println();
    //    divide(array, 0, array.length-1);
    //     display(array);
    // }

    // private static void display(int[] arr) {
    //     for (int i = 0; i < arr.length; i++) {
    //         System.out.print(arr[i]+" ");
    //        }
    // }
    // private static void conquer(int[] array, int start,int mid, int end){
    //         int[] merged=new int[end-start+1];
    //         int idx1=start;
    //         int idx2=mid+1;
    //         //iterate in new merged array
    //         int x=0;

    //         while (idx1 <=mid &&idx2 <=end) {
    //             if(array[idx1]<array[idx2]){
    //                 merged[x++]=array[idx1++];
    //             }
    //             else{
    //                 merged[x++]=array[idx2++];
    //             }
    //         }
    //         while(idx1<=mid){
    //             merged[x++]=array[idx1++];
    //         }
    //         while (idx2<=end) {
    //            merged[x++]=array[idx2++];
    //         }

    //         for (int i = 0; i < merged.length; i++) {
    //             array[start+i]=merged[i];
    //         }
    // }

    // private static void divide(int[] array, int start, int end) {
    //    if(start>=end){
    //     return;
    //    }
    //     int mid=start+(end-start)/2;
    //     divide(array, start, mid);
    //     divide(array, mid+1, end);

    //     conquer(array,start, mid, end);
    // }





    //USING LL
    public static void main(String[] args) {
    // Create a sample linked list
    Node head = new Node(5);
    head.next = new Node(3);
    head.next.next = new Node(1);
    head.next.next.next = new Node(8);

    // Call merge sort to sort the list
    head = mergeSort(head);

    // Print the sorted list
    Node current = head;
    while (current != null) {
        System.out.print(current.data + " -> ");
        current = current.next;
    }
    System.out.println("null"); // Print "null" to indicate the end of the list
}
static Node mergeSort(Node head)
    {
        // add your code here
        head=mergesort(head);
        return head;
    }
    //for finding middle element
    
   static Node mergesort(Node head) {
    if (head == null || head.next == null) {
        return head;  // Base case: list with 0 or 1 node is already sorted
    }
    Node current=head;

   
    Node mid=findMid(head);
    Node nextofMid=mid.next;
    mid.next=null;

    Node first = mergesort(current);
    Node second = mergesort(nextofMid);
    Node result=conquer(first, second);
    
    return  result; // Merge and return sorted list
}

// Find the middle element and split the list
static Node findMid(Node current) {
    Node slow = current;
   Node fast=current;
   while(fast.next!=null && fast.next.next!=null){
    slow=slow.next;
    fast=fast.next.next;
   }
return slow;

   // Disconnect first and second halves
}

// Merge two sorted lists
static Node conquer(Node first, Node second) {
    Node answer = null;

    if (first == null) {
        return second;
    } else if (second == null) {
        return first;
    }

    if (first.data <= second.data) {
        answer = first;
        answer.next = conquer(first.next, second);
    } else {
        answer = second;
        answer.next = conquer(first, second.next);
    }

    return answer;

    }
    
}
