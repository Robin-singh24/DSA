package MathsForDSA;

public class HCF {
    public static void main(String[] args) {
        int a = 94;
        int b = 136;
        System.out.println(highestCF(a, b));
    }

    static int highestCF(int a,int b){
        int ans = 0;
        for (int i = 1; i <= a && i<=b; i++) {
            if(a%i==0 && b%i==0){
                ans = i;
            }
        }

        return ans;
    }
}
