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
public class PhongThiNghiem extends PhongHoc{
    private String chuyennghanh;
    private String succhua;
    private boolean cobonrua;

    public PhongThiNghiem(String maphong, String daynha, double dientich, int sobongden,String chuyennghanh,String succhua,boolean cobonrua) {
        super(maphong, daynha, dientich, sobongden);
        this.chuyennghanh=chuyennghanh;
        this.succhua=succhua;
        
    }
    public boolean cobonrua(){
        return cobonrua;
    }

    public String getChuyennghanh() {
        return chuyennghanh;
    }

    public void setChuyennghanh(String chuyennghanh) {
        this.chuyennghanh = chuyennghanh;
    }

    public String getSucchua() {
        return succhua;
    }

    public void setSucchua(String succhua) {
        this.succhua = succhua;
    }

    @Override
    public boolean datchuan() {
        return super.datchuan()&& cobonrua; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String toString() {
        return "+chuyennghanh+"+chuyennghanh+"+succhua+"+succhua+"+super.toString()+"; //To change body of generated methods, choose Tools | Templates.
    }
    
}
