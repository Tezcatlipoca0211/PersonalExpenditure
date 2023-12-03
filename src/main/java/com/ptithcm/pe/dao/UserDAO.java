/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ptithcm.pe.dao;

import com.ptithcm.pe.PersonalExpenditure;
import com.ptithcm.pe.database.DatabaseHelper;
import com.ptithcm.pe.model.User;
import com.ptithcm.pe.util.Constraints;
import java.awt.Component;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author tezca
 */
public class UserDAO implements DAO<User> {

    public static UserDAO getInstance() {
        return new UserDAO();
    }

    @Override
    public int insert(User t) {
        int result = 0;
        try ( //Bước 1: Tạo kết nối cơ sở dữ liệu
                Connection con = DatabaseHelper.openConnection();) {
            try {
                // Bước 2: Tạo ra đối tượng statement
                String sql = "INSERT INTO [User]([Name], [UserName], [Password], Email) VALUES(?, ?, ?, ?)";

                PreparedStatement ps = con.prepareStatement(sql);
                con.setAutoCommit(false);
                ps.setString(1, t.getName());
                ps.setString(2, t.getUserName());
                ps.setString(3, t.getPassword());
                ps.setString(4, t.getEmail());
                //Bước 3: Thực thi câu lệnh SQL
                result = ps.executeUpdate();
                //Bước 4: Làm việc với kết quả thu được
                System.out.println("Có " + result + " dòng bị thay đổi!");
                //Bước 5: commit
                con.commit();
            } catch (Exception e) {
                con.rollback();
            } finally {
                con.setAutoCommit(true);
            }

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
        try ( //Bước 1: Tạo kết nối cơ sở dữ liệu
                Connection con = DatabaseHelper.openConnection();) {
            try {
                // Bước 2: Tạo ra đối tượng statement
                String sql = "UPDATE [User] SET IsActivate = 0 WHERE UserId = ?";
                PreparedStatement ps = con.prepareStatement(sql);
                con.setAutoCommit(false);
                ps.setInt(1, t.getId());
                //Bước 3: Thực thi câu lệnh SQL
                result = ps.executeUpdate();
                //Bước 4: Làm việc với kết quả thu được
                System.out.println("Có " + result + " dòng bị thay đổi!");
                //Bước 5: commit
                con.commit();
            } catch (Exception e) {
                con.rollback();
            } finally {
                con.setAutoCommit(true);
            }

        } catch (SQLException ex) {
            Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return result;
    }

    @Override
    public ArrayList<User> selectAll() {
        ArrayList<User> result = new ArrayList<>();
        try {
            //Bước 1: Tạo kết nối cơ sở dữ liệu
            Connection con = DatabaseHelper.openConnection();
            // Bước 2: Tạo ra đối tượng statement
            Statement statement = con.createStatement();
            //Bước 3: Thực thi câu lệnh SQL
            String sql = "SELECT * FROM [User]";
            ResultSet rs = statement.executeQuery(sql);
            //Bước 4: Làm việc với kết quả thu được
            while (rs.next()) {
                int userId = rs.getInt("UserId");
                String name = rs.getString("Name");
                String username = rs.getString("UserName");
                String password = rs.getString("Password");
                String email = rs.getString("Email");
                boolean isActivate = rs.getBoolean("IsActivate");

                User user = new User(userId, name, username, password, email, isActivate);
                result.add(user);
            }
            //Bước 5: Ngắt kết nối
            DatabaseHelper.closeConnection(con);
        } catch (SQLException ex) {
            Logger.getLogger(GroupDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return result;
    }

    @Override
    public User selectByName(String name) {
        User user = null;
        try {
            //Bước 1: Tạo kết nối cơ sở dữ liệu
            Connection con = DatabaseHelper.openConnection();
            // Bước 2: Tạo ra đối tượng statement
            String sql = "SELECT * FROM [Group] WHERE [Name] = ?";
            PreparedStatement preparedStatement = con.prepareStatement(sql);
            preparedStatement.setString(1, name);
            //Bước 3: Thực thi câu lệnh SQL           
            ResultSet rs = preparedStatement.executeQuery();
            //Bước 4: Làm việc với kết quả thu được
            while (rs.next()) {
                int userId = rs.getInt("UserId");
                String username = rs.getString("UserName");
                String password = rs.getString("Password");
                String email = rs.getString("Email");
                boolean isActivate = rs.getBoolean("IsActivate");
                user = new User(userId, name, username, password, email, isActivate);
            }
            //Bước 5: Ngắt kết nối
            DatabaseHelper.closeConnection(con);
        } catch (SQLException ex) {
            Logger.getLogger(GroupDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return user;
    }

    public User selectByUsername(String username) {
        User user = null;
        try {
            //Bước 1: Tạo kết nối cơ sở dữ liệu
            Connection con = DatabaseHelper.openConnection();
            // Bước 2: Tạo ra đối tượng statement
            String sql = "SELECT * FROM [User] WHERE [UserName] = ?";
            PreparedStatement preparedStatement = con.prepareStatement(sql);
            preparedStatement.setString(1, username);
            //Bước 3: Thực thi câu lệnh SQL           
            ResultSet rs = preparedStatement.executeQuery();
            //Bước 4: Làm việc với kết quả thu được
            while (rs.next()) {
                int userId = rs.getInt("UserId");
                String name = rs.getString("Name");
                String password = rs.getString("Password");
                String email = rs.getString("Email");
                boolean isActivate = rs.getBoolean("IsActivate");
                user = new User(userId, name, username, password, email, isActivate);
            }
            //Bước 5: Ngắt kết nối
            DatabaseHelper.closeConnection(con);
        } catch (SQLException ex) {
            Logger.getLogger(GroupDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return user;
    }

    public int login(String username, String password) {

        User user = getInstance().selectByUsername(username);
        if (user == null) {
            return 2;
        }

        if (!user.getPassword().equals(password)) {
            return 1;
        }
        PersonalExpenditure.getInstance().setUserId(user.getId());
        return 0;
    }
}
