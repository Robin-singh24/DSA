package MathsForDSA;

public class Seive {
    public static void main(String[] args) {
        int n = 40;
        boolean[] primes = new boolean[n+1];//since we want 40 to be included as the array will have a range from 0 to 39.  
        seiveOfEratho(primes, n);
    }
    static void seiveOfEratho(boolean[] primes, int n){
        for (int i = 2; i*i <= n; i++) {
            //initially the values of the empty array will all be false
            //if value is false then the number is prime  
            if(!primes[i]){
                //in this loop we are marking every element that is a multiple of that number as true.
                //i.e if a element is marked as true then it is not a prime number.
                //here it will start from i*2(2*2 or 3*2(as 2 &3 are already prime numbers)) and run till 'n' and increment 'i' times
                //i.e if i=2 it will increment +2 times for i=3, +3 times and soo on 
                for (int j = i*2; j <=n; j+=i) {
                    primes[i] = true;
                }
            }
        }
        //printing all the prime numbers
        for (int i = 2; i <=n; i++) {
            if(!primes[i]){
                System.out.println(i + " ");
            }
        }
    }
}
