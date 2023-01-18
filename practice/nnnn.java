package practice;

import java.util.*;

public class nnnn {
    public static void main(String[] args) {
        int a = 100;
        System.out.println("before : " + a);
        increase(a);
        System.out.println("after : " + a);
    }

    static int increase(int a){
        System.out.println("before inc: " + a);
        a = a+10;
        System.out.println("after inc: " + a);
        return a;
    }
}
