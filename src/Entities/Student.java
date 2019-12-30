/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

import java.util.Date;

public class Student extends Person {
    private int studentId;
    /*private String firstName;
    private String lastName;
    private String fatherName;
    private String motherName;
    private Date dateOfBirth;
*/
    private Date HIB_Dose1;
    private Date DTap_Dose1;
    private Date DTap_Dose2;
    private Date DTap_Dose3;
    private Date DTap_Dose4;
    private Date DTap_Dose5;
    private Date Polio_Dose1;
    private Date Polio_Dose2;
    private Date Polio_Dose3;
    private Date Polio_Dose4;
    private Date MMR_Dose1;
    private Date MMR_Dose2;
    private Date Hepatitis_Dose1;
    private Date Hepatitis_Dose2;
    private Date Hepatitis_Dose3;
    private Date Varicella_Dose1;
    private Date Varicella_Dose2;

    public Date getDateOfBirth() {
        return dateOfBirth;
    }
    public Date getHIB_Dose1() {
        return HIB_Dose1;
    }
    public Date getDTap_Dose1() {
        return DTap_Dose1;
    }
    public Date getDTap_Dose2() {
        return DTap_Dose2;
    }
    public Date getDTap_Dose3() {
        return DTap_Dose3;
    }
    
    public Date getDTap_Dose4() {
        return DTap_Dose4;
    }
    public Date getDTap_Dose5() {
        return DTap_Dose5;
    }
    
    public Date getPolio_Dose1() {
        return Polio_Dose1;
    }
    public Date getPolio_Dose2() {
        return Polio_Dose2;
    }
    public Date getPolio_Dose3() {
        return Polio_Dose3;
    }
    public Date getPolio_Dose4() {
        return Polio_Dose4;
    }
    public Date getMMR_Dose1() {
        return MMR_Dose1;
    }
    public Date getMMR_Dose2() {
        return MMR_Dose2;
    }
    
    public Date getHepatitis_Dose1() {
        return Hepatitis_Dose1;
    }
    public Date getHepatitis_Dose2() {
        return Hepatitis_Dose2;
    }
    
    public Date getHepatitis_Dose3() {
        return Hepatitis_Dose3;
    }
    
    public Date getVaricella_Dose1() {
        return Varicella_Dose1;
    }
    public Date getVaricella_Dose2() {
        return Varicella_Dose2;
    }
    
    public void setHIB_Dose1(Date HIB_Dose1){
        this.HIB_Dose1 = HIB_Dose1;
    }
    
    public void setDTap_Dose1(Date DTap_Dose1){
        this.DTap_Dose1 = DTap_Dose1;
    }
    
    public void setDTap_Dose2(Date DTap_Dose2){
        this.DTap_Dose2 = DTap_Dose2;
    }
    
    public void setDTap_Dose3(Date DTap_Dose3){
        this.DTap_Dose3 = DTap_Dose3;
    }
    public void setDTap_Dose4(Date DTap_Dose4){
        this.DTap_Dose4 = DTap_Dose4;
    }
    public void setDTap_Dose5(Date DTap_Dose5){
        this.DTap_Dose5 = DTap_Dose5;
    }
    
    public void setVaricella_Dose1(Date Varicella_Dose1) {
        this.Varicella_Dose1 = Varicella_Dose1;
    }
    public void setVaricella_Dose2(Date Varicella_Dose2) {
        this.Varicella_Dose2 = Varicella_Dose2;
    }
    
    public void setPolio_Dose1(Date Polio_Dose1){
        this.Polio_Dose1 = Polio_Dose1;
    }
    public void setPolio_Dose2(Date Polio_Dose2){
        this.Polio_Dose2 = Polio_Dose2;
    }
    public void setPolio_Dose3(Date Polio_Dose3){
        this.Polio_Dose3 = Polio_Dose3;
    }
    public void setPolio_Dose4(Date Polio_Dose4){
        this.Polio_Dose4 = Polio_Dose4;
    }
    
    public void setMMR_Dose1(Date MMR_Dose1){
        this.MMR_Dose1 = MMR_Dose1;
    }
    
    public void setMMR_Dose2(Date MMR_Dose2){
        this.MMR_Dose2 = MMR_Dose2;
    }
    
    public void setHepatitis_Dose1(Date Hepatitis_Dose1) {
        this.Hepatitis_Dose1 = Hepatitis_Dose1;
    }
    public void setHepatitis_Dose2(Date Hepatitis_Dose2) {
        this.Hepatitis_Dose2 = Hepatitis_Dose2;
    }
    public void setHepatitis_Dose3(Date Hepatitis_Dose3) {
        this.Hepatitis_Dose3 = Hepatitis_Dose3;
    }
    
    
    public void setRegistrationDate(Date registrationDate) {
        this.registrationDate = registrationDate;
    }
    
    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Date getRegistrationDate() {
        return registrationDate;
    }

    
    private Date registrationDate;

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }
    private Category ageCategory;
    private Teacher teacher;
    private String notes;

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFatherName() {
        return fatherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public String getMotherName() {
        return motherName;
    }

    public void setMotherName(String motherName) {
        this.motherName = motherName;
    }

    public Category getAgeCategory() {
        return ageCategory;
    }

    public void setAgeCategory(Category ageCategory) {
        this.ageCategory = ageCategory;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }
    
    @Override
    public String toString(){
        return this.getFirstName();
    }
    
}
