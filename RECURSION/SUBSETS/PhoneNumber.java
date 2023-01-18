package RECURSION.SUBSETS;

import java.util.ArrayList;
import java.util.List;

public class PhoneNumber {
    public static void main(String[] args) {
        System.out.println(padCount("", "100"));
    }

    static List<String> LetterPad(String p, String up) {
        if (up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        int digit = up.charAt(0) - '0';

        ArrayList<String> list = new ArrayList<>();

        for (int i = (digit - 1) * 3; i < digit * 3; i++) {
            char ch = (char) ('a' + i);
            list.addAll(LetterPad(p + ch, up.substring(1)));
        }
        return list;
    }

    static void combi(String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }

        int digit = up.charAt(0) - '0'; // this will convert '2' to 2
        
        for (int i = (digit - 1) * 3; i < digit * 3; i++) {
            char ch = (char) ('a' + i);
            combi(p + ch, up.substring(1));
        }
    }

    static int padCount(String p, String up) {
        if (up.isEmpty()) {
            return 1;
        }

        int digit = up.charAt(0) - '0'; // this will convert '2' to 2
        int count = 0;
        for (int i = (digit - 1) * 3; i < digit * 3; i++) {
            char ch = (char) ('a' + i);
            count  = count + padCount(p + ch, up.substring(1));
        }
        return count;
    }
}
