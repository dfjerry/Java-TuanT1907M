package com.session1;

public class Human {
    public int age;
    public Human(){
        System.out.println("Vua tao 1 object Human"); //Tu dong chay ngay khi khoi tao doi tuong o main
    }
    public Human(String msg){
        System.out.println(msg);
    }
    public Human(int x){
        age = x;
        System.out.println("Vua set age");
    }
    public Human(int y,int x){

    }
    public void getInfo(){

        System.out.println("Age"+age);
    }

}
