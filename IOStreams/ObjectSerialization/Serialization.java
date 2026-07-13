package IOStreams.ObjectSerialization;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.Date;

public class Serialization {

    public static void main(String[] args) {

        try {

            Employee emp = new Employee(
                    "Sudhir",
                    new Date(),
                    "IT",
                    "Developer",
                    90000);

            ObjectOutputStream out =
                    new ObjectOutputStream(new FileOutputStream("data"));

            out.writeObject(emp);
            out.close();

            System.out.println("Object Serialized Successfully");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}