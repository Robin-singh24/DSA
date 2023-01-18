package practice.arrays;

import java.util.Scanner;

public class isPrime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int count = 0;

        for (int i = 1; i <= n; i++) {
            if(n%i==0){
                count+=1;
            }
        }
        if(count==2){
            System.out.println("number is a prime number");
        }
        else{
            System.out.println("number is not a prime number");
        }
    }
}
