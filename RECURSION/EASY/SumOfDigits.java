package RECURSION.EASY;

public class SumOfDigits {
    public static void main(String[] args) {
        System.out.println(sumRecur(1234));
        System.out.println(productRecur(12340));
    }

    // using loops
    static int sum(int n) {
        int ans = 0;

        while (n > 0) {
            ans = ans + (n % 10);
            n = n / 10;
        }

        return ans;
    }

    // sum of digits using recursion
    static int sumRecur(int n) {
        if (n == 0) {
            return 0;
        }
        return n % 10 + sumRecur(n / 10);
    }

    // product of digits using recursion
    static int productRecur(int n) {
        if (n%10 == n) {
            return n;
        }
        return n % 10 * productRecur(n / 10);
    }
}
