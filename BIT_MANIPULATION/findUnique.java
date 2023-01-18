package BIT_MANIPULATION;

public class findUnique {
    public static void main(String[] args) {
        int[] arr = {2,3,3,4,4,2,5};
        System.out.println(Unique(arr));
    }

    private static int Unique(int[] arr) {
        int ans = 0;
        
        // for (int i = 0; i < arr.length; i++) {
        //     ans = ans ^ arr[i];
        // }
        for(int n : arr){
            ans = ans^n; 
        }
        return ans;
    }
}
