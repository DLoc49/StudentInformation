
package repository;

import java.util.List;
import model.Student;

public interface IStuIn4Repository {

    void adding(List<Student> students, Student new_student);

    void display(List<Student> students);
    
}