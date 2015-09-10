/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.evaluasi1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author AP
 */
public class Pertemuan7 {
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = null;
        try {
            //jika ingin membaca sebuah file
            // buffered reader membutuhkan object reader, disini kita menggunakanan
            // file reader ()       
            // windows bisa menggunakan FileReader("C:\\latihan.txt" or "D:/latihan.txt")
            // "\n" "\t" (googling escape character
            
            br = new BufferedReader(new FileReader("D:/latihan.txt"));
            
            String isi;
            System.out.println("______ISI FILE_____");
            while((isi = br.readLine()) != null){ // br. dibaca perbaris
                System.out.println(isi);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Pertemuan7.class.getName()).log(Level.SEVERE, null, ex);
        } 
  
    }
    
}
