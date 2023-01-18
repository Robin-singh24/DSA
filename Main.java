import java.util.*;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
        }
        int a = 10;
        int b = 20;
        swap(a,b);
        System.out.println(a + " " + b);


    }


    static void swap(int a,int b){
        int temp = a;
        a = b;
        b = temp;
    }
}
