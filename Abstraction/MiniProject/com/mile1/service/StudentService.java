package Abstraction.MiniProject.com.mile1.service;

import Abstraction.MiniProject.com.mile1.bean.Student;

public class StudentService {

    public int findNumberOfNullMarksArray(Student[] students) {

        int count = 0;

        for (Student s : students) {
            if (s != null && s.getMarks() == null) {
                count++;
            }
        }

        return count;
    }

    public int findNumberOfNullNames(Student[] students) {

        int count = 0;

        for (Student s : students) {
            if (s != null && s.getName() == null) {
                count++;
            }
        }

        return count;
    }

    public int findNumberOfNullObjects(Student[] students) {

        int count = 0;

        for (Student s : students) {
            if (s == null) {
                count++;
            }
        }

        return count;
    }
}