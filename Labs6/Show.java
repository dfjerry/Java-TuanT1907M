package Labs6;
import assignment5.Main;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.net.URL;
import java.sql.*;
import java.util.ResourceBundle;
//tao table view
public class Show implements Initializable {
    @FXML
    private TableView<Products> table1 = new TableView<>();
    //gan id cho cac column
    @FXML
    private TableColumn<Products, Integer> id1Column;
    @FXML
    private TableColumn<Products, String> name1Column;
    @FXML
    private TableColumn<Products, String> descr1Column;
    @FXML
    private TableColumn<Products, Integer> price1Column;
    @FXML
    private TableColumn<Products, Integer> amount1Column;
    //List lưu trữ dữ liệu từ DB
    ObservableList<Products> oblist = FXCollections.observableArrayList();
    public TextField txtName = new TextField();
    public TextField txtDesc = new TextField();
    public TextField txtPrice = new TextField();
    public TextField txtAmount = new TextField();
//day thay oi ok de e xem cai list fxml la cai nao thay main ah dung r thay
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        try {
            //Step 2
            Class.forName("com.mysql.cj.jdbc.Driver");
            //Step 3
            String url = "jdbc:mysql://localhost:3306/labs6?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC"; // ở cuối là tên database
            String username = "root";
            String password = ""; // nếu dùng xampp để chuỗi trống
            //Step4 tao connection
            Connection conn = DriverManager.getConnection(url, username, password);
            System.out.println("Ket noi MySQL thanh cong");
            //Query SQL
            String sql_text = "SELECT * FROM products";
            Statement stm = conn.createStatement();
            ResultSet rs = stm.executeQuery(sql_text);//hứng câu truy vấn vứt vào rs của lớp result set
            while (rs.next()){
                Products st = new Products(rs.getString("name"), rs.getString("descr"), rs.getInt("price"), rs.getInt("amount"));
                oblist.add(st);
            }
            id1Column.setCellValueFactory(new PropertyValueFactory<Products, Integer>("id"));
            name1Column.setCellValueFactory(new PropertyValueFactory<Products, String>("name"));
            descr1Column.setCellValueFactory(new PropertyValueFactory<Products, String>("descr"));
            price1Column.setCellValueFactory(new PropertyValueFactory<Products, Integer>("price"));
            amount1Column.setCellValueFactory(new PropertyValueFactory<Products, Integer>("amount"));
            table1.setItems(oblist);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        //set cell column

//hmm thay co xem bai demo htrc ko e cung ko chay ra dc
        // bai nao thay bat xem
    }
    //goi tab muon nap vao
    public void add(){
        String name = txtName.getText();
        String descr = txtDesc.getText();
        Integer price = Integer.parseInt(txtPrice.getText());
        Integer amount = Integer.parseInt(txtAmount.getText());
        try{
            //Step 2
            Class.forName("com.mysql.cj.jdbc.Driver");
            //Step 3
            String url = "jdbc:mysql://localhost:3306/labs6?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC"; // ở cuối là tên database
            String username = "root";
            String password = ""; // nếu dùng xampp để chuỗi trống
            //Step4 tao connection
            Connection conn = DriverManager.getConnection(url, username, password);
            System.out.println("Ket noi MySQL thanh cong");
            Statement stm = conn.createStatement();
            String sql_text2 = "INSERT INTO products(name, descr, price, amount) VALUE('"+name+"','"+descr+"',"+ price+","+amount+")";
            stm.executeUpdate(sql_text2);
            String sql_text1 = "SELECT * FROM products";
            ResultSet rs = stm.executeQuery(sql_text1);//hứng câu truy vấn vứt vào rs của lớp result set
            oblist.removeAll(oblist);
            while (rs.next()){
                oblist.add(new Products(rs.getString("name"), rs.getString("descr"), rs.getInt("price"), rs.getInt("amount")));
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
    //goi tab cart
//    public void cart(){
//        try{
//            Parent cart = FXMLLoader.load(getClass().getResource("cart.fxml"));
//            Main.mainStage.getScene().setRoot(cart);
//        }catch (Exception e){
//            System.out.println(e.getMessage());
//        }
//    }
    public void cart(ActionEvent e){
        try {
            Stage stage = (Stage) ((Node) e.getSource()).getScene().getWindow();
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("cart.fxml"));
            Parent cartView = loader.load();
            Scene scene = new Scene(cartView);
            stage.setScene(scene);
            //Select product add to cart
            Cart cart = loader.getController();
            Products selected = table1.getSelectionModel().getSelectedItem();//tạo obj selected (của Products) select bằng việc click vào
            cart.setProduct(selected);
            //set scene sau khi da select



        }catch (Exception a){
            System.out.println(a.getMessage());
        }
    }
}
