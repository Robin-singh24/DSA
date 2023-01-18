package RECURSION.STRINGS;

public class SkipString{
    public static void main(String[] args) {
        String str = "bcappledg";
        System.out.println(skipAppleNotApple(str));
    }

    static String skipApple(String up){
        if(up.isEmpty()){
            return "";
        }

        if(up.startsWith("apple")){
            return skipApple(up.substring(5));
        }else{
            return up.charAt(0) + skipApple(up.substring(1));
        }
    }

    static String skipAppleNotApple(String up){
        if(up.isEmpty()){
            return "";
        }

        if(up.startsWith("app") && !up.startsWith("apple")){
            return skipAppleNotApple(up.substring(3));
        }else{
            return up.charAt(0) + skipAppleNotApple(up.substring(1));
        }
    }
}