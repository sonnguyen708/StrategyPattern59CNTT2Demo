/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai3;

/**
 *
 * @author Admin
 */
public class Sosanhtheoten implements ISosanh<Sinhvien>{

    @Override
    public int sosanh(Sinhvien o1, Sinhvien o2) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
       int rescomp=o1.getHoten().compareTo(o2.getHoten());
       if(rescomp>0){
           return -1;
       }
       if(rescomp<0){
           return 1;
       }
       return 0;
    } 
}
