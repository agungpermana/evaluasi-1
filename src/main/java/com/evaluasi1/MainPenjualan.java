/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.evaluasi1;

//import com.evaluasi1.domain.Penjualan;

import com.evaluasi1.domain.Penjualan;
import com.evaluasi1.domain.User;
import com.evaluasi1.domain.barang;
import com.evaluasi1.service.Impl;
import com.evaluasi1.service.Interfaciang;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;



/**
 *
 * @author AP
 */
public class MainPenjualan {
    
    public static void main(String[] sql) throws SQLException  {
        
        
        
        Connection conn = null; 
        Statement statement = null; 
        
        try {
            
            Class.forName("com.mysql.jdbc.Driver");
            
            conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/transaksi", 
                    "root", 
                    "");
            
            Interfaciang service = new Impl();
        
            
            System.out.println("Sukses konek ke mysql");
        
            statement = conn.createStatement();
            
            Penjualan p = new Penjualan();
            service.savePenjualan(p);
            service.updatePenjualan(p);
            service.deletePenjualan(p);
            service.selectPenjualan(statement);
            
            barang b = new barang();
            service.saveBarang(b);
            service.updateBarang(b);
            service.deleteBarang(b);
            service.selectBarang(statement);
            
            User u = new User();
            service.saveUser(u);
            service.updateUser(u);
            service.deleteUser(u);
            service.selectUser(statement);
            
            
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
//        PenjualanInterface service = new MysqlPenjualan();
//        PenjualanInterface services = new Insert();
//
//        Penjualan p = new Penjualan();
//        //service.savePenjualan(null);
//        service.selectPenjualans(p);
//        service.update(p);
//        service.delete(p);
//        services.selectPenjualans(null);        
    
    
        
    

