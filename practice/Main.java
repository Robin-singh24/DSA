package practice;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        int n = in.nextInt();
        int[][] arr = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = in.nextInt();
            }
        }

        // boolean isFound = false;

        int first = 0;
        int second = 0;
        int max = maxNumber(arr);
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if(arr[i][i]==max){
                    first = i;
                    second = j;
                    // isFound = true;
                }
            }
        }
        System.out.println(first+" "+ second);
        System.out.println("max value is: ("+(first+","+second)+")");

        // if(isFound){
        //     System.out.println("max value is: ("+(first+","+second)+")");
        // }else{
        //     System.out.println("-1,-1");
        // }

    }

    // static int[] search(int[][] arr, int target) {
    // for (int i = 0; i < arr.length; i++) {
    // for (int j = 0; j < arr[i].length; j++) {
    // if (arr[i][j] == target) {
    // return new int[] { i, j };
    // }
    // }
    // }
    // return new int[] { -1, -1 };
    // }

    static int[] maxNumIdx(int[][] arr) {
        
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == maxNumber(arr) ) {
                    return new int[] { i,j };
                }
            }
        }
        return new int[] { -1, -1 };
    }

    static int maxNumber(int[][] arr) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                }
            }
        }
        return max;
    }

}
