package Fraction;

public class Main {
    public static void main(String[] args) {
        Fraction ps1 = new Fraction(1, 2);
        Fraction ps2 = new Fraction(5, 23);
        Fraction ps3 = new Fraction();
        ps3.nhapPhanSo();
        System.out.println(ps3.inPhanSo());
        ps1.add(ps2);
        ps1.sub(ps2);
        ps1.mul(ps2);
        ps1.div(ps2);
        ps3.nghichDao();

    }
}
