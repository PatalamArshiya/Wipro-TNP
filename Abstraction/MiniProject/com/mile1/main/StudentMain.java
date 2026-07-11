package Abstraction.MiniProject.com.mile1.main;

import Abstraction.MiniProject.com.mile1.bean.Student;
import Abstraction.MiniProject.com.mile1.exception.NullMarksArrayException;
import Abstraction.MiniProject.com.mile1.exception.NullNameException;
import Abstraction.MiniProject.com.mile1.exception.NullStudentObjectException;
import Abstraction.MiniProject.com.mile1.service.StudentReport;
import Abstraction.MiniProject.com.mile1.service.StudentService;

public class StudentMain {

    public static void main(String[] args) {

        Student data[] = new Student[4];

        data[0] = new Student("Sekhar",
                new int[] { 85, 75, 95 });

        data[1] = new Student(null,
                new int[] { 11, 22, 33 });

        data[2] = new Student("Manoj", null);

        data[3] = null;

        StudentReport report = new StudentReport();

        for (int i = 0; i < data.length; i++) {

            try {

                System.out.print("Student " + (i + 1) + " : ");

                String result = report.validate(data[i]);

                if (result.equals("VALID")) {

                    String grade = report.findGrades(data[i]);

                    System.out.println(data[i].getName()
                            + " Grade : " + grade);
                }

            } catch (NullNameException e) {

                System.out.println(e);

            } catch (NullMarksArrayException e) {

                System.out.println(e);

            } catch (NullStudentObjectException e) {

                System.out.println(e);

            }
        }

        StudentService service = new StudentService();

        System.out.println();
        System.out.println("Number of Null Marks Array = "
                + service.findNumberOfNullMarksArray(data));

        System.out.println("Number of Null Names = "
                + service.findNumberOfNullNames(data));

        System.out.println("Number of Null Objects = "
                + service.findNumberOfNullObjects(data));
    }
}