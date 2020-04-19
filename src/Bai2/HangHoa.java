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
public class HangHoa {
    String tenHH;
    int Gia;
    String Mota;
    
    public HangHoa() {
    }
    //contructor
    public HangHoa(String tenHH, int Gia, String Mota) {
        this.tenHH = tenHH;
        this.Gia = Gia;
        this.Mota = Mota;
    }
    //getter

    public String getTenHH() {
        return tenHH;
    }

    public String getMota() {
        return Mota;
    }
    
    public int getGia() {
        return Gia;
    }
    public String thontinHH(){
        return ("tenHH:"+this.tenHH+"Gia:"+this.Gia+"Mota:"+this.Mota);
    }
}
