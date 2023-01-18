package practice.String;

public class ipaddress {
    public static void main(String[] args) {
        String address = "1.1.1.1";
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < address.length(); i++) {
            if(address.charAt(i)=='.'){
                str.append("[.]");
            }else{
                str.append(address.charAt(i));
            }
        }
        System.out.println(str);
    }
}
