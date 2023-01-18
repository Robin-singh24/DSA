package RECURSION.EASY;

public class PrintNum {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(NumSum(n));
    }

//FIRST
    static void OneToN(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        OneToN(n-1);
    }

//SECOND
    static void NToOne(int n){
        if(n==0){
            return;
        }
        NToOne(n-1);
        System.out.println(n);  
    }

//THIRD
    static int NumProduct(int n){
        if(n<=1 ){
            return 1;
        }
        
        return n*NumProduct(n-1);  
    }

//FOURTH
static int NumSum(int n){
    if(n==1){
        return 1;
    }
    
    return n + NumSum(n-1);  
    }

}
