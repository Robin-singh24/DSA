package practice;

import java.util.*;

public class fibonacci {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // long n = in.nextInt();
        // long a = 0;
        // long b = 1;
        // long c=0;
        // long lastTwoDigit = 0;
        // for(long i = 2;i<=n;i++){
        //     c = a+b;
        //     a=b;
        //     b=c;
        // }
    
        // System.out.println(c);
        // System.out.println(c%100);
        int a = in.nextInt();
        int c = in.nextInt();
        int b = in.nextInt();
        int max = a;
        if(a<b){
            max = b;
        }else if(a<c){
            max = c;
        }
        else{
          max = max;
        }

        System.out.println(max);
    }
}
