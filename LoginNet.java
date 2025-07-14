/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import com.formdev.flatlaf.FlatLightLaf;
import com.mysql.cj.protocol.Resultset;
import java.sql.Connection;
import java.sql.ResultSet;
import controller.BCrypt;
import manager.ManagerInterface;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import manager.AccountManager;
import model.AccountNet;

public class LoginNet extends javax.swing.JFrame {
    Connection con = null;
    ResultSet rs = null;
    Color panDefualt, panEnter, panClick;
    private boolean showPassword = false;

    public LoginNet() {
        initComponents();
        setLocationRelativeTo(null);
        UIManager.put("Button.focus", Color.white);
        panDefualt = new Color(89, 168, 105);
        panClick = new Color(89, 168, 120);
        panEnter = new Color(89, 168, 120);
        JPaneLogin.setBackground(panDefualt);
        ImageIcon logo = new ImageIcon(getClass().getResource("/icon/logo.png"));
        setIconImage(logo.getImage());
        passwordUser.setEchoChar('●');
    }
    @SuppressWarnings("unchecked")

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        Login = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        loginUser = new javax.swing.JTextField();
        passwordUser = new javax.swing.JPasswordField();
        JPaneLogin = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        CreateAcc = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        FogetPass = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Đăng nhập vào phần mềm");
        setResizable(false);
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });

        Login.setBackground(new java.awt.Color(75, 85, 99));

        jLabel4.setFont(new java.awt.Font("SF Pro Display", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Username");

        jLabel5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));

        jLabel6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));

        loginUser.setBackground(new java.awt.Color(13, 39, 51));
        loginUser.setFont(new java.awt.Font("SF Pro Display", 1, 18)); // NOI18N
        loginUser.setForeground(new java.awt.Color(255, 255, 255));
        loginUser.setBorder(null);
        loginUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                loginUserMouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                loginUserMousePressed(evt);
            }
        });
        loginUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginUserActionPerformed(evt);
            }
        });
        loginUser.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                loginUserKeyPressed(evt);
            }
        });

        passwordUser.setBackground(new java.awt.Color(13, 39, 51));
        passwordUser.setForeground(new java.awt.Color(255, 255, 255));
        passwordUser.setBorder(null);
        passwordUser.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                passwordUserKeyPressed(evt);
            }
        });

        JPaneLogin.setBackground(javax.swing.UIManager.getDefaults().getColor("Actions.Green"));
        JPaneLogin.setToolTipText("");
        JPaneLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        JPaneLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JPaneLoginMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                JPaneLoginMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                JPaneLoginMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                JPaneLoginMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                JPaneLoginMouseReleased(evt);
            }
        });
        JPaneLogin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                JPaneLoginKeyPressed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("SF Pro Display", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Login");

        javax.swing.GroupLayout JPaneLoginLayout = new javax.swing.GroupLayout(JPaneLogin);
        JPaneLogin.setLayout(JPaneLoginLayout);
        JPaneLoginLayout.setHorizontalGroup(
            JPaneLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPaneLoginLayout.createSequentialGroup()
                .addGap(102, 102, 102)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(109, Short.MAX_VALUE))
        );
        JPaneLoginLayout.setVerticalGroup(
            JPaneLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPaneLoginLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jLabel8.setFont(new java.awt.Font("SF Pro Display", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Password");

        CreateAcc.setFont(new java.awt.Font("SF Pro Display", 1, 18)); // NOI18N
        CreateAcc.setForeground(new java.awt.Color(255, 255, 255));
        CreateAcc.setText("Create Account ");
        CreateAcc.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        CreateAcc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CreateAccMouseClicked(evt);
            }
        });

        jLabel10.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));

        FogetPass.setFont(new java.awt.Font("SF Pro Display", 1, 18)); // NOI18N
        FogetPass.setForeground(new java.awt.Color(255, 255, 255));
        FogetPass.setText("Forgot password ");
        FogetPass.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        FogetPass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                FogetPassMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout LoginLayout = new javax.swing.GroupLayout(Login);
        Login.setLayout(LoginLayout);
        LoginLayout.setHorizontalGroup(
            LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LoginLayout.createSequentialGroup()
                .addGroup(LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(LoginLayout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(LoginLayout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(loginUser, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(LoginLayout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(LoginLayout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(LoginLayout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(passwordUser, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(LoginLayout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(LoginLayout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(JPaneLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(LoginLayout.createSequentialGroup()
                        .addGap(160, 160, 160)
                        .addComponent(FogetPass))
                    .addGroup(LoginLayout.createSequentialGroup()
                        .addGap(160, 160, 160)
                        .addComponent(CreateAcc)))
                .addContainerGap(44, Short.MAX_VALUE))
        );
        LoginLayout.setVerticalGroup(
            LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LoginLayout.createSequentialGroup()
                .addGap(150, 150, 150)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(loginUser, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(passwordUser, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel5)
                .addGap(38, 38, 38)
                .addComponent(JPaneLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(FogetPass)
                .addGap(6, 6, 6)
                .addComponent(CreateAcc)
                .addContainerGap(48, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Login, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Login, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
        // TODO add your handling code here:
        System.out.println(evt.getKeyCode());

    }//GEN-LAST:event_formKeyPressed

    private void CreateAccMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CreateAccMouseClicked

        AddAccountNet add = new AddAccountNet();
    add.setVisible(true);
    this.dispose();
    }//GEN-LAST:event_CreateAccMouseClicked

    private void JPaneLoginKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JPaneLoginKeyPressed

    }//GEN-LAST:event_JPaneLoginKeyPressed

    private void JPaneLoginMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JPaneLoginMouseReleased

        JPaneLogin.setBackground(panClick);
    }//GEN-LAST:event_JPaneLoginMouseReleased

    private void JPaneLoginMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JPaneLoginMousePressed
        // TODO add your handling code here:

        JPaneLogin.setBackground(panEnter);
    }//GEN-LAST:event_JPaneLoginMousePressed

    private void JPaneLoginMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JPaneLoginMouseExited
        // TODO add your handling code here:
        JPaneLogin.setBackground(panClick);
    }//GEN-LAST:event_JPaneLoginMouseExited

    private void JPaneLoginMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JPaneLoginMouseEntered
        // TODO add your handling code here:
        JPaneLogin.setBackground(panEnter);
    }//GEN-LAST:event_JPaneLoginMouseEntered

    private void JPaneLoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JPaneLoginMouseClicked
        checkLogin();

    }//GEN-LAST:event_JPaneLoginMouseClicked

    private void passwordUserKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passwordUserKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            checkLogin();
        }
    }//GEN-LAST:event_passwordUserKeyPressed

    private void loginUserKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_loginUserKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            checkLogin();
        }
    }//GEN-LAST:event_loginUserKeyPressed

    private void loginUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginUserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_loginUserActionPerformed

    private void loginUserMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginUserMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_loginUserMousePressed

    private void loginUserMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginUserMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_loginUserMouseEntered

    private void FogetPassMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FogetPassMouseClicked
        ForgetPasswordNet foget = new ForgetPasswordNet();
    foget.setVisible(true);
    this.dispose();
    }//GEN-LAST:event_FogetPassMouseClicked

    public static void main(String args[]) throws UnsupportedLookAndFeelException {
        UIManager.setLookAndFeel(new FlatLightLaf());
        java.awt.EventQueue.invokeLater(() -> new LoginNet().setVisible(true));
    }

    public void checkLogin() {
        String usercheck = loginUser.getText();
        String passwordcheck = new String(passwordUser.getPassword());

        if (usercheck.isEmpty() || passwordcheck.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập đầy đủ !", "Cảnh báo !", JOptionPane.WARNING_MESSAGE);
            return;
        }

        try {
            AccountNet acc = AccountManager.getInstance().selectById(usercheck);
            if (acc == null) {
                JOptionPane.showMessageDialog(this, "Tài khoản không tồn tại trên hệ thống !", "Cảnh báo !", JOptionPane.WARNING_MESSAGE);
                return;
            }
            if (!passwordcheck.equals(acc.getPassword())) {
                JOptionPane.showMessageDialog(this, "Sai mật khẩu !", "Cảnh báo !", JOptionPane.WARNING_MESSAGE);
                return;
            }
            if (acc.getStatus() != 1) {
                JOptionPane.showMessageDialog(this, "Tài khoản của bạn đã bị khóa !", "Cảnh báo !", JOptionPane.WARNING_MESSAGE);
                return;
            }

            JOptionPane.showMessageDialog(this, "Đăng nhập thành công!");
            this.dispose();
            openDashboard(acc);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }




    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CreateAcc;
    private javax.swing.JLabel FogetPass;
    private javax.swing.JPanel JPaneLogin;
    private javax.swing.JPanel Login;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTextField loginUser;
    private javax.swing.JPasswordField passwordUser;
    // End of variables declaration//GEN-END:variables

    private void openDashboard(AccountNet acc) {
 MenuNet menu = new MenuNet(); // Gọi giao diện menu chính của bạn
    menu.setVisible(true);
    }
}
