package RECURSION.BACKTRACKING;

import java.util.ArrayList;

public class maze {
    public static void main(String[] args) {
        System.out.println(pathRetDiagonal("",3, 3));
        System.out.println(countPaths(3, 3));
    }

    static int countPaths(int r, int c) {
        if (r == 1 || c == 1) {
            return 1;
        }

        int down = countPaths(r - 1, c);
        int right = countPaths(r, c - 1);
        int totalWays = down + right;
        return totalWays;
    }

    static void printPaths(String p, int r, int c) {
        if (r == 1 && c == 1) {
            System.out.println(p);
            return;
        }

        if(r>1){
            printPaths(p + 'D',r - 1, c);
        }
        if(c>1){
            printPaths(p + 'R',r, c - 1);
        }
    }

    static ArrayList<String> pathRet(String p, int r, int c) {
        if (r == 1 && c == 1) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> list = new ArrayList<>();

        if(r>1){
            list.addAll(pathRet(p + 'D',r - 1, c));
        }
        if(c>1){
            list.addAll(pathRet(p + 'R',r, c - 1));
        }
        return list;
    }

    static ArrayList<String> pathRetDiagonal(String p, int r, int c) {
        if (r == 1 && c == 1) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> list = new ArrayList<>();

        if(r>1){
            list.addAll(pathRetDiagonal(p + 'V',r - 1, c));
        }
        if(c>1){
            list.addAll(pathRetDiagonal(p + 'H',r, c - 1));
        }
        if(r>1 && c>1){
            list.addAll(pathRetDiagonal(p + 'D',r-1, c - 1));
        }
        return list;
    }
}
