package ARRAYS;

import java.util.Scanner;

public class TwoDArray {
    public static void main(String[] args) {
        //basic syntax

        //int[][] arr = new int[no of rows][no of columns];
        // int[][] arr = {
        //     {1,2,3},
        //     {4,5,6},
        //     {7,8,9}
        // };
        
        //System.out.println(Arrays.deepToString(arr));
        
        //TAKING INPUT IN 2D ARRAY :-
        
        try (Scanner in = new Scanner(System.in)) {
            int [][] arr2d = new int[3][3];

            for (int row = 0; row < arr2d.length; row++) {
                for(int col = 0; col<arr2d[row].length;col++){
                    arr2d[row][col] = in.nextInt();
                }
            }

            //OUTPUT
            for (int row = 0; row < arr2d.length; row++) {
                for (int col = 0; col < arr2d[row].length; col++) {
                    System.out.print(arr2d[row][col] + " ");
                }
                System.out.println();
            }
        }

        //OUTPUT2
        // for(int[] a : arr2d){
        //     System.out.println(Arrays.toString(a));
        // }
       
    }
}
