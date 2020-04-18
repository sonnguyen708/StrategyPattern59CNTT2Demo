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
public class Main {
    public static void main(String[] args){
        Context ct= new Context();
        ct.setTinhToan(new Cong());
        System.out.println("75+12="+ct.Tinh(75,12));
        ct.setTinhToan(new Tru());
        System.out.println("54-78="+ct.Tinh(54,78));
    }
}
