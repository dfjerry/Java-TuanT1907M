package assignment5;

import Lab1.Student;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.ListView;

import java.net.URL;
import java.util.ResourceBundle;
//Step1
import java.sql.*;
public class List implements Initializable {
    public ListView<Student> lsView = new ListView();
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        try{
            //Step 2
            Class.forName("com.mysql.cj.jdbc.Driver");
            //Step 3
            String url = "jdbc:mysql://localhost:3306/ass5?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC"; // ở cuối là tên database
            String username = "root";
            String password = ""; // nếu dùng xampp để chuỗi trống
            //Step4 tao connection
            Connection conn = DriverManager.getConnection(url, username, password);
            System.out.println("Ket noi MySQL thanh cong");
            //Query SQL
            String sql_text = "SELECT * FROM students";
            Statement stm = conn.createStatement();
            ResultSet rs = stm.executeQuery(sql_text);//hứng câu truy vấn vứt vào rs của lớp result set
            //1 danh sach cho FX
            ObservableList ls = FXCollections.observableArrayList();// tuong tu array list nhung danh rieng cho connection
            while (rs.next()){
                Student st = new Student(rs.getString("name"), rs.getInt("age"), rs.getInt("mark"));
                ls.add(st);
            }
            lsView.setItems(ls);
            //selectedItems
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
    public void form(){
        //Buoc 2 goi noi dung muon nap vao
        try{
            Parent form = FXMLLoader.load(getClass().getResource("form.fxml"));
            Main.mainStage.getScene().setRoot(form);
        }catch (Exception e){
            System.out.println("Error");
        }
    }
}
