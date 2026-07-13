package IOStreams.MiniProject;

import java.io.*;


public class EmployeeOperations {

    File file = new File("employee.txt");

    public void addEmployee(Employee e) throws Exception {

        ObjectOutputStream oos;

        if (file.exists() && file.length() > 0) {
            oos = new AppendObjectOutputStream(new FileOutputStream(file, true));
        } else {
            oos = new ObjectOutputStream(new FileOutputStream(file));
        }

        oos.writeObject(e);
        oos.close();
    }

    public void displayAll() throws Exception {

        if (!file.exists()) {
            System.out.println("No Records Found");
            return;
        }

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));

        System.out.println("----Report----");

        try {
            while (true) {
                Employee e = (Employee) ois.readObject();
                System.out.println(e);
            }
        } catch (EOFException ex) {
        }

        System.out.println("----End of Report----");
        ois.close();
    }
}