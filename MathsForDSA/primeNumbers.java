package MathsForDSA;

public class primeNumbers {
    public static void main(String[] args) {
        int n = 40;
        // for(int i=1;i<=n;i++){
        //     System.out.println(i + " "+isPrime(i));
        // }
        for (int i = 1; i <=n; i++) {
            if(isPrime(i)){
                System.out.println(i);
            }
        }

    }

    private static boolean isPrime(int n) {
        int count = 0;
        if(n<=1){
            return false;
        }
        for (int i = 2; i <= n; i++) {
            if(n%i==0){
                count++;
            }
        }
        if(count==1){
            return true;
        }
        return false;
    }
}
