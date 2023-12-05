package Scenes;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.ImageCursor;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class sceneController {
    private Stage stage;
    private Scene scene;
    private Parent root;


    String array[] = {"Welcome.fxml","Race-Subrace 1.0.fxml","Class1.0.fxml","Ability1.0.fxml","Background1.0.fxml","Equipment1.0.fxml","Summary1.0.fxml"};
    public static int counter = 0;


    public void prev(ActionEvent event) throws IOException
    {
        counter -= 1;
        loadScene(event);
    }

    public void next(ActionEvent event) throws IOException
    {
        counter += 1;
        loadScene(event);
    }

    public void loadScene(ActionEvent event) throws IOException
    {
        Image cursor = new Image("/src/sword.png");//changing cursor
        root = FXMLLoader.load(getClass().getResource(array[counter]));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        scene.setCursor(new ImageCursor(cursor));
        stage.setScene(scene);
        stage.centerOnScreen(); // Centering the stage on the screen
        stage.show(); 
    }

     public void loadSceneSummary(ActionEvent event) throws IOException
    {
        Image cursor = new Image("/src/sword.png");//changing cursor
        root = FXMLLoader.load(getClass().getResource(array[counter]));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        String css = this.getClass().getResource("summary.css").toExternalForm();
        scene.getStylesheets().add(css);
        scene.setCursor(new ImageCursor(cursor));
        stage.setScene(scene);
        stage.centerOnScreen(); // Centering the stage on the screen
        stage.show(); 
    }

    public void switchToScene2(ActionEvent event) throws IOException 
    {
        counter = 1;
        loadScene(event);
    }

    public void switchToScene3(ActionEvent event) throws IOException 
    {
        counter = 2;
        loadScene(event);
    }

    public void switchToScene4(ActionEvent event) throws IOException 
    {
        counter = 3;
        loadScene(event);
    }

    public void switchToScene5(ActionEvent event) throws IOException 
    {
        counter = 4;
        loadScene(event);
    }

    public void switchToScene6(ActionEvent event) throws IOException 
    {
        counter = 5;
        loadScene(event);
    }

    public void switchToScene7(ActionEvent event) throws IOException 
    {
        counter = 6;
        loadSceneSummary(event);
    }

   
}

