/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Demo;

import DAO.DBAccess;
import Entities.Category;
import Entities.Student;
import Entities.Teacher;
import java.awt.CardLayout;
import java.awt.Component;
import java.awt.event.ItemEvent;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JPanel;

/**
 *
 * @author priyammodi
 */
public class AddVaccineDetails2JPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private String dateFormat = "MM-dd-yyyy";
    /**
     * Creates new form AddVaccineDetails2JPanel
     */
    public AddVaccineDetails2JPanel(JPanel userProcessContainer) {
        this.userProcessContainer = userProcessContainer;
        initComponents();
        BindStudents();
    }

    public void BindStudents(){
        try{
           DBAccess db = new DBAccess();
           drpdwnstd.removeAllItems();
           
            for(Student student : db.fetchStudents2()){
                drpdwnstd.addItem(student);
            }
       }
       catch(Exception e){
           System.out.println(e);
       }
    }
    /*
    private void subVaccineActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
        try{
        Student objStudent = new Student();
        Student objname = (Student)drpdwnstd.getSelectedItem();
        Date dateofDTap_Dose1 = new SimpleDateFormat(dateFormat).parse(DTap_Dose1.getText());
        Date dateofDTap_Dose2 = new SimpleDateFormat(dateFormat).parse(DTap_Dose2.getText());
        Date dateofDTap_Dose3 = new SimpleDateFormat(dateFormat).parse(DTap_Dose3.getText());
        Date dateofDTap_Dose4 = new SimpleDateFormat(dateFormat).parse(DTap_Dose4.getText());
        Date dateofPolio_Dose1 = new SimpleDateFormat(dateFormat).parse(Polio_Dose1.getText());
        Date dateofPolio_Dose2 = new SimpleDateFormat(dateFormat).parse(Polio_Dose2.getText());
        Date dateofPolio_Dose3 = new SimpleDateFormat(dateFormat).parse(Polio_Dose3.getText());
        Date dateofMMR_Dose1 = new SimpleDateFormat(dateFormat).parse(MMR_Dose1.getText());
        Date dateofHepatitis_Dose1 = new SimpleDateFormat(dateFormat).parse(HepatitisB_Dose1.getText());
        Date dateofHepatitis_Dose2 = new SimpleDateFormat(dateFormat).parse(HepatitisB_Dose2.getText());
        Date dateofHepatitis_Dose3 = new SimpleDateFormat(dateFormat).parse(HepatitisB_Dose3.getText());
        Date dateofVariclla_Dose1 = new SimpleDateFormat(dateFormat).parse(Varicella_Dose1.getText());
        Date dateofVariclla_Dose2 = new SimpleDateFormat(dateFormat).parse(Varicella_Dose2.getText());
        objStudent.setStudentId(objname.getStudentId());
        objStudent.setDTap_Dose1(dateofDTap_Dose1);
        objStudent.setDTap_Dose2(dateofDTap_Dose2);
        objStudent.setDTap_Dose3(dateofDTap_Dose3);
        objStudent.setDTap_Dose4(dateofDTap_Dose4);
        objStudent.setPolio_Dose1(dateofPolio_Dose1);
        objStudent.setPolio_Dose2(dateofPolio_Dose2);
        objStudent.setPolio_Dose3(dateofPolio_Dose3);
        objStudent.setMMR_Dose1(dateofMMR_Dose1);
        objStudent.setHepatitis_Dose1(dateofHepatitis_Dose1);
        objStudent.setHepatitis_Dose2(dateofHepatitis_Dose2);
        objStudent.setHepatitis_Dose3(dateofHepatitis_Dose3);
        objStudent.setVaricella_Dose1(dateofVariclla_Dose1);
        System.out.println("Printing Student ---");
        System.out.println("" + objStudent.getHIB_Dose1());
        //Adding student data to Database
        DBAccess db = new DBAccess();
        db.addVaacine(objStudent);
        
        // Navigate to student option screen with confirmation msg
        CardLayout layout=(CardLayout)userProcessContainer.getLayout();
        StudnetJPanel student = new StudnetJPanel(userProcessContainer, "Student Vaccine Details added successfully !!");
        userProcessContainer.add("Student", student);
        layout.next(userProcessContainer);
        
       }
       catch(Exception e){
           System.out.println(e);
       }                           
    }  
    */

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        drpdwnstd = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        DTap_Dose1 = new javax.swing.JTextField();
        DTap_Dose2 = new javax.swing.JTextField();
        DTap_Dose3 = new javax.swing.JTextField();
        DTap_Dose4 = new javax.swing.JTextField();
        DTap_Dose5 = new javax.swing.JTextField();
        Polio_Dose1 = new javax.swing.JTextField();
        Polio_Dose2 = new javax.swing.JTextField();
        Polio_Dose3 = new javax.swing.JTextField();
        Polio_Dose4 = new javax.swing.JTextField();
        Hepatitis_Dose1 = new javax.swing.JTextField();
        HepatitisB_Dose2 = new javax.swing.JTextField();
        HepatitisB_Dose3 = new javax.swing.JTextField();
        MMR_Dose1 = new javax.swing.JTextField();
        MMR_Dose2 = new javax.swing.JTextField();
        Varicella_Dose1 = new javax.swing.JTextField();
        Varicella_Dose2 = new javax.swing.JTextField();
        btnSubmitVaccine = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));

        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jButton1)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel1.setText("Select Student");

        drpdwnstd.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        drpdwnstd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                drpdwnstdActionPerformed(evt);
            }
        });

        jLabel2.setText("DTap");

        jLabel3.setText("Dose - 1");

        jLabel4.setText("Dose - 2");

        jLabel5.setText("Dose -3 ");

        jLabel6.setText("Dose - 4");

        jLabel7.setText("Dose - 5");

        jLabel8.setText("Polio");

        jLabel9.setText("Dose - 1 ");

        jLabel10.setText("Dose - 2");

        jLabel11.setText("Dose - 3");

        jLabel12.setText("Dose - 4");

        jLabel13.setText("Hepatitis B");

        jLabel14.setText("Dose - 1");

        jLabel15.setText("Dose - 2");

        jLabel16.setText("Dose - 3");

        jLabel17.setText("MMR");

        jLabel18.setText("Dose - 1");

        jLabel19.setText("Dose - 2");

        jLabel20.setText("Varicella");

        jLabel21.setText("Dose - 1");

        jLabel22.setText("Dose - 2");

        DTap_Dose1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DTap_Dose1ActionPerformed(evt);
            }
        });

        btnSubmitVaccine.setText("Submit");
        btnSubmitVaccine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitVaccineActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                                .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(drpdwnstd, 0, 250, Short.MAX_VALUE)
                                .addComponent(DTap_Dose1)
                                .addComponent(DTap_Dose2)
                                .addComponent(DTap_Dose3)
                                .addComponent(DTap_Dose4)
                                .addComponent(DTap_Dose5)
                                .addComponent(Polio_Dose1)
                                .addComponent(Polio_Dose2)
                                .addComponent(Polio_Dose3)
                                .addComponent(Polio_Dose4)
                                .addComponent(Hepatitis_Dose1)
                                .addComponent(HepatitisB_Dose2)
                                .addComponent(HepatitisB_Dose3)
                                .addComponent(MMR_Dose1)
                                .addComponent(MMR_Dose2)
                                .addComponent(Varicella_Dose1))
                            .addComponent(Varicella_Dose2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 435, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(177, 177, 177)
                .addComponent(btnSubmitVaccine, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(drpdwnstd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(DTap_Dose1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(2, 2, 2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(DTap_Dose2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(DTap_Dose3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(DTap_Dose4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(DTap_Dose5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(Polio_Dose1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(Polio_Dose2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(Hepatitis_Dose1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(HepatitisB_Dose2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16)
                            .addComponent(HepatitisB_Dose3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel18)
                            .addComponent(MMR_Dose1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Polio_Dose3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Polio_Dose4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel19)
                    .addComponent(MMR_Dose2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(Varicella_Dose1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(Varicella_Dose2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSubmitVaccine)
                .addContainerGap(153, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void DTap_Dose1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DTap_Dose1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DTap_Dose1ActionPerformed

    private void drpdwnstdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_drpdwnstdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_drpdwnstdActionPerformed

    private void btnSubmitVaccineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitVaccineActionPerformed
        // TODO add your handling code here:
        try{
        Student objStudent = new Student();
        Student objname = (Student)drpdwnstd.getSelectedItem();
        Date dateofDTap_Dose1 = new SimpleDateFormat(dateFormat).parse(DTap_Dose1.getText());
        Date dateofDTap_Dose2 = new SimpleDateFormat(dateFormat).parse(DTap_Dose2.getText());
        Date dateofDTap_Dose3 = new SimpleDateFormat(dateFormat).parse(DTap_Dose3.getText());
        Date dateofDTap_Dose4 = new SimpleDateFormat(dateFormat).parse(DTap_Dose4.getText());
        Date dateofDTap_Dose5 = new SimpleDateFormat(dateFormat).parse(DTap_Dose5.getText());
        Date dateofPolio_Dose1 = new SimpleDateFormat(dateFormat).parse(Polio_Dose1.getText());
        Date dateofPolio_Dose2 = new SimpleDateFormat(dateFormat).parse(Polio_Dose2.getText());
        Date dateofPolio_Dose3 = new SimpleDateFormat(dateFormat).parse(Polio_Dose3.getText());
        Date dateofPolio_Dose4 = new SimpleDateFormat(dateFormat).parse(Polio_Dose4.getText());
        Date dateofMMR_Dose1 = new SimpleDateFormat(dateFormat).parse(MMR_Dose1.getText());
        Date dateofMMR_Dose2 = new SimpleDateFormat(dateFormat).parse(MMR_Dose2.getText());
        Date dateofHepatitis_Dose1 = new SimpleDateFormat(dateFormat).parse(Hepatitis_Dose1.getText());
        Date dateofHepatitis_Dose2 = new SimpleDateFormat(dateFormat).parse(HepatitisB_Dose2.getText());
        Date dateofHepatitis_Dose3 = new SimpleDateFormat(dateFormat).parse(HepatitisB_Dose3.getText());
        Date dateofVariclla_Dose1 = new SimpleDateFormat(dateFormat).parse(Varicella_Dose1.getText());
        Date dateofVariclla_Dose2 = new SimpleDateFormat(dateFormat).parse(Varicella_Dose2.getText());
        objStudent.setStudentId(objname.getStudentId());
        objStudent.setDTap_Dose1(dateofDTap_Dose1);
        objStudent.setDTap_Dose2(dateofDTap_Dose2);
        objStudent.setDTap_Dose3(dateofDTap_Dose3);
        objStudent.setDTap_Dose4(dateofDTap_Dose4);
        objStudent.setDTap_Dose5(dateofDTap_Dose5);
        objStudent.setPolio_Dose1(dateofPolio_Dose1);
        objStudent.setPolio_Dose2(dateofPolio_Dose2);
        objStudent.setPolio_Dose3(dateofPolio_Dose3);
        objStudent.setPolio_Dose4(dateofPolio_Dose4);
        objStudent.setMMR_Dose1(dateofMMR_Dose1);
        objStudent.setMMR_Dose2(dateofMMR_Dose2);
        objStudent.setHepatitis_Dose1(dateofHepatitis_Dose1);
        objStudent.setHepatitis_Dose2(dateofHepatitis_Dose2);
        objStudent.setHepatitis_Dose3(dateofHepatitis_Dose3);
        objStudent.setVaricella_Dose1(dateofVariclla_Dose1);
        objStudent.setVaricella_Dose2(dateofVariclla_Dose2);
        System.out.println("Printing Student ---");
        System.out.println("" + objStudent.getHIB_Dose1());
        //Adding student data to Database
        DBAccess db = new DBAccess();
        db.addVaacine2(objStudent);
        
        // Navigate to student option screen with confirmation msg
        CardLayout layout=(CardLayout)userProcessContainer.getLayout();
        StudnetJPanel student = new StudnetJPanel(userProcessContainer, "Student Vaccine Details added successfully !!");
        userProcessContainer.add("Student", student);
        layout.next(userProcessContainer);
        
       }
       catch(Exception e){
           System.out.println(e);
       }                          
    }//GEN-LAST:event_btnSubmitVaccineActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
                    // TODO add your handling code here:
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);

    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField DTap_Dose1;
    private javax.swing.JTextField DTap_Dose2;
    private javax.swing.JTextField DTap_Dose3;
    private javax.swing.JTextField DTap_Dose4;
    private javax.swing.JTextField DTap_Dose5;
    private javax.swing.JTextField HepatitisB_Dose2;
    private javax.swing.JTextField HepatitisB_Dose3;
    private javax.swing.JTextField Hepatitis_Dose1;
    private javax.swing.JTextField MMR_Dose1;
    private javax.swing.JTextField MMR_Dose2;
    private javax.swing.JTextField Polio_Dose1;
    private javax.swing.JTextField Polio_Dose2;
    private javax.swing.JTextField Polio_Dose3;
    private javax.swing.JTextField Polio_Dose4;
    private javax.swing.JTextField Varicella_Dose1;
    private javax.swing.JTextField Varicella_Dose2;
    private javax.swing.JButton btnSubmitVaccine;
    private javax.swing.JComboBox drpdwnstd;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
