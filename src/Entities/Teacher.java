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
public class Teacher extends Person{
    private int Id;
    private String Name;

    public String getAgeCategoryName() {
        return ageCategoryName;
    }

    public void setAgeCategoryName(String ageCategoryName) {
        this.ageCategoryName = ageCategoryName;
    }
    private int ageCategory;
    private String ageCategoryName;
    private int classroomAssigned;
    private int student_capacity;
    private int student_assigned;

    public int getStudent_capacity() {
        return student_capacity;
    }

    public void setStudent_capacity(int student_capacity) {
        this.student_capacity = student_capacity;
    }

    public int getStudent_assigned() {
        return student_assigned;
    }

    public void setStudent_assigned(int student_assigned) {
        this.student_assigned = student_assigned;
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

    public int getAgeCategory() {
        return ageCategory;
    }

    public void setAgeCategory(int ageCategory) {
        this.ageCategory = ageCategory;
    }

    public int getClassroomAssigned() {
        return classroomAssigned;
    }

    public void setClassroomAssigned(int classroomAssigned) {
        this.classroomAssigned = classroomAssigned;
    }
    
    @Override
    public String toString(){
        return this.getName();
    }
    
}
