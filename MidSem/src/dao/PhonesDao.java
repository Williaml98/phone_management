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
import javax.swing.table.DefaultTableModel;
import model.Phones;

/**
 *
 * @author William
 */
public class PhonesDao {
    public String dburl = "jdbc:postgresql://localhost:5432/phones_management_system_db";
    public String username = "postgres";
    public String passwd = "1974";
    
    
    public Integer AddPhones(Phones phoneObj){
    try{
        Connection con = DriverManager.getConnection(dburl, username, passwd);
        String sql = "INSERT INTO \"Phones\" (phone_brand, phone_model, phone_storage, phone_price, phone_color, phone_status) VALUES (?,?,?,?,?,?)";
        PreparedStatement pst = con.prepareStatement(sql);
        pst.setString(1, phoneObj.getPhoneBrand());
        pst.setString(2, phoneObj.getPhoneModel());
        pst.setString(3, phoneObj.getPhoneStorage());
        pst.setDouble(4, phoneObj.getPhonePrice());
        pst.setString(5, phoneObj.getPhoneColor());
        pst.setString(6, phoneObj.getPhoneStatus());
        int rowAffected = pst.executeUpdate();
        con.close();
        return rowAffected;
    } catch(Exception ex){
        ex.printStackTrace();
        return null; // Update this return value as needed
    }    
}

    
    public Integer DeletePhones(int phoneId){
        try{
            Connection con = DriverManager.getConnection(dburl, username, passwd);
            String sql = "DELETE FROM \"Phones\" WHERE phone_id=?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setInt(1, phoneId);
            int rowAffected = pst.executeUpdate();
            con.close();
            return rowAffected;
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return null;
    }
    
     public Integer UpdatePhones(Phones phoneObj, int phoneId) {
        try {
            Connection con = DriverManager.getConnection(dburl, username, passwd);
            String sql = "UPDATE \"Phones\" SET phone_brand =?, phone_model=?, phone_storage=?,phone_price=?, phone_color=?, phone_status=? WHERE phone_id=?";
            PreparedStatement pst = con.prepareStatement(sql);
           
            pst.setString(1, phoneObj.getPhoneBrand());
            pst.setString(2, phoneObj.getPhoneModel());
            pst.setString(3, phoneObj.getPhoneStorage());
            pst.setDouble(4, phoneObj.getPhonePrice());
            pst.setString(5, phoneObj.getPhoneColor());
            pst.setString(6, phoneObj.getPhoneStatus());
            pst.setInt(7, phoneId);
                    
            int rows = pst.executeUpdate();
            con.close();
            return rows;
        }catch(Exception ex){
            ex.printStackTrace();
            return null;
        }
    }
     
     public Integer UpdatePhones(int phoneId) {
        try {
            Connection con = DriverManager.getConnection(dburl, username, passwd);
            String sql = "UPDATE \"Phones\" set phone_status=? where phone_id=?";
            PreparedStatement pst = con.prepareStatement(sql);

            pst.setString(1, "Sold");
            pst.setInt(2, phoneId);         

            int rows = pst.executeUpdate();
            con.close();
            return rows;
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return null;
    }
     
      public void LoadPhones(DefaultTableModel tableModel, String userStatus) {
        try{
            Connection con = DriverManager.getConnection(dburl, username, passwd);
            String sql;
           
            if(userStatus.equals("admin")){
               sql  = "SELECT * FROM \"Phones\"";
            }else{
                sql  = "SELECT * FROM \"Phones\" WHERE phone_status=?";
            }
             PreparedStatement pst = con.prepareStatement(sql);
              
              if (!userStatus.equals("admin")){
                   pst.setString(1, "Available");
              }
            
            ResultSet rs = pst.executeQuery();
            while(rs.next()){
                tableModel.addRow(new Object[]{
                        rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getDouble(5),
                        rs.getString(6),
                        rs.getString(7),
                });
            }
            con.close();
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }
}
