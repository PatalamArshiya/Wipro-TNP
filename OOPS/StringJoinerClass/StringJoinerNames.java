package OOPS.StringJoinerClass;
import java.util.ArrayList;
import java.util.StringJoiner;

public class StringJoinerNames {
    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();

        names.add("Arshiya");
        names.add("Thanu Sri");
        names.add("Sowmya");
        names.add("Khasira");

        StringJoiner sj = new StringJoiner(",", "{", "}");

        for (String name : names) {
            sj.add(name);
        }

        System.out.println(sj);
    }
}
    

