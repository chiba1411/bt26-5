/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap1;

/**
 *
 * @author Admin
 */
public class PhongHoc {
    private String maphong;
    private String daynha;
    private double dientich;
    private int sobongden;

    public PhongHoc(String maphong, String daynha, double dientich, int sobongden) {
        this.maphong = maphong;
        this.daynha = daynha;
        this.dientich = dientich;
        this.sobongden = sobongden;
    }

    public String getMaphong() {
        return maphong;
    }

    public void setMaphong(String maphong) {
        this.maphong = maphong;
    }

    public String getDaynha() {
        return daynha;
    }

    public void setDaynha(String daynha) {
        this.daynha = daynha;
    }

    public double getDientich() {
        return dientich;
    }

    public void setDientich(double dientich) {
        this.dientich = dientich;
    }

    public int getSobongden() {
        return sobongden;
    }

    public void setSobongden(int sobongden) {
        this.sobongden = sobongden;
    }
    public boolean datchuan(){
        return coduanhsang();
    }
    public boolean coduanhsang(){
        return sobongden >= dientich/10;
    }
    
    @Override
    public String toString() {
        return "PhongHoc{" + "maphong=" + maphong + ", daynha=" + daynha + ", dientich=" + dientich + ", sobongden=" + sobongden + '}';
    }
    
}
