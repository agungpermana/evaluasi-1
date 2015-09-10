package com.evaluasi1.service;

import com.evaluasi1.domain.Penjualan;
import com.evaluasi1.domain.User;
import com.evaluasi1.domain.barang;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;



/**
 *
 * @author AP
 */
public interface Interfaciang {
    
    public void savePenjualan(Penjualan p) throws SQLException;
    public void updatePenjualan(Penjualan p) throws SQLException;
    public void deletePenjualan(Penjualan p) throws SQLException;
    public List<Penjualan> selectPenjualan(Statement stmt) throws SQLException;
    
    public void saveBarang(barang b) throws SQLException;
    public void updateBarang(barang b) throws SQLException;
    public void deleteBarang(barang b) throws SQLException;
    public List<barang> selectBarang(Statement stmtb) throws SQLException;
    
    public void saveUser(User u) throws SQLException;
    public void updateUser(User u) throws SQLException;
    public void deleteUser(User u) throws SQLException;
    public List<User> selectUser(Statement stmtu) throws SQLException;
    
    public void txtPenjualan(Penjualan p);
    
}
