/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai2;
import java.util.ArrayList;
/**
 *
 * @author Admin
 */
public class Main {
    public static void main(String[] args){
       
        //tao hang hoa
        HangHoa hh1= new HangHoa("BanhTrang",6000000,"Mau trang");
        HangHoa hh2= new HangHoa("Dua hau",4000000,"Mau do"); 
        
        
        //tao gio hang
        GioHang gh1= new GioHang();
        gh1.setHinhthucTT( new ThanhToanCOD());
        gh1.themHangHoa(hh1);
        gh1.themHangHoa(hh2);
        GioHang gh2= new GioHang();
        gh2.setHinhthucTT(new ThanhToanOnline());
        gh2.themHangHoa(hh1);
        gh2.themHangHoa(hh2);
        //in gio hang 1
        gh1.inDS();
        System.out.println("Tong Tien Hang:"+gh1.TongTienHang());
        System.out.println("So tien phai tra:"+gh1.thanhtoan()+"\n");
        System.out.println("");
        //in gio hang 2
        gh2.inDS();
        System.out.println("Tong Tien Hang:"+gh2.TongTienHang());
        System.out.println("So tien phai tra:"+gh2.thanhtoan()+"\n");
        
    }          
}
