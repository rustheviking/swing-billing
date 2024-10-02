/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.aldrin.billing.gui.panel;

import com.aldrin.billing.dao.impl.BillingDataDAOImpl;
import com.aldrin.billing.gui.JFrameApp;
import com.aldrin.billing.gui.dialog.au.JDialogBillingAU;
import com.aldrin.billing.gui.dialog.au.JDialogViewBillingDetails;
import com.aldrin.billing.model.Customer;
import com.aldrin.billing.model.Product;
import com.aldrin.billing.model.User;
import com.aldrin.billing.util.LoginUser;
import com.formdev.flatlaf.FlatClientProperties;
import com.formdev.flatlaf.extras.FlatSVGIcon;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;
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
public class JPanelBilling extends javax.swing.JPanel implements MouseListener {

    /**
     * Creates new form JPanelBilling
     */
    private JFrameApp jFrameApp;
    private DecimalFormat df = new DecimalFormat("##,##0.00");

    public JPanelBilling(JFrameApp jFrameApp) {
        initComponents();
        this.jFrameApp = jFrameApp;
        setTable();
        jTextFieldSearch.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "Search");
        jTextFieldSearch.putClientProperty(FlatClientProperties.TEXT_FIELD_LEADING_ICON, new FlatSVGIcon("svg/search.svg", 24, 24));
        selectBillingData();
        addPopupMenu();
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
        jTableProduct = new javax.swing.JTable();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jButtonNew = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jTextFieldSearch = new javax.swing.JTextField();
        jPanel11 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jPanel14 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jComboBoxFilter = new javax.swing.JComboBox<>();
        jPanel12 = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();

        setLayout(new java.awt.BorderLayout());

        jPanel1.setOpaque(false);
        jPanel1.setLayout(new java.awt.BorderLayout());

