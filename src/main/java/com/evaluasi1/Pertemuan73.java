/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.evaluasi1;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author AP cara nulis file
 */
public class Pertemuan73 {
    
    public static void main(String[] args) {
        // FileWriter utk menulis file
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
            Logger.getLogger(Pertemuan73.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                fw.close();
            } catch (IOException ex) {
                Logger.getLogger(Pertemuan73.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
    }
    
}
