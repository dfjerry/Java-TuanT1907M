package com.session1;

public class Main {

    public static void main(String[] args) {
        Human h = new Human(15);
        System.out.println("Tuoi: "+h.age);
        h.getInfo();
        Car c = new Car();
        System.out.println("Year: "+c.year);
    }
}
