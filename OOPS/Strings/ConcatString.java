package OOPS.Strings;

public class ConcatString {
    public static void main(String[] args){
        String s1 = "Sachin";
        String s2 = "Tendulkar";
        String result;
        if(s1.charAt(s1.length() -1) == s2.charAt(0)){
            result = s1 + s2.substring(1);
        } else {
            result = s1+s2;
        }
        System.out.println(result.toLowerCase());
    }
    
}
