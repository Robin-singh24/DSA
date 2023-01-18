package SEARCHING.linearSearch;
//searching an element in a given range 
public class searchInRange {
    public static void main(String[] args) {
        int[] arr = {18,12,-7,9,3,14,28};
        int target = 12;
        int ans = search(arr, target, 2, 5);
        System.out.println(ans);
    }

    static int search(int[] arr,int target,int start,int end){
        if(arr.length==0){
            return -1;
        }
        for(int i=start;i<=end;i++){
            if(arr[i]==target){
                return i;
            }
        }
        return -1;
    }
}
