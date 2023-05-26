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
public class PhongMayTinh extends PhongHoc{
    private int somaytinh;

    public PhongMayTinh(String maphong, String daynha, double dientich, int sobongden,int somaytinh) {
        super(maphong, daynha, dientich, sobongden);
        this.somaytinh=this.somaytinh;
    }

    public int getSomaytinh() {
        return somaytinh;
    }

    public void setSomaytinh(int somaytinh) {
        this.somaytinh = somaytinh;
    }

    @Override
    public String toString() {
        return "+somaytinh+"+somaytinh+"+super.toString()+"; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean datchuan() {
        return super.datchuan() && somaytinh >= getDientich()/1.5; //To change body of generated methods, choose Tools | Templates.
    }
    
}
