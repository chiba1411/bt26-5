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
public class PhongHocLyThuyet extends PhongHoc{
    private boolean comaychieu;

    public PhongHocLyThuyet(String maphong, String daynha, double dientich, int sobongden,boolean comaychieu) {
        super(maphong, daynha, dientich, sobongden);
        this.comaychieu=comaychieu;
    }
    public boolean comaychieu(){
        return comaychieu;
    }
    @Override
    public boolean datchuan() {
        return super.datchuan() && comaychieu; //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public String toString() {
        return "+comaychieu+"+comaychieu+"+super.toString()+"; //To change body of generated methods, choose Tools | Templates.
    }

    
    
    
    
}
