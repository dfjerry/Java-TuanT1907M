package Bai1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Fraction fraction1 = new Fraction();
        Fraction fraction2 = new Fraction();
        System.out.println("Nhập phân số 1 : ");
        fraction1.nhapPhanso();
        System.out.println("Nhập phân số 2: ");
        fraction2.nhapPhanso();
        System.out.print("Phân số 1 : ");
        fraction1.inPhanso();
        System.out.print("Phân số 2: ");
        fraction2.inPhanso();
        fraction1.add(fraction2);
        fraction1.sub(fraction2);
        fraction1.mul(fraction2);
        fraction1.div(fraction2);
    }
}
