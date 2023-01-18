package practice.arrays;

import java.util.Scanner;

public class twoDSpiral {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int r = in.nextInt();
        int c = in.nextInt();
        int[][] arr = new int[r][c];

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arr[i][j] = in.nextInt();
            }
        }

        int sr = 0, sc = 0, er = r - 1, ec = c - 1, count = 0;

        while (count < r * c) {
            // top wall
            for (int col = sc; col <= ec && count < r * c; col++) {
                System.out.print(arr[sr][col] + " ");
                count++;
            }
            sr++;
            // right wall
            for (int row = sr; row <= er && count < r * c; row++) {
                System.out.print(arr[row][ec] + " ");
                count++;
            }
            ec--;
            // bottom wall
            for (int col = ec; col >= sc && count < r * c; col--) {
                System.out.print(arr[er][col] + " ");
                count++;
            }
            er--;
            // left wall
            for (int row = er; row >= sr && count < r * c; row--) {
                System.out.print(arr[row][sc] + " ");
                count++;
            }
            sc++;
        }
    }
}
