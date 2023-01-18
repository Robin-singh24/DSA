package SEARCHING.linearSearch;

//searching an element in an array using linear search
//time complexity = O(N)
//space complexity = O(1)

public class LSearchOnInt {

    //search in the array: if found return the index
    //otherwise return -1
    public static void main(String[] args) {
        int[] aray = {2,8,9,11,342,12,22};
        System.out.println(LinearSearch(aray, 8));
    }

    static int LinearSearch(int[] arr,int target){
        if(arr.length==0){
            return -1;
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                return i;
            }
        }

        // for(int element : arr){
        //     if(element==target){
        //         return element;
        //     }
        // }
        return -1;
    }
}
