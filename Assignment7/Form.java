package session6;

import connector.Connector;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import java.sql.*;
public class Form {
    public TextField txtName = new TextField();
    public TextArea txtDesc = new TextArea();
    public TextField txtPrice = new TextField();
    public TextField txtQtt = new TextField();
    public void submit(){
        try {
            Connector connector = Connector.getInstance();
            String name = txtName.getText();
            String desc = txtDesc.getText();
            Integer price = Integer.parseInt(txtPrice.getText());
            Integer quantity = Integer.parseInt(txtQtt.getText());

            String sql_text = "INSERT INTO product(name, description, price, quantity) VALUES ('"+name+"','"+desc+"',"+price+","+quantity+")";
            Boolean prstm = connector.executeUpdate(sql_text);
            //PreparedStatement prStm = conn.prepareStatement(sql_text);
//            //dien vao value
//            prStm.setString(1, name);
//            prStm.setString(2, desc);
//            prStm.setInt(3, price);
//            prStm.setInt(4, quantity);
 //           if (!prStm.execute()){// prStm.execute() tra ve kieu boolean
                Parent form = FXMLLoader.load(getClass().getResource("list.fxml"));
                Main.mainStage.getScene().setRoot(form);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
