/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package com.aldrin.billing.gui;

import com.aldrin.billing.MassageBilling;
import com.aldrin.billing.dao.impl.UserDAOImpl;
import com.aldrin.billing.model.User;
import com.aldrin.billing.util.LoginUser;
import com.formdev.flatlaf.FlatClientProperties;
import com.formdev.flatlaf.extras.FlatSVGIcon;
import java.awt.Font;
import java.awt.event.KeyEvent;
import java.io.File;
import java.util.prefs.Preferences;

/**
 *
 * @author Java Programming with Aldrin
 */
public class JDialogLogin extends javax.swing.JDialog {

    /**
     * Creates new form JDialogLogin
     */
    private static final String USERNAME_PREF_KEY = "username";
    private static final String PASSWORD_PREF_KEY = "password";
    Preferences preferences = Preferences.userNodeForPackage(MassageBilling.class);

    public JDialogLogin(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();

        // Check if username and password are stored in preferences
        jTextFieldUsername.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "Username");
        jPasswordFieldPassword.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "Password");

        //clear button
        jTextFieldUsername.putClientProperty(FlatClientProperties.TEXT_FIELD_SHOW_CLEAR_BUTTON, true);

        //reveal button
        jPasswordFieldPassword.putClientProperty(FlatClientProperties.STYLE, "showRevealButton:true;" + "showCapsLock:true");

        try {
            File fontStyle = new File("src/main/resources/fonts/TitanOne-Regular.ttf");
            Font font = Font.createFont(Font.TRUETYPE_FONT, fontStyle);
            jLabelTitle.setFont(font.deriveFont(38f));
//            jButtonLogin.setFont(font.deriveFont(16f));
        } catch (Exception e) {
            e.printStackTrace();
        }
        jButtonLogin.setIcon(new FlatSVGIcon("svg/login.svg",20,20));

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTextFieldUsername = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jPasswordFieldPassword = new javax.swing.JPasswordField();
        jCheckBoxRememberMe = new javax.swing.JCheckBox();
        jLabelErrorMessage = new javax.swing.JLabel();
        jLabelTitle = new javax.swing.JLabel();
        jButtonLogin = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Login");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setText("PASSWORD");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 140, 320, -1));

        jTextFieldUsername.setPreferredSize(new java.awt.Dimension(64, 28));
        getContentPane().add(jTextFieldUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 105, 320, -1));

        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("LOG IN WITH USERNAME");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 90, 320, -1));

        jPasswordFieldPassword.setMinimumSize(new java.awt.Dimension(64, 28));
        jPasswordFieldPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jPasswordFieldPasswordKeyPressed(evt);
            }
        });
        getContentPane().add(jPasswordFieldPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 155, 320, 28));

        jCheckBoxRememberMe.setForeground(new java.awt.Color(102, 102, 102));
        jCheckBoxRememberMe.setText("Remember me");
        getContentPane().add(jCheckBoxRememberMe, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 190, 320, 30));

        jLabelErrorMessage.setForeground(new java.awt.Color(204, 0, 0));
        jLabelErrorMessage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelErrorMessage.setPreferredSize(new java.awt.Dimension(0, 16));
        getContentPane().add(jLabelErrorMessage, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 60, 320, 20));

        jLabelTitle.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabelTitle.setForeground(new java.awt.Color(0, 102, 153));
        jLabelTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTitle.setText("Login");
        jLabelTitle.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        getContentPane().add(jLabelTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(7, 0, 320, 40));

        jButtonLogin.setForeground(new java.awt.Color(102, 102, 102));
        jButtonLogin.setText("Login");
        jButtonLogin.setPreferredSize(new java.awt.Dimension(71, 32));
        jButtonLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLoginActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 230, 320, -1));

        setSize(new java.awt.Dimension(348, 315));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jPasswordFieldPasswordKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPasswordFieldPasswordKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            login();
        }
    }//GEN-LAST:event_jPasswordFieldPasswordKeyPressed

    private void jButtonLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLoginActionPerformed
        login();
    }//GEN-LAST:event_jButtonLoginActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonLogin;
    private javax.swing.JCheckBox jCheckBoxRememberMe;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelErrorMessage;
    private javax.swing.JLabel jLabelTitle;
    private javax.swing.JPasswordField jPasswordFieldPassword;
    private javax.swing.JTextField jTextFieldUsername;
    // End of variables declaration//GEN-END:variables
    private UserDAOImpl userDAOImpl = new UserDAOImpl();

    private void login() {
        String username = jTextFieldUsername.getText();
        String password = new String(jPasswordFieldPassword.getPassword());
        boolean remember = jCheckBoxRememberMe.isSelected();

        // Validate login
        User user = new User();
        String storedUsername = preferences.get(USERNAME_PREF_KEY, null);
        String storedPassword = preferences.get(PASSWORD_PREF_KEY, null);
        user.setUsername(storedUsername);
        if (storedPassword == null) {
            user.setUsername(jTextFieldUsername.getText());
            user.setPassword(jPasswordFieldPassword.getText());
            if (userDAOImpl.loginUser(user) != null) {
                if (remember) {
                    preferences.put(USERNAME_PREF_KEY, username);
                    preferences.put(PASSWORD_PREF_KEY, password);
                }
                dispose();
            } else {
                jLabelErrorMessage.setText("Please check your username and password and try again.");
                jTextFieldUsername.putClientProperty("JComponent.outline", "error");
                jPasswordFieldPassword.putClientProperty("JComponent.outline", "error");
            }
        } else {
            user.setPassword(storedPassword);
            if (userDAOImpl.loginUser(user) != null) {
                LoginUser logInUser = new LoginUser();
                user = userDAOImpl.loginUser(user);
                logInUser.setUser(user);
                dispose();
                // login for jdialog
            }
        }
    }

}