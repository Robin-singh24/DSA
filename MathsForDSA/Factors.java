package MathsForDSA;

public class Factors {
    public static void main(String[] args) {
        int n = 36;
        factor2(n);
        
    }
    static void factor1(int n){
        for (int i = 1; i <= n; i++) {
            if(n%i==0){
                System.out.print(i + " ");
            }
        }
    }

    static void factor2(int n){
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if(n%i==0){
                if(n/i==i){
                    System.out.print(i + " ");
                }else{
                    System.out.print(i + " " + n/i + " ");
                }
            }
        }
    }
}
