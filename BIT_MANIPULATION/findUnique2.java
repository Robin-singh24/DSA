package BIT_MANIPULATION;


public class findUnique2 {
    public static void main(String[] args) {
        int[] arr = {2,2,3,2,7,8,8,7,7,8};
        System.out.println(search(arr));
    }

    private static int search(int[] arr) {
        int ans = 0;
        for (int num : arr) {
            ans = (ans+num)%3;
        }
        return ans;
    }
}
