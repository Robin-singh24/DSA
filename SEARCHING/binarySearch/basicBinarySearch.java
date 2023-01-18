package SEARCHING.binarySearch;

public class basicBinarySearch {
    public static void main(String[] args) {
        int[] arr = { 2, 3, 6, 8, 10, 12, 13, 18 };
        int target = 6; // 2
        int ans = binarySearchASC(arr, target);
        System.out.println(ans);
        int[] arr1 = { 20, 18, 14, 11, 9, 5, 1 };
        int target1 = 1; // 6
        int ans1 = binarySearchDSC(arr1, target1);
        System.out.println(ans1);

    }

    static int binarySearchASC(int[] arr, int target) {
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
        return -1;
    }

    static int binarySearchDSC(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2; // middle element
            if (target < arr[mid]) {
                start = mid + 1;
            } else if (target > arr[mid]) {
                end = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
