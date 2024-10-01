/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.aldrin.billing.gui.panel;

import com.aldrin.billing.dao.impl.UserDAOImpl;
import com.aldrin.billing.gui.JFrameApp;
import com.aldrin.billing.gui.dialog.au.JDialogUserAU;
import com.aldrin.billing.model.Role;
import com.aldrin.billing.model.User;
import com.formdev.flatlaf.FlatClientProperties;
import com.formdev.flatlaf.extras.FlatSVGIcon;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author Java Programming with Aldrin
 */
public class JPanelUser extends javax.swing.JPanel implements MouseListener {

    /**
     * Creates new form JPanelContent
     */
    private JFrameApp jFrameApp;
    private Role role;
    private User user;

    public JPanelUser(JFrameApp jFrameApp) {
        initComponents();
//        this.jFrameApp = jFrameCafSys;
        initComponents();
        this.jFrameApp =jFrameApp;
        setTable();
        selectUserAccount();
        jTextFieldSearch.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "Search");
        //icon
        jTextFieldSearch.putClientProperty(FlatClientProperties.TEXT_FIELD_LEADING_ICON, new FlatSVGIcon("svg/search.svg", 24, 24));
        jButtonUpdate.setEnabled(false);
        jTtableUser.putClientProperty("JTable.showHorizontalLines", false);
        jTtableUser.putClientProperty("JTable.showVerticalLines", false);
        jTtableUser.putClientProperty("JTable.intercellSpacing", new Dimension(10, 2));
        jTtableUser.putClientProperty("JTable.font", new Font("Arial", Font.PLAIN, 14));
        jTtableUser.putClientProperty("JTable.selectionBackground", new Color(135, 206, 250));  // Light sky blue
        jTtableUser.putClientProperty("JTable.selectionForeground", Color.BLACK);
        jTtableUser.putClientProperty("JTable.alternateRowColor", new Color(240, 240, 240));
    }
    


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jAPanel1 = new com.aldrin.billing.util.JAPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTtableUser = new javax.swing.JTable();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jButtonNew = new javax.swing.JButton();
        jButtonUpdate = new javax.swing.JButton();
        jPanel10 = new javax.swing.JPanel();
        jTextFieldSearch = new javax.swing.JTextField();
        jPanel12 = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();

        setLayout(new java.awt.BorderLayout());

        jPanel1.setOpaque(false);
        jPanel1.setLayout(new java.awt.BorderLayout());

        jPanel4.setOpaque(false);
        jPanel4.setPreferredSize(new java.awt.Dimension(940, 40));
        jPanel4.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 20, 10));

        jLabel2.setText("Users");
        jPanel4.add(jLabel2);

        jPanel1.add(jPanel4, java.awt.BorderLayout.NORTH);

        jAPanel1.setLayout(new java.awt.BorderLayout());

        jPanel2.setOpaque(false);
        jPanel2.setLayout(new java.awt.BorderLayout());

        jPanel5.setOpaque(false);
        jPanel5.setLayout(new java.awt.BorderLayout());

        jTtableUser.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTtableUser);

        jPanel5.add(jScrollPane1, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel5, java.awt.BorderLayout.CENTER);

        jPanel6.setOpaque(false);
        jPanel6.setPreferredSize(new java.awt.Dimension(10, 425));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 349, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel6, java.awt.BorderLayout.WEST);

        jPanel7.setOpaque(false);
        jPanel7.setPreferredSize(new java.awt.Dimension(10, 425));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 349, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel7, java.awt.BorderLayout.EAST);

        jPanel8.setOpaque(false);
        jPanel8.setPreferredSize(new java.awt.Dimension(886, 10));

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 947, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel8, java.awt.BorderLayout.SOUTH);

        jAPanel1.add(jPanel2, java.awt.BorderLayout.CENTER);

        jPanel3.setOpaque(false);
        jPanel3.setPreferredSize(new java.awt.Dimension(886, 50));
        jPanel3.setLayout(new java.awt.BorderLayout());

        jPanel9.setOpaque(false);
        jPanel9.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.RIGHT, 10, 10));

        jButtonNew.setIcon(new FlatSVGIcon("svg/plus.svg",24,24));
        jButtonNew.setText("Add");
        jButtonNew.setMargin(new java.awt.Insets(2, 2, 3, 2));
        jButtonNew.setPreferredSize(new java.awt.Dimension(90, 30));
        jButtonNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNewActionPerformed(evt);
            }
        });
        jPanel9.add(jButtonNew);

        jButtonUpdate.setIcon(new FlatSVGIcon("svg/edit.svg",24,24));
        jButtonUpdate.setText("Update");
        jButtonUpdate.setMargin(new java.awt.Insets(2, 2, 3, 2));
        jButtonUpdate.setPreferredSize(new java.awt.Dimension(90, 30));
        jButtonUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonUpdateActionPerformed(evt);
            }
        });
        jPanel9.add(jButtonUpdate);

        jPanel3.add(jPanel9, java.awt.BorderLayout.CENTER);

        jPanel10.setOpaque(false);
        jPanel10.setPreferredSize(new java.awt.Dimension(300, 50));
        jPanel10.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 10, 10));

        jTextFieldSearch.setPreferredSize(new java.awt.Dimension(250, 30));
        jTextFieldSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldSearchKeyReleased(evt);
            }
        });
        jPanel10.add(jTextFieldSearch);

        jPanel3.add(jPanel10, java.awt.BorderLayout.WEST);

        jAPanel1.add(jPanel3, java.awt.BorderLayout.NORTH);

        jPanel1.add(jAPanel1, java.awt.BorderLayout.CENTER);

        jPanel12.setOpaque(false);
        jPanel1.add(jPanel12, java.awt.BorderLayout.LINE_END);

        jPanel13.setOpaque(false);
        jPanel1.add(jPanel13, java.awt.BorderLayout.LINE_START);

        add(jPanel1, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNewActionPerformed
        JDialogUserAU roleAU = new JDialogUserAU(jFrameApp, true);
        roleAU.setVisible(true);
        selectUserAccount();
    }//GEN-LAST:event_jButtonNewActionPerformed

    private void jButtonUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUpdateActionPerformed
        JDialogUserAU roleAU = new JDialogUserAU(jFrameApp, true, user, "Update");
        roleAU.setVisible(true);
        selectUserAccount();
        jButtonUpdate.setEnabled(false);
    }//GEN-LAST:event_jButtonUpdateActionPerformed

    private void jTextFieldSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldSearchKeyReleased
        String text = jTextFieldSearch.getText().trim();
        if (text.length() == 0) {
            sorter.setRowFilter(null);
        } else {
            sorter.setRowFilter(RowFilter.regexFilter("(?i)" + text + ",*"));
        }
    }//GEN-LAST:event_jTextFieldSearchKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.aldrin.billing.util.JAPanel jAPanel1;
    private javax.swing.JButton jButtonNew;
    private javax.swing.JButton jButtonUpdate;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextFieldSearch;
    private javax.swing.JTable jTtableUser;
    // End of variables declaration//GEN-END:variables

    public DefaultTableModel tableModel = new DefaultTableModel(new Object[]{"ID", "ROLE ID", "FIRST NAME", "SURNAME", "ROLE", "USERNAME", "PASSWORD", "ACTIVE"}, 0) {
        public Class getColumnClass(int columnIndex) {
            if (columnIndex == 0) {
                return String.class;
            }
            switch (columnIndex) {
                case 1:
                    return String.class;
                case 2:
                    return String.class;
                case 4:
                    return String.class;
                case 5:
                    return String.class;
                case 6:
                    return String.class;
                case 7:
                    return Boolean.class;
                default:
                    return String.class;
            }
        }

        public boolean isCellEditable(int row, int col) {
            if (col < 10) {
                return false;

            } else {
                return true;
            }
        }
    };
    private TableRowSorter<TableModel> sorter = new TableRowSorter<TableModel>(tableModel);

    private void setTable() {
        jTtableUser.setCellSelectionEnabled(true);
        jTtableUser = new JTable(tableModel);
        jScrollPane1.setViewportView(jTtableUser);
        jTtableUser.addMouseListener(this);
        jTtableUser.setRowSorter(sorter);
        TableColumn hide0 = jTtableUser.getColumnModel().getColumn(0);
        hide0.setMinWidth(0);
        hide0.setMaxWidth(0);
        hide0.setPreferredWidth(0);
        TableColumn hide1 = jTtableUser.getColumnModel().getColumn(1);
        hide1.setMinWidth(0);
        hide1.setMaxWidth(0);
        hide1.setPreferredWidth(0);
        TableColumn hide2 = jTtableUser.getColumnModel().getColumn(6);
        hide2.setMinWidth(0);
        hide2.setMaxWidth(0);
        hide2.setPreferredWidth(0);

    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if (e.getSource() == jTtableUser) {
            if (e.getButton() == MouseEvent.BUTTON1) {
                if (e.getClickCount() == 1) {
                    int row = jTtableUser.getSelectedRow();
//                    Boolean selectedCol = (Boolean) jTableUser.getValueAt(row, 7);
//                    if (selectedCol == true) {
//                        jTableUser.setValueAt(false, row, 7);
//                    } else {
//                        jTableUser.setValueAt(true, row, 7);
//                    }
                    if (row != -1) {
                        //"ID", "ROLE ID", "FIRST NAME", "SURNAME", "ROLE", "USERNAME", "PASSWORD", "ACTIVE"
                        Long id = Long.parseLong(jTtableUser.getValueAt(row, 0).toString());
                        Long roleId = Long.parseLong(jTtableUser.getValueAt(row, 1).toString());
                        String firstname = jTtableUser.getValueAt(row, 2).toString();
                        String surname = jTtableUser.getValueAt(row, 3).toString();
                        String role = jTtableUser.getValueAt(row, 4).toString();
                        String username = jTtableUser.getValueAt(row, 5).toString();
                        String password = jTtableUser.getValueAt(row, 6).toString();
                        Boolean active = Boolean.parseBoolean(jTtableUser.getValueAt(row, 7).toString());
                        User ua = new User();
                        Role r = new Role();
                        r.setId(roleId);
                        ua.setId(id);
                        ua.setRole(r);
                        ua.setFirstname(firstname);
                        ua.setSurname(surname);
                        ua.setUsername(username);
                        ua.setPassword(password);
                        if(active ==true){
                           ua.setInActiveAt(null); 
                        }else{
                           ua.setInActiveAt(new Timestamp(new Date().getTime())); 
                        }
                        
                        User uat = studentDAOImpl.findPhotoByUserId(ua);
                        ua.setPhoto(uat.getPhoto());
                        this.user = ua;
                        jButtonUpdate.setEnabled(true);
                    }

                }
            }
        }

    }

    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }

    private UserDAOImpl studentDAOImpl = new UserDAOImpl();
    private ArrayList<User> userAccountList;
    String pattern = "MMM. dd, yyyy";
    SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
//"ID", "ROLE ID", "FIRST NAME", "SURNAME", "ROLE", "USERNAME", "PASSWORD", "ACTIVE"

    private void selectUserAccount() {
        tableModel.setRowCount(0);
        userAccountList = studentDAOImpl.selectUser();
        tableModel.setRowCount(0);
        for (User u : userAccountList) {
            boolean active;
            if(u.getInActiveAt()==null){
                active =true;
            }else{
                active =false;
            }
            tableModel.addRow(new Object[]{u.getId(), u.getRole().getId(), u.getFirstname(), u.getSurname(), u.getRole().getRole(), u.getUsername(), u.getPassword(), active});
        }
    }
    
    
    public JButton getNewUserButton() {
        return jButtonNew;
    }

}