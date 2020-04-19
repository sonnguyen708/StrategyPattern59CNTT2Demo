/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai2;

/**
 *
 * @author Admin
 */
public class ThanhToanOnline implements IThanhToan{
    @Override
    public double thanhtoan(int TienHang) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        if(TienHang < 1000000) 
            return TienHang-(TienHang*0.05);
        else 
            return TienHang-(TienHang*0.07);   
        }
}
