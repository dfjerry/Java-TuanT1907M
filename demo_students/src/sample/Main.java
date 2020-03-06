package assignment5;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
    public static void main(String[] args) {
        launch(args);
    }
    //Buoc 1 lam cho khung ko bi bien mat
    public static Stage mainStage;
    @Override
    public void start(Stage primaryStage){
        mainStage = primaryStage;
        try{
            Parent root = FXMLLoader.load(getClass().getResource("list.fxml"));
            primaryStage.setTitle("Student");
            primaryStage.setScene(new Scene(root,800,600));
            primaryStage.show();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

    }
}
