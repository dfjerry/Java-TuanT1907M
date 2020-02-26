package ASS1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a,b,c;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Nhap vao canh a: ");
            a = sc.nextInt();
            System.out.println("Nhap vao canh b: ");
            b = sc.nextInt();
            System.out.println("Nhap vao canh c: ");
            c = sc.nextInt();
        }while (!Main.kiemTra(a,b,c));
        Triangle tg = new Triangle();
        System.out.println("Chu vi "+tg.getPerimeter());
        System.out.println("Dien tich "+tg.getArea());
    }
    public static boolean kiemTra(int a, int b, int c){
        if(a+b>c && a+c>b && b+c>a) return true;
            System.out.println("Day khong phai la 3 canh tam giac.");
            return false;
    }
}
