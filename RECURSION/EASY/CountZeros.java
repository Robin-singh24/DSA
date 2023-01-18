package RECURSION.EASY;

public class CountZeros {
    public static void main(String[] args) {
        int n = 000000000000000000000000000 ;
        System.out.println(count(n));
    }

    // RECURSION
    static int count(int n){
        return helper(n,0);
    }

    private static int helper(int n, int c) {
        if(n==0){
            return c;
        }
        int rem = n%10;
        if(rem==0){
            return helper(n/10,c+1);
        }
        return helper(n/10, c);
    }

    // ITERATION
    static int count1(int n) {
        int count = 0;
        while (n > 0) {
            int rem = n % 10;
            if (rem == 0) {
                count++;
            }
            n = n / 10;
        }
        return count;
    }
}
