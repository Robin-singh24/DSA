// import java.util.*;

// /**
//  * Given an array of numbers. You need to add all the elements of the array,
//  * then reverse the output of the sum obtained. Input contains integer N =
//  * Number of elements, followed by N integers.
//  * N = 4 34 2 48 19 Output: 39 (Sum = 93) N = 7 2 9 19 34 563 62 81 Output: 77
//  * (Sum=770)
//  */

// public class prac {
//     public static void main(String[] args) {
//         Scanner in = new Scanner(System.in);
//         System.out.println("enter row : ");
//         int m = in.nextInt();
//         System.out.println("enter col : ");
//         int n = in.nextInt();
//         int[][] arr = new int[m][n];
        
//         for(int i = 0;i<m;i++){
//             for(int j = 0 ;j<n;j++){
//                 arr[i][j] = in.nextInt();
//             }
//         }
//         System.out.println("enter k : ");
//         int k = in.nextInt();
//         int temp = 0;
//         for(int i = 0;i<arr.length;i++){
//             for(int j = 0 ;j<arr[i].length;j++){
//                 if(arr[i][j]==k){
//                     temp = i+j;
//                 }
//             }
//             System.out.println("-1");
//         }
//         System.out.println("i: " + i + "j: " + j);
//     }
// }
