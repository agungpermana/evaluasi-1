
package com.evaluasi1.pertemuan8;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author AP
 * contoh dari penggunaaan batch execution
 */
public class Pertemuan92 {
    
    public static void main(String[] args) {
        
        Connection conn = null; // jembatan koneksi antara aplikasi dengan database //jembbatanya
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            
            conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/LATIHAN", 
                    "root", 
                    "");
            
            System.out.println("Sukses konek ke mysql");   
            System.out.println("insert 10 data ke table peserta dengan batch exection");
            
            List<String> namaRandom = new ArrayList<String>();
            for (int i = 0; i < 10; i++) {
                Random rand = new Random();
                int nextRan = rand.nextInt(100);
                
                String nama = "random " + nextRan;
                System.out.println(nama);
                namaRandom.add(nama);
            }
            insertData(conn, namaRandom);
            
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
    
    private static void insertData(Connection conn, List<String> nama) {
        PreparedStatement ps = null;
        try {
            String sql = "insert into peserta (nama) values (?)";
            
            conn.setAutoCommit(false);
            ps = conn.prepareStatement(sql);
            for (String nama1 : nama) {
                ps.setString(1, nama1);
                ps.addBatch();
            }
            
            ps.executeBatch();
            conn.commit();
            conn.setAutoCommit(true);
        } catch (SQLException ex) {
            try {
                conn.rollback();
                ps.close();
            } catch(SQLException ex1) {
                ex1.printStackTrace();
            }
        }
    }
}
