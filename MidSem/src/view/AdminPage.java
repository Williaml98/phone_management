/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import dao.PhonesDao;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Phones;

/**
 *
 * @author William
 */
public class AdminPage extends javax.swing.JFrame {
    DefaultTableModel tableModel = new DefaultTableModel();
    /**
     * Creates new form AdminPage
     */
    public AdminPage() {
        initComponents();
        addColumns();
        RetrievePhones();
        setTitle("PHONES MANAGEMENT");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        phoneBrandTxt = new javax.swing.JTextField();
        phoneModel = new javax.swing.JTextField();
        phoneStorage = new javax.swing.JTextField();
        phoneColor = new javax.swing.JTextField();
        phonePrice = new javax.swing.JTextField();
        insertBtn = new javax.swing.JButton();
        updateBtn = new javax.swing.JButton();
        deleteBtn = new javax.swing.JButton();
        logOutBtn = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        phoneStatus = new javax.swing.JComboBox<>();
        usersBtn = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        phonesTable = new javax.swing.JTable();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(new javax.swing.border.MatteBorder(null));

        jLabel1.setBackground(new java.awt.Color(0, 255, 0));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Phone Sales DashBoard");

        jLabel2.setText("Phone Brand");

        jLabel3.setText("Phone Model");

        jLabel4.setText("Phone Storage");

        jLabel5.setText("Phone Color");

        jLabel6.setText("Phone Price");

        phoneBrandTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                phoneBrandTxtKeyTyped(evt);
            }
        });

        phoneModel.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                phoneModelKeyTyped(evt);
            }
        });

        phoneColor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                phoneColorKeyTyped(evt);
            }
        });

        phonePrice.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                phonePriceKeyTyped(evt);
            }
        });

        insertBtn.setBackground(new java.awt.Color(0, 128, 0));
        insertBtn.setForeground(new java.awt.Color(255, 255, 255));
        insertBtn.setText("Insert");
        insertBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertBtnActionPerformed(evt);
            }
        });

        updateBtn.setBackground(new java.awt.Color(0, 0, 139));
        updateBtn.setForeground(new java.awt.Color(255, 255, 255));
        updateBtn.setText("Update");
        updateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBtnActionPerformed(evt);
            }
        });

        deleteBtn.setBackground(new java.awt.Color(139, 0, 0));
        deleteBtn.setForeground(new java.awt.Color(255, 255, 255));
        deleteBtn.setText("Delete");
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });

        logOutBtn.setBackground(new java.awt.Color(139, 0, 0));
        logOutBtn.setForeground(new java.awt.Color(255, 255, 255));
        logOutBtn.setText("LogOut");
        logOutBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logOutBtnActionPerformed(evt);
            }
        });

        jLabel7.setText("Phone Status ");

        phoneStatus.setBackground(new java.awt.Color(220, 220, 220));
        phoneStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select..", "Sold", "Available", "Out of Service", "Maintenance", }));
        phoneStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phoneStatusActionPerformed(evt);
            }
        });

        usersBtn.setBackground(new java.awt.Color(173, 216, 230));
        usersBtn.setText("Users");
        usersBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usersBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 82, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(insertBtn))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(phoneBrandTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(phoneStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(updateBtn)
                                .addGap(40, 40, 40)
                                .addComponent(deleteBtn)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(usersBtn, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(logOutBtn, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(phoneModel, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(phoneColor, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(phonePrice, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(phoneStorage, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(logOutBtn)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(phoneBrandTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(phoneStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(phoneModel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(phoneStorage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(phoneColor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(phonePrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(insertBtn)
                    .addComponent(updateBtn)
                    .addComponent(deleteBtn)
                    .addComponent(usersBtn))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(new javax.swing.border.MatteBorder(null));

        jLabel8.setBackground(new java.awt.Color(255, 153, 0));
        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Phones");

        phonesTable.setBackground(new java.awt.Color(200, 220, 230));
        phonesTable.setForeground(new java.awt.Color(0, 0, 128));
        phonesTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        phonesTable.setGridColor(new java.awt.Color(220, 230, 240));
        phonesTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                phonesTableMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(phonesTable);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(241, 241, 241)
                .addComponent(jLabel8)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
    
    private void insertBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertBtnActionPerformed
         boolean isValid = Verification();
        if(isValid)
          InsertPhones();
        EmpyFields();
    }//GEN-LAST:event_insertBtnActionPerformed

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
         boolean isValid = Verification();
        if(isValid)
            DeletePhones();
        EmpyFields();
    }//GEN-LAST:event_deleteBtnActionPerformed

    private void updateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBtnActionPerformed
        boolean isValid = Verification();
        if(isValid)
            UpdatePhones();
        EmpyFields();
    }//GEN-LAST:event_updateBtnActionPerformed

    private void logOutBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logOutBtnActionPerformed
        LoginPage lp = new LoginPage();
        lp.setVisible(true);
        dispose();
    }//GEN-LAST:event_logOutBtnActionPerformed

    private void phonesTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_phonesTableMouseClicked
         int row = phonesTable.getSelectedRow();
         int idColumnIndex = 0; // Assuming "id" is the first column

        if (row != -1) {
            Object idObject = phonesTable.getValueAt(row, idColumnIndex);
            if (idObject != null) {
                
                String selectedPhoneBrand = phonesTable.getValueAt(row, 1).toString();
                String selectedPhoneModel = phonesTable.getValueAt(row, 2).toString();
                String selectedPhoneStorage = phonesTable.getValueAt(row, 3).toString();
                String selectedPhonePrice = phonesTable.getValueAt(row, 4).toString();
                String selectedPhoneColor = phonesTable.getValueAt(row, 5).toString();
                String selectedPhoneStatus = phonesTable.getValueAt(row, 6).toString();

                phoneBrandTxt.setText(selectedPhoneBrand);
                phoneModel.setText(selectedPhoneModel);
                phoneStorage.setText(selectedPhoneStorage);
                phonePrice.setText(selectedPhonePrice);
                phoneColor.setText(selectedPhoneColor);
                phoneStatus.setSelectedItem(selectedPhoneStatus);
        }
}



        
    }//GEN-LAST:event_phonesTableMouseClicked

    private void phoneStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phoneStatusActionPerformed
     

    }//GEN-LAST:event_phoneStatusActionPerformed

    private void usersBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usersBtnActionPerformed
        UsersPage uP = new UsersPage();
        uP.setVisible(true);
        dispose();
    }//GEN-LAST:event_usersBtnActionPerformed

    private void phoneBrandTxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_phoneBrandTxtKeyTyped
        char keyChar = evt.getKeyChar();
        boolean digit = Character.isDigit(keyChar);
        if(digit){
            evt.consume();
        }
    }//GEN-LAST:event_phoneBrandTxtKeyTyped

    private void phoneModelKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_phoneModelKeyTyped
        
    }//GEN-LAST:event_phoneModelKeyTyped

    private void phoneColorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_phoneColorKeyTyped
        char keyChar = evt.getKeyChar();
        boolean digit = Character.isDigit(keyChar);
        if(digit){
            evt.consume();
        }
    }//GEN-LAST:event_phoneColorKeyTyped

    private void phonePriceKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_phonePriceKeyTyped
         if(!Character.isDigit(evt.getKeyChar())){
            evt.consume();
        }
    }//GEN-LAST:event_phonePriceKeyTyped

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
            java.util.logging.Logger.getLogger(AdminPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminPage().setVisible(true);
            }
        });
    }
    
    private void DeletePhones(){
        int feedBack = JOptionPane.showConfirmDialog(this, "You are about to delete the record",
                "Warning", JOptionPane.YES_NO_CANCEL_OPTION);
        if(feedBack == 0) System.out.println("Not deleted");
        else return;

        PhonesDao dao = new PhonesDao();
        int selectedRowIndex = phonesTable.getSelectedRow();
        int rows = dao.DeletePhones(Integer.parseInt(tableModel.getValueAt(selectedRowIndex, 0).toString()));

        if(rows > 0) {
            JOptionPane.showMessageDialog(this,
                    "Record successfully deleted ",
                    "Information",
                    JOptionPane.INFORMATION_MESSAGE);
        }

        tableModel = new DefaultTableModel();
        addColumns();
        RetrievePhones();
    }
    
    private void UpdatePhones(){
         
        int feedBack = JOptionPane.showConfirmDialog(this,
                "You are about to alter this record!", "Warning",
                JOptionPane.YES_NO_CANCEL_OPTION);
        if(feedBack == 0) System.out.println("Not Updated");
        else return;
        
        Phones thePhone = new Phones();
        thePhone.setPhoneBrand(phoneBrandTxt.getText());
        thePhone.setPhoneModel(phoneModel.getText());
        thePhone.setPhoneStorage(phoneStorage.getText());
        thePhone.setPhonePrice(Double.parseDouble(phonePrice.getText()));
        thePhone.setPhoneColor(phoneColor.getText());
        thePhone.setPhoneStatus((String) phoneStatus.getSelectedItem());

        PhonesDao dao = new PhonesDao();
        int selectedRowIndex = phonesTable.getSelectedRow();
        int rowAffected = dao.UpdatePhones(thePhone, Integer.parseInt(tableModel.getValueAt(selectedRowIndex, 0).toString()));

        if(rowAffected > 0) {
            JOptionPane.showMessageDialog(this,
                    "Record successfully updated", "Information",
                    JOptionPane.INFORMATION_MESSAGE);
        }

        tableModel = new DefaultTableModel();
        addColumns();
        RetrievePhones();
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton deleteBtn;
    private javax.swing.JButton insertBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JButton logOutBtn;
    private javax.swing.JTextField phoneBrandTxt;
    private javax.swing.JTextField phoneColor;
    private javax.swing.JTextField phoneModel;
    private javax.swing.JTextField phonePrice;
    private javax.swing.JComboBox<String> phoneStatus;
    private javax.swing.JTextField phoneStorage;
    private javax.swing.JTable phonesTable;
    private javax.swing.JButton updateBtn;
    private javax.swing.JButton usersBtn;
    // End of variables declaration//GEN-END:variables

    private void addColumns() {
        tableModel.addColumn("Phone Id");
        tableModel.addColumn("Phone Brand");
        tableModel.addColumn("Phone Model");
        tableModel.addColumn("Phone Storage");
        tableModel.addColumn("Phone Price");
        tableModel.addColumn("Phone Color");
        tableModel.addColumn("phone Status");
       
        phonesTable.setModel(tableModel);
    }
    
    
    public void RetrievePhones() {
        PhonesDao dao = new PhonesDao();
        dao.LoadPhones(tableModel, "admin");
    }
    
    private boolean Verification (){
        if(phoneBrandTxt.getText().trim().isEmpty() 
           || phoneModel.getText().trim().isEmpty() 
           || phoneStorage.getText().trim().isEmpty() 
           || phonePrice.getText().trim().isEmpty() 
           || phoneColor.getText().trim().isEmpty() 
           || phoneStatus.getSelectedIndex() == 0){
            JOptionPane.showMessageDialog(this, "Provide data", "Empty Fields", JOptionPane.WARNING_MESSAGE);
            return false;
        }
        return true;
    }
   
     private void InsertPhones() {
        Phones thisPhone = new Phones();
        thisPhone.setPhoneBrand(phoneBrandTxt.getText());
        thisPhone.setPhoneModel(phoneModel.getText());
        thisPhone.setPhoneStorage(phoneStorage.getText());
        thisPhone.setPhonePrice(Double.parseDouble(phonePrice.getText()));
        thisPhone.setPhoneColor(phoneColor.getText());
        thisPhone.setPhoneStatus((String) phoneStatus.getSelectedItem());
        
        
         PhonesDao dao = new PhonesDao();
        int rows = dao.AddPhones(thisPhone);
        if (rows > 0){
            JOptionPane.showMessageDialog(this, "Phone added successfully!", "Recorded",JOptionPane.INFORMATION_MESSAGE);

            tableModel = new DefaultTableModel();
            addColumns();
            RetrievePhones();
            return;
        }else{
            JOptionPane.showMessageDialog(this, "Failed to add the phone!", "Try again", JOptionPane.ERROR_MESSAGE);
            return;
        }
    }
     public void EmpyFields(){
         phoneBrandTxt.setText("");
         phoneModel.setText("");
         phoneStorage.setText("");
         phoneColor.setText("");
         phonePrice.setText("");
         phoneStatus.setSelectedIndex(0);
     }
}
