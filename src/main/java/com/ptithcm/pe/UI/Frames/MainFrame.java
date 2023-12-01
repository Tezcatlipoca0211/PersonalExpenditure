/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.ptithcm.pe.UI.Frames;

import com.ptithcm.pe.util.*;
import com.ptithcm.pe.UI.Panels.ListRevenuesTypeEPanel;
import com.ptithcm.pe.UI.Panels.ListGroupTypeEPanel;
import com.ptithcm.pe.UI.Panels.ListGroupTypeRPanel;
import com.ptithcm.pe.UI.Panels.ListRevenuesTypeRPanel;
import javax.swing.*;

/**
 *
 * @author tezca
 */
public class MainFrame extends javax.swing.JFrame {

    /**
     * Creates new form Main
     */
    public MainFrame() {
        initComponents();
        setSize(1600, 900);
        setDefaultCloseOperation(MainFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setExtendedState(MainFrame.NORMAL);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToolBar1 = new javax.swing.JToolBar();
        btnRevenuesTypeE = new javax.swing.JButton();
        btnListGroupTypeE = new javax.swing.JButton();
        jSeparator6 = new javax.swing.JToolBar.Separator();
        btnAddReceipt = new javax.swing.JButton();
        btnListReceipt = new javax.swing.JButton();
        jSeparator7 = new javax.swing.JToolBar.Separator();
        btnStatistic = new javax.swing.JButton();
        jSeparator4 = new javax.swing.JToolBar.Separator();
        btnCloseTab = new javax.swing.JButton();
        tabbedPane = new javax.swing.JTabbedPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuFile = new javax.swing.JMenu();
        mniLogin = new javax.swing.JMenuItem();
        mniLogout = new javax.swing.JMenuItem();
        jSeparator5 = new javax.swing.JPopupMenu.Separator();
        mniExit = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        mniListRevenuesTypeE = new javax.swing.JMenuItem();
        mniListGroupTypeE = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        mniListRevenuesTypeR = new javax.swing.JMenuItem();
        mniListGroupTypeR = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        mniStatistics = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenuItem2 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle(com.ptithcm.pe.util.Constaint.TITLE_MAIN);

        jToolBar1.setRollover(true);

        btnRevenuesTypeE.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        btnRevenuesTypeE.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icon_payment32.png"))); // NOI18N
        btnRevenuesTypeE.setText(com.ptithcm.pe.util.Constaint.TITLE_LIST_EXPENDITURE);
        btnRevenuesTypeE.setFocusable(false);
        btnRevenuesTypeE.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnRevenuesTypeE.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnRevenuesTypeE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRevenuesTypeEActionPerformed(evt);
            }
        });
        jToolBar1.add(btnRevenuesTypeE);

        btnListGroupTypeE.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        btnListGroupTypeE.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icon_list32.png"))); // NOI18N
        btnListGroupTypeE.setText(com.ptithcm.pe.util.Constaint.TITLE_LIST_EXPENDITURE_TYPE);
        btnListGroupTypeE.setFocusable(false);
        btnListGroupTypeE.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnListGroupTypeE.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnListGroupTypeE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListGroupTypeEActionPerformed(evt);
            }
        });
        jToolBar1.add(btnListGroupTypeE);
        jToolBar1.add(jSeparator6);

        btnAddReceipt.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        btnAddReceipt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icon_receipt32.png"))); // NOI18N
        btnAddReceipt.setText(com.ptithcm.pe.util.Constaint.TITLE_LIST_RECEIPT);
        btnAddReceipt.setFocusable(false);
        btnAddReceipt.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAddReceipt.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnAddReceipt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddReceiptActionPerformed(evt);
            }
        });
        jToolBar1.add(btnAddReceipt);

        btnListReceipt.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        btnListReceipt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icon_addRec32.png"))); // NOI18N
        btnListReceipt.setText(com.ptithcm.pe.util.Constaint.TITLE_LIST_RECEIPT_TYPE);
        btnListReceipt.setFocusable(false);
        btnListReceipt.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnListReceipt.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnListReceipt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListReceiptActionPerformed(evt);
            }
        });
        jToolBar1.add(btnListReceipt);
        jToolBar1.add(jSeparator7);

        btnStatistic.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnStatistic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icon_statistic32.png"))); // NOI18N
        btnStatistic.setText(com.ptithcm.pe.util.Constaint.STATISTICS);
        btnStatistic.setFocusable(false);
        btnStatistic.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnStatistic.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(btnStatistic);
        jToolBar1.add(jSeparator4);

        btnCloseTab.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        btnCloseTab.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icon_close32.png"))); // NOI18N
        btnCloseTab.setText(com.ptithcm.pe.util.Constaint.CLOSE_WINDOWS);
        btnCloseTab.setFocusable(false);
        btnCloseTab.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCloseTab.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnCloseTab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseTabActionPerformed(evt);
            }
        });
        jToolBar1.add(btnCloseTab);

        tabbedPane.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        jMenuBar1.setPreferredSize(new java.awt.Dimension(80, 30));

        menuFile.setText("File");
        menuFile.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        mniLogin.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        mniLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icon_login20.png"))); // NOI18N
        mniLogin.setText("Login");
        menuFile.add(mniLogin);

        mniLogout.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        mniLogout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icon_logout.png"))); // NOI18N
        mniLogout.setText("Logout");
        menuFile.add(mniLogout);
        menuFile.add(jSeparator5);

        mniExit.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_DOWN_MASK));
        mniExit.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        mniExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icon_exit20.png"))); // NOI18N
        mniExit.setText("Exit");
        mniExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniExitActionPerformed(evt);
            }
        });
        menuFile.add(mniExit);

        jMenuBar1.add(menuFile);

        jMenu2.setText("Manager");
        jMenu2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        mniListRevenuesTypeE.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        mniListRevenuesTypeE.setText(com.ptithcm.pe.util.Constaint.TITLE_LIST_EXPENDITURE);
        mniListRevenuesTypeE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniListRevenuesTypeEActionPerformed(evt);
            }
        });
        jMenu2.add(mniListRevenuesTypeE);

        mniListGroupTypeE.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        mniListGroupTypeE.setText(com.ptithcm.pe.util.Constaint.TITLE_LIST_EXPENDITURE_TYPE);
        mniListGroupTypeE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniListGroupTypeEActionPerformed(evt);
            }
        });
        jMenu2.add(mniListGroupTypeE);
        jMenu2.add(jSeparator2);

        mniListRevenuesTypeR.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        mniListRevenuesTypeR.setText(com.ptithcm.pe.util.Constaint.TITLE_LIST_RECEIPT);
        mniListRevenuesTypeR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniListRevenuesTypeRActionPerformed(evt);
            }
        });
        jMenu2.add(mniListRevenuesTypeR);

        mniListGroupTypeR.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        mniListGroupTypeR.setText(com.ptithcm.pe.util.Constaint.TITLE_LIST_RECEIPT_TYPE);
        mniListGroupTypeR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniListGroupTypeRActionPerformed(evt);
            }
        });
        jMenu2.add(mniListGroupTypeR);
        jMenu2.add(jSeparator3);

        mniStatistics.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        mniStatistics.setText(com.ptithcm.pe.util.Constaint.STATISTICS);
        jMenu2.add(mniStatistics);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Help");
        jMenu3.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        jMenuItem1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jMenuItem1.setText("Content");
        jMenu3.add(jMenuItem1);
        jMenu3.add(jSeparator1);

        jMenuItem2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icon_aboutUs.png"))); // NOI18N
        jMenuItem2.setText("About Us");
        jMenu3.add(jMenuItem2);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE)
            .addComponent(tabbedPane)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tabbedPane, javax.swing.GroupLayout.DEFAULT_SIZE, 502, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mniExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniExitActionPerformed
        // TODO add your handling code here:
        int confirmResult = JOptionPane.showConfirmDialog(this, "Bạn có muốn thoát chương trình không?", "Xác nhận thoát", JOptionPane.YES_NO_OPTION);

        if (confirmResult == JOptionPane.YES_OPTION)
            System.exit(0);
    }//GEN-LAST:event_mniExitActionPerformed

    private void mniListRevenuesTypeEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniListRevenuesTypeEActionPerformed
        showListRevenuesTypeE();
    }//GEN-LAST:event_mniListRevenuesTypeEActionPerformed

    private void btnRevenuesTypeEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRevenuesTypeEActionPerformed
        showListRevenuesTypeE();
    }//GEN-LAST:event_btnRevenuesTypeEActionPerformed

    private void btnListGroupTypeEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListGroupTypeEActionPerformed
        showListGroupTypeE();
    }//GEN-LAST:event_btnListGroupTypeEActionPerformed

    private void mniListGroupTypeEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniListGroupTypeEActionPerformed
        showListGroupTypeE();
    }//GEN-LAST:event_mniListGroupTypeEActionPerformed

    private void btnCloseTabActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseTabActionPerformed
        int selectedIndex = tabbedPane.getSelectedIndex();
    if (selectedIndex != -1) {
        tabbedPane.removeTabAt(selectedIndex);
    }
    }//GEN-LAST:event_btnCloseTabActionPerformed

    private void btnAddReceiptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddReceiptActionPerformed
        showListRevenuesTypeR();
    }//GEN-LAST:event_btnAddReceiptActionPerformed

    private void mniListRevenuesTypeRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniListRevenuesTypeRActionPerformed
        showListRevenuesTypeR();
    }//GEN-LAST:event_mniListRevenuesTypeRActionPerformed

    private void btnListReceiptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListReceiptActionPerformed
        // TODO add your handling code here:
        showListGroupTypeR();
    }//GEN-LAST:event_btnListReceiptActionPerformed

    private void mniListGroupTypeRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniListGroupTypeRActionPerformed
        // TODO add your handling code here:
        showListGroupTypeR();
    }//GEN-LAST:event_mniListGroupTypeRActionPerformed

    private void showListRevenuesTypeE(){
       boolean flag = TabbedPane.checkTabbedExist(Constaint.TITLE_LIST_EXPENDITURE, tabbedPane);
        if (flag == false){
            ListRevenuesTypeEPanel listExp = new ListRevenuesTypeEPanel();
            TabbedPane.createTab(tabbedPane, Constaint.TITLE_LIST_EXPENDITURE, listExp);
        }
    }
    
    private void showListGroupTypeE(){
       boolean flag = TabbedPane.checkTabbedExist(Constaint.TITLE_LIST_EXPENDITURE_TYPE, tabbedPane);
        if (flag == false){
            ListGroupTypeEPanel listGrExp = new ListGroupTypeEPanel();
            TabbedPane.createTab(tabbedPane, Constaint.TITLE_LIST_EXPENDITURE_TYPE, listGrExp);
        }
    }
    
    private void showListRevenuesTypeR(){
       boolean flag = TabbedPane.checkTabbedExist(Constaint.TITLE_LIST_RECEIPT, tabbedPane);
        if (flag == false){
            ListRevenuesTypeRPanel listRec = new ListRevenuesTypeRPanel();
            TabbedPane.createTab(tabbedPane, Constaint.TITLE_LIST_RECEIPT, listRec);
        }
    }
    
    private void showListGroupTypeR(){
       boolean flag = TabbedPane.checkTabbedExist(Constaint.TITLE_LIST_RECEIPT_TYPE, tabbedPane);
        if (flag == false){
            ListGroupTypeRPanel listGrRec = new ListGroupTypeRPanel();
            TabbedPane.createTab(tabbedPane, Constaint.TITLE_LIST_RECEIPT_TYPE, listGrRec);
        }
    }
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
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddReceipt;
    private javax.swing.JButton btnCloseTab;
    private javax.swing.JButton btnListGroupTypeE;
    private javax.swing.JButton btnListReceipt;
    private javax.swing.JButton btnRevenuesTypeE;
    private javax.swing.JButton btnStatistic;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JToolBar.Separator jSeparator4;
    private javax.swing.JPopupMenu.Separator jSeparator5;
    private javax.swing.JToolBar.Separator jSeparator6;
    private javax.swing.JToolBar.Separator jSeparator7;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JMenu menuFile;
    private javax.swing.JMenuItem mniExit;
    private javax.swing.JMenuItem mniListGroupTypeE;
    private javax.swing.JMenuItem mniListGroupTypeR;
    private javax.swing.JMenuItem mniListRevenuesTypeE;
    private javax.swing.JMenuItem mniListRevenuesTypeR;
    private javax.swing.JMenuItem mniLogin;
    private javax.swing.JMenuItem mniLogout;
    private javax.swing.JMenuItem mniStatistics;
    private javax.swing.JTabbedPane tabbedPane;
    // End of variables declaration//GEN-END:variables
}
