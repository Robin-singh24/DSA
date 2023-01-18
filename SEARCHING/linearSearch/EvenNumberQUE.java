package SEARCHING.linearSearch;

public class EvenNumberQUE {
    public static void main(String[] args) {
        int[] arr = { 12, 2, 3, 4444, 122 };
        int ans = findNumbers(arr);
        System.out.println(ans);
    }

    static int findNumbers(int[] arr) {
        int count = 0;
        for (int num : arr) {
            if (even(num)) {
                count++;
            }
        }
        return count;
    }

    static boolean even(int num) {
        int numberOfDigits = digits(num);
        return numberOfDigits % 2 == 0;
    }

    static int digits(int num) {
        int count = 0;

        while (num > 0) {
            count++;
            num /= 10;
        }

        return count;
    }
}
