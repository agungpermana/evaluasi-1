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
public class Koneksi {

    private Connection conn = null;
    
    public void eksekusiQuery(String sql){
        try {
            Class.forName("com.mysql.jdbc.Driver");
                conn = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/transaksi",
                        "root",
                        "");
                Statement s = conn.createStatement();
                
                s.executeUpdate(sql);
                
                System.out.println("Query sukses");
                conn.close();
        } catch (Exception e) {
            System.out.println("Query Gagal");
        }
    }

    public Connection bukaKoneksi() {
        if (conn != null) {
            return conn;
        } else {
            try {
                Class.forName("com.mysql.jdbc.Driver");
                conn = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/transaksi",
                        "root",
                        "");
                Statement s = conn.createStatement();
                
                s.executeUpdate("");
                return conn;
            } catch (Exception e) {
                return null;
            }
        }
    }
}
