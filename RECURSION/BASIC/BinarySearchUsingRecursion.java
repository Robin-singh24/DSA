package RECURSION.BASIC;

public class BinarySearchUsingRecursion {
    public static void main(String[] args) {
        int[] arr = {10,20,21,33,55};
        int ans = search(arr, 11, 0, arr.length-1);
        System.out.println(ans);
    }

    static int search(int[] arr, int target, int s, int e) {

        // Base Condition
        if (s > e) {
            return -1;
        }

        int m = s + (e - s) / 2;

        if (arr[m] == target) {
            return m;
        }
        if (target > arr[m]) {
            return search(arr, target, m + 1, e);
        }
        return search(arr, target, s, m - 1);

    }
}
