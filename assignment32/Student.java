package assignment32;

import java.util.ArrayList;
import java.util.Scanner;

public class Student {
    public int ID;
    public String name;
    public int age;

    public Student(int ID, String name, int age) {
        this.ID = ID;
        this.name = name;
        this.age = age;
    }
    public Student(){

    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
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

    @Override
    public String toString() {
        return "Student{" +
                "ID=" + ID +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
    public ArrayList<Student> personModelStudent = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    public void addStudent(){
        for(int i=0;i<1;i++){
            Student student = new Student(sc.nextInt(), sc.next(), sc.nextInt());
        }
    }
}
