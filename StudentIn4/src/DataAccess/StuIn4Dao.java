
package DataAccess;

import common.Library;
import common.Validation;
import java.util.Collections;
import java.util.List;
import model.Student;

public class StuIn4Dao {

    private static StuIn4Dao instance = null;
    protected Validation valid = new Validation();

    public static StuIn4Dao Instance() {
        if (instance == null) {
            synchronized (StuIn4Dao.class) {
                if (instance == null) {
                    instance = new StuIn4Dao();
                }
            }
        }
        return instance;
    }

    public void adding(List<Student> students, Student new_student) {
        String choice = "Y";
        while(choice.equalsIgnoreCase("Y")){
            Student newStudent = new Student();
            newStudent.setName(valid.inputString("Enter name"));
            newStudent.setClasses(valid.inputString("Enter class"));
            newStudent.setMark(valid.inputInt("Enter mark", 0, 10));
            students.add(newStudent);
            Collections.sort(students, new Library());
            choice = valid.inputStringMatch("Do you want to enter more student information?(Y/N)", "[YNyn]");
        }
    }

    public void display(List<Student> students) {
        int count = 1;
        for (Student student : students) {
            System.out.println("-------------Student " + count+"-------------");
            System.out.println(student.toString());
            count++;
        }
    }
}