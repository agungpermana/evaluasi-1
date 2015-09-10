package com.evaluasi1.pertemuan8;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author AP
 */
public class Pertemuan81 {
    
    public static void main(String[] args) {
        
        
        Connection conn = null; // jembatan koneksi antara aplikasi dengan database //jembbatanya
        Statement statement = null; // statment yang mengekssekusi perintah //truknya
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            
            conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/LATIHAN", 
                    "root", 
                    "");
            
            System.out.println("Sukses konek ke mysql");
            
            System.out.println("Membuat table.....");
            statement = conn.createStatement();
//            statement.executeUpdate("CREATE DATABASE LATIHAN"); // truknya ngirim database
//            System.out.println("database latihan terbuat");
            
            createTable(statement);
            
            System.out.println("Insert data ke table peserta .....");
            insertToPeserta(statement);
            
            System.out.println("---data peserta---");
            readPeserta(statement);
            
            System.out.println("--update data peserta id 1----");
            updatePeserta(statement);            
            
            System.out.println("---baca peserta update -----");
            readPeserta(statement);
            
            System.out.println("--delete data peserta id 1 ----");
            deletePeserta(statement);
            
            System.out.println("---baca peserta delete -----");
            readPeserta(statement);            
            
            System.out.println("--- drop table----");
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
    
    private static void deletePeserta(Statement statement) throws SQLException {
        String sql = "delete from peserta where id = '3'";
        statement.executeUpdate(sql);
    }
    
    private static void updatePeserta(Statement statement) throws SQLException {
        String sql = "update peserta set nama = 'agung' where id = '2'";
        statement.executeUpdate(sql);
    }
    
    private static void readPeserta(Statement statement) throws SQLException {
        String sql = "select * from peserta";
        ResultSet rs = statement.executeQuery(sql); // khusus read harus ditampung ke ResultSet
        
        List<Peserta> list = new ArrayList<Peserta>();
        while(rs.next()) { // ambil object berikutnya rs.next
            Peserta p = new Peserta();
            p.setId(rs.getInt("id"));
            p.setNama(rs.getString("nama"));
            
            list.add(p);
            System.out.println("id = " + rs.getInt("id")
                    + ", nama = " + rs.getString("nama"));
        }
    }
    
    public static void createTable(Statement statement) throws SQLException {
        String sql = "Create table IF NOT EXISTS peserta ("
                + "id INTEGER NOT NULL AUTO_INCREMENT, "
                + "nama VARCHAR(255), "
                + "PRIMARY KEY (id))";
        
        statement.executeUpdate(sql); // gandengan saat membuat query
    }
    
    public static void insertToPeserta(Statement statement) throws SQLException {
        String sql = "Insert into peserta (nama) values ('Jimmy')";
        statement.executeUpdate(sql);
    }    
    
}
