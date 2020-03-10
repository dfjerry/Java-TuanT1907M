package Lab1DAO;

import Lab1.Student;
import Labs6.Product;
import connector.Connector;

import java.sql.ResultSet;
import java.util.ArrayList;

public class StudentDataAccessObject implements DataAccessObjectConcreate<Student> {//them obj Student de biet DAO cua cai nao
    //tao instance
    private static StudentDataAccessObject instance;
    //tao 1 doi tuong cua class
    private StudentDataAccessObject(){

    }
    //get instance
    public static StudentDataAccessObject getInstance(){
        if(instance == null){
            instance = new StudentDataAccessObject();
        }
        return instance;
    }
    //arraylist cua Student de in du lieu ra list view
    @Override
    public ArrayList list() {
        try {
            Connector conn = Connector.getInstance();//ket noi DB
            ResultSet rs = conn.getQuery("SELECT * FROM students");//cau sql
            ArrayList<Student> ls = new ArrayList<>(); //tao list ls
            while (rs.next()){
                ls.add(new Student(rs.getString("name"), rs.getInt("age"), rs.getInt("mark")));
            }
            return ls; //add các dữ liệu vào ls rồi trả về ls
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return null;
    }


    @Override
    public Boolean create(Student student) {
        try {
            Connector conn = Connector.getInstance();//ket noi
            String sql_text = "INSERT INTO students(name, age, mark) VALUES ('"+ student.getName()+","+student.getAge()+","+student.getMark()+")";
            return conn.executeUpdate(sql_text);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return false;//tra ve false khi sai
    }

    @Override
    public Boolean update(Student student) {
        try {
            Connector conn = Connector.getInstance();//ket noi
            String sql_text = "UPDATE product SET name = "+student.getName()+"age = "+student.getAge()+"mark = "+student.getMark()+"WHERE id ="+student.getId();////cau query update tai 1 ID nao do
            return conn.executeUpdate(sql_text);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return false;
    }

    @Override
    public Boolean delete(Student student) {
        try {
            Connector conn = Connector.getInstance();//ket noi
            String sql_text = "DELETE FROM product WHERE id = "+student.getId();
            return conn.executeUpdate(sql_text);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return false;
    }
}
