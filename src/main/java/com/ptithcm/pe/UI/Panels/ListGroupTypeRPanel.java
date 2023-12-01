/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.ptithcm.pe.UI.Panels;

//import com.ptithcm.pe.UI.Dialogs.AddNewRevenuesTypeE;
import com.ptithcm.pe.UI.Dialogs.AddNewGroupTypeExp;
import com.ptithcm.pe.UI.Dialogs.AddNewGroupTypeRec;
import com.ptithcm.pe.util.TabbedPane;
import java.awt.Frame;
import javax.swing.SwingUtilities;

/**
 *
 * @author tezca
 */
public class ListGroupTypeRPanel extends javax.swing.JPanel {

    /**
     * Creates new form ListExpenditureTypePanel
     */
    public ListGroupTypeRPanel() {
        initComponents();
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
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbeData = new javax.swing.JTable();
        txtName = new javax.swing.JTextField();
        txtId = new javax.swing.JTextField();
        lblName = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnAdd = new javax.swing.JButton();
        btnRefresh = new javax.swing.JButton();

        setLayout(null);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 153));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText(com.ptithcm.pe.util.Constaint.TITLE_LIST_RECEIPT_TYPE);
        add(jLabel1);
        jLabel1.setBounds(0, 0, 820, 55);
        add(jSeparator1);
        jSeparator1.setBounds(0, 61, 826, 3);

        tbeData.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "ID", "Name"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tbeData);

        add(jScrollPane2);
        jScrollPane2.setBounds(70, 88, 750, 256);

        txtName.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtName.setPreferredSize(new java.awt.Dimension(350, 30));
        add(txtName);
        txtName.setBounds(160, 404, 300, 30);

        txtId.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtId.setPreferredSize(new java.awt.Dimension(120, 30));
        add(txtId);
        txtId.setBounds(160, 362, 110, 30);

        lblName.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblName.setText("Name:");
        add(lblName);
        lblName.setBounds(70, 410, 40, 17);

        jLabel3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel3.setText("ID:");
        add(jLabel3);
        jLabel3.setBounds(70, 368, 17, 17);

        btnAdd.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icon_add32.png"))); // NOI18N
        btnAdd.setText("Thêm mới");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        add(btnAdd);
        btnAdd.setBounds(540, 360, 129, 42);

        btnRefresh.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnRefresh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icon_refresh32.png"))); // NOI18N
        btnRefresh.setText("Làm mới");
        add(btnRefresh);
        btnRefresh.setBounds(690, 360, 130, 42);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        AddNewGroupTypeRec addNewRevenuesTypeR = new AddNewGroupTypeRec((Frame) SwingUtilities.getWindowAncestor(this), true);
        addNewRevenuesTypeR.setSize(500, 300);
        addNewRevenuesTypeR.setLocationRelativeTo(null);
        addNewRevenuesTypeR.setVisible(true);
    }//GEN-LAST:event_btnAddActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnRefresh;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblName;
    private javax.swing.JTable tbeData;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtName;
    // End of variables declaration//GEN-END:variables
}
