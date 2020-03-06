package assignment5;
//Step1
import Lab1.Student;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.TextField;

import java.sql.*;
public class Form {
    public TextField txtName = new TextField();
    public TextField txtAge = new TextField();
    public TextField txtMark = new TextField();
    public void submitStudent() throws Exception{
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
            String name = txtName.getText();
            Integer age;
            Integer mark;
            age = Integer.parseInt(txtAge.getText());// đọc parseInt để đọc từ int --> string
            mark = Integer.parseInt(txtMark.getText());
            Student s = new Student(name, age, mark);

            String sql_text = "INSERT INTO students(name, age, mark) VALUE('"+name+"',"+age+","+mark+")";
            Statement stm = conn.createStatement();
            int row_number = stm.executeUpdate(sql_text);//Update, tra ve so row du lieu bi anh huong
            if(row_number>0){
                //chuyen ve man hinh danh sach
                Parent list = FXMLLoader.load(getClass().getResource("list.fxml"));
                Main.mainStage.getScene().setRoot(list);

            }else{
                //thong bao gi do --> validation

            }
        }catch (Exception e){
            throw new Exception("Loi mat roi");//Crash app
        }
    }
}
