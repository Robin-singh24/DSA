package STRINGS;

public class StringB {
    public static void main(String[] args) {
        // StringBuilder series = new StringBuilder();
        // for (int i = 0; i < 26; i++) {
        //     char ch = (char)('a' + i);
        //     series.append(ch);
        // }
        // System.out.println(series);

        //StringBuilder name = new StringBuilder();
        // name.append("Robin Singh");
        // System.out.println(name.length());
        // name.reverse();
        // System.out.println(name); 
        // String firstName = "Robin";
        // System.out.println(firstName.hashCode());

        //PALINDROME STRING
        StringBuilder ori = new StringBuilder();
        ori.append("abcdcba");
        System.out.println(ori);
        StringBuilder pali = new StringBuilder();
        pali.append(ori.reverse());
        System.out.println(pali);

        if(pali.equals(ori)){
            System.out.println(true);
        }
        else{
            System.out.println(false);
        }    

    }
}
