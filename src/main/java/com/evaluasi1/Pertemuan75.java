package com.evaluasi1;

//import java.util.logging.Level;
//import java.util.logging.Logger;

/**
 *
 * @author AP
 */
public class Pertemuan75 {
    
    public static void main(String[] args) {
        try {
            Integer[] angka = new Integer[2];
            angka[0] = 1;
            angka[1] = 2;
            
           // hitung(angka);
            hitung2(angka);
        } catch (LatihanException ex) {
            System.out.println("");
//            a();
        } 
//        catch (ArrayIndexOutOfBoundsException ex){
//            a();
//        }
    }
    
//    private static void a(){
//        //melakukan perhitungan sendiri
//        Integer hasil = 5+2;
//        System.out.println("hasil dari perhitungan sendiri : " + hasil);
//    }
    
    private static void hitung(Integer[] arrInt) throws LatihanException{
        try{
        Integer hasil = arrInt[5] + arrInt[2];
            System.out.println("hasil : " + hasil);
        } catch (Exception ex){
            throw new LatihanException("Array tidak lebih dari 5");
        }
        
        if(arrInt.length > 5) {
            Integer hasil = arrInt[5] + arrInt[2];
            System.out.println("hasil : " + hasil);
        } else {
            System.out.println("array tidak lebih dari 5");
        }
    }
    
    private static void hitung2(Integer[] arrInt) 
            throws ArrayIndexOutOfBoundsException, LatihanException {
        Integer hasil = arrInt[5] + arrInt[2];
        System.out.println("hasil : " + hasil);
    }
    
}
