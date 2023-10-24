package Scenes;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.ImageCursor;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import javafx.scene.control.ChoiceBox;

public class sceneController {
    private Stage stage;
    private Scene scene;
    private Parent root;
    @FXML
    private ChoiceBox<String> racebox;



    public void switchToScene2(ActionEvent event) throws IOException 
    {
            Image cursor = new Image("/src/sword.png");//changing cursor
            root = FXMLLoader.load(getClass().getResource("../application/Race-Subrace 1.0.fxml"));
            stage = (Stage)((Node)event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            scene.setCursor(new ImageCursor(cursor));
            stage.setScene(scene);
            stage.show();
    }
}

