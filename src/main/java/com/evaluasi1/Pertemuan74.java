/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.evaluasi1;

/**
 *
 * @author AP
 */
public class Pertemuan74 {
    
    public static void main(String[] args) {
        
        // contoh dari Exception
        // Object mahkluk masih null tapi sudah dipanggil property nya (lihat baris 24)
        Makhluk manusia = null;
        
//        Makhluk manusia = new Makhluk(); //object makhluk
//        manusia.setJmlKaki(2); //object makhluck memiliki property kaki 2
//        manusia.setJmlGigi(32); // object makhluk memiliki properti gigi 32
//        manusia.setBerbulu(true); // object makhlluk memiliki properti berbulu true
        try { // Handling Exception dengan try catch nullpointer
        System.out.println("apakah manusia berbeulu ? " + manusia.getBerbulu());
        }catch(NullPointerException npe){
            System.out.println("null bos");
        }
        
        // ketika menambhkan baris 34 akan terjadi array index out of bounds
        // cara menanganinya adalah pakai blok baris 36-41 
        Integer[] angka = new Integer[3];
        angka[0] = 1;
        angka[1] = 2;
        angka[2] = 3;
        
        // run time exception
        if(angka.length > 3){
            angka[3] = 4;
            angka[4] = 5;
        }   else {
            System.out.println("panjangnya array hanya 3, jangan dilebihin");
        }
        
        System.out.println("angka ke 5 " + angka[2]);
        
    }
    
    
}
