
package controller;

import model.Student;
import repository.StuIn4Repository;
import view.Menu;


public class StuIn4Controller extends Menu{
    protected static String[] mc = {"Enter student information",
                                    "Display student information", "Exit"};
    protected StuIn4Repository repo;
    protected Student student;
    
    public StuIn4Controller(){
        super("====== Collection Sort Program ======", mc);
        repo = new StuIn4Repository();
        student = new Student();
    }

    @Override
    public void execute(int choice) {
        switch(choice){
            case 1:{
                repo.adding(student.getStudents(), new Student());
                break;
            }
            case 2:{
                repo.display(student.getStudents());
                break;
            }
            case 3:{
                System.out.println("EXIT...");
                System.exit(0);
            }
            default:{
                System.out.println("No such choice!");
            }
        }
    }
}