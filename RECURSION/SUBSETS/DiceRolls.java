package RECURSION.SUBSETS;

import java.util.*;

public class DiceRolls {
    public static void main(String[] args) {
        System.out.println(diceFace("",7,8));
    }

    static void rolls(String p,int target){
        if(target==0){
            System.out.println(p);
            return;
        }

        for (int i = 1; i <=6 && i<=target; i++) {
            rolls(p+i, target-i);
        }
    }

    static List<String> dice(String p,int target){
        if(target==0){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> list = new ArrayList<>();

        for (int i = 1; i <=6 && i<=target; i++) {
            list.addAll(dice(p+i, target-i));
        }
        return list;
    }

    // dice with unknown number of faces
    static List<String> diceFace(String p,int target,int face){
        if(target==0){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> list = new ArrayList<>();

        for (int i = 1; i <=face && i<=target; i++) {
            list.addAll(diceFace(p+i, target-i,face));
        }
        return list;
    }
}
