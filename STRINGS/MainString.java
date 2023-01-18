package STRINGS;

public class MainString {
    public static void main(String[] args) {
        String a = new String("Robin");
        String b = new String("Robin");
        System.out.println(a.equals(b));

        String series = "";
        for(int i=0;i<26;i++){
            char ch = (char) ('a'+i);
            series += ch;
        }
        System.out.println(series);
        
    }
}
