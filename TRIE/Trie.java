package TRIE;
import java.util.*;
public class Trie {

    static class Node{
        Node[] children;
        boolean eow; //end of word

        public Node(){
            children = new Node[26];
            //initialising the array null
            for (int i = 0; i < 26; i++) {
                children[i] = null;
            }
            eow = false;
        }
    }

    static Node root = new Node();

    public static void insert(String str){
        Node curr = root;
        for (int i = 0; i < str.length(); i++) { //0(L)
            int index = str.charAt(i) - 'a';
            if(curr.children[index]==null){
                //add new node
                curr.children[index] = new Node();
            }
            if(i==str.length()-1){
                curr.children[index].eow = true;
            }
            curr = curr.children[index];
        }
    }

    public static boolean search(String key){
        Node curr = root;
        for (int i = 0; i < key.length(); i++) {
            int index = key.charAt(i) - 'a';
            if(curr.children[index]==null){
                return false;
            }
            if(i==key.length()-1 && curr.children[index].eow==false){
                return false;
            }

            curr = curr.children[index];
        }
        return true;
    }

    public static void main(String[] args) {
        String[] words = {"a","any","the","there","their"};

        for (int i = 0; i < words.length; i++) {
            insert(words[i]);
        }
        System.out.println(search("there"));
        System.out.println(search("their"));
        System.out.println(search("thor"));
        System.out.println(search("an"));
    }
}
