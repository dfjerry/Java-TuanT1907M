package Bai1;

import java.util.Scanner;

public class Fraction {
    public int tuSo;
    public int mauSo;

    public Fraction() {
    }

    public Fraction(int tuSo, int mauSo) {
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
    public void nhapPhanso(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào tử số: ");
        tuSo = sc.nextInt();
        System.out.println("Nhập vào mẫu số ");
        mauSo = sc.nextInt();
    }
    public void inPhanso(){
        System.out.println(getTuSo()+"/"+getMauSo());
    }
    public int timUSCLN(int a, int b) {
        while (a != b) {
            if (a > b) {
                a -= b;
            } else {
                b -= a;
            }
        }
        return a;
    }
    public void rutgonPhanso(){
        int i = timUSCLN(getTuSo(),getMauSo());
        setTuSo(getTuSo()/i);
        setMauSo(getMauSo()/i);
    }
    public void add(Fraction fraction){
        int tu = getTuSo() * fraction.getMauSo() + fraction.getTuSo()*getMauSo();
        int mau = getMauSo() * fraction.getMauSo();
        Fraction fractionAdd = new Fraction(tu,mau);
        fractionAdd.rutgonPhanso();
        System.out.println("Phân số kết quả sau khi cộng là "+fractionAdd.tuSo+"/"+fractionAdd.getMauSo());
    }
    public void sub(Fraction fraction){
        int tu = getTuSo() * fraction.getMauSo() - fraction.getTuSo()*getMauSo();
        int mau = getMauSo() * fraction.getMauSo();
        Fraction fractionSub = new Fraction(tu,mau);
        fractionSub.rutgonPhanso();
        System.out.println("Phân số kết quả sau khi trừ là "+fractionSub.tuSo+"/"+fractionSub.getMauSo());
    }
    public void mul (Fraction fraction){
        int tu = getTuSo() * fraction.getTuSo();
        int mau = getMauSo() * fraction.getMauSo();
        Fraction fractionMul = new Fraction(tu,mau);
        fractionMul.rutgonPhanso();
        System.out.println("Phân số kết quả sau khi nhân là "+fractionMul.tuSo+"/"+fractionMul.getMauSo());
    }
    public void div(Fraction fraction){
        int tu = getTuSo() * fraction.getMauSo();
        int mau = getMauSo() * fraction.getTuSo();
        Fraction fractionDiv = new Fraction(tu,mau);
        fractionDiv.rutgonPhanso();
        System.out.println("Phân số kết quả sau khi chia là "+fractionDiv.tuSo+"/"+fractionDiv.getMauSo());

    }
}
