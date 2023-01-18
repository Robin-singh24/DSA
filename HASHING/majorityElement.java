package HASHING;
import java.util.*;
public class majorityElement {
    public static void main(String[] args) {
        int[] arr = {1,1,2,5,3,2,5,1,2};

        HashMap<Integer,Integer> map = new HashMap<>();


        for (int i = 0; i < arr.length; i++) {
            if(map.containsKey(arr[i])){
                map.put(arr[i], map.get(arr[i])+1);
            }else{
                map.put(arr[i], 1);
            }
        }
        //iterating through set
        for(Integer key : map.keySet()){
            if(map.get(key) >= arr.length/3){
                System.out.println(key);
            }
        }
    }

}
