package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class Students {

    public String name;
    public int age;
    public int mark;

    public Students(String name, int age, int mark) {
        this.name = name;
        this.age = age;
        this.mark = mark;
    }
    public Students(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }
}
