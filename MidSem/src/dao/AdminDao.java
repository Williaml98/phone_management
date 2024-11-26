/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import model.Admin;

/**
 *
 * @author William
 */
public class AdminDao {
    public String dburl = "jdbc:postgresql://localhost:5432/phones_management_system_db";
    public String username = "postgres";
    public String passwd = "1974";
    
    public boolean UserLogIn(Admin adminObj){
        try{
            Connection con = DriverManager.getConnection(dburl, username, passwd);
            String sql = "SELECT* FROM \"Admins\" WHERE admin_username=? and admin_pass=?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, adminObj.getUsername());
            pst.setString(2, adminObj.getPassword());
            ResultSet rs = pst.executeQuery();
            if(rs.next()){
                con.close();
                return true;
            }
            else{
                con.close();
                return false;
            }

        }catch(Exception e){
            e.printStackTrace();
            return false;
        }
    }

    public Integer UserSignUp(Admin adminObj){
        try{
            Connection con = DriverManager.getConnection(dburl, username, passwd);
            String sql = "INSERT INTO \"Admins\" (admin_username, admin_email, admin_pass) VALUES (?,?,?)";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, adminObj.getUsername());
            pst.setString(2, adminObj.getEmail());
            pst.setString(3, adminObj.getPassword());
            int rows = pst.executeUpdate();
            con.close();
            return rows;
        }catch(Exception e){
            e.printStackTrace();
            return null;
        }
    }
}