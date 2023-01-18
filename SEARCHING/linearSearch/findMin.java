package SEARCHING.linearSearch;

public class findMin {
    public static void main(String[] args) {
        int[] arr = {18,12,-7,9,3,14,28};
        System.out.println(search(arr));
    }

    static int search(int[] arr){   
        if(arr.length==0){
            return -1;
        }
        int min = arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]<min){
                min = arr[i];
            }
        }
        return min;
    }

}
