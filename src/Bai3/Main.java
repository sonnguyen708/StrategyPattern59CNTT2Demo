/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai3;
//import java.util.Date;
//import java.text.DateFormat;
import java.text.ParseException;
//import java.util.ArrayList;
import java.text.SimpleDateFormat;

/**
 *
 * @author Admin
 */
public class Main {
    public static void main(String[] args) throws ParseException{
        //create class formatDate
        SimpleDateFormat formaterDate= new SimpleDateFormat("dd/MM/yyyy");
        Sinhvien sv1=new Sinhvien("Nguyen van A", formaterDate.parse("28/03/1999"), 9.0f);
        Sinhvien sv2=new Sinhvien("Nguyen van B", formaterDate.parse("26/03/1999"), 8.0f);
        Sinhvien sv3=new Sinhvien("Nguyen van C", formaterDate.parse("25/03/1999"), 7.0f);
        Sinhvien sv4=new Sinhvien("Nguyen van D", formaterDate.parse("24/03/1999"), 6.0f);
        Sinhvien sv5=new Sinhvien("Nguyen van E", formaterDate.parse("23/03/1999"), 5.0f);
        //them QLSV
        QLSV ql= new QLSV();
        ql.themsinhvien(sv1);
        ql.themsinhvien(sv2);
        ql.themsinhvien(sv3);
        ql.themsinhvien(sv4);
        ql.themsinhvien(sv5);
        // in danh sach ra man hinh
        System.out.println("In danh sach sinh vien:");
        ql.inDS();
        //sap xep sinh vien theo ten
        Sosanhtheoten theoten= new Sosanhtheoten();
        System.out.println("Sap xep theo ten:");
        ql.setSosanh(theoten);
        ql.sapxep();
        //sap xep sinh vien theo diem trung binh 
        Sosanhtheodiem theodiem= new Sosanhtheodiem();
        System.out.println("Sap xep theo diem trung binh:");
        ql.setSosanh(theodiem);
        ql.sapxep();
    }  
}
