package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class Students {
    public int id;
    public String name;
    public int age;
    public int mark;

    public Students(int id, String name, int age, int mark) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.mark = mark;
    }
    public Students(){

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
