/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ptithcm.pe.database;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author tezca
 */
public class DatabaseHelper {
    private static final Logger LOGGER = Logger.getLogger(DatabaseHelper.class.getName());


    public static Connection openConnection() throws SQLException {
        Connection connection = null;
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://MSI\\BAOCHINH:1433;DatabaseName=PersonalExpenseManagement;encrypt=true;trustServerCertificate=true;";
            String username = "sa";
            String password = "123456";
            connection = DriverManager.getConnection(url, username, password);
        } catch (ClassNotFoundException | SQLException e) {
            LOGGER.log(Level.SEVERE, "Không thể kết nối đến Cơ sở dữ liệu", e);
            throw new SQLException("Không thể kết nối đến Cơ sở dữ liệu", e);
        }
        return connection;
    }

    public static void closeConnection(Connection c) {
        try {
            if (c!= null)
                c.close();
        } catch (SQLException e) {
            LOGGER.log(Level.SEVERE, "Lỗi khi đóng kết nối", e);
        }
    }
    
    public static void printInfo(Connection c){
        try {
            if (c != null)
            {
                DatabaseMetaData databaseMetaData = c.getMetaData();
                System.out.println(databaseMetaData.getDatabaseProductName());
                System.out.println(databaseMetaData.getDatabaseProductVersion());
            }
                        
        } catch (SQLException e) {
            LOGGER.log(Level.SEVERE, "Lỗi khi xem thông tin kết nối", e);
        }
    }
}
