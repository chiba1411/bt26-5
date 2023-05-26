/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap1;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Main {

    private static Scanner sc = new Scanner(System.in);
    private static QuanLyPhongHoc ql = new QuanLyPhongHoc();

    public static void main(String[] args) {
        int chon;
        do {
            System.out.println("menu quan ly phong hoc");
            System.out.println("1.them phong hoc");
            System.out.println("2.tim phong hoc");
            System.out.println("3.in danh sach phong hoc");
            System.out.println("4.in danh sach phong hoc dat chuan");
            System.out.println("5.sap xep theo dai nha tang dan");
            System.out.println("6.sap xep theo dien tich giam");
            System.out.println("7.sap xep theo bong den tang dan");
            System.out.println("8.cap nhap so may tinh");
            System.out.println("9.xoa phog hoc");
            System.out.println("10.in tong so phong hoc");
            System.out.println("11.in danh sach may co 60 may");
            System.out.println("0.thoat");
            System.out.println("nhap lua chon");
            chon = sc.nextInt();
            sc.nextLine();
            switch (chon) {
                case 1:
                    themphonghoc();
                    break;
                case 2:
                    timphonghoc();
                    break;
                case 3:
                    indanhsachphonghoc();
                    break;
                case 4:
                    indanhsachphonghocdatchuan();
                    break;
                case 5:
                    sapxeptheochieudaitangdan();
                    break;
                case 6:
                    sapxemtheodientichgiamdan();
                    break;
                case 7:
                    sapxeptheobongdentangden();
                    break;
                case 8:
                    capnhapsomaytinh();
                    break;
                case 9:
                    xoaphonghoc();
                    break;
                case 10:
                    intongsophonghoc();
                    break;
                case 11:
                    indanhsachmayco60may();
                    break;
                case 0:
                    System.out.println("ket thuc");
                    break;
                    System.out.println("chon khong hop le.chon lai");
                    break;
            }

        } while (chon != 0);
        

    public static void themphonghoc() {
        System.out.println("them phong hoc");
        System.out.println("nhap ma phong hoc");
        String maphong = sc.nextLine();
        System.out.println("nhap day nha");
        String daynha = sc.nextLine();
        System.out.println("nhap dien tich");
        Double dientich = sc.nextDouble();
        System.out.println("nhap so bong den");
        int sobongden = sc.nextInt();
        sc.nextLine();
        System.out.println("chon loai phong hoc");
        System.out.println("1.phong hoc ly thuyet");
        System.out.println("2.phong may tinh");
        System.out.println("3.phong thi nghiem");
        System.out.println("moi nhap lua chon");
        int loaiphong = sc.nextInt();
        sc.nextLine();
        switch (loaiphong) {
            case 1:
                System.out.println("co may chieu(true/false)");
                boolean comaychieu = sc.nextBoolean();
                ql.themphonghoc(new PhongHocLyThuyet(maphong, daynha, dientich, sobongden, comaychieu));
                System.out.println("them phong hoc ly thuyet thanh cong");
                break;
            case 2:
                break;
            case 3:
                break;
        }

    }
}
}
