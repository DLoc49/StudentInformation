/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository;

import DataAccess.StuIn4Dao;
import java.util.List;
import model.Student;

public class StuIn4Repository implements IStuIn4Repository {
    @Override
    public void adding(List<Student> students, Student new_student){
        StuIn4Dao.Instance().adding(students, new_student);
    }
    
    @Override
    public void display(List<Student> students){
        if(students.isEmpty()){
            System.out.println("List is empty");
            return;
        }
        StuIn4Dao.Instance().display(students);
    }
}