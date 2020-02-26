package ss1_demo;

import com.session1.Car;

public class Toyota extends Car {
    protected int price;
    public Toyota(int year, String typeCar, String brand, int price){
//        this.year = year;
//        this.typeCar = typeCar;
//        this.brand = brand;
        super(year, typeCar, brand);//chay lai cac bien khoi tao tu class Car
        this.price = price;
    }
    public void showInfo(){
        super.getInfo();
        this.setYear(2003);
        System.out.println("Year "+year);
        System.out.println("Year "+typeCar);
    }
}
