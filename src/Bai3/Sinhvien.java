/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai3;
import java.text.SimpleDateFormat;
//import java.time.LocalDate;
import java.util.Date;
/**
 *
 * @author Admin
 */
public class Sinhvien {
    private String Hoten;
    private Date Ngaysinh;
    private float DiemTB;

    public Sinhvien() {
    }

    public Sinhvien(String Hoten, Date Ngaysinh, float DiemTB) {
        this.Hoten = Hoten;
        this.Ngaysinh = Ngaysinh;
        this.DiemTB = DiemTB;
    }

    public String getHoten() {
        return Hoten;
    }

    public float getDiemTB() {
        return DiemTB;
    }
    public String thongtinDSSV(){
        SimpleDateFormat formaterDate= new SimpleDateFormat("dd/MM/yyyy");
        return "Ho ten :"+this.Hoten+"Ngaysinh:"+formaterDate.format(this.Ngaysinh)+"Diem TB:"+this.DiemTB;
    }
}
