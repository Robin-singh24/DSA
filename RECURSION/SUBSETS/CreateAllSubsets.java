package RECURSION.SUBSETS;

import java.util.ArrayList;

public class CreateAllSubsets {
    public static void main(String[] args) {
        String str = "abc";
        System.out.println(subsetAscii2("", str));
    }

    static void subset(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);
        subset(p + ch, up.substring(1));
        subset(p, up.substring(1));
    }

    static ArrayList<String> subset2(String p,String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        char ch = up.charAt(0);
        ArrayList<String> left =  subset2(p + ch, up.substring(1));
        ArrayList<String> right =  subset2(p, up.substring(1));

        left.addAll(right);
        return left;
    }

    static void subsetAscii(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);
        subsetAscii(p + ch, up.substring(1));
        subsetAscii(p, up.substring(1));
        subsetAscii(p + (ch+0), up.substring(1));
    }

    static ArrayList<String> subsetAscii2(String p,String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        char ch = up.charAt(0);
        ArrayList<String> first =  subsetAscii2(p + ch, up.substring(1));
        ArrayList<String> second =  subsetAscii2(p, up.substring(1));
        ArrayList<String> third =  subsetAscii2(p+ (ch+0), up.substring(1));

        first.addAll(second);
        first.addAll(third);

        return first;
    }
}
