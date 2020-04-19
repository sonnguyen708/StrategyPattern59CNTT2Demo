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
public class GioHang  {
    //thuoc tinh 
    IThanhToan HinhthucTT;
    ArrayList<HangHoa>DSHH= new ArrayList<>();
    //setter
    public void setHinhthucTT(IThanhToan HinhthucTT) {
        this.HinhthucTT = HinhthucTT;
    }
    //method 
    //them hang hoa
    public void themHangHoa(HangHoa hanghoa){
         DSHH.add(hanghoa);
    }
    
    //vong lap for tong tien hang
    public int TongTienHang(){
        int sum=0;
        for(HangHoa hanghoa:DSHH){
            sum=sum+hanghoa.getGia();
        }
        return sum;
    }
    public double thanhtoan(){
        return HinhthucTT.thanhtoan(TongTienHang());
    }
    public void inDS(){
       DSHH.forEach(HH-> System.out.println("Danh sach hang hoa"+HH.thontinHH()));
    }
     
}
