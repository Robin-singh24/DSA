package BIT_MANIPULATION;
//find the ith bit of a number.
public class FindBit {
    public static void main(String[] args) {
        int n = 16;
        System.out.println(get(n));
    }
    static int get(int n){
        int ans = n&(1<<(n-1));
        return ans;
    }
}
