package RECURSION.ARRAYS;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {1,10,13,16,12,20,26,6,99};
        int target = 69;
        System.out.println(search(arr, target, 0));
    }

    static int searchIndex(int[] arr,int target,int index){
        //base condition
        if(index==arr.length){
            return -1;
        }

        if(arr[index]==target){
            return index;
        }

        return searchIndex(arr, target, index+1);
    }

    static boolean search(int[] arr,int target,int index){
        //base condition
        if(index==arr.length){
            return false;
        }

        return arr[index]==target || search(arr, target, index+1);
    }
}
