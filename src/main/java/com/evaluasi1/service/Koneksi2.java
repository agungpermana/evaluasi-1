/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.evaluasi1.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author AP
 */
public class Koneksi2 {
    
    public void connection (String sql) {
         Connection conn = null; // jembatan koneksi antara aplikasi dengan database //jembbatanya
         Statement statement = null; // statment yang mengekssekusi perintah //truknya
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            
            conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/transaksi", 
                    "root", 
                    "");
            
            statement = conn.createStatement();
            statement.executeUpdate(sql);
            System.out.println("sukses konek mysql");
        } catch (SQLException ex) {
            ex.printStackTrace();
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        } finally { 
            try { 
                statement.close();
                conn.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    
    }
}
