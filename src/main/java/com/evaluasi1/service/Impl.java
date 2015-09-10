
package com.evaluasi1.service;

import com.evaluasi1.domain.Penjualan;
import com.evaluasi1.domain.User;
import com.evaluasi1.domain.barang;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
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
public class Impl 
    
    implements Interfaciang{
      
    public void koneks2(String sql){
        Statement stmt = null;
        Connection conn = null;
              
        try {
            
            Class.forName("com.mysql.jdbc.Driver");
            
            conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/transaksi", 
                    "root", 
                    "");
           
            stmt = conn.createStatement();
            stmt.executeUpdate(sql);
            
            
                   } catch (SQLException ex) {
            ex.printStackTrace();
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        } finally { 
            try { 
                stmt.close();
                conn.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }
   
    public void savePenjualan(Penjualan p) throws SQLException {
        String sql = "insert into penjualan values (NULL,'pisang','3','5000'),"
                + "(NULL,'golok','1','1000'),"
                + "(NULL,'pisau','2','6000')";
        
        System.out.println("insert penjualan");
        this.koneks2(sql);
    } 
    
    public void updatePenjualan(Penjualan p) throws SQLException {
        String sql = "update penjualan set nama_barang = 'kolor' where no_faktur ='1'";
        System.out.println("update penjualan");
        this.koneks2(sql);
    }
    
    public void deletePenjualan(Penjualan p) throws SQLException {
        String sql = "delete from penjualan where no_faktur='3'";
        System.out.println("delete penjualan");
        this.koneks2(sql);
    }

   @Override
    public List<Penjualan> selectPenjualan(Statement stmt) throws SQLException{
        FileWriter fw = null;
        try {
            
            File file = new File("D:\\txtPenjualan.txt");
            if(!file.exists()) {
                file.createNewFile();
            }
            fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);
            
            String sql = "select * from penjualan";
            ResultSet resP = stmt.executeQuery(sql);
            
            List<Penjualan> list = new ArrayList<Penjualan>();
            System.out.println("------select Barang------");
            while (resP.next()) {            
                Penjualan p = new Penjualan();
                
                p.setNoFaktur(resP.getInt(1));
                
                bw.write(resP.getString(1));
                bw.append(",");
                bw.write(resP.getString(2));
                bw.append(",");
                bw.write(resP.getString(3));
                bw.append(",");
                bw.write(resP.getString(4));
                bw.append("\r\n");
                
                list.add(p);
                System.out.println(resP.getInt(1)+", "+resP.getString(2)+", "
                        +resP.getInt(3)+", "+resP.getBigDecimal(4));
                   
            }
            bw.flush();
            bw.close();
            return null;
        } catch (IOException ex) {
            Logger.getLogger(Impl.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                fw.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return null; 
    }

    public void saveBarang(barang b) throws SQLException {
        String sql = "insert into barang values (NULL,'baju','3','3000','pakaian'),"
                + "(NULL,'celana','1','2000','bawahan'),"
                + "(NULL,'beras','3','3000','nasi')";
        System.out.println("Insert Barang");
        this.koneks2(sql);
    }

    public void updateBarang(barang b) throws SQLException {
        String sql = "update barang set nama_brg ='akik' where kode_brg='1'";
        System.out.println("update barang kode 1");
        this.koneks2(sql);
    }   

    public void deleteBarang(barang b) throws SQLException {
        String sql = "delete from barang where kode_brg = '3'";
        System.out.println("delete barang kode 3");
        this.koneks2(sql);
    }

    @Override
    public List<barang> selectBarang(Statement stmtb) throws SQLException{
        FileWriter fw = null;
        try {
            
            File file = new File("D:\\txtBarang.txt");
            if(!file.exists()) {
                file.createNewFile();
            }
            fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);
            
            String sql = "select * from barang";
            ResultSet resB = stmtb.executeQuery(sql);
            
            List<barang> list = new ArrayList<barang>();
            System.out.println("------select Barang------");
            while (resB.next()) {            
                barang b = new barang();
                
                b.setKodeBarang(resB.getInt(1));
                
                bw.write(resB.getString(1));
                bw.append(",");
                bw.write(resB.getString(2));
                bw.append(",");
                bw.write(resB.getString(3));
                bw.append(",");
                bw.write(resB.getString(4));
                bw.append(",");
                bw.write(resB.getString(5));
                bw.append("\r\n");
                
                list.add(b);
                System.out.println(resB.getInt(1)+", "+resB.getString(2)+", "+resB.getInt(3)
                        +", "+resB.getInt(4)+", "+resB.getString(5));
                   
            }
            bw.flush();
            bw.close();
            return null;
        } catch (IOException ex) {
            Logger.getLogger(Impl.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                fw.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return null; 
        
    }

    public void saveUser(User u) throws SQLException {
        String sql = "insert into user values(NULL, 'agung','L','1990-05-05','depok','212'),"
                + "(NULL,'permana','L','1990-09-01','jakarta','099'),"
                + "(NULL,'sari','P','1991-01-20','magelang','082')";
        System.out.println("insert ke user");
        this.koneks2(sql);
    }

    public void updateUser(User u) throws SQLException {
        String sql = "update user set nama='sultan' where id_user='1'";
        System.out.println("update user id 1");
        this.koneks2(sql);
    }

    public void deleteUser(User u) throws SQLException {
        String sql = "delete from user where id_user = '3'";
        System.out.println("delete user id 3");
        this.koneks2(sql);
    }

    public List<User> selectUser(Statement stmtu) throws SQLException {
        FileWriter fw = null;
        try {
            
            File file = new File("D:\\txtUser.txt");
            if(!file.exists()) {
                file.createNewFile();
            }
            fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);
            
            String sql = "select * from user";
            ResultSet resU = stmtu.executeQuery(sql);
            
            List<User> list = new ArrayList<User>();
            System.out.println("------select user--");
            while (resU.next()) {            
                User u = new User();
                
                u.setIdUser(resU.getInt(1));
                
                bw.write(resU.getString(1));
                bw.append(",");
                bw.write(resU.getString(2));
                bw.append(",");
                bw.write(resU.getString(3));
                bw.append(",");
                bw.write(resU.getString(4));
                bw.append(",");
                bw.write(resU.getString(5));
                bw.append(",");
                bw.write(resU.getString(6));
                bw.append("\r\n");
                
                list.add(u);
                System.out.println(resU.getInt(1)+", "+resU.getString(2)+", "+resU.getString(3)
                        +", "+resU.getDate(4)+" ,"+resU.getString(5)+", "+resU.getString(6));
            }
            bw.flush();
            bw.close();
            return null;
        } catch (IOException ex) {
            Logger.getLogger(Impl.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                fw.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return null;     
    }

    public void txtPenjualan(Penjualan p) {
         FileWriter fw = null;
        try {
            File file = new File("D:\\latihantulis.txt"); 
            if(!file.exists()) {
                file.createNewFile(); // dituliskan di txt baru
            }
            
            fw = new FileWriter(file);
            
            BufferedWriter bw = new BufferedWriter(fw); 
            bw.write("isi dalam file ini ditulis dari class pertemuan73.java");
            bw.newLine(); // baris baru
            // karena windows berbeda dalam jvm javanya, maka harus /r/n
            bw.write("\r\nbaris 2");
            bw.close();
        } catch (IOException ex) {
            Logger.getLogger(Impl.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                fw.close();
            } catch (IOException ex) {
                Logger.getLogger(Impl.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }   
}

//try {
//            
//        String sql = "select * from penjualan";
//        ResultSet rs = stmt.executeQuery(sql); 
//        
//        List<Penjualan> list = new ArrayList<Penjualan>();
//        System.out.println("-----Select Penjualan----------");
//        while(rs.next()) { 
//            Penjualan p = new Penjualan();
//            p.setNoFaktur(rs.getString("nama_barang"));
//            
//            
//            list.add(p);
//            
//            System.out.println(rs.getString("nama_barang"));
//            
//        }
//            
//        } catch (SQLException ex) {
//            Logger.getLogger(Impl.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        return null;