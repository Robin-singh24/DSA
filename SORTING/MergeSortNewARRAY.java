package SORTING;

import java.util.Arrays;

public class MergeSortNewARRAY {
    public static void main(String[] args) {
        int[] arr = {8,3,4,12,5,6};
        int[] ans = mergeSort(arr);
        System.out.println("Unsorted: "+Arrays.toString(arr));
        System.out.println("Sorted: "+Arrays.toString(ans));
    }

    static int[] mergeSort(int[] arr) {
        if (arr.length == 1) {
            return arr;
        }

        int mid = arr.length / 2;

        int[] left = mergeSort(Arrays.copyOfRange(arr, 0, mid));
        int[] right = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));

        return merge(left, right);

    }

    private static int[] merge(int[] first, int[] second) {
        int[] mix = new int[first.length + second.length];
        
        int i = 0;
        int j = 0;
        int k = 0;

        //comparing the numbers of both the array and merging them to the new array.
        while(i<first.length && j<second.length){
            if(first[i]<second[j]){
                mix[k] = first[i];
                i++;
            }else{
                mix[k] = second[j];
                j++;
            }
            k++;
        }
        //checking if i<length of first array then this loop will execute.
        //as soon as i exceed the length of the array the remaining part of the second array will be be merged to the final array  
        while(i<first.length){
            mix[k] = first[i];
            i++;
            k++;
        }

        //checking if j<length of second array then this loop will execute.
        //as soon as j exceed the length of the array the remaining part of the first array will be be merged to the final array 
        while(j<second.length){
            mix[k] = second[j];
            j++;
            k++;
        }
        return mix;
    }
}
