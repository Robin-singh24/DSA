package practice.String;

public class PalindromeCheck {
    public static void main(String[] args) {
        String str = "abbba";
        System.out.println(isPaliUsingSB(str));
        
    }

    //first
    //using 2 pointers
    static boolean isPali(String str){
        str = str.toLowerCase();
        int start = 0;
        int end = str.length()-1;

        while(start<end){
            if(str.charAt(start)!=str.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    //second 
    //using for loop
    static boolean ispalindrome(String str){
        if(str == null || str.length() == 0){
            return false;
        }
        
        str = str.toLowerCase();
        for(int i=0;i<str.length()/2;i++){
            char start = str.charAt(i);
            char end = str.charAt(str.length()-1-i);

            if(start!=end){
                return false;
            }
        }return true;
    }

    //check palindrome using string builders
    static boolean isPaliUsingSB(String str){
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        String rev = sb.toString();
        if(str.equals(rev)){
            return true;
        }else{
            return false;
        }
    }
}
