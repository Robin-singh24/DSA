package BIT_MANIPULATION;

public class CountSetBits {
    public static void main(String[] args) {
        int n = 19; // n=10011 therefore total number of set bits==3....
        System.out.println(setBits(n));
    }

    private static int setBits(int n) {
        int count = 0;

        while(n>0){
            if((n&1)==1){
                count++;
            }
            n = n>>1;
        }

        return count;
    }
}
