/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.evaluasi1.domain;

import java.math.BigDecimal;

/**
 *
 * @author AP
 */
public class Penjualan {
    
    Integer noFaktur;
    String namaBarang;
    Integer jumlahBarang;
    private BigDecimal totalHarga;
    public static int jumlahPenjualan = 0;

    public Integer getNoFaktur() {
        return noFaktur;
    }

    public void setNoFaktur(Integer noFaktur) {
        this.jumlahPenjualan++;
        this.noFaktur = this.jumlahPenjualan;
    }

    public String getNamaBarang() {
        return namaBarang;
    }

    public void setNamaBarang(String namaBarang) {
        this.namaBarang = namaBarang;
    }

    public Integer getJumlahBarang() {
        return jumlahBarang;
    }

    public void setJumlahBarang(Integer jumlahBarang) {
        this.jumlahBarang = jumlahBarang;
    }

    public BigDecimal getTotalHarga() {
        return totalHarga;
    }

    public void setTotalHarga(BigDecimal totalHarga) {
        this.totalHarga = totalHarga;
    }   
    
    
}
