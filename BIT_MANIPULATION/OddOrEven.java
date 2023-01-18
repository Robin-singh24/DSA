package BIT_MANIPULATION;

public class OddOrEven {
    public static void main(String[] args) {
        int n = 32;
        System.out.println(isOdd(n));
    }

    static boolean isOdd(int n) {
        return (n & 1)==1;
    }
    
}
