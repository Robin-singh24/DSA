package SEARCHING.binarySearch;

//floor of a number
public class secondQue {
    public static void main(String[] args) {
        int[] arr = { 1, 4, 6, 7 };
        int target = 5;
        int ans = binarySearchASC(arr, target);
        System.out.println(ans);
    }

    static int binarySearchASC(int[] arr, int target) {

        if (target < arr[0]) {
            return -1;
        }

        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2; // middle element
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return arr[end];
    }
}
