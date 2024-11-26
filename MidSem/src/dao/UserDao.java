package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;
import model.User;

public class UserDao {
    String dburl = "jdbc:postgresql://localhost:5432/phones_management_system_db";
    String username = "postgres";
    String passwd = "1974";

    public Integer InsertUser(User userObj) {
        try {
            Connection con = DriverManager.getConnection(dburl, username, passwd);
            String sql = "INSERT INTO \"Users\" (user_name, user_location, user_phone) values(?,?,?)";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, userObj.getUserName());
            pst.setString(2, userObj.getUserLocation());
            pst.setInt(3, userObj.getUserPhone());
            int rows = pst.executeUpdate();
            con.close();
            return rows;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public Integer DeleteUser(int userId) {
        try {
            Connection con = DriverManager.getConnection(dburl, username, passwd);
            String sql = "DELETE FROM \"Users\" WHERE user_id=?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setInt(1, userId);
            int rows = pst.executeUpdate();
            con.close();
            return rows;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public Integer UpdateUser(User userObj, int userId) {
        try {
            Connection con = DriverManager.getConnection(dburl, username, passwd);
            String sql = "UPDATE \"Users\" SET user_name =?, user_location=?, user_phone=? WHERE user_id=?";
            PreparedStatement pst = con.prepareStatement(sql);

            pst.setString(1, userObj.getUserName());
            pst.setString(2, userObj.getUserLocation());
            pst.setInt(3, userObj.getUserPhone());
            pst.setInt(4, userId);

            int rows = pst.executeUpdate();
            con.close();
            return rows;
        } catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }

    public void RetrieveUser(DefaultTableModel tableModel) {
        try {
            Connection con = DriverManager.getConnection(dburl, username, passwd);
            String sql = "SELECT * FROM \"Users\"";
            PreparedStatement pst = con.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                tableModel.addRow(new Object[]{
                    rs.getInt(1),
                    rs.getString(2),
                    rs.getString(3),
                    rs.getInt(4)
                });
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
