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
public class Context {
    private Tinh Tinhtoan;
    //Thay đổi thông tin trong setTinhToan
    public void setTinhToan(Tinh Tinhtoan){
        this.Tinhtoan=Tinhtoan;
    }
    public float Tinh(float a,float b){
        return Tinhtoan.tinh(a,b);
    }
}
