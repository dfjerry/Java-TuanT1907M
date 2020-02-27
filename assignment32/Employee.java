package assignment32;

import java.util.ArrayList;
import java.util.Scanner;

public class Employee {
    public int ID;
    public String name;
    public int salary;

    public Employee(int ID, String name, int salary) {
        this.ID = ID;
        this.name = name;
        this.salary = salary;
    }
    public Employee(){

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

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "ID=" + ID +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
    public ArrayList<Employee> personModelEmployee = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    public void addEmployee(int ID, String name, int salary){
        this.ID = ID;
        this.name = name;
        this.salary = salary;
    }
    public void addEmployee(){
        for(int i=0; i<1; i++){
            Employee employee = new Employee(sc.nextInt(), sc.next(), sc.nextInt());
        }
    }
}
