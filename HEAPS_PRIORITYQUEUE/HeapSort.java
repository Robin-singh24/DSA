package HEAPS_PRIORITYQUEUE;

import java.util.Arrays;

public class HeapSort {

    public static void heapify(int[] arr,int i,int size){
        int left = 2*i+1;
        int right = 2*i+2;
        int max = i;

        if(left<size && arr[left] > arr[max]){
            max = left;
        }
        if(right<size && arr[right] > arr[max]){
            max = right;
        }

        //compare max and root
        if(max!=i){
            //swap
            int temp = arr[i];
            arr[i] = arr[max];
            arr[max] = temp;

            heapify(arr, max, size);
        }
    }

    public static void heapSort(int[] arr){ // 0(nlogn)
        //step 1 - build maxheap
        int n = arr.length;
        for(int i=n/2;i>=0;i--){
            heapify(arr,i,n);
        }

        //step 2 - push largest at end
        for (int i = n-1; i>0; i--){
            //swap
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            heapify(arr,0,i);
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,2,14,5,13};
        heapSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
