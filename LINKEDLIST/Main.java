package LINKEDLIST;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        //SINGLY LL
        LL list = new LL();
        list.insertFirst(2);
        list.insertFirst(3);
        list.insertFirst(12);
        list.insertFirst(22);
        list.insertFirst(4);
        list.insertLast(99);
        list.insert(11, 3);
        // System.out.println(list.delete(3));
        list.display();
        list.insertRecur(3, 33);
        list.display();

        // System.out.println(list.find(12));
        

        //DOUBLY LINKED LIST
        // DLL list = new DLL();
        // list.insertFirst(5);
        // list.insertFirst(2);
        // list.insertFirst(8);
        // list.insertLast(7);
        // list.insert(18, 7);

        // CIRCULAR LL
        // CLL list = new CLL();
        // list.insertFirst(8);
        // list.insertFirst(9);
        // list.insertFirst(2);
        // list.insertFirst(7);
        // list.delete(7);
        // list.display();
    }
}
