/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.hostelmanagement.SignUp;

import com.mycompany.hostelmanagement.AfterLoginScreen.AfterLoginScreen;
import com.mycompany.hostelmanagement.DBConnection.DBConnection;
import java.awt.Color;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jahnavi
 */
public class SignUpPage extends javax.swing.JFrame {

    /**
     * Creates new form SignUpPage
     */
   public Connection connection =null; 
    private static final Logger logger = Logger.getLogger(SignUpPage.class.getName());
    public static SignUpPage signUpPage;
    
    public static SignUpPage getSignUpPage(){
        return signUpPage;
    }
    
    
    public SignUpPage() {
        initComponents();
        connection = DBConnection.getConnection();
        signupName.setForeground(Color.GRAY);
        signupName.setText("Name");
        signupName.addFocusListener(new FocusListener() {
           
            @Override
            public void focusLost(FocusEvent e) {
                if (signupName.getText().isEmpty()) {
                    signupName.setText("Name");
                }
            }

            @Override
                public void focusGained(FocusEvent e) {
                     if (signupName.getText().equals("Name")) {
                    signupName.setText("");
                }
            }
        });
        signupMobile.setForeground(Color.GRAY);
        signupMobile.setText("Mobile");
        signupMobile.addFocusListener(new FocusListener() {
           
            @Override
            public void focusLost(FocusEvent e) {
                if (signupMobile.getText().isEmpty()) {
                    signupMobile.setText("Mobile");
                }
            }

            @Override
                public void focusGained(FocusEvent e) {
                     if (signupMobile.getText().equals("Mobile")) {
                    signupMobile.setText("");
                }
            }
        }); 
        signupEmail.setForeground(Color.GRAY);
        signupEmail.setText("Email");
        signupEmail.addFocusListener(new FocusListener() {
           
            @Override
            public void focusLost(FocusEvent e) {
                if (signupEmail.getText().isEmpty()) {
                    signupEmail.setText("Email");
                }
            }

            @Override
                public void focusGained(FocusEvent e) {
                     if (signupEmail.getText().equals("Email")) {
                    signupEmail.setText("");
                }
            }
        }); 
        signupFathername.setForeground(Color.GRAY);
        signupFathername.setText("Fathername");
        signupFathername.addFocusListener(new FocusListener() {
           
            @Override
            public void focusLost(FocusEvent e) {
                if (signupFathername.getText().isEmpty()) {
                    signupFathername.setText("Fathername");
                }
            }

            @Override
                public void focusGained(FocusEvent e) {
                     if (signupFathername.getText().equals("Fathername")) {
                    signupFathername.setText("");
                }
            }
        }); 
        signupMothername.setForeground(Color.GRAY);
        signupMothername.setText("Mothername");
        signupMothername.addFocusListener(new FocusListener() {
           
            @Override
            public void focusLost(FocusEvent e) {
                if (signupMothername.getText().isEmpty()) {
                    signupMothername.setText("Mothername");
                }
            }

            @Override
                public void focusGained(FocusEvent e) {
                     if (signupMothername.getText().equals("Mothername")) {
                    signupMothername.setText("");
                }
            }
        });
        signupDoB.setForeground(Color.GRAY);
        signupDoB.setText("DoB");
        signupDoB.addFocusListener(new FocusListener() {
           
            @Override
            public void focusLost(FocusEvent e) {
                if (signupDoB.getText().isEmpty()) {
                    signupDoB.setText("DoB");
                }
            }

            @Override
                public void focusGained(FocusEvent e) {
                     if (signupDoB.getText().equals("DoB")) {
                    signupDoB.setText("");
                }
            }
        });
        signupAddress.setForeground(Color.GRAY);
        signupAddress.setText("Address");
        signupAddress.addFocusListener(new FocusListener() {
           
            @Override
            public void focusLost(FocusEvent e) {
                if (signupAddress.getText().isEmpty()) {
                    signupAddress.setText("Address");
                }
            }

            @Override
                public void focusGained(FocusEvent e) {
                     if (signupAddress.getText().equals("Address")) {
                    signupAddress.setText("");
                }
            }
        });  
        signupBranch.setForeground(Color.GRAY);
        signupBranch.setText("Branch");
        signupBranch.addFocusListener(new FocusListener() {
           
            @Override
            public void focusLost(FocusEvent e) {
                if (signupBranch.getText().isEmpty()) {
                    signupBranch.setText("Branch");
                }
            }

            @Override
                public void focusGained(FocusEvent e) {
                     if (signupBranch.getText().equals("Branch")) {
                    signupBranch.setText("");
                }
            }
        });  
        signupYear.setForeground(Color.GRAY);
        signupYear.setText("Year");
        signupYear.addFocusListener(new FocusListener() {
           
            @Override
            public void focusLost(FocusEvent e) {
                if (signupYear.getText().isEmpty()) {
                    signupYear.setText("Year");
                }
            }

            @Override
                public void focusGained(FocusEvent e) {
                     if (signupYear.getText().equals("Year")) {
                    signupYear.setText("");
                }
            }
        });
        signupPassword.setForeground(Color.GRAY);
        signupPassword.setText("Password");
        signupPassword.addFocusListener(new FocusListener() {
           
            @Override
            public void focusLost(FocusEvent e) {
                if (signupPassword.getText().isEmpty()) {
                    signupPassword.setText("Password");
                }
            }

            @Override
                public void focusGained(FocusEvent e) {
                     if (signupPassword.getText().equals("Password")) {
                    signupPassword.setText("");
                }
            }
        });
        loginId.setForeground(Color.GRAY);
        loginId.setText("email/loginid");
        loginId.addFocusListener(new FocusListener() {
           
            @Override
            public void focusLost(FocusEvent e) {
                if (loginId.getText().isEmpty()) {
                    loginId.setText("email/loginid");
                }
            }

            @Override
                public void focusGained(FocusEvent e) {
                     if (loginId.getText().equals("email/loginid")) {
                    loginId.setText("");
                }
            }
        });
        loginPassword.setForeground(Color.GRAY);
        loginPassword.setText("someplaceholder");
        loginPassword.addFocusListener(new FocusListener() {
           
            @Override
            public void focusLost(FocusEvent e) {
                if (loginPassword.getText().isEmpty()) {
                    loginPassword.setText("someplaceholder");
                }
            }

            @Override
                public void focusGained(FocusEvent e) {
                     if (loginPassword.getText().equals("someplaceholder")) {
                    loginPassword.setText("");
                }
            }
        });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDatePickerUtil1 = new org.jdatepicker.util.JDatePickerUtil();
        sqlDateModel1 = new org.jdatepicker.impl.SqlDateModel();
        utilDateModel1 = new org.jdatepicker.impl.UtilDateModel();
        dateChooserDialog1 = new datechooser.beans.DateChooserDialog();
        login = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        signupName = new javax.swing.JTextField();
        signupMobile = new javax.swing.JTextField();
        signUp = new javax.swing.JButton();
        signupEmail = new javax.swing.JTextField();
        signupFathername = new javax.swing.JTextField();
        signupMothername = new javax.swing.JTextField();
        signupAddress = new javax.swing.JTextField();
        signupBranch = new javax.swing.JTextField();
        signupYear = new javax.swing.JTextField();
        signupGender = new javax.swing.JComboBox<>();
        genderFieldFixed = new javax.swing.JTextField();
        signupPassword = new javax.swing.JPasswordField();
        loginPassword = new javax.swing.JPasswordField();
        signupDoB = new datechooser.beans.DateChooserCombo();
        loginId = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(700, 700));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        login.setBackground(new java.awt.Color(10, 17, 235));
        login.setFont(new java.awt.Font("Noto Sans Mono CJK KR Regular", 1, 12)); // NOI18N
        login.setForeground(new java.awt.Color(6, 2, 32));
        login.setText("Log In");
        login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginActionPerformed(evt);
            }
        });
        getContentPane().add(login, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 10, 140, 30));

        jButton2.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        jButton2.setText("Create New Account");
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 50, 500, 50));

        signupName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signupNameActionPerformed(evt);
            }
        });
        getContentPane().add(signupName, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 109, 240, 40));

        signupMobile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signupMobileActionPerformed(evt);
            }
        });
        getContentPane().add(signupMobile, new org.netbeans.lib.awtextra.AbsoluteConstraints(372, 110, 230, 40));

        signUp.setBackground(new java.awt.Color(16, 240, 70));
        signUp.setFont(new java.awt.Font("Ubuntu", 1, 36)); // NOI18N
        signUp.setForeground(new java.awt.Color(11, 28, 16));
        signUp.setText("Sign Up");
        signUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signUpActionPerformed(evt);
            }
        });
        getContentPane().add(signUp, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 480, 188, 52));

        signupEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signupEmailActionPerformed(evt);
            }
        });
        getContentPane().add(signupEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 161, 240, 39));

        signupFathername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signupFathernameActionPerformed(evt);
            }
        });
        getContentPane().add(signupFathername, new org.netbeans.lib.awtextra.AbsoluteConstraints(372, 160, 230, 39));

        signupMothername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signupMothernameActionPerformed(evt);
            }
        });
        getContentPane().add(signupMothername, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 218, 240, 42));

        signupAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signupAddressActionPerformed(evt);
            }
        });
        getContentPane().add(signupAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 278, 240, 42));

        signupBranch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signupBranchActionPerformed(evt);
            }
        });
        getContentPane().add(signupBranch, new org.netbeans.lib.awtextra.AbsoluteConstraints(372, 280, 230, 40));

        signupYear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signupYearActionPerformed(evt);
            }
        });
        getContentPane().add(signupYear, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 338, 240, 42));

        signupGender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female" }));
        getContentPane().add(signupGender, new org.netbeans.lib.awtextra.AbsoluteConstraints(376, 400, 230, -1));

        genderFieldFixed.setEditable(false);
        genderFieldFixed.setText("Gender");
        genderFieldFixed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                genderFieldFixedActionPerformed(evt);
            }
        });
        getContentPane().add(genderFieldFixed, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 400, 240, -1));
        getContentPane().add(signupPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(376, 340, 230, 42));

        loginPassword.setText("jPasswordField1");
        getContentPane().add(loginPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 10, 160, -1));
        getContentPane().add(signupDoB, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 220, 230, 40));

        loginId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginIdActionPerformed(evt);
            }
        });
        getContentPane().add(loginId, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, 180, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginActionPerformed
        // TODO add your handling code here:
        String loginId = this.loginId.getText();
        String password = this.loginPassword.getText();
        
        try{
            PreparedStatement readFromStudentsTable=connection.prepareStatement("select id from students where (email=? or mobile=?)");
            readFromStudentsTable.setString(1,loginId);
            readFromStudentsTable.setString(2,loginId);
            ResultSet profileIdResultSet = readFromStudentsTable.executeQuery();
            
             if(profileIdResultSet==null){
                login.setForeground(Color.red);
                login.setText("Login Failed");
                throw new Exception("Invalid Login email or mobile");
            }
             
            profileIdResultSet.next();
            String profileId = profileIdResultSet.getString(1);
            logger.log(Level.INFO,"Profile Id read Successfuly from students table {}",profileId);
           

            PreparedStatement readFromPasswordTable = connection.prepareStatement("select password from password where profileId=?");
            readFromPasswordTable.setString(1,profileId);
            ResultSet passwordResultset = readFromPasswordTable.executeQuery();
            
            if(passwordResultset == null ){
                login.setForeground(Color.red);
                login.setText("Login Failed");
                throw new Exception("Invalid Login password");
            }
            
            logger.log(Level.INFO,"Password Data read Successfuly from password table");
            passwordResultset.next();
            String storedPassword = passwordResultset.getString(1);
            
            if(storedPassword == null || !storedPassword.equals(password)){
                login.setForeground(Color.red);
                login.setText("Login Failed");
                throw new Exception("Invalid Login password");
            }
           
            
            signUpPage.setVisible(false);
            AfterLoginScreen.getAfterLoginScreen(profileId).setVisible(true);
            
            
            /** 
             * Add a new screen upon successful login
             */
            }catch(Exception e){
                login.setForeground(Color.red);
                login.setBackground(Color.GRAY);
                login.setText("Login Failed");
                e.printStackTrace();
            
        }
        
        
    }//GEN-LAST:event_loginActionPerformed

    private void signupNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signupNameActionPerformed
     
    }//GEN-LAST:event_signupNameActionPerformed

    private void signupMobileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signupMobileActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_signupMobileActionPerformed

    private void signUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signUpActionPerformed
            String name = signupName.getText();
            String mobile = signupMobile.getText();
            String email = signupEmail.getText();
            String fatherName = signupFathername.getText();
            String motherName = signupMothername.getText();
            String dob = signupDoB.getText();
            String address = signupAddress.getText();
            String branch = signupBranch.getText();
            String year = signupYear.getText();
            String gender = signupGender.getSelectedItem().toString();
            String password = signupPassword.getText();
            try{
            PreparedStatement insertIntoStudentsTable=connection.prepareStatement("insert into students(name,email,fatherName,motherName,dob,address,mobile,branch,year,gender)"
                    + " values(?,?,?,?,?,?,?,?,?,?)");
            insertIntoStudentsTable.setString(1,name);
            insertIntoStudentsTable.setString(2,email);
            insertIntoStudentsTable.setString(3,fatherName);
            insertIntoStudentsTable.setString(4,motherName);
            insertIntoStudentsTable.setString(5,dob);
            insertIntoStudentsTable.setString(6,address);
            insertIntoStudentsTable.setString(7,mobile);
            insertIntoStudentsTable.setString(8,branch);
            insertIntoStudentsTable.setString(9,year);
            insertIntoStudentsTable.setString(10,gender);
            insertIntoStudentsTable.executeUpdate();
            logger.log(Level.INFO,"Data Inserted Successfuly into students table");

            PreparedStatement readFromStudentsTable = connection.prepareStatement("select id from students where mobile=?");
            readFromStudentsTable.setString(1,mobile);
            ResultSet resultset = readFromStudentsTable.executeQuery();
            logger.log(Level.INFO,"Data read Successfuly from students table");
            resultset.next();
            String profileId = resultset.getString(1);
            
            PreparedStatement insertIntoPasswordTable=connection.prepareStatement("insert into password(profileId,password)"
                    + " values(?,?)");
            insertIntoPasswordTable.setString(1, profileId);
            insertIntoPasswordTable.setString(2, password);
            insertIntoPasswordTable.executeUpdate();
            logger.log(Level.INFO,"Data inserted Successfuly from password table");
            
            
            signUp.setText("Success...");
            }catch(Exception e){
                signUp.setForeground(Color.red);
                signUp.setText("Failed..");
                e.printStackTrace();
            }
    }//GEN-LAST:event_signUpActionPerformed

    private void signupEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signupEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_signupEmailActionPerformed

    private void signupFathernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signupFathernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_signupFathernameActionPerformed

    private void signupMothernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signupMothernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_signupMothernameActionPerformed

    private void signupAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signupAddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_signupAddressActionPerformed

    private void signupBranchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signupBranchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_signupBranchActionPerformed

    private void signupYearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signupYearActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_signupYearActionPerformed

    private void genderFieldFixedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_genderFieldFixedActionPerformed
        // TODO add your handling code here:
        genderFieldFixed.setEditable(false);
    }//GEN-LAST:event_genderFieldFixedActionPerformed

    private void loginIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_loginIdActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SignUpPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SignUpPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SignUpPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SignUpPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                signUpPage=new SignUpPage();
                signUpPage.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private datechooser.beans.DateChooserDialog dateChooserDialog1;
    private javax.swing.JTextField genderFieldFixed;
    private javax.swing.JButton jButton2;
    private org.jdatepicker.util.JDatePickerUtil jDatePickerUtil1;
    private javax.swing.JButton login;
    private javax.swing.JTextField loginId;
    private javax.swing.JPasswordField loginPassword;
    private javax.swing.JButton signUp;
    private javax.swing.JTextField signupAddress;
    private javax.swing.JTextField signupBranch;
    private datechooser.beans.DateChooserCombo signupDoB;
    private javax.swing.JTextField signupEmail;
    private javax.swing.JTextField signupFathername;
    private javax.swing.JComboBox<String> signupGender;
    private javax.swing.JTextField signupMobile;
    private javax.swing.JTextField signupMothername;
    private javax.swing.JTextField signupName;
    private javax.swing.JPasswordField signupPassword;
    private javax.swing.JTextField signupYear;
    private org.jdatepicker.impl.SqlDateModel sqlDateModel1;
    private org.jdatepicker.impl.UtilDateModel utilDateModel1;
    // End of variables declaration//GEN-END:variables
}
