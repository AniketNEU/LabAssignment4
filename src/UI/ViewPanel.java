/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI;

import Model.Patient;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ButtonModel;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author anikettiwari
 */
public class ViewPanel extends javax.swing.JPanel {
    private String uploadedPhotoPath;

    /**
     * Creates new form FormPanel
     */

    private Patient newPatient;
    
    public ViewPanel(Patient newPatient) {
        initComponents();
        if(newPatient != null){
          this.newPatient = newPatient;
          populateData();  
        }
        else{
            JOptionPane.showMessageDialog(this, "Please fill the form first.", "Form Not Filled", JOptionPane.WARNING_MESSAGE);
        }
        
        
    }
    
    private void populateData() {
        if(newPatient == null){
            JOptionPane.showMessageDialog(this, "Please fill the form first.", "Form Not Filled", JOptionPane.WARNING_MESSAGE);
        }
        firstNameTextField.setText(this.newPatient.getFirstName());
        lastNameTextField.setText(this.newPatient.getLastName());
        ageTextField.setText(this.newPatient.getAgeText());
        emailTextField.setText(this.newPatient.getEmail());
        patientComboBox.setActionCommand(this.newPatient.getPatientType());
        dateChooser.setDate(this.newPatient.getDate());
        messageTextArea.setText(this.newPatient.getMessage());
        
        String gender = this.newPatient.getGender();
        if(gender!= null){
            switch(gender){
                case "MALE":
                    maleRadioButton.setSelected(true);
                    break;
                case "FEMALE":
                    femaleRadioButton.setSelected(true);
                    break;
                case "OTHER":
                    otherRadioButton.setSelected(true);
                    break; 
            }
            
        }
           else {
              System.err.println("No radio button selected.");
         }
        
        String photoFilePath = this.newPatient.getPhotoFilePath();
        try {
          BufferedImage img = ImageIO.read(new File(photoFilePath));
          ImageIcon imageIcon = new ImageIcon(img.getScaledInstance(60, 80, Image.SCALE_SMOOTH));
          photoLabel.setIcon(imageIcon);
        } catch (IOException ex) {
          ex.printStackTrace();
            }
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        newGenderGroup = new javax.swing.ButtonGroup();
        mainPanel = new javax.swing.JPanel();
        titleLabel = new javax.swing.JLabel();
        firstNameLabel = new javax.swing.JLabel();
        lastNameLabel = new javax.swing.JLabel();
        ageLabel = new javax.swing.JLabel();
        emailLabel = new javax.swing.JLabel();
        messageLabel = new javax.swing.JLabel();
        firstNameTextField = new javax.swing.JTextField();
        lastNameTextField = new javax.swing.JTextField();
        ageTextField = new javax.swing.JTextField();
        emailTextField = new javax.swing.JTextField();
        messagePanel = new javax.swing.JScrollPane();
        messageTextArea = new javax.swing.JTextArea();
        genderLabel = new javax.swing.JLabel();
        maleRadioButton = new javax.swing.JRadioButton();
        femaleRadioButton = new javax.swing.JRadioButton();
        otherRadioButton = new javax.swing.JRadioButton();
        patientLabel = new javax.swing.JLabel();
        patientComboBox = new javax.swing.JComboBox<>();
        dateLabel = new javax.swing.JLabel();
        dateChooser = new com.toedter.calendar.JDateChooser();
        photoLabel = new javax.swing.JLabel();

        mainPanel.setBackground(new java.awt.Color(255, 255, 204));

        titleLabel.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        titleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleLabel.setText("PATIENT INFORMATION");

        firstNameLabel.setText("First name");

        lastNameLabel.setText("Last name");

        ageLabel.setText("Age");

        emailLabel.setText("email id");

        messageLabel.setText("Message");

        firstNameTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                firstNameTextFieldfirstNameFocusLost(evt);
            }
        });
        firstNameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firstNameTextFieldActionPerformed(evt);
            }
        });

        lastNameTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                lastNameTextFieldlastNameFocusLost(evt);
            }
        });

        ageTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                ageTextFieldFocusLost(evt);
            }
        });

        emailTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                emailTextFieldFocusLost(evt);
            }
        });

        messageTextArea.setColumns(20);
        messageTextArea.setRows(5);
        messagePanel.setViewportView(messageTextArea);

        genderLabel.setText("Gender");

        newGenderGroup.add(maleRadioButton);
        maleRadioButton.setText("Male");
        maleRadioButton.setActionCommand("MALE");
        maleRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maleRadioButtonActionPerformed(evt);
            }
        });

        newGenderGroup.add(femaleRadioButton);
        femaleRadioButton.setText("Female");
        femaleRadioButton.setActionCommand("FEMALE");
        femaleRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                femaleRadioButtonActionPerformed(evt);
            }
        });

        newGenderGroup.add(otherRadioButton);
        otherRadioButton.setText("Other");
        otherRadioButton.setActionCommand("OTHER");

        patientLabel.setText("Patient type");

        patientComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Inpatient", "Outpatient", "Emergency patient", " " }));
        patientComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                patientComboBoxActionPerformed(evt);
            }
        });

        dateLabel.setText("Date");

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGap(133, 133, 133)
                        .addComponent(titleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 411, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGap(161, 161, 161)
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(mainPanelLayout.createSequentialGroup()
                                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ageLabel)
                                    .addComponent(firstNameLabel)
                                    .addComponent(lastNameLabel)
                                    .addComponent(patientLabel)
                                    .addComponent(genderLabel)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                                        .addGap(1, 1, 1)
                                        .addComponent(dateLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(101, 101, 101)
                                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lastNameTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 234, Short.MAX_VALUE)
                                    .addComponent(firstNameTextField)
                                    .addComponent(ageTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 234, Short.MAX_VALUE)
                                    .addComponent(patientComboBox, 0, 234, Short.MAX_VALUE)
                                    .addGroup(mainPanelLayout.createSequentialGroup()
                                        .addComponent(maleRadioButton)
                                        .addGap(32, 32, 32)
                                        .addComponent(femaleRadioButton)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(otherRadioButton))
                                    .addComponent(dateChooser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(mainPanelLayout.createSequentialGroup()
                                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(emailLabel)
                                    .addComponent(messageLabel)
                                    .addComponent(photoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(messagePanel)
                                    .addComponent(emailTextField))))))
                .addContainerGap(142, Short.MAX_VALUE))
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(titleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(firstNameLabel)
                    .addComponent(firstNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lastNameLabel)
                    .addComponent(lastNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(ageTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(ageLabel)))
                .addGap(24, 24, 24)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addComponent(dateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addComponent(dateLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(genderLabel)
                            .addComponent(maleRadioButton)
                            .addComponent(femaleRadioButton)
                            .addComponent(otherRadioButton))
                        .addGap(24, 24, 24)))
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(patientLabel)
                    .addComponent(patientComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(emailLabel)
                            .addComponent(emailTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(40, 40, 40)
                        .addComponent(messageLabel)
                        .addGap(18, 18, 18)
                        .addComponent(photoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(messagePanel, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 59, Short.MAX_VALUE)
                .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void firstNameTextFieldfirstNameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_firstNameTextFieldfirstNameFocusLost
        // TODO add your handling code here:
        String firstName = firstNameTextField.getText();
        if(!isValidName(firstName)){
            JOptionPane.showMessageDialog(this, "Please enter a valid first name", "Invalid Input", JOptionPane.ERROR_MESSAGE);
            firstNameTextField.requestFocus();
        }
    }//GEN-LAST:event_firstNameTextFieldfirstNameFocusLost

    private void firstNameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firstNameTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_firstNameTextFieldActionPerformed

    private void lastNameTextFieldlastNameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_lastNameTextFieldlastNameFocusLost
        // TODO add your handling code here:
        String lastName = lastNameTextField.getText();
        if(!isValidName(lastName)){
            JOptionPane.showMessageDialog(this, "Please enter a valid last name", "Invalid Input", JOptionPane.ERROR_MESSAGE);
            lastNameTextField.requestFocus();
        }
    }//GEN-LAST:event_lastNameTextFieldlastNameFocusLost

    private void ageTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ageTextFieldFocusLost
        // TODO add your handling code here:
        String ageText = ageTextField.getText();
        if (!isValidInteger(ageText)) {
            JOptionPane.showMessageDialog(this, "Please enter a valid integer for age.", "Invalid Input", JOptionPane.ERROR_MESSAGE);
            ageTextField.requestFocus();
        }
    }//GEN-LAST:event_ageTextFieldFocusLost

    private void emailTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_emailTextFieldFocusLost
        // TODO add your handling code here:
        String email = emailTextField.getText();
        if (!isValidEmail(email)) {
            JOptionPane.showMessageDialog(this, "Please enter a valid email address.", "Invalid Input", JOptionPane.ERROR_MESSAGE);
            emailTextField.requestFocus();
        }
    }//GEN-LAST:event_emailTextFieldFocusLost

    private boolean isValidName(String name){
        return name.matches("^[A-Za-z]*$");
    }
    
    private boolean isValidEmail(String email) {
        if (email == null || email.trim().isEmpty()) {
        return true; 
         }
        String regex = "^[A-Za-z0-9+_.-]+@(.+)$";
        return email.matches(regex);
    }
    
    private boolean isValidInteger(String input) {
    if (input == null || input.trim().isEmpty()) {
        return true;
    }

    try {
        int value = Integer.parseInt(input);
        if (value >= 0) {
            return true; 
        } else {
            return false; 
        }
    } catch (NumberFormatException e) {
        return false; 
    }
    
    }
    private void maleRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_maleRadioButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_maleRadioButtonActionPerformed

    private void femaleRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_femaleRadioButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_femaleRadioButtonActionPerformed

    private void patientComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_patientComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_patientComboBoxActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ageLabel;
    private javax.swing.JTextField ageTextField;
    private com.toedter.calendar.JDateChooser dateChooser;
    private javax.swing.JLabel dateLabel;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JTextField emailTextField;
    private javax.swing.JRadioButton femaleRadioButton;
    private javax.swing.JLabel firstNameLabel;
    private javax.swing.JTextField firstNameTextField;
    private javax.swing.JLabel genderLabel;
    private javax.swing.JLabel lastNameLabel;
    private javax.swing.JTextField lastNameTextField;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JRadioButton maleRadioButton;
    private javax.swing.JLabel messageLabel;
    private javax.swing.JScrollPane messagePanel;
    private javax.swing.JTextArea messageTextArea;
    private javax.swing.ButtonGroup newGenderGroup;
    private javax.swing.JRadioButton otherRadioButton;
    private javax.swing.JComboBox<String> patientComboBox;
    private javax.swing.JLabel patientLabel;
    private javax.swing.JLabel photoLabel;
    private javax.swing.JLabel titleLabel;
    // End of variables declaration//GEN-END:variables

    
}
