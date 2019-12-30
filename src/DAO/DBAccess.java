/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;
import Entities.Student;
import Entities.Category;
import Entities.Teacher;
import Entities.Vaccine;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DBAccess {
    
  private Connection connect = null;
  private Statement statement = null;
  private PreparedStatement preparedStatement = null;
  private ResultSet resultSet = null;
  
  final private String host = "localhost";
  final private String user = "root";
  final private String passwd = "Boston@23";
  
  // fetch categories
  public ArrayList<Category> fetchCategories()throws Exception {
      ArrayList<Category> objCategoryList = new ArrayList<Category>();
       try {
	      Class.forName("com.mysql.jdbc.Driver");
	      connect = DriverManager
	          .getConnection("jdbc:mysql://" + host + "/daycare?"
	              + "user=" + user + "&password=" + passwd );

	      // Statements allow to issue SQL queries to the database
	      statement = connect.createStatement();

	      preparedStatement = connect
	          .prepareStatement("SELECT Id, Name, student_capacity, teacher_capacity from daycare.category");
              
	      resultSet = preparedStatement.executeQuery();
             
              
              while (resultSet.next()) {
	      // It is possible to get the columns via name
	      // also possible to get the columns via the column number
	      // which starts at 1
	      // e.g. resultSet.getSTring(2);
              Category objCategory = new Category();
              objCategory.setId(resultSet.getInt("Id"));
              objCategory.setName(resultSet.getString("Name"));
              objCategory.setStudent_capacity(resultSet.getInt("student_capacity"));
              objCategory.setTeacher_capacity(resultSet.getInt("teacher_capacity"));
              
              objCategoryList.add(objCategory);
	    }
             
	      
	    } catch (Exception e) {
	      throw e;
	    } finally {
	      close();
	    }
      return objCategoryList;
  }
  
  // fetch teachers based on category id
  public ArrayList<Teacher> fetchTeachers(int categoryId)throws Exception {
      System.out.println("fetchTeachers function called : categoryId = " + categoryId);
      ArrayList<Teacher> objTeacherList = new ArrayList<Teacher>();
       try {
	      Class.forName("com.mysql.jdbc.Driver");
	      connect = DriverManager
	          .getConnection("jdbc:mysql://" + host + "/daycare?"
	              + "user=" + user + "&password=" + passwd );

	      // Statements allow to issue SQL queries to the database
	      statement = connect.createStatement();
              
              if(categoryId > 0){
                   preparedStatement = connect
	          .prepareStatement("SELECT Id, Name, student_capacity, student_assigned, CategoryName, Classroom FROM daycare.teacher_details WHERE student_assigned < student_capacity AND CategoryId = " +  categoryId);
              }
              else{
                   preparedStatement = connect
                        .prepareStatement("SELECT Id, Name, student_capacity, student_assigned, CategoryName, Classroom FROM daycare.teacher_details;");
              
              }
	     
	      resultSet = preparedStatement.executeQuery();
             
              
              while (resultSet.next()) {
	      // It is possible to get the columns via name
	      // also possible to get the columns via the column number
	      // which starts at 1
	      // e.g. resultSet.getSTring(2);
              Teacher objTeacher = new Teacher();
              objTeacher.setId(resultSet.getInt("Id"));
              objTeacher.setName(resultSet.getString("Name"));
              objTeacher.setStudent_capacity(resultSet.getInt("student_capacity"));
              objTeacher.setStudent_assigned(resultSet.getInt("student_assigned"));
              objTeacher.setAgeCategoryName(resultSet.getString("CategoryName"));
              objTeacher.setClassroomAssigned(Integer.parseInt(resultSet.getString("Classroom")));
              
              objTeacherList.add(objTeacher);
	    }
             
	      
	    } catch (Exception e) {
	      throw e;
	    } finally {
	      close();
	    }
      return objTeacherList;
  }
  
  // fetch Students based on category id
  public ArrayList<Student> fetchStudents()throws Exception {
      System.out.println("fetchStudents function called..." );
      ArrayList<Student> objStudentList = new ArrayList<Student>();
       try {
	      Class.forName("com.mysql.jdbc.Driver");
	      connect = DriverManager
	          .getConnection("jdbc:mysql://" + host + "/daycare?"
	              + "user=" + user + "&password=" + passwd );

	      // Statements allow to issue SQL queries to the database
	      statement = connect.createStatement();

	      preparedStatement = connect
	          .prepareStatement("SELECT Id, FirstName, LastName, MotherName,FatherName"
                          + ",AgeCategoryId,AgeCategoryName ,RegistrationDate , TeacherID, Teacher_name, DateOfBirth, ClassroomId  FROM daycare.student_details where AgeCategoryName = '6-12' or AgeCategoryName = '13-24'; ");
              
	      resultSet = preparedStatement.executeQuery();
             
              
              while (resultSet.next()) {
                  
              Student objStudent = new Student();
              objStudent.setStudentId(resultSet.getInt("Id"));
              objStudent.setFirstName(resultSet.getString("FirstName"));
              objStudent.setLastName(resultSet.getString("LastName"));
              objStudent.setMotherName(resultSet.getString("MotherName"));
              objStudent.setFatherName(resultSet.getString("FatherName"));
              objStudent.setRegistrationDate(resultSet.getDate("RegistrationDate"));
              objStudent.setDateOfBirth(resultSet.getDate("DateOfBirth"));
              
              // Age Category 
              Category objCategory  = new Category();
              objCategory.setId(resultSet.getInt("AgeCategoryId"));
              objCategory.setName(resultSet.getString("AgeCategoryName"));
              objStudent.setAgeCategory(objCategory);
              
              // Teacher Details
              Teacher objTeacher = new Teacher();
              objTeacher.setId(resultSet.getInt("TeacherID"));
              objTeacher.setName(resultSet.getString("Teacher_name"));
              objTeacher.setClassroomAssigned(resultSet.getInt("ClassroomId"));
              objStudent.setTeacher(objTeacher);
              
              objStudentList.add(objStudent);
	    }
             
	      
	    } catch (Exception e) {
	      throw e;
	    } finally {
	      close();
	    }
      return objStudentList;
  }
  
  public ArrayList<Student> fetchStudents2()throws Exception {
      System.out.println("fetchStudents function called..." );
      ArrayList<Student> objStudentList = new ArrayList<Student>();
       try {
	      Class.forName("com.mysql.jdbc.Driver");
	      connect = DriverManager
	          .getConnection("jdbc:mysql://" + host + "/daycare?"
	              + "user=" + user + "&password=" + passwd );

	      // Statements allow to issue SQL queries to the database
	      statement = connect.createStatement();

	      preparedStatement = connect
	          .prepareStatement("SELECT Id, FirstName, LastName, MotherName,FatherName"
                          + ",AgeCategoryId,AgeCategoryName ,RegistrationDate , TeacherID, Teacher_name, DateOfBirth, ClassroomId  FROM daycare.student_details where AgeCategoryName = '25-35' or AgeCategoryName = '36-47' or AgeCategoryName = '48-59'; ");
              
	      resultSet = preparedStatement.executeQuery();
             
              
              while (resultSet.next()) {
                  
              Student objStudent = new Student();
              objStudent.setStudentId(resultSet.getInt("Id"));
              objStudent.setFirstName(resultSet.getString("FirstName"));
              objStudent.setLastName(resultSet.getString("LastName"));
              objStudent.setMotherName(resultSet.getString("MotherName"));
              objStudent.setFatherName(resultSet.getString("FatherName"));
              objStudent.setRegistrationDate(resultSet.getDate("RegistrationDate"));
              objStudent.setDateOfBirth(resultSet.getDate("DateOfBirth"));
              
              // Age Category 
              Category objCategory  = new Category();
              objCategory.setId(resultSet.getInt("AgeCategoryId"));
              objCategory.setName(resultSet.getString("AgeCategoryName"));
              objStudent.setAgeCategory(objCategory);
              
              // Teacher Details
              Teacher objTeacher = new Teacher();
              objTeacher.setId(resultSet.getInt("TeacherID"));
              objTeacher.setName(resultSet.getString("Teacher_name"));
              objTeacher.setClassroomAssigned(resultSet.getInt("ClassroomId"));
              objStudent.setTeacher(objTeacher);
              
              objStudentList.add(objStudent);
	    }
             
	      
	    } catch (Exception e) {
	      throw e;
	    } finally {
	      close();
	    }
      return objStudentList;
  }
  
  public void addStudent(Student objStudent) throws Exception{
      
      try {
	      Class.forName("com.mysql.jdbc.Driver");
	      connect = DriverManager
	          .getConnection("jdbc:mysql://" + host + "/daycare?"
	              + "user=" + user + "&password=" + passwd );

	      // Statements allow to issue SQL queries to the database
	      statement = connect.createStatement();

	      // PreparedStatements can use variables and are more efficient
	      preparedStatement = connect
	          .prepareStatement("insert into  daycare.student_details(FirstName,LastName,FatherName, "
                          + "MotherName, AgeCategoryId, RegistrationDate, TeacherID, Teacher_name, DateOfBirth, AgeCategoryName, ClassroomId, RegistrationDue)"
                          + " values (?, ?, ?, ?, ? , ?, ?,?,?,?,?, ?)");
              
	      preparedStatement.setString(1, objStudent.getFirstName());
	      preparedStatement.setString(2, objStudent.getLastName());
              preparedStatement.setString(3, objStudent.getFatherName());
              preparedStatement.setString(4, objStudent.getMotherName());
              preparedStatement.setInt(5, objStudent.getAgeCategory().getId());
              preparedStatement.setDate(6, new java.sql.Date(objStudent.getRegistrationDate().getYear(), objStudent.getRegistrationDate().getMonth(), objStudent.getRegistrationDate().getDate()));
              preparedStatement.setInt(7, objStudent.getTeacher().getId());
              preparedStatement.setString(8, objStudent.getTeacher().getName());
              preparedStatement.setDate(9, new java.sql.Date(objStudent.getDateOfBirth().getYear(), objStudent.getDateOfBirth().getMonth(), objStudent.getDateOfBirth().getDate()));
              preparedStatement.setString(10, objStudent.getAgeCategory().getName());
              preparedStatement.setInt(11, objStudent.getTeacher().getClassroomAssigned());
              int registeredyear = (objStudent.getRegistrationDate().getYear()+1);
              preparedStatement.setDate(12, new java.sql.Date(objStudent.getRegistrationDate().getYear(), objStudent.getRegistrationDate().getMonth(), objStudent.getRegistrationDate().getDate()));
              System.out.println(new java.sql.Date(objStudent.getDateOfBirth().getYear(), objStudent.getDateOfBirth().getMonth(), objStudent.getDateOfBirth().getDate()));
	      preparedStatement.executeUpdate();
              
              // Updating student assigned in teacher counter counter
              int current_counter = objStudent.getTeacher().getStudent_assigned();
              int increment_counter = current_counter + 1;
              System.out.println("Current Student assigned for teacher " + objStudent.getTeacher().getName() + " is :" + objStudent.getTeacher().getStudent_assigned());
	      
              preparedStatement = connect.prepareStatement("Update teacher_details SET student_assigned = " 
                      + increment_counter + " WHERE Id = " + objStudent.getTeacher().getId() +";");
              
              preparedStatement.executeUpdate();
              
	    } catch (Exception e) {
	      throw e;
	    } finally {
	      close();
      }
  }
  // Add student
  public void addVaacine(Student objStudent) throws Exception{
      int id = 1;
      
      try {
	      Class.forName("com.mysql.jdbc.Driver");
	      connect = DriverManager
	          .getConnection("jdbc:mysql://" + host + "/DayCare?"
	              + "user=" + user + "&password=" + passwd );

	      // Statements allow to issue SQL queries to the database
	      statement = connect.createStatement();
              System.out.println("Inside AddVaccine Method");
	      // PreparedStatements can use variables and are more efficient
	      preparedStatement = connect
	          .prepareStatement("Update daycare.student_details SET HIB_Dose1 = ?, DTap_Dose1 = ?,DTap_Dose2 = ?, DTap_Dose3 = ?, DTap_Dose4 = ?, Polio_Dose1 = ?, Polio_Dose2 = ?, Polio_Dose3 = ?, Hepatitis_Dose1 = ?, Hepatitis_Dose2 = ?, Hepatitis_Dose3 = ?, MMR_Dose1= ?, Varicella_Dose1 = ?  WHERE id = "+ objStudent.getStudentId() +";");
                          //+ "+,DTap_Dose1 = ?,DTap_Dose2 = ?, DTap_Dose3 = ?, DTap_Dose4 = ?, Polio_Dose1 = ?, Polio_Dose2 = ?, Polio_Dose3 = ? WHERE id = "+ id +";");
                         // + "MMR_Dose1= ?, Hepatitis_Dose1 = ?, Hepatitis_Dose2 = ?, Hepatitis_Dose3 = ?, Varicella_Dose1 = ? WHERE id = "+ id +";");
	      preparedStatement.setDate(1, new java.sql.Date(objStudent.getHIB_Dose1().getYear(), objStudent.getHIB_Dose1().getMonth(), objStudent.getHIB_Dose1().getDay()));
              System.out.println(new java.sql.Date(objStudent.getHIB_Dose1().getYear(), objStudent.getHIB_Dose1().getMonth(), objStudent.getHIB_Dose1().getDay()));
              System.out.println("Update daycare.student_details SET HIB_Dose1 = ? WHERE FirstName = "+ objStudent.getFirstName() +";");
              //System.out.println(objStudent.getHIB_Dose1().getMonth());
              //System.out.println(objStudent.getHIB_Dose1().getDay());
              
	      preparedStatement.setDate(2, new java.sql.Date(objStudent.getDTap_Dose1().getYear(), objStudent.getDTap_Dose1().getMonth(), objStudent.getDTap_Dose1().getDate()));
              preparedStatement.setDate(3, new java.sql.Date(objStudent.getDTap_Dose2().getYear(), objStudent.getDTap_Dose2().getMonth(), objStudent.getDTap_Dose2().getDate()));
              preparedStatement.setDate(4, new java.sql.Date(objStudent.getDTap_Dose3().getYear(), objStudent.getDTap_Dose3().getMonth(), objStudent.getDTap_Dose3().getDate()));
              preparedStatement.setDate(5, new java.sql.Date(objStudent.getDTap_Dose4().getYear(), objStudent.getDTap_Dose4().getMonth(), objStudent.getDTap_Dose4().getDate()));
              preparedStatement.setDate(6, new java.sql.Date(objStudent.getPolio_Dose1().getYear(), objStudent.getPolio_Dose1().getMonth(), objStudent.getPolio_Dose1().getDate()));
              preparedStatement.setDate(7, new java.sql.Date(objStudent.getPolio_Dose2().getYear(), objStudent.getPolio_Dose2().getMonth(), objStudent.getPolio_Dose2().getDate()));
              preparedStatement.setDate(8, new java.sql.Date(objStudent.getPolio_Dose3().getYear(), objStudent.getPolio_Dose3().getMonth(), objStudent.getPolio_Dose3().getDate()));
              preparedStatement.setDate(9, new java.sql.Date(objStudent.getMMR_Dose1().getYear(), objStudent.getMMR_Dose1().getMonth(), objStudent.getMMR_Dose1().getDate()));
              preparedStatement.setDate(10, new java.sql.Date(objStudent.getHepatitis_Dose1().getYear(), objStudent.getHepatitis_Dose1().getMonth(), objStudent.getHepatitis_Dose1().getDate()));
              preparedStatement.setDate(11, new java.sql.Date(objStudent.getHepatitis_Dose2().getYear(), objStudent.getHepatitis_Dose2().getMonth(), objStudent.getHepatitis_Dose2().getDate()));
              preparedStatement.setDate(12, new java.sql.Date(objStudent.getHepatitis_Dose3().getYear(), objStudent.getHepatitis_Dose3().getMonth(), objStudent.getHepatitis_Dose3().getDate()));
              preparedStatement.setDate(13, new java.sql.Date(objStudent.getVaricella_Dose1().getYear(), objStudent.getVaricella_Dose1().getMonth(), objStudent.getVaricella_Dose1().getDate()));
              preparedStatement.executeUpdate();  
	    } catch (Exception e) {
	      throw e;
	    } finally {
	      close();
	    }
  }
  
  public void addVaacine2(Student objStudent) throws Exception{
      
      try {
	      Class.forName("com.mysql.jdbc.Driver");
	      connect = DriverManager
	          .getConnection("jdbc:mysql://" + host + "/DayCare?"
	              + "user=" + user + "&password=" + passwd );

	      // Statements allow to issue SQL queries to the database
	      statement = connect.createStatement();
              System.out.println("Inside AddVaccine Method");
	      // PreparedStatements can use variables and are more efficient
	      preparedStatement = connect
	          .prepareStatement("Update daycare.student_details SET DTap_Dose1 = ? , DTap_Dose2 = ?, DTap_Dose3 = ?, DTap_Dose4 = ?, DTap_Dose5 = ?, Polio_Dose1 = ?, Polio_Dose2 = ?, Polio_Dose3 = ?, Polio_Dose4 = ?, MMR_Dose1= ?, MMR_Dose2= ?, Hepatitis_Dose1 = ?, Hepatitis_Dose2 = ?,  Hepatitis_Dose3 = ? WHERE id = " + objStudent.getStudentId()+";");
                         // + "DTap_Dose2 = ?, DTap_Dose3 = ?, DTap_Dose4 = ?, DTap_Dose5 = ? " WHERE id = "+ objStudent.getStudentId()+";);
                          //+ ", Polio_Dose1 = ?, Polio_Dose2 = ?, Polio_Dose3 = ?, Polio_Dose4 = ?, MMR_Dose1= ?, MMR_Dose2= ?, Hepatitis_Dose1 = ?, Hepatitis_Dose2 = ?, Hepatitis_Dose3 = ?, Varicella_Dose1 = ?, Varicella_Dose2 = ?  WHERE id = "+ objStudent.getStudentId() +";");
                          //+ "+,DTap_Dose1 = ?,DTap_Dose2 = ?, DTap_Dose3 = ?, DTap_Dose4 = ?, Polio_Dose1 = ?, Polio_Dose2 = ?, Polio_Dose3 = ? WHERE id = "+ id +";");
                         // + "MMR_Dose1= ?, Hepatitis_Dose1 = ?, Hepatitis_Dose2 = ?, Hepatitis_Dose3 = ?, Varicella_Dose1 = ? WHERE id = "+ id +";")
              //System.out.println(new java.sql.Date(objStudent.getHIB_Dose1().getYear(), objStudent.getHIB_Dose1().getMonth(), objStudent.getHIB_Dose1().getDay()));
              //System.out.println("Update daycare.student_details SET HIB_Dose1 = ? WHERE FirstName = "+ objStudent.getFirstName() +";");
              //System.out.println(objStudent.getHIB_Dose1().getMonth());
              //System.out.println(objStudent.getHIB_Dose1().getDay());
             // System.out.println("Student ID is --------- "+objStudent.getStudentId());
              System.out.println("Before Statement");
              System.out.println("You reached till Here");
	      preparedStatement.setDate(1, new java.sql.Date(objStudent.getDTap_Dose1().getYear(), objStudent.getDTap_Dose1().getMonth(), objStudent.getDTap_Dose1().getDate()));
              preparedStatement.setDate(2, new java.sql.Date(objStudent.getDTap_Dose2().getYear(), objStudent.getDTap_Dose2().getMonth(), objStudent.getDTap_Dose2().getDate()));
              preparedStatement.setDate(3, new java.sql.Date(objStudent.getDTap_Dose3().getYear(), objStudent.getDTap_Dose3().getMonth(), objStudent.getDTap_Dose3().getDate()));
              preparedStatement.setDate(4, new java.sql.Date(objStudent.getDTap_Dose4().getYear(), objStudent.getDTap_Dose4().getMonth(), objStudent.getDTap_Dose4().getDate()));
              preparedStatement.setDate(5, new java.sql.Date(objStudent.getDTap_Dose5().getYear(), objStudent.getDTap_Dose5().getMonth(), objStudent.getDTap_Dose5().getDate()));
              System.out.println("You reached till Here ---------2");
              preparedStatement.setDate(6, new java.sql.Date(objStudent.getPolio_Dose1().getYear(), objStudent.getPolio_Dose1().getMonth(), objStudent.getPolio_Dose1().getDate()));
              preparedStatement.setDate(7, new java.sql.Date(objStudent.getPolio_Dose2().getYear(), objStudent.getPolio_Dose2().getMonth(), objStudent.getPolio_Dose2().getDate()));
              preparedStatement.setDate(8, new java.sql.Date(objStudent.getPolio_Dose3().getYear(), objStudent.getPolio_Dose3().getMonth(), objStudent.getPolio_Dose3().getDate()));
              preparedStatement.setDate(9, new java.sql.Date(objStudent.getPolio_Dose4().getYear(), objStudent.getPolio_Dose4().getMonth(), objStudent.getPolio_Dose4().getDate()));
              preparedStatement.setDate(10, new java.sql.Date(objStudent.getMMR_Dose1().getYear(), objStudent.getMMR_Dose1().getMonth(), objStudent.getMMR_Dose1().getDate()));
              preparedStatement.setDate(11, new java.sql.Date(objStudent.getMMR_Dose2().getYear(), objStudent.getMMR_Dose2().getMonth(), objStudent.getMMR_Dose2().getDate()));
              preparedStatement.setDate(12, new java.sql.Date(objStudent.getHepatitis_Dose1().getYear(), objStudent.getHepatitis_Dose1().getMonth(), objStudent.getHepatitis_Dose1().getDate()));
              preparedStatement.setDate(13, new java.sql.Date(objStudent.getHepatitis_Dose2().getYear(), objStudent.getHepatitis_Dose2().getMonth(), objStudent.getHepatitis_Dose2().getDate()));
              preparedStatement.setDate(14, new java.sql.Date(objStudent.getHepatitis_Dose3().getYear(), objStudent.getHepatitis_Dose3().getMonth(), objStudent.getHepatitis_Dose3().getDate()));
              /*preparedStatement.setDate(15, new java.sql.Date(objStudent.getVaricella_Dose1().getYear(), objStudent.getVaricella_Dose1().getMonth(), objStudent.getVaricella_Dose1().getDate()));
                preparedStatement.setDate(16, new java.sql.Date(objStudent.getVaricella_Dose2().getYear(), objStudent.getVaricella_Dose2().getMonth(), objStudent.getVaricella_Dose2().getDate()));
              */preparedStatement.executeUpdate();  
	    } catch (Exception e) {
	      throw e;
	    } finally {
	      close();
	    }
  }
  
  
  
  
  public void addStudentData(Student objStudent)throws Exception {
      try {
	      Class.forName("com.mysql.jdbc.Driver");
	      connect = DriverManager
	          .getConnection("jdbc:mysql://" + host + "/daycare?"
	              + "user=" + user + "&password=" + passwd );

	      // Statements allow to issue SQL queries to the database
	      statement = connect.createStatement();

	      // PreparedStatements can use variables and are more efficient
	      preparedStatement = connect
	          .prepareStatement("insert into  daycare.student_details values (default, ?, ?, ?, ? , ?, ?)");
              
	      preparedStatement.setString(1, objStudent.getFirstName());
	      preparedStatement.setString(2, objStudent.getLastName());
	      preparedStatement.setString(3, "TestWebpage");
	      preparedStatement.setDate(4, new java.sql.Date(2009, 12, 11));
	      preparedStatement.setString(5, "TestSummary");
	      preparedStatement.setString(6, "TestComment");
	      preparedStatement.executeUpdate();

	      preparedStatement = connect
	          .prepareStatement("SELECT myuser, webpage, datum, summary, COMMENTS from feedback.comments");
	      resultSet = preparedStatement.executeQuery();
	      writeResultSet(resultSet);
	      
	    } catch (Exception e) {
	      throw e;
	    } finally {
	      close();
	    }
  }
  
  
  public void readDataBase(Student objStudent) throws Exception {
	    try {
	      Class.forName("com.mysql.jdbc.Driver");
	      connect = DriverManager
	          .getConnection("jdbc:mysql://" + host + "/feedback?"
	              + "user=" + user + "&password=" + passwd );

	      // Statements allow to issue SQL queries to the database
	      statement = connect.createStatement();

	      // PreparedStatements can use variables and are more efficient
	      preparedStatement = connect
	          .prepareStatement("insert into  feedback.comments values (default, ?, ?, ?, ? , ?, ?)");
	      // "myuser, webpage, datum, summary, COMMENTS from feedback.comments");
	      // Parameters start with 1
	      preparedStatement.setString(1, objStudent.getFirstName());
	      preparedStatement.setString(2, objStudent.getLastName());
	      preparedStatement.setString(3, "TestWebpage");
	      preparedStatement.setDate(4, new java.sql.Date(2009, 12, 11));
	      preparedStatement.setString(5, "TestSummary");
	      preparedStatement.setString(6, "TestComment");
	      preparedStatement.executeUpdate();

	      preparedStatement = connect
	          .prepareStatement("SELECT myuser, webpage, datum, summary, COMMENTS from feedback.comments");
	      resultSet = preparedStatement.executeQuery();
	      writeResultSet(resultSet);
	      
	    } catch (Exception e) {
	      throw e;
	    } finally {
	      close();
	    }

	  }

	  private void writeMetaData(ResultSet resultSet) throws SQLException {
	    //   Now get some metadata from the database
	    // Result set get the result of the SQL query
	    
	    System.out.println("The columns in the table are: ");
	    
	    System.out.println("Table: " + resultSet.getMetaData().getTableName(1));
	    for  (int i = 1; i<= resultSet.getMetaData().getColumnCount(); i++){
	      System.out.println("Column " +i  + " "+ resultSet.getMetaData().getColumnName(i));
	    }
	  }

	  private void writeResultSet(ResultSet resultSet) throws SQLException {
	    // ResultSet is initially before the first data set
	    while (resultSet.next()) {
	      // It is possible to get the columns via name
	      // also possible to get the columns via the column number
	      // which starts at 1
	      // e.g. resultSet.getSTring(2);
	      String user = resultSet.getString("myuser");
	      String website = resultSet.getString("webpage");
	      String summary = resultSet.getString("summary");
	      Date date = resultSet.getDate("datum");
	      String comment = resultSet.getString("comments");
	      System.out.println("User: " + user);
	      System.out.println("Website: " + website);
	      System.out.println("Summary: " + summary);
	      System.out.println("Date: " + date);
	      System.out.println("Comment: " + comment);
	    }
	  }

	  // You need to close the resultSet
	  private void close() {
	    try {
	      if (resultSet != null) {
	        resultSet.close();
	      }

	      if (statement != null) {
	        statement.close();
	      }

	      if (connect != null) {
	        connect.close();
	      }
	    } catch (Exception e) {

	    }
	  }
}
