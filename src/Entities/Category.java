/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

/**
 *
 * @author Tejal
 */
public class Category {
    private int Id;
    private String Name;
    private int student_capacity;
    private int teacher_capacity;

    public int getStudent_capacity() {
        return student_capacity;
    }

    public void setStudent_capacity(int student_capacity) {
        this.student_capacity = student_capacity;
    }

    public int getTeacher_capacity() {
        return teacher_capacity;
    }

    public void setTeacher_capacity(int teacher_capacity) {
        this.teacher_capacity = teacher_capacity;
    }
    

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }
    
    @Override
    public String toString(){
        return this.getName();
    }
}
