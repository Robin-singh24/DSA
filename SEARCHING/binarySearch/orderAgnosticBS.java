package SEARCHING.binarySearch;

public class orderAgnosticBS {
    public static void main(String[] args) {
        int [] arr = {10,8,7,5,3,2,1};
        int target = 1;
        int ans = orderAgnostic(arr, target);
        System.out.println(ans);
    }

    static int orderAgnostic(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        boolean isAsc = arr[start] < arr[end];
        while (start <= end) {
            int mid = start + (end - start) / 2;

            // check if target is middle element
            if (target == arr[mid]) {
                return mid;
            }

            // check ascending
            if (isAsc) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } 
            //check descending
            else {
                if (target < arr[mid]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }

        //element not present
        return -1;
    }
}
