/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.evaluasi1.pertemuan8;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author AP
 */
public class Pertemuan9 {
    public static void main(String[] args) {
        
        Connection conn = null; // jembatan koneksi antara aplikasi dengan database //jembbatanya
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            
            conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/LATIHAN", 
                    "root", 
                    "");
            
            System.out.println("Sukses konek ke mysql");   
            System.out.println("membaca data peserta dengan nama jimmy (sebagai parameter) ");
            readDataPeserta(conn, "agung");
//            statement.executeUpdate("CREATE DATABASE LATIHAN"); // truknya ngirim database
//            System.out.println("database latihan terbuat");
            
            
        } catch (SQLException ex) {
            ex.printStackTrace();
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        } finally { 
            try { 
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(Pertemuan9.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
                
    }   
    
    private static void readDataPeserta (Connection conn, String nama) {
        PreparedStatement ps = null;
        try {
            String sql = "select * from peserta where nama = ?";
            
            ps = conn.prepareStatement(sql);
            ps.setString(1, nama);
            
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                System.out.println("id = " + rs.getInt("id")
                        + ", nama = " + rs.getString("nama"));
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            try {
                ps.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }
}
