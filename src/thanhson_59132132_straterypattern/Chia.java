/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thanhson_59132132_straterypattern;

/**
 *
 * @author Admin
 */
public class Chia implements Tinh {

    @Override
    public float tinh(float a, float b) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        if(b==0)
            return Float.NEGATIVE_INFINITY;
        else 
            return a/b;
        }
}
   

