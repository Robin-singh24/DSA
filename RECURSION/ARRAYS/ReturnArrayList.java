package RECURSION.ARRAYS;

import java.util.*;

public class ReturnArrayList {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 4, 5, 1, 3 };
        int target = 1;
        System.out.println(searchIndex(arr, target, 0));
    }

    // passing the list in the argument
    static ArrayList<Integer> searchAllIndex(int[] arr, int target, int index, ArrayList<Integer> list) {

        if (index == arr.length) {
            return list;
        }

        if (arr[index] == target) {
            list.add(index);
        }

        return searchAllIndex(arr, target, index + 1, list);
    }

    // passing the list as a parameter
    static ArrayList<Integer> searchIndex(int[] arr, int target, int index) {
        ArrayList<Integer> list = new ArrayList<>();
        if (index == arr.length) {
            return list;
        }

        if (arr[index] == target) {
            list.add(index);
        }
        ArrayList<Integer> ansTotal = searchIndex(arr, target, index + 1);
        list.addAll(ansTotal);
        return list;
    }

}
