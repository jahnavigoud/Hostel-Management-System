/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.hostelmanagement.AdminAfterLoginScreen.SearchStudentScreen;

import com.mycompany.hostelmanagement.DBConnection.DBConnection;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author pranay
 */
public class SearchStudentScreen extends javax.swing.JInternalFrame {

    /**
     * Creates new form SearchStudentScreen
     */
    
    public Connection connection =null; 
    public SearchStudentScreen() {
        initComponents();
        connection = DBConnection.getConnection();
       
    
    }
    
    public void placeholders(){
            profileId.addFocusListener(new FocusListener() {
           
            @Override
            public void focusLost(FocusEvent e) {
                if (profileId.getText().isEmpty()) {
                    profileId.setText("ProfileId");
                }
            }

            @Override
                public void focusGained(FocusEvent e) {
                     if (profileId.getText().equals("ProfileId")) {
                    profileId.setText("");
                }
            }
        });
            
            mobileNum.addFocusListener(new FocusListener() {
           
            @Override
            public void focusLost(FocusEvent e) {
                if (mobileNum.getText().isEmpty()) {
                    mobileNum.setText("Mobile");
                }
            }

            @Override
                public void focusGained(FocusEvent e) {
                     if (mobileNum.getText().equals("Mobile")) {
                    mobileNum.setText("");
                }
            }
        });
              email.addFocusListener(new FocusListener() {
           
            @Override
            public void focusLost(FocusEvent e) {
                if (email.getText().isEmpty()) {
                    email.setText("Email");
                }
            }

            @Override
                public void focusGained(FocusEvent e) {
                     if (email.getText().equals("Email")) {
                    email.setText("");
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

        mobileNum = new javax.swing.JTextField();
        email = new javax.swing.JTextField();
        profileId = new javax.swing.JTextField();
        searchBy = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        RoomNumber = new javax.swing.JTextField();
        nameField = new javax.swing.JTextField();
        roomField = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        FeeDueField = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        FeePaidField = new javax.swing.JTextField();

        searchBy.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        searchBy.setText("SearchBy");
        searchBy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchByActionPerformed(evt);
            }
        });

        jTextField1.setEditable(false);
        jTextField1.setText("Name");

        RoomNumber.setText("RoomNumber");
        RoomNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RoomNumberActionPerformed(evt);
            }
        });

        jTextField2.setEditable(false);
        jTextField2.setText("Fee Paid");

        FeeDueField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FeeDueFieldActionPerformed(evt);
            }
        });

        jTextField4.setText("Fee Due");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(searchBy, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(profileId, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(mobileNum, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(RoomNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(nameField, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)
                            .addComponent(roomField)
                            .addComponent(FeePaidField)
                            .addComponent(FeeDueField))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mobileNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(profileId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchBy))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(RoomNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(roomField, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FeePaidField, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FeeDueField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(133, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RoomNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RoomNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RoomNumberActionPerformed

    private void FeeDueFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FeeDueFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FeeDueFieldActionPerformed

    private void searchByActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchByActionPerformed
            
            nameField.setText("");
            roomField.setText("");
            FeeDueField.setText("");
            FeePaidField.setText("");
            
            
            String email = this.email.getText();
            String mobile = mobileNum.getText();
            String profileId = this.profileId.getText();
        try {
            PreparedStatement readFromStudentsTable=connection.prepareStatement("select * from students where (email=? or mobile=? or id=?)");
            readFromStudentsTable.setString(1,email);
            readFromStudentsTable.setString(2,mobile);
            readFromStudentsTable.setString(3,profileId);
            ResultSet profileIdResultSet = readFromStudentsTable.executeQuery();
            if(profileIdResultSet.next()){
                nameField.setText(profileIdResultSet.getString(2));
                profileId = profileIdResultSet.getString(1);
            }else{
                throw new Exception();
            }
            
             PreparedStatement readFromRegisterTable=connection.prepareStatement("select * from register where (profileId1=? or profileId2=?)");
            readFromRegisterTable.setString(1,profileId);
            readFromRegisterTable.setString(2,profileId);
            ResultSet resultSet = readFromRegisterTable.executeQuery();
            if(resultSet.next()){
                if(resultSet.getString(3)==null){
                   roomField.setText(resultSet.getString(4));
                }else{
                    roomField.setText(resultSet.getString(3));
                }
               
            }else{
                throw new Exception();
            }
            
            PreparedStatement readFromFeeTable=connection.prepareStatement("select * from feedetails where profileId=?");
            readFromFeeTable.setString(1,profileId);
            ResultSet resultSet2 = readFromFeeTable.executeQuery();
            if(resultSet2.next()){
                FeePaidField.setText(resultSet2.getString(4));
                FeeDueField.setText(resultSet2.getString(5));
            }else{
                throw new Exception();
            }
            
            
            
           
            
        } catch (Exception ex) {
            Logger.getLogger(SearchStudentScreen.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_searchByActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField FeeDueField;
    private javax.swing.JTextField FeePaidField;
    private javax.swing.JTextField RoomNumber;
    private javax.swing.JTextField email;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField mobileNum;
    private javax.swing.JTextField nameField;
    private javax.swing.JTextField profileId;
    private javax.swing.JTextField roomField;
    private javax.swing.JButton searchBy;
    // End of variables declaration//GEN-END:variables
}