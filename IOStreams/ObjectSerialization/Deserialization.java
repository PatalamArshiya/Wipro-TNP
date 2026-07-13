package IOStreams.ObjectSerialization;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Deserialization {

    public static void main(String[] args) {

        try {

            ObjectInputStream in =
                    new ObjectInputStream(new FileInputStream("data"));

            Employee emp = (Employee) in.readObject();

            in.close();

            System.out.println("Name : " + emp.getName());
            System.out.println("Date Of Birth : " + emp.getDateOfBirth());
            System.out.println("Department : " + emp.getDepartment());
            System.out.println("Designation : " + emp.getDesignation());
            System.out.println("Salary : " + emp.getSalary());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}