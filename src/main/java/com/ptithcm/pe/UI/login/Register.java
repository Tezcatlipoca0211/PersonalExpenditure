/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.ptithcm.pe.UI.login;

import com.ptithcm.pe.dao.UserDAO;
import com.ptithcm.pe.model.User;
import com.ptithcm.pe.util.CheckValidated;
import com.ptithcm.pe.util.Constraints;
import com.ptithcm.pe.util.PasswordHashing;
import javax.swing.JOptionPane;

/**
 *
 * @author tezca
 */
public class Register extends javax.swing.JFrame {

    /**
     * Creates new form Register
     */
    public Register() {
        initComponents();
        setSize(625, 525);

        setDefaultCloseOperation(Login.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setExtendedState(Login.NORMAL);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitle = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        lblName = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        lblUsername = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        lblPassword = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        lblConfrm = new javax.swing.JLabel();
        txtConfirm = new javax.swing.JPasswordField();
        lblEmail = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        btnLogin = new javax.swing.JButton();
        btnRegister = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(625, 475));

        lblTitle.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(0, 102, 255));
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText(Constraints.REGISTER);
        lblTitle.setPreferredSize(new java.awt.Dimension(600, 50));

        lblName.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblName.setText("Họ và tên:");
        lblName.setPreferredSize(new java.awt.Dimension(125, 30));

        txtName.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtName.setPreferredSize(new java.awt.Dimension(325, 30));

        lblUsername.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblUsername.setText("Tên tài khoản:");
        lblUsername.setPreferredSize(new java.awt.Dimension(125, 30));

        txtUsername.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtUsername.setPreferredSize(new java.awt.Dimension(325, 30));

        lblPassword.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblPassword.setText("Mật khẩu:");
        lblPassword.setPreferredSize(new java.awt.Dimension(125, 30));

        txtPassword.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtPassword.setPreferredSize(new java.awt.Dimension(325, 30));

        lblConfrm.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblConfrm.setText("Xác nhận mật khẩu:");
        lblConfrm.setPreferredSize(new java.awt.Dimension(125, 30));

        txtConfirm.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtConfirm.setPreferredSize(new java.awt.Dimension(325, 30));

        lblEmail.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblEmail.setText("Email:");
        lblEmail.setPreferredSize(new java.awt.Dimension(125, 30));

        txtEmail.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtEmail.setPreferredSize(new java.awt.Dimension(325, 30));

        jLabel6.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel6.setText("Đã có tài khoản?");
        jLabel6.setPreferredSize(new java.awt.Dimension(95, 30));

        btnLogin.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icon_login20.png"))); // NOI18N
        btnLogin.setText("Đăng nhập");
        btnLogin.setPreferredSize(new java.awt.Dimension(125, 35));
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        btnRegister.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnRegister.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icon_register20.png"))); // NOI18N
        btnRegister.setText("Đăng ký");
        btnRegister.setPreferredSize(new java.awt.Dimension(125, 35));
        btnRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterActionPerformed(evt);
            }
        });

        btnExit.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icon_exit20.png"))); // NOI18N
        btnExit.setText("Thoát");
        btnExit.setPreferredSize(new java.awt.Dimension(125, 35));
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 612, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 1, Short.MAX_VALUE))
                            .addComponent(jSeparator1)))
                    .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lblEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lblConfrm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtConfirm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lblPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lblName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lblUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtUsername, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnRegister, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(111, 111, 111))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblConfrm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtConfirm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRegister, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        this.dispose();
        new Login().setVisible(true);
    }//GEN-LAST:event_btnLoginActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        if (JOptionPane.showConfirmDialog(this, "Bạn chắc chắn muốn thoát", "Xác nhận thoát", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION)
            System.exit(0);
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterActionPerformed
        String name = txtName.getText().toString().trim();
        String username = txtUsername.getText().toString().trim();
        String password = new String(txtPassword.getPassword());
        String confirm = new String(txtConfirm.getPassword());
        String email = txtEmail.getText().toString().trim();

        if (name.isEmpty()) {
            JOptionPane.showMessageDialog(this, Constraints.NAME_IS_EMPTY, Constraints.REGISTER_ERROR, JOptionPane.ERROR_MESSAGE);
        } else if (CheckValidated.checkNameOfUserValid(name) == false) {
            JOptionPane.showMessageDialog(this, Constraints.NAME_IS_INVALID, Constraints.REGISTER_ERROR, JOptionPane.ERROR_MESSAGE);
        } else if (username.isEmpty()) {
            JOptionPane.showMessageDialog(this, Constraints.USERNAME_IS_EMPTY, Constraints.REGISTER_ERROR, JOptionPane.ERROR_MESSAGE);
        } else if (username.length() < 6 || username.length() > 20) {
            JOptionPane.showMessageDialog(this, Constraints.USERNAME_IS_SHORT, Constraints.REGISTER_ERROR, JOptionPane.ERROR_MESSAGE);
        } else if (CheckValidated.checkUsernameValid(username) == false) {
            JOptionPane.showMessageDialog(this, Constraints.USERNAME_IS_INVALID, Constraints.REGISTER_ERROR, JOptionPane.ERROR_MESSAGE);
        } else if (UserDAO.getInstance().selectByUsername(username) != null) {
            JOptionPane.showMessageDialog(this, Constraints.USERNAME_IS_EXITS, Constraints.REGISTER_ERROR, JOptionPane.ERROR_MESSAGE);
        } else if (password.isEmpty()) {
            JOptionPane.showMessageDialog(this, Constraints.PASSWORD_IS_EMPTY, Constraints.REGISTER_ERROR, JOptionPane.ERROR_MESSAGE);
        } else if (password.length() < 6 || password.length() > 20) {
            JOptionPane.showMessageDialog(this, Constraints.PASSWORD_IS_SHORRT, Constraints.REGISTER_ERROR, JOptionPane.ERROR_MESSAGE);
        } else if (CheckValidated.checkPasswordValid(password) == false) {
            JOptionPane.showMessageDialog(this, Constraints.PASSWORD_IS_INVALID, Constraints.REGISTER_ERROR, JOptionPane.ERROR_MESSAGE);
        } else if (confirm.isEmpty()) {
            JOptionPane.showMessageDialog(this, Constraints.CONFIRM_PASSWORD_IS_EMPTY, Constraints.REGISTER_ERROR, JOptionPane.ERROR_MESSAGE);
        } else if (!password.equals(confirm)) {
            JOptionPane.showMessageDialog(this, Constraints.CONFIRM_PASSWORD_IS_INCORRECT, Constraints.REGISTER_ERROR, JOptionPane.ERROR_MESSAGE);
        } else if (email.isEmpty()) {
            JOptionPane.showMessageDialog(this, Constraints.EMAIL_IS_EMPTY, Constraints.REGISTER_ERROR, JOptionPane.ERROR_MESSAGE);
        } else if (email.length() > 255) {
            JOptionPane.showMessageDialog(this, Constraints.EMAIL_IS_LONG, Constraints.REGISTER_ERROR, JOptionPane.ERROR_MESSAGE);
        } else if (CheckValidated.checkEmailValid(email) == 1) {
            JOptionPane.showMessageDialog(this, Constraints.EMAIL_IS_SHORT, Constraints.REGISTER_ERROR, JOptionPane.ERROR_MESSAGE);
        } else if (CheckValidated.checkEmailValid(email) == 2) {
            JOptionPane.showMessageDialog(this, Constraints.EMAIL_IS_INVALID, Constraints.REGISTER_ERROR, JOptionPane.ERROR_MESSAGE);
        } else {
            if (JOptionPane.showConfirmDialog(this, "Bạn chắc chắn muốn đăng ký", "Xác nhận", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
                String hashPassword = PasswordHashing.toSha1(password);
                User user = new User(name, username, hashPassword, email);
                int result = UserDAO.getInstance().insert(user);
                if (result > 0) {
                    JOptionPane.showMessageDialog(this, Constraints.REGISTER_SUCCESS, Constraints.NOTIFY, result);
                } else {
                    JOptionPane.showMessageDialog(this, Constraints.REGISTER_ERROR, Constraints.NOTIFY, result);
                }
            }
        }


    }//GEN-LAST:event_btnRegisterActionPerformed

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
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Register().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton btnRegister;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lblConfrm;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JPasswordField txtConfirm;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtName;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
