package session6;

import Labs6.Product;
import connector.Connector;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.ListView;

import java.net.URL;
import java.util.ResourceBundle;
import java.sql.*;
public class List implements Initializable {
    public ListView lsView = new ListView();

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        try {
            String sql_txt1 = "SELECT * FROM product";
            Connector connector = Connector.getInstance();
            ResultSet rs = connector.getQuery(sql_txt1);
            ObservableList<Product> ls = FXCollections.observableArrayList();
            while (rs.next()){
                ls.add(new Product(rs.getInt("id"), rs.getString("name"), rs.getString("description"), rs.getInt("price"), rs.getInt("quantity")));
            }
            lsView.setItems(ls);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
    //SPQ SINGLE PAGE APPLICATION
    public void form(){
        try {
//            Parent form = FXMLLoader.load(getClass().getResource("form.fxml"));
//            Main.mainStage.getScene().setRoot(form);
            Load ld = Load.getInstance();
            Parent load = ld.loadScene("./form.fxml");
            Main.mainStage.getScene().setRoot(load);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
    public void addToCart(){
        Product selected = (Product) lsView.getSelectionModel().getSelectedItem();
        Main.cart.add(selected);
        System.out.println("Add to cart successfully");
    }
    public void cart(){
        try {
//            Parent cart = FXMLLoader.load(getClass().getResource("cart.fxml"));
//            Main.mainStage.getScene().setRoot(cart);
            Load ld = Load.getInstance();
            Parent load = ld.loadScene("cart.fxml");
            Main.mainStage.getScene().setRoot(load);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
