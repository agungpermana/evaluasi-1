
package com.evaluasi1.pertemuan8;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Time;
import java.sql.Timestamp;


/**
 *
 * @author AP
 * sampe membuat jdbc dengan date, time, timestamp dan jg blob
 */
public class Pertemuan93 {
     public static void main(String[] args) {
        
        Connection conn = null; // jembatan koneksi antara aplikasi dengan database //jembbatanya
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            
            conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/LATIHAN", 
                    "root", 
                    "");
            
            System.out.println("Sukses konek ke mysql");   
            createTable(conn);
            insertToTableTgl(conn);
        } catch (SQLException ex) {
            ex.printStackTrace();
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        } finally { 
            try { 
                conn.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }                
    }
     
     private static void createTable(Connection conn) {
        Statement st = null;
        try {   
            st = conn.createStatement();
            st.executeUpdate("create table if not exists tgl (id int AUTO_INCREMENT, "
                    + "tgl DATE, waktu TIME, tglwaktu TIMESTAMP, PRIMARY KEY(id))");
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            try {
                st.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
     }
     
     private static void insertToTableTgl(Connection conn) {
         PreparedStatement ps = null;
        
         try {
            
            
            String sql = "insert into tgl(tgl, waktu, tglwaktu) values (?,?,?)";
            ps = conn.prepareStatement(sql);
            ps.setDate(1, new Date(new java.util.Date().getTime()));
            ps.setTime(2, new Time(System.currentTimeMillis()));
            ps.setTimestamp(3, new Timestamp(System.currentTimeMillis()));
            
            ps.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            try {
                ps.close();
            } catch (SQLException ex){
                ex.printStackTrace();
            }
        }
     }
}
