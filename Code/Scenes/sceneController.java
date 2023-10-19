package Scenes;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.FXML;

import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class sceneController {
    private Stage stage;
    private Scene scene;
    private Parent root;


    public void switchToScene2(ActionEvent event) throws IOException 
    {
            root = FXMLLoader.load(getClass().getResource("Dnd Front1.0.fxml"));
            stage = (Stage)((Node)event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
    }

    
}
