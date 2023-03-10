package SORTING;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = { 4, 5, 1, 2, 3 };
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void selection(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int last = arr.length - 1 - i;
            int maxIndex = getMaxIndex(arr, 0, last);
            swap(arr, maxIndex, last);
        }
    }

    static int getMaxIndex(int[] arr, int start, int end) {
        int max = start;
        for (int i = start; i <= end; i++) {
            if (arr[max] < arr[i]) {
                max = i;
            }
        }
        return max;
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }




//EVERY METHOD IN ONE    
    static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            //FINDING MAX
            int max = 0;
            int last = arr.length - 1 - i;
            for (int j = 0; j <= arr.length -i -1; j++) {
                if (arr[j] > arr[max]) {
                    max = j;
                }
            }
            //SWAPPING 
            int temp = arr[max];
            arr[max] = arr[last];
            arr[last] = temp;
        }
    }
}
