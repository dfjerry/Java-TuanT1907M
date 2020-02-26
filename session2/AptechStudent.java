package session2;

public class AptechStudent extends Student implements StudentInterface, HumanInterface{//khi ke thua student thi chi dc ke thua 1 lop(class), 1 lop chi có 1 lớp cha
    //khi implements thi phai trien khai het ham ben interface
    @Override
    public void ShowInfo() {
        System.out.println("Hello teacher!");
    }

    @Override
    public void study() {

    }

    @Override
    public void playGame() {

    }

    @Override
    public void sleep() {

    }

    @Override
    public void running() {

    }

    @Override
    public int getAge() {
        return 0;
    }

    @Override
    public void eating() {

    }
}
