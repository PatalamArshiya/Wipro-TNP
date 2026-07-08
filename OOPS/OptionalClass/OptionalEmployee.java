package OOPS.OptionalClass;
import java.util.Optional;

public class OptionalEmployee {

    public static void main(String[] args) {

        Employee emp = null;

        try {
            Employee e = Optional.ofNullable(emp)
                    .orElseThrow(() -> new InvalidEmployeeException("Employee is null"));

            System.out.println(e.name);

        } catch (InvalidEmployeeException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
    

