package ASS1;

public class RightTriangle extends Triangle {
    public RightTriangle(){
    super();
    }
    public RightTriangle(int a, int b, int c){
        super(a, b, c);
    }
    public void showRight(){
        super.getPerimeter();
        super.getArea();
    }
}
