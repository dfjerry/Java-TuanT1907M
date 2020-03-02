package sample;

import javafx.beans.property.Property;
import javafx.beans.property.StringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.StackPane;

import javax.print.DocFlavor;
import java.awt.*;
import java.net.URL;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

//chon dung TextArea cua scene
public class Controller extends Students implements Initializable{
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
//    private ObservableList<Students> studentList;
    ObservableList<Students> oblist = FXCollections.observableArrayList();
//
//    @FXML
//    private TextField nameText;
//    @FXML
//    private TextField ageText;
//    @FXML
//    private TextField markText;
//        public TextArea txtArea = new TextArea(); //bien txtArea giong ben demo ta vua tao
    @Override
    public void initialize(URL location, ResourceBundle resources) {//tuong duong vs constructor nhung no la 1 man hinh giao dien va phai khoi tao tu thoi diem ban dau
//bai 1 them student vao class student
        //        studentList = FXCollections.observableArrayList(//them cac gia tri vao studentList
//                new Students(1, "Nguyen Thanh Tuan", 26, 5),
//                new Students(2, "Nguyen Minh Thang", 25, 10),
//                new Students(3, "Nguyen Trung ANh", 19, 5)
//        );
        try{
            Connection con = DBConnector.getConnection();
            ResultSet rs = con.createStatement().executeQuery("SELECT * FROM students");
            while (rs.next()){
                oblist.add(new Students(rs.getInt("id"), rs.getString("name"), rs.getInt("age"), rs.getInt("mark")));
            }
        }catch (SQLException e){
            Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, e);
        }
        idColumn.setCellValueFactory(new PropertyValueFactory<Students, Integer>("id"));
        nameColumn.setCellValueFactory(new PropertyValueFactory<Students, String>("name"));
        ageColumn.setCellValueFactory(new PropertyValueFactory<Students, Integer>("age"));
        markColumn.setCellValueFactory(new PropertyValueFactory<Students, Integer>("mark"));
        table.setItems(oblist);
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
