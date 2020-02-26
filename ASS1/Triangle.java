package ASS1;

import java.util.Scanner;

public class Triangle {
    protected int a;
    protected int b;
    protected int c;
    protected double p;
    public Triangle(){

    }
    public Triangle(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }
    public int getPerimeter(){
        return a + b + c;
    }
    public double getArea(){
        p = getPerimeter()/2;
        return Math.sqrt(p*(p-a)*(p-b)*(p-c));
    }


}
