package RECURSION.EASY;

//1234 = 4321
public class ReverseNumber {
    public static void main(String[] args) {
        int n = 1234;
        reverseRecur1(n);
        System.out.println(n);
        System.out.println(sum);
    }

    static int reverseIter(int n) {
        int ans = 0;
        while (n > 0) {
            ans = ans * 10 + (n % 10);
            n = n / 10;
        }
        return ans;
    }

    // using recursion
    static int sum = 0;

    static void reverseRecur1(int n) {

        if (n == 0) {
            return;
        }
        int rem = n % 10;
        sum = sum * 10 + rem;
        reverseRecur1(n / 10);
    }
}
