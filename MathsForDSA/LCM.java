package MathsForDSA;

public class LCM {
    public static void main(String[] args) {
        System.out.println(lowestCommonMulti(2, 5));
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

    static int lowestCommonMulti(int a,int b){
        //(lcm = a*b/hcf)
        int lcm = (a*b)/highestCF(a, b);
        return lcm;
    }
}
