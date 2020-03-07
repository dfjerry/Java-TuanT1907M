package session6;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;

public class Load {
    private static Load ld;
    public static Load getInstance(){
        if(ld == null){
            ld = new Load();
        }
        return ld;
    }
    public Parent loadScene(String form) throws Exception{
        return FXMLLoader.load(getClass().getResource(form));
    }
}
