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
public class barang {
    
    Integer kodeBarang;
    String namaBarang;
    Integer jumlahBarang;
    BigDecimal harga;
    String jenisBarang;

    public String getJenisBarang() {
        return jenisBarang;
    }

    public void setJenisBarang(String jenisBarang) {
        this.jenisBarang = jenisBarang;
    }

    public BigDecimal getHarga() {
        return harga;
    }

    public void setHarga(BigDecimal harga) {
        this.harga = harga;
    }

    public Integer getKodeBarang() {
        return kodeBarang;
    }

    public void setKodeBarang(Integer kodeBarang) {
        this.kodeBarang = kodeBarang;
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
}
