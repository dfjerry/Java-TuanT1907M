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
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import java.util.Scanner;

//chon dung TextArea cua scene
public class Controller extends Students implements Initializable{
    @FXML
    private TableView<Students> table;
    //gan id cho cac tableColumn va TextField
    @FXML
    private TableColumn<Students, String> nameColumn;
    @FXML
    private TableColumn<Students, Integer> ageColumn;
    @FXML
    private TableColumn<Students, Integer> markColumn;
    private ObservableList<Students> studentList;
    @FXML
    private TextField nameText;
    @FXML
    private TextField ageText;
    @FXML
    private TextField markText;
    //    public TextArea txtArea = new TextArea(); //bien txtArea giong ben demo ta vua tao
    @Override
    public void initialize(URL location, ResourceBundle resources) {//tuong duong vs constructor nhung no la 1 man hinh giao dien va phai khoi tao tu thoi diem ban dau

        studentList = FXCollections.observableArrayList(
                new Students("Nguyen Thanh Tuan", 26, 5),
                new Students("Nguyen Minh Thang", 25, 10),
                new Students("Nguyen Trung ANh", 19, 5)
        );
        nameColumn.setCellValueFactory(new PropertyValueFactory<Students, String>("name"));
        ageColumn.setCellValueFactory(new PropertyValueFactory<Students, Integer>("age"));
        markColumn.setCellValueFactory(new PropertyValueFactory<Students, Integer>("mark"));
        table.setItems(studentList);

    }
    public void add(ActionEvent e) {
        Students newStudent = new Students();
        newStudent.setName(nameText.getText());
        newStudent.setAge(Integer.parseInt(ageText.getText()));//Interger.parseInt(s) tra s tu String ve kieu Interger
        newStudent.setMark(Integer.parseInt(markText.getText()));
        studentList.add(newStudent);
    }
    public void delete(ActionEvent e) {
        Students selected = table.getSelectionModel().getSelectedItem();
        for(Students student: studentList){
            studentList.remove(selected);
        }
    }
}