        jPanel4.setOpaque(false);
        jPanel4.setPreferredSize(new java.awt.Dimension(940, 40));
        jPanel4.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 20, 10));

        jLabel2.setText("Billing");
        jPanel4.add(jLabel2);

        jPanel1.add(jPanel4, java.awt.BorderLayout.NORTH);

        jAPanel1.setLayout(new java.awt.BorderLayout());

        jPanel2.setOpaque(false);
        jPanel2.setLayout(new java.awt.BorderLayout());

        jPanel5.setOpaque(false);
        jPanel5.setLayout(new java.awt.BorderLayout());

        jTableProduct.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTableProduct);

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
            .addGap(0, 299, Short.MAX_VALUE)
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
            .addGap(0, 299, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel7, java.awt.BorderLayout.EAST);

        jPanel8.setOpaque(false);
        jPanel8.setPreferredSize(new java.awt.Dimension(886, 60));
        jPanel8.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 10, 5));

        jButtonNew.setIcon(new FlatSVGIcon("svg/plus.svg",24,24));
        jButtonNew.setText("<html><center>Create<br><h4 style=\"color:red; padding:0; margin:0;\">Billing</h4></center></html>");
        jButtonNew.setMargin(new java.awt.Insets(2, 2, 3, 2));
        jButtonNew.setPreferredSize(new java.awt.Dimension(90, 40));
        jButtonNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNewActionPerformed(evt);
            }
        });
        jPanel8.add(jButtonNew);

        jPanel2.add(jPanel8, java.awt.BorderLayout.SOUTH);

        jAPanel1.add(jPanel2, java.awt.BorderLayout.CENTER);

        jPanel3.setOpaque(false);
        jPanel3.setPreferredSize(new java.awt.Dimension(886, 50));
        jPanel3.setLayout(new java.awt.BorderLayout());

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

        jPanel11.setLayout(new java.awt.BorderLayout());

        jPanel9.setOpaque(false);
        jPanel9.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.RIGHT, 10, 5));
        jPanel11.add(jPanel9, java.awt.BorderLayout.CENTER);

        jPanel14.setPreferredSize(new java.awt.Dimension(200, 50));
        jPanel14.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 5, 10));

        jLabel1.setText("Filter:");
        jLabel1.setPreferredSize(new java.awt.Dimension(37, 30));
        jPanel14.add(jLabel1);

        jComboBoxFilter.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Today", "Yesterday", "Week", "Month", "All Time" }));
        jComboBoxFilter.setMinimumSize(new java.awt.Dimension(95, 22));
        jComboBoxFilter.setPreferredSize(new java.awt.Dimension(130, 30));
        jComboBoxFilter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxFilterActionPerformed(evt);
            }
        });
        jPanel14.add(jComboBoxFilter);

        jPanel11.add(jPanel14, java.awt.BorderLayout.WEST);

        jPanel3.add(jPanel11, java.awt.BorderLayout.CENTER);

        jAPanel1.add(jPanel3, java.awt.BorderLayout.NORTH);

        jPanel1.add(jAPanel1, java.awt.BorderLayout.CENTER);

        jPanel12.setOpaque(false);
        jPanel1.add(jPanel12, java.awt.BorderLayout.LINE_END);

        jPanel13.setOpaque(false);
        jPanel1.add(jPanel13, java.awt.BorderLayout.LINE_START);

        add(jPanel1, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNewActionPerformed
        JDialogBillingAU productAU = new JDialogBillingAU(jFrameApp, true);
        productAU.setVisible(true);
        selectBillingData();

    }//GEN-LAST:event_jButtonNewActionPerformed

    private void jTextFieldSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldSearchKeyReleased
        String text = jTextFieldSearch.getText().trim();
        if (text.length() == 0) {
            sorter.setRowFilter(null);
        } else {
            sorter.setRowFilter(RowFilter.regexFilter("(?i)" + text + ",*"));
        }
    }//GEN-LAST:event_jTextFieldSearchKeyReleased

    private void jComboBoxFilterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxFilterActionPerformed
        selectBillingData();
    }//GEN-LAST:event_jComboBoxFilterActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.aldrin.billing.util.JAPanel jAPanel1;
    private javax.swing.JButton jButtonNew;
    private javax.swing.JComboBox<String> jComboBoxFilter;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableProduct;
    private javax.swing.JTextField jTextFieldSearch;
    // End of variables declaration//GEN-END:variables

    public DefaultTableModel tableModel = new DefaultTableModel(new Object[]{"INVOICE ID", "DATE/TIME", "USER", "CUSTOMER", "PAYMENT METHOD", "AMOUNT", "DATE/TIME UF"}, 0) {
        public Class getColumnClass(int columnIndex) {
            if (columnIndex == 0) {
                return Object.class;
            }
            switch (columnIndex) {
                case 1:
                    return String.class;
                case 2:
                    return String.class;
                case 3:
                    return String.class;
                case 4:
                    return String.class;
                case 5:
                    return Integer.class;
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

        jTableProduct.setCellSelectionEnabled(true);
        jTableProduct = new JTable(tableModel);
        jScrollPane1.setViewportView(jTableProduct);
        jTableProduct.setGridColor(Color.red);
        jTableProduct.addMouseListener(this);
        jTableProduct.setRowSorter(sorter);
        TableColumn[] column = new TableColumn[100];

        column[0] = jTableProduct.getColumnModel().getColumn(0);
        column[0].setPreferredWidth(60);

        column[1] = jTableProduct.getColumnModel().getColumn(1);
        column[1].setPreferredWidth(100);

        column[2] = jTableProduct.getColumnModel().getColumn(2);
        column[2].setPreferredWidth(100);

        column[3] = jTableProduct.getColumnModel().getColumn(3);
        column[3].setPreferredWidth(100);

        TableColumn hide1 = jTableProduct.getColumnModel().getColumn(6);
        hide1.setMinWidth(0);
        hide1.setMaxWidth(0);
        hide1.setPreferredWidth(0);

    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if (e.getSource() == jTableProduct) {
            if (e.getButton() == MouseEvent.BUTTON1) {
                if (e.getClickCount() == 1) {
                    int row = jTableProduct.getSelectedRow();

                    if (row != -1) {
                        //"ID", "PRODUCT","DESCRIPTION","PRICE"
                        Long id = Long.parseLong(jTableProduct.getValueAt(row, 0).toString());
                        String product = jTableProduct.getValueAt(row, 1).toString();
                        String description = jTableProduct.getValueAt(row, 2).toString();
                        Product p = new Product();
                        p.setProductId(id);
                        p.setProduct(product);
                        p.setDescription(description);

//                        this.product = p;
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

    private BillingDataDAOImpl billingDataDAOImpl = new BillingDataDAOImpl();
    private ArrayList<BillingData> billingDataList;
//    String pattern = "MMM. dd, yyyy";
    String pattern = "MMM. dd, yyyy hh:mm a";
    SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
//    "INVOICE ID", "DATE/TIME", "USER", "CUSTOMER","PAYMENT METHOD","AMOUNT"

    private void selectBillingData() {
        tableModel.setRowCount(0);
        if (new LoginUser().getUser().getRole().getRole().equals("ADMIN")) {
            if (jComboBoxFilter.getSelectedIndex() == 0) {//today
                billingDataList = billingDataDAOImpl.selectBillingDataByToday();
            } else if (jComboBoxFilter.getSelectedIndex() == 1) { //yesterday
                billingDataList = billingDataDAOImpl.selectBillingDataByYesterday();
            } else if (jComboBoxFilter.getSelectedIndex() == 2) { //week
                billingDataList = billingDataDAOImpl.selectBillingDataByCurrentWeek();
            } else if (jComboBoxFilter.getSelectedIndex() == 3) { //current month
                billingDataList = billingDataDAOImpl.selectBillingDataByCurrentMonth();
            } else if (jComboBoxFilter.getSelectedIndex() == 4) {//all time
                billingDataList = billingDataDAOImpl.selectBillingData();
            }
        } else {
            if (jComboBoxFilter.getSelectedIndex() == 0) {//today
                billingDataList = billingDataDAOImpl.selectBillingDataByTodayUser();
            } else if (jComboBoxFilter.getSelectedIndex() == 1) { //yesterday
                billingDataList = billingDataDAOImpl.selectBillingDataByYesterdayUser();
            } else if (jComboBoxFilter.getSelectedIndex() == 2) { //week
                billingDataList = billingDataDAOImpl.selectBillingDataByCurrentWeekUser();
            } else if (jComboBoxFilter.getSelectedIndex() == 3) { //current month
                billingDataList = billingDataDAOImpl.selectBillingDataByCurrentMonthUser();
            } else if (jComboBoxFilter.getSelectedIndex() == 4) {//all time
                billingDataList = billingDataDAOImpl.selectBillingDataUser();
            }
        }

        tableModel.setRowCount(0);
        for (BillingData c : billingDataList) {
            tableModel.addRow(new Object[]{c.getInvoice().getInvoiceId(), c.getFormattedDate(), c.getUser().getSurname() + ", " + c.getUser().getFirstname(), c.getCustomer().getLastName() + ", " + c.getCustomer().getFirstName(), c.getPayment().getMethod(), df.format(c.getInvoice().getTotalAmount()), c.getInvoice().getCreatedAt()});
        }
    }

    // Create popup menu
    JPopupMenu popupMenu = new JPopupMenu();

    // Create menu items
    JMenuItem itemViewBillingDetails = new JMenuItem("View billing details");
    JMenuItem itemUpdateBilling = new JMenuItem("Update billing");

    public void addPopupMenu() {
        itemViewBillingDetails.setIcon(new FlatSVGIcon("svg/search.svg", 24, 24));
        itemUpdateBilling.setIcon(new FlatSVGIcon("svg/edit.svg", 24, 24));
        itemViewBillingDetails.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int selectedRow = jTableProduct.getSelectedRow();
                if (selectedRow != -1) {
                    Long invoiceID = (Long) jTableProduct.getValueAt(selectedRow, 0);
                    System.err.println("invoiceID:" + invoiceID);
//                    "INVOICE ID", "DATE/TIME", "USER", "CUSTOMER","PAYMENT METHOD","AMOUNT"

                    BillingData bd = new BillingData();
                    User u = new User();
                    Customer c = new Customer();
                    String dateTime = String.valueOf(jTableProduct.getValueAt(selectedRow, 1));
                    String user = String.valueOf(jTableProduct.getValueAt(selectedRow, 2));
                    String customer = String.valueOf(jTableProduct.getValueAt(selectedRow, 3));

                    u.setSurname(user);
                    c.setLastName(customer);
                    bd.setFormattedDate(dateTime);
                    bd.setCustomer(c);
                    bd.setUser(u);

                    JDialogViewBillingDetails view = new JDialogViewBillingDetails(jFrameApp, true, invoiceID, bd);
                    view.setVisible(true);

                }
            }
        });

        itemUpdateBilling.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int selectedRow = jTableProduct.getSelectedRow();
                if (selectedRow != -1) {
//                    DefaultTableModel model = (DefaultTableModel) jTableProduct.getModel();
//                    model.removeRow(selectedRow);
//                    String product = jTableProduct.getValueAt(0, 2).toString();
                    if (tableModel.getRowCount() == 0) {
                        return;
                    }

                }
                if (tableModel.getRowCount() == 0) {
                }
            }
        });

        // Add menu items to the popup menu
        popupMenu.add(itemViewBillingDetails);
        popupMenu.add(itemUpdateBilling);

        // Add action listeners to the menu items
        // Add mouse listener to the table
        jTableProduct.addMouseListener(new MouseAdapter() {

            public void mousePressed(MouseEvent e) {
                if (e.isPopupTrigger()) {
                    showPopup(e);
                }
            }

            public void mouseReleased(MouseEvent e) {
                if (e.isPopupTrigger()) {
                    showPopup(e);
                }
            }

            private void showPopup(MouseEvent e) {
                int row = jTableProduct.rowAtPoint(e.getPoint());
                int column = jTableProduct.columnAtPoint(e.getPoint());
                if (!jTableProduct.isRowSelected(row)) {
                    jTableProduct.changeSelection(row, column, false, false);
                }
                String product = jTableProduct.getValueAt(row, column).toString();
                if (product.toString().equals(" ") || product.toString().equals("Grand Total")) {
                    return;
                } else {
                    popupMenu.show(e.getComponent(), e.getX(), e.getY());
                }

            }
        });
    }

}
