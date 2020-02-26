package com.session1;

public class Car {
    protected int year = 2020; //protected ra ngoai package chi ai ke' thua ms dc dung
    protected String typeCar = "AutoCar";
    protected String brand = "Auto";
    public Car(){

    }
    public Car(int year, String typeCar, String brand) {//Ham khởi tạo đầy đủ tham số
        this.year = year;
        this.typeCar = typeCar;
        this.brand = brand;
    }

    public void getInfo(){
        System.out.println("Brand "+brand);
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getTypeCar() {
        return typeCar;
    }

    public void setTypeCar(String typeCar) {
        this.typeCar = typeCar;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}
