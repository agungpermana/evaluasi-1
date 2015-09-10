/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.evaluasi1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author AP
 */
public class Pertemuan72 {
    
    public static void main(String[] args) {
        try {
            File file = new File("D:\\latihan.txt");
            FileInputStream fis = null;
            
            fis = new FileInputStream(file);
            
            System.out.println("--------ISI FILE--------");
            int isi;
            while((isi = fis.read()) != -1){ //!= -1 artinya ada kolomnya
                System.out.println((char) isi); // isi kolom bentuknya byte makanya di conversi ke char
                
            }
                   
        } catch (IOException ex) {
            Logger.getLogger(Pertemuan72.class.getName()).log(Level.SEVERE, null, ex);
        } 
        
    }
    
}
