/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package view;

import controller.BCrypt;
import javax.swing.JOptionPane;
import model.AccountNet;
import manager.AccountManager;

/**
 *
 * @author Duong Minh Tien
 */
public class AddAccountNet extends javax.swing.JDialog {
    private AccountFormNet homeAcc;


    public AddAccountNet(javax.swing.JInternalFrame parent, javax.swing.JFrame owner, boolean modal) {
        super(owner, modal);
        initComponents();
        setLocationRelativeTo(null);
        homeAcc = (AccountFormNet) parent;
    }

    public AddAccountNet() {
    initComponents();
    setLocationRelativeTo(null);
}

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txfullname = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtusername = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtpassword = new javax.swing.JTextField();
        txaddaccount = new javax.swing.JButton();
        txback = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Thêm tài khoản mới");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("SF Pro Display", 0, 16)); // NOI18N
        jLabel2.setText("Tên tài khoản");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, 120, -1));

        txfullname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txfullnameActionPerformed(evt);
            }
        });
        jPanel1.add(txfullname, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 298, 38));

        jLabel3.setFont(new java.awt.Font("SF Pro Display", 0, 16)); // NOI18N
        jLabel3.setText("Tên đăng nhập");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, -1, 24));
        jPanel1.add(txtusername, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, 298, 38));
        txtusername.getAccessibleContext().setAccessibleName("txtusername");

        jLabel4.setFont(new java.awt.Font("SF Pro Display", 0, 16)); // NOI18N
        jLabel4.setText("Mật khẩu");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 340, 68, -1));
        jPanel1.add(txtpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 370, 298, 38));

        txaddaccount.setBackground(javax.swing.UIManager.getDefaults().getColor("Actions.Green"));
        txaddaccount.setForeground(new java.awt.Color(255, 255, 255));
        txaddaccount.setText("Tao Tai Khoan");
        txaddaccount.setBorder(null);
        txaddaccount.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txaddaccount.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txaddaccountMouseClicked(evt);
            }
        });
        txaddaccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txaddaccountActionPerformed(evt);
            }
        });
        jPanel1.add(txaddaccount, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 430, 140, 38));

        txback.setText("Huỷ");
        txback.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txbackActionPerformed(evt);
            }
        });
        jPanel1.add(txback, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 430, 140, 38));

        jPanel2.setBackground(javax.swing.UIManager.getDefaults().getColor("Actions.Green"));

        jLabel1.setFont(new java.awt.Font("SF Pro Display", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("THÊM TÀI KHOẢN");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(88, 88, 88)
                .addComponent(jLabel1)
                .addContainerGap(102, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(20, 20, 20))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 390, -1));

        jLabel6.setFont(new java.awt.Font("SF Pro Display", 0, 16)); // NOI18N
        jLabel6.setText("Email");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, 50, -1));
        jPanel1.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, 300, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txaddaccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txaddaccountActionPerformed
        // TODO add your handling code here:
    AddAccount();
    }//GEN-LAST:event_txaddaccountActionPerformed

    private void txbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txbackActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_txbackActionPerformed

    private void txaddaccountMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txaddaccountMouseClicked
        // TODO add your handling code here:
        

    }//GEN-LAST:event_txaddaccountMouseClicked

    private void txfullnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txfullnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txfullnameActionPerformed

    private void AddAccount() {
    String fullName = txfullname.getText().trim();
    String user = txtusername.getText().trim();
    String passwordPlain = txtpassword.getText().trim();
    String email = txtEmail.getText().trim();

    if (fullName.isEmpty() || user.isEmpty() || passwordPlain.isEmpty() || email.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Vui lòng nhập đầy đủ thông tin !", "Cảnh báo", JOptionPane.WARNING_MESSAGE);
        return;
    }

    if (!isValid(email)) {
        JOptionPane.showMessageDialog(this, "Vui lòng nhập email đúng định dạng !", "Cảnh báo", JOptionPane.WARNING_MESSAGE);
        return;
    }

    if (AccountManager.getInstance().selectById(user) != null) {
        JOptionPane.showMessageDialog(this, "Tên đăng nhập đã tồn tại !", "Cảnh báo", JOptionPane.WARNING_MESSAGE);
        return;
    }

    AccountNet acc = new AccountNet(fullName, user, passwordPlain, 1, email);
    AccountManager.getInstance().insert(acc);

    if (homeAcc != null) {
        homeAcc.loadDataToTable(AccountManager.getInstance().selectAll());
    }

    JOptionPane.showMessageDialog(this, "Thêm thành công !");
    this.dispose();
}

    
    static boolean isValid(String email) {
        String regex = "^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$";
        return email.matches(regex);
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton txaddaccount;
    private javax.swing.JButton txback;
    private javax.swing.JTextField txfullname;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtpassword;
    private javax.swing.JTextField txtusername;
    // End of variables declaration//GEN-END:variables
}