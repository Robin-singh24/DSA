package HASHING;

import java.util.HashSet;
import java.util.Iterator;

public class hashSet {
    public static void main(String[] args) {
        //creating
        HashSet<Integer> set = new HashSet<>();

        //insert
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(5);
        set.add(6);

        System.out.println(set);
        //searching
        System.out.println(set.contains(5));//true
        set.remove(5);
        set.remove(6);
        set.add(0);
        System.out.println("size of set is:"+ set.size());

        //iterator
        Iterator it = set.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
