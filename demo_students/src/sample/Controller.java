package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.sql.*;
import java.util.ResourceBundle;

//chon dung TextArea cua scene
public class Controller extends Students implements Initializable{
    //Tạo tableview và column
    @FXML
    private TableView<Students> table;
    //gan id cho cac tableColumn va TextField
    @FXML
    private TableColumn<Students, Integer> idColumn;
    @FXML
    private TableColumn<Students, String> nameColumn;
    @FXML
    private TableColumn<Students, Integer> ageColumn;
    @FXML
    private TableColumn<Students, Integer> markColumn;
//    private ObservableList<Students> studentList; // list lưu trữ dữ liệu class Student
    //List lưu trữ dữ liệu từ DB
    ObservableList<Students> oblist = FXCollections.observableArrayList();
    @FXML
    private TextField nameText = new TextField();
    @FXML
    private TextField ageText = new TextField();
    @FXML
    private TextField markText = new TextField();
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        try{
            // step : Lấy  Driver
            Class.forName("com.mysql.cj.jdbc.Driver");
//            // Step 3: Tạo URL database
            String url = "jdbc:mysql://localhost:3306/ass5?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC"; // ở cuối là tên database
            String username = "root";
            String password = ""; // nếu dùng xampp để chuỗi trống
//            // Step 4: kết nối với database
            Connection conn = DriverManager.getConnection(url,username,password);
            System.out.println("Kết nối mySQL thành công!");
            //show all students
            Statement stm = conn.createStatement();
            String sql_txt1 = "SELECT * FROM students";
            ResultSet rs = stm.executeQuery(sql_txt1);//thực thi lệnh query sql_txt1 show students
            while (rs.next()){
                //thêm vào list tạo ở trên
                oblist.add(new Students(rs.getInt("id"), rs.getString("name"), rs.getInt("age"), rs.getInt("mark")));
            }
            idColumn.setCellValueFactory(new PropertyValueFactory<Students, Integer>("id"));
            nameColumn.setCellValueFactory(new PropertyValueFactory<Students, String>("name"));
            ageColumn.setCellValueFactory(new PropertyValueFactory<Students, Integer>("age"));
            markColumn.setCellValueFactory(new PropertyValueFactory<Students, Integer>("mark"));
            table.setItems(oblist);
        }catch (Exception e ){
            System.out.println(e.getMessage());
        }
    }
    //       public TextArea txtArea = new TextArea(); //bien txtArea giong ben demo ta vua tao
    public void add() throws Exception{//tuong duong vs constructor nhung no la 1 man hinh giao dien va phai khoi tao tu thoi diem ban dau
        //bai 1 them student vao class student
        //        studentList = FXCollections.observableArrayList(//them cac gia tri vao studentList
//                new Students(1, "Nguyen Thanh Tuan", 26, 5),
//                new Students(2, "Nguyen Minh Thang", 25, 10),
//                new Students(3, "Nguyen Trung ANh", 19, 5)
//        );
        //lấy thông tin từ text field
        String name = nameText.getText();
        Integer age = Integer.parseInt(ageText.getText());
        Integer mark = Integer.parseInt(markText.getText());
        try{
            // step : Lấy  Driver
            Class.forName("com.mysql.cj.jdbc.Driver");
//            // Step 3: Tạo URL database
            String url = "jdbc:mysql://localhost:3306/ass5?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC"; // ở cuối là tên database
            String username = "root";
            String password = ""; // nếu dùng xampp để chuỗi trống
//            // Step 4: kết nối với database
            Connection conn = DriverManager.getConnection(url,username,password);
            System.out.println("Kết nối mySQL thành công!");
            //Insert students
            Statement stm2 = conn.createStatement();
            String sql_txt2 = "INSERT INTO students(name,age,mark) VALUES('"+name+"',"+age+","+mark+")";//SQL query insert
            stm2.executeUpdate(sql_txt2);// Insert được thực hiện
            String sql_txt1 = "SELECT * FROM students";
            Statement stm1 = conn.createStatement();
            ResultSet rs2 = stm1.executeQuery(sql_txt1);
            oblist.removeAll(oblist); // reset lại List khi lấy về từ database mỗi khi nhấn button
            //Sử dụng dữ liệu vừa lấy từ truy vấn ra
            while (rs2.next()){
                oblist.add(new Students(rs2.getInt("id"), rs2.getString("name"), rs2.getInt("age"), rs2.getInt("mark")));
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

    }

//    public void add(ActionEvent e) {
//        Students newStudent = new Students();
//        newStudent.setName(nameText.getText());
//        newStudent.setAge(Integer.parseInt(ageText.getText()));//Interger.parseInt(s) tra s tu String ve kieu Interger
//        newStudent.setMark(Integer.parseInt(markText.getText()));
//        oblist.add(newStudent);
//    }
//    public void delete(ActionEvent e) {
//        Students selected = table.getSelectionModel().getSelectedItem();
//        for(Students student: oblist){
//            oblist.remove(selected);
//        }
//    }
}
