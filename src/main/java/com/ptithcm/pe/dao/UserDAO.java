/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ptithcm.pe.dao;

import com.ptithcm.pe.database.DatabaseHelper;
import com.ptithcm.pe.model.User;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author tezca
 */
public class UserDAO implements DAO<User>{
    
    public static UserDAO getInstance(){
        return new UserDAO();
    }

    @Override
    public int insert(User t) {
        int result = 0;
        try {
            //Bước 1: Tạo kết nối cơ sở dữ liệu
            Connection con = DatabaseHelper.openConnection();
            // Bước 2: Tạo ra đối tượng statement
            String sql = "INSERT INTO [User]([Name], [UserName], [Password], Email) VALUES(?, ?, ?, ?)";
            
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, t.getName());
            ps.setString(2, t.getUserName());
            ps.setString(3, t.getPassword());
            ps.setString(4, t.getEmail());
            //Bước 3: Thực thi câu lệnh SQL
            result = ps.executeUpdate(sql);
            //Bước 4: Làm việc với kết quả thu được
            System.out.println("Bạn đã thực thi: " +  sql);
            System.out.println("Có " + result + " dòng bị thay đổi!");
            //Bước 5: Ngắt kết nối
            DatabaseHelper.closeConnection(con);
        } catch (SQLException ex) {
            Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return result;
    }

    @Override
    public int update(User t) {
        return 0;
    }

    @Override
    public int delete(User t) {
        int result = 0;
        try {
            //Bước 1: Tạo kết nối cơ sở dữ liệu
            Connection con = DatabaseHelper.openConnection();
            // Bước 2: Tạo ra đối tượng statement
            String sql = "UPDATE [User] SET IsActivate = 0 WHERE UserId = ?";    
            PreparedStatement statement = con.prepareStatement(sql);
            statement.setInt(1, t.getId());
            //Bước 3: Thực thi câu lệnh SQL         
            result = statement.executeUpdate();
            //Bước 4: Làm việc với kết quả thu được
            System.out.println("Bạn đã thực thi: " +  sql);
            System.out.println("Có " + result + " dòng bị thay đổi!");
            //Bước 5: Ngắt kết nối
            DatabaseHelper.closeConnection(con);
        } catch (SQLException ex) {
            Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return result;
    }

    @Override
    public ArrayList<User> selectAll() {
        
        return null;
    }

    @Override
    public User selectById(int id) {
        
        return null;   
    }

    @Override
    public User selectByName(String name) {
        
        return null;
    }
    
}
