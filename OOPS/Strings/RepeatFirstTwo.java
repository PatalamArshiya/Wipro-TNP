package OOPS.Strings;

public class RepeatFirstTwo {
    public static void main(String [] args){
        String str = "Wipro";
        String first = str.substring(0,2);
        for(int i=0;i<str.length();i++){
            System.out.println(first);
        }
    }
    
}
