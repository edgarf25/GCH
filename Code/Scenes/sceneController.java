package Scenes;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class sceneController {
    private Stage stage;
    private Scene scene;
    private Parent root;
    int counter = 0;

    String[] str = {"1.FXML", "2.FXML"};

    public void switchToSceneNext(ActionEvent event, int fxml) throws IOException 
    {
        root = FXMLLoader.load(getClass().getResource(str[counter]));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void switchToRace(ActionEvent event) throws IOException 
    {
        root = FXMLLoader.load(getClass().getResource("race.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }


    
}
