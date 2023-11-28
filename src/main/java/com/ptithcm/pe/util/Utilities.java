/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ptithcm.pe.util;

import java.awt.Component;
import javax.swing.*;

/**
 *
 * @author tezca
 */
public class Utilities {
    
    public static final String TITLE_ADD_NEW_EXPENDITURE_TYPE = "Thêm phân loại chi tiêu mới";
    public static final String TITLE_LIST_EXPENDITURE_TYPE = "Danh mục phân loại chi tiêu";
    public static final String TITLE_ADD_NEW_EXPENDITURE = "Thêm chi tiêu mới";
    public static final String TITLE_LIST_EXPENDITURE = "Danh sách chi tiêu";
    public static final String TITLE_ADD_NEW_RECEIPT_TYPE = "Thêm phân loại thu nhập mới";
    public static final String TITLE_LIST_RECEIPT_TYPE = "Danh mục phân loại thu nhập";
    public static final String TITLE_ADD_NEW_RECEIPT = "Thêm thu nhập mới";
    public static final String TITLE_LIST_RECEIPT = "Danh sách thu nhập";

    public static boolean checkTabbedExist(String title, JTabbedPane tab) {
        for (int i = 0; i < tab.getTabCount(); i++) {
            if (tab.getTitleAt(i).equals(title)) {
                // Nếu tồn tại, chuyển đến tab đó và đặt cờ là true
                tab.setSelectedIndex(i);
                return true;
            }
        }
        return false;
    }
    
    public static void createTab(JTabbedPane tab, String title, Component component){
        tab.addTab(title, component);
        tab.setSelectedIndex(tab.getTabCount() - 1);
    }
}
