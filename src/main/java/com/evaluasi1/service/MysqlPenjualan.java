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
public class MysqlPenjualan 
    
    implements PenjualanInterface{

    public void save(Penjualan p) {
        System.out.println("save Penjualan mysql");
    }

    public void update(Penjualan p) {
        System.out.println("update mysql penjualan");
    }

    public void delete(Penjualan p) {
        System.out.println("delete sql penjualan");
    }

    public List<Penjualan> selectPenjualan() {
        System.out.println("select sql Penjualan");
        return null;
    }

    public void save(User U) {
        System.out.println("Save sql User");
    }

    public void update(User u) {
        System.out.println("UPDATE SQL USER");
    }

    public void delete(User u) {
        System.out.println("DELETE SQL USER");
    }

    public List<User> selectUser() {
        System.out.println("SELECT USER SQL");
        return null;
    }

    public void save(barang b) {
        System.out.println("SAVE BARANG SQL");
    }

    public void update(barang b) {
        System.out.println("UPDATE BARANG SQL");
    }

    public void delete(barang b) {
        System.out.println("DELETE BARANG SQL");
    }

    public List<barang> selectbarang() {
        System.out.println("SELECT BARANG SQL");
        return null;
    }

    
}
    

