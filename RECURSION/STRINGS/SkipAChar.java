package RECURSION.STRINGS;

public class SkipAChar {
    public static void main(String[] args) {
        String str = "baccad";
        // func(str, "", 'a');  
        System.out.println(func2(str));
    }

    static void func(String up, String p, char target) {
        // up = unprocessed
        // p = processed
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);

        if (ch == target) {
            func(up.substring(1), p, target);
        } else {
            func(up.substring(1), p + ch, target);
        }
    }
    static String func2(String up) {
        if (up.isEmpty()) {
            return "";
        }

        char ch = up.charAt(0);

        if (ch == 'a') {
            return func2(up.substring(1));
        } else {
            return ch + func2(up.substring(1));
        }
    }
}
