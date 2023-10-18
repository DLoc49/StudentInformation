
package model;

import java.util.ArrayList;
import java.util.List;

public class Student {

    private String name;
    private int mark;
    private String classes;
    private List<Student> students = new ArrayList<Student>();

    public Student(String name, int mark, String classes) {
        this.name = name;
        this.mark = mark;
        this.classes = classes;
    }
    
    public Student(){}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }

    public String getClasses() {
        return classes;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    @Override
    public String toString() {
        return "Name: "+this.getName()+
                "\nClasses: "+this.getClasses()+
                "\nMark: "+this.getMark();
    }
}