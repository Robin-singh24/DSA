package TRIE;
import java.util.*;
public class Questions {
    static class Node {
        Node[] children;
        boolean eow; // end of word

        public Node() {
            children = new Node[26];
            // initialising the array null
            for (int i = 0; i < 26; i++) {
                children[i] = null;
            }
            eow = false;
        }
    }

    static Node root = new Node();

    public static void insert(String str) {
        Node curr = root;
        for (int i = 0; i < str.length(); i++) { // 0(L)
            int index = str.charAt(i) - 'a';
            if (curr.children[index] == null) {
                // add new node
                curr.children[index] = new Node();
            }
            if (i == str.length() - 1) {
                curr.children[index].eow = true;
            }
            curr = curr.children[index];
        }
    }

    public static boolean search(String key) {
        Node curr = root;
        for (int i = 0; i < key.length(); i++) {
            int index = key.charAt(i) - 'a';
            if (curr.children[index] == null) {
                return false;
            }
            if (i == key.length() - 1 && curr.children[index].eow == false) {
                return false;
            }

            curr = curr.children[index];
        }
        return true;
    }

    // Que 1 - wordBreak
    public static boolean wordBreak(String key) {
        if (key.length() == 0) {
            return true;
        }
        for (int i = 1; i <= key.length(); i++) {
            String firstPart = key.substring(0, i);
            String secPart = key.substring(i);
            if (search(firstPart) && wordBreak(secPart)) {
                return true;
            }
        }
        return false;
    }

    // Que 2 - startsWith
    public static boolean startsWith(String str) {
        Node temp = root;
        for (int i = 0; i < str.length(); i++) {
            int index = str.charAt(i) - 'a';
            if (temp.children[index] == null) {
                return false;
            }
            temp = temp.children[index];
        }
        return true;
    }

    // Que 3 - countUniqueSubstrings
    public static int countNodes(Node root){
        if(root==null){
            return 0;
        }
        int count = 0;
        for(int i = 0; i < 26 ; i++){
            if(root.children[i]!=null){
                count+=countNodes(root.children[i]);
            }
        }
        return count + 1;
    }

    // Que 4 - longestWord
    public static String ans = "";
    public static void longestWord(Node root , StringBuilder temp){
        if(root==null) return;
        for (int i = 0; i < 26; i++) {
            if(root.children[i]!=null && root.children[i].eow==true){
                temp.append((char)(i+'a'));
                if(temp.length()>ans.length()){
                    ans = temp.toString();//u cannot assign a string value to a stringBuilder directly
                }
                longestWord(root.children[i], temp);
                temp.deleteCharAt(temp.length()-1);
            }
            
        }
    }

    public static void main(String[] args) {
        // QUE 3 - unique prefix
        // find all the suffix for string
        // String word = "apple";
        // take the suffix of the string and insert all the suffix in a trie
        // for (int i = 0; i < word.length(); i++) {
        //     String suffix = word.substring(i);
        //     System.out.println(suffix);
        //     insert(suffix);
        // }
        // System.out.println(countNodes(root));

        //4th question
        String[] words = {"a","banaba","app","appl","ap","apply","apple"};
        for (int i = 0; i < words.length; i++) {
            insert(words[i]);
        }
        longestWord(root, new StringBuilder(""));
        System.out.println(ans);
    }
}
