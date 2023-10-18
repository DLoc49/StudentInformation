
    package common;

    import java.util.Comparator;
    import model.Student;

    public class Library implements Comparator<Student>{

        @Override
        public int compare(Student o1, Student o2) {
            return o1.getName().compareTo(o2.getName());
        }
    }