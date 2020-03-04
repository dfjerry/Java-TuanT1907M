package Labs6;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.stage.Stage;

import java.awt.*;

public class Cart {
    @FXML
    private TableColumn<Products, Integer> idcColumn;
    @FXML
    private TableColumn<Products, String> namecColumn;
    @FXML
    private TableColumn<Products, String> descrcColumn;
    @FXML
    private TableColumn<Products, Integer> pricecColumn;
    @FXML
    private TableColumn<Products, Integer> amountcColumn;
    public void setProduct(Products product){
        idcColumn.setText(String.valueOf(product.getId()));
        namecColumn.setText(product.getName());
        descrcColumn.setText(product.getDescr());
        pricecColumn.setText(String.valueOf(product.getPrice()));
        amountcColumn.setText(String.valueOf(product.getAmount()));
    }
    public void goBackMain(ActionEvent e){
        try {
            Stage stage = (Stage) ((Node) e.getSource()).getScene().getWindow();
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("main.fxml"));
            Parent mainParent = loader.load();//Parent tao ra scene
            Scene scene = new Scene(mainParent);
            stage.setScene(scene);

        }catch (Exception b){
            System.out.println(b.getMessage());
        }

    }
}
