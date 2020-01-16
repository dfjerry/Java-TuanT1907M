package Fraction;

import ASS1.Main;

import java.util.Scanner;

public class Fraction {
    protected int tuSo;
    protected int mauSo;
    public Fraction(){

    }
    public Fraction(int tuSo, int mauSo){
        this.tuSo = tuSo;
        this.mauSo = mauSo;
    }

    public int getTuSo() {
        return tuSo;
    }

    public void setTuSo(int tuSo) {
        this.tuSo = tuSo;
    }

    public int getMauSo() {
        return mauSo;
    }

    public void setMauSo(int mauSo) {
        this.mauSo = mauSo;
    }
    public void nhapPhanSo(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap tu so: ");
        tuSo = sc.nextInt();
        do {
            System.out.println("Nhap mau so(DK: #0): ");
            mauSo = sc.nextInt();
        }while (mauSo ==0);
    }
    public String inPhanSo(){
        return "Phan so: " + tuSo + "/" + mauSo;
    }
    public int timUSCLN(int a, int b){
        while (a != b){
            if(a>b){
                a -= b;
            }else{
                b -= a;
            }
        }
        return a;

    }
    public void rutGon(){
        int i = timUSCLN(this.getTuSo(), this.getMauSo());
        this.setTuSo(this.getTuSo()/i);
        this.setMauSo(this.getMauSo()/i);
    }
    public void nghichDao(){
        int ts = this.getMauSo();
        int ms = this.getTuSo();
        Fraction nghichDao = new Fraction(ts, ms);
        nghichDao.rutGon();
        System.out.println("So nghich dao la: "+nghichDao.tuSo +"/"+nghichDao.mauSo);
    }
    public void add(Fraction phanSo){
        int ts = this.getTuSo() * phanSo.getMauSo() +  phanSo.getTuSo() * this.getMauSo();
        int ms = this.getMauSo() * phanSo.getMauSo();
        Fraction phanSoTong = new Fraction(ts, ms);
        phanSoTong.rutGon();
        System.out.println("Tong hai phan so = "+phanSoTong.tuSo + "/" + phanSoTong.mauSo);
    }
    public void sub(Fraction phanSo){
        int ts = this.getTuSo() * phanSo.getMauSo() - phanSo.getTuSo() * this.getMauSo();
        int ms = this.getMauSo() * phanSo.getMauSo();
        Fraction phanSoHieu = new Fraction(ts, ms);
        phanSoHieu.rutGon();
        System.out.println("Hieu hai phan so = "+phanSoHieu.tuSo + "/" + phanSoHieu.mauSo);
    }
    public void mul(Fraction phanSo){
        int ts = this.getTuSo() * phanSo.getTuSo();
        int ms = this.getMauSo() * phanSo.getMauSo();
        Fraction phansoTich = new Fraction(ts, ms);
        phansoTich.rutGon();
        System.out.println("Tich hai phan so = "+phansoTich.tuSo + "/"+phansoTich.mauSo);
    }
    public void div(Fraction phanSo){
        int ts = this.getTuSo() * phanSo.getMauSo();
        int ms = this.getMauSo() * phanSo.getTuSo();
        Fraction phanSoThuong = new Fraction(ts, ms);
        phanSoThuong.rutGon();
        System.out.println("Thuong hai phan so  = "+phanSoThuong.tuSo + "/"+phanSoThuong.mauSo);
    }
}
