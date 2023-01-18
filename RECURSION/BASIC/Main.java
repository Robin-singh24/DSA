package RECURSION.BASIC;

public class Main {
    public static void main(String[] args) {
        print(10);
    }

    static void print1(int n) {
        if (n >= 6) {
            return;
        }
        System.out.println(n);

        print1(n + 1);
    }

    static void print(int n) {
        if (n <= 0) {
            return;
        }
        System.out.println(n);

        print(n - 1);
    }

}
