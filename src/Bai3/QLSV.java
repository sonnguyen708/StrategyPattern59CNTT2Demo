/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai3;
import java.util.ArrayList;
/**
 *
 * @author Admin
 */
public class QLSV {
    ISosanh sosanh;
    ArrayList<Sinhvien>dsSV= new ArrayList<>();
    public void setSosanh(ISosanh sosanh){
        this.sosanh=sosanh;
    }
    public void themsinhvien(Sinhvien sv){
        dsSV.add(sv);
    }
    public void sapxep(){
        dsSV.sort((x,y)->sosanh.sosanh((Sinhvien) x,(Sinhvien) y));
    }
    //inDS
    public void inDS(){
        dsSV.forEach(sv->System.out.println("Sinh vien:"+sv.thongtinDSSV()));
    }
}
