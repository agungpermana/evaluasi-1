/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.evaluasi1.service;

import com.evaluasi1.domain.Penjualan;
import com.evaluasi1.domain.User;
import com.evaluasi1.domain.barang;
import java.util.List;

/**
 *
 * @author AP
 */
public interface PenjualanInterface {
    
    public void save(Penjualan p);
    public void update(Penjualan p);
    public void delete(Penjualan p);
    public List<Penjualan> selectPenjualan();
    
    public void save(User U);
    public void update(User u);
    public void delete(User u);
    public List<User> selectUser();
    
    public void save(barang b);
    public void update(barang b);
    public void delete(barang b);
    public List<barang> selectbarang();
    
}
