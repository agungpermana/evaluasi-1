/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.evaluasi1;

import com.evaluasi1.domain.Penjualan;
import com.evaluasi1.domain.User;
import com.evaluasi1.domain.barang;
import com.evaluasi1.service.MysqlPenjualan;
import com.evaluasi1.service.PenjualanInterface;

/**
 *
 * @author AP
 */
public class MainPenjualan {
    
    public static void main(String[] args) {
        PenjualanInterface service = new MysqlPenjualan();
        service.save(new Penjualan());
        service.update(new Penjualan());
        service.delete(new Penjualan());
        service.selectPenjualan();
        
        service.save(new barang());
        service.update(new barang());
        service.delete(new barang());
        service.selectbarang();
        
        service.save(new User());
        service.update(new User());
        service.delete(new User());
        service.selectUser();
    }
}
