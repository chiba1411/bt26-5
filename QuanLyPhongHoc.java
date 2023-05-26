/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author Admin
 */
public class QuanLyPhongHoc {
    private List<PhongHoc> danhsachphonghoc;
    public QuanLyPhongHoc(){
        danhsachphonghoc = new ArrayList<>();
    }
    public void themphonghoc(PhongHoc phongHoc){
        for (PhongHoc ph : danhsachphonghoc) {
            if(ph.getMaphong().equals(phongHoc.getMaphong())){
                System.out.println("Phong hoc co ma"+phongHoc.getMaphong()+"da ton tai");
            };
            return;
            
        }
        danhsachphonghoc.add(phongHoc);
        System.out.println("them phong hoc "+phongHoc.getMaphong());
    }
    public PhongHoc timphonghoc(String maphong){
        for (PhongHoc ph : danhsachphonghoc) {
            if(ph.getMaphong().equals(maphong)){
                return ph;
            }
            
        }return null;
    }
    public void indanhsachphonghoc(){
        System.out.println("danh sach phong hoc");
        for (PhongHoc ph : danhsachphonghoc) {
            System.out.println(ph);
        }
    }
    public void indanhsachphonghocdatchuan(){
        System.out.println("danh sach dat chuan");
        for (PhongHoc ph : danhsachphonghoc) {
            if(ph.datchuan()){
                System.out.println(ph);
            }
            
        }
    }
    public void sapxeptheodaynhatangdan(){
        Collections.sort(danhsachphonghoc,new Comparator<PhongHoc>(){
            @Override
            public int compare(PhongHoc p1,PhongHoc p2){
                return p1.getDaynha().compareTo(p2.getDaynha());
            }
        });
    }
    public void sapxeptheodientichgiamdan(){
        Collections.sort(danhsachphonghoc,new Comparator<PhongHoc>(){
            @Override
            public int compare(PhongHoc p1,PhongHoc p2){
                return Double.compare(p2.getDientich(), p1.getDientich());
            }
        });
    }
    public void sapxeptheobongdentangdan(){
        Collections.sort(danhsachphonghoc,new Comparator<PhongHoc>(){
            @Override
            public int compare(PhongHoc p1,PhongHoc p2){
                return Integer.compare(p1.getSobongden(), p2.getSobongden());
            }
        });
    }
    public void capnhapsomaytinh(String maphong,int somaytinh){
        PhongHoc ph= timphonghoc(maphong);
        if(ph instanceof PhongMayTinh){
            ((PhongMayTinh)ph).setSomaytinh(somaytinh);
            System.out.println("cap nhap so may tinh "+maphong+"thanh cong");
        }else{
            System.out.println("phong"+maphong+"khong la phong may tinh");
        }
    }
    public void xoaphonghoc(String maphong){
        
    }
    public void intongsophonghoc(){
        int tongsophonghoc=danhsachphonghoc.size();
        System.out.println("tong so phong hoc"+tongsophonghoc);
    }
    public void indanhsachphongmayco60may(){
        System.out.println("sanh sach phong may co 60 may");
        for (PhongHoc ph : danhsachphonghoc) {
            if(ph instanceof PhongMayTinh && ((PhongMayTinh)ph).getSomaytinh()==60){
                System.out.println(ph);
            }
        }
    }
}
