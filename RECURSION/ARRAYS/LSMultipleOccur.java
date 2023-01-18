package RECURSION.ARRAYS;

import java.util.*;

//find all the occurences of an element in an array
public class LSMultipleOccur {
    public static void main(String[] args) {
        int[] arr = {10,20,5,4,89,5,12,4,5};
        int target = 5;
        findAll(arr, target, 0);
        System.out.println(ans);
    }
    static ArrayList<Integer> ans = new ArrayList<>();
    static void findAll(int[] arr, int target, int index) {
        //base condition
        if(index==arr.length){
            return;
        }

        if(arr[index] == target){
            ans.add(index);
        }
        findAll(arr, target, index+1);

    }
}
