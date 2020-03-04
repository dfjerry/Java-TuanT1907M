package Labs6;

import javafx.application.Application;
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
    public void start(Stage primaryStage) throws Exception {
        mainStage = primaryStage;
        try{
            Parent root = FXMLLoader.load(getClass().getResource("main.fxml"));
            primaryStage.setTitle("Products");
            primaryStage.setScene(new Scene(root, 1000, 600));
            primaryStage.show();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
