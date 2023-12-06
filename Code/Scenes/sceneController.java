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
    String otherScenes[] = {"Settings.fxml", "Credits.fxml"};
    public static int counter = 0;
    CharacterData characterData = CharacterData.getInstance();
    
    String cursorPath = characterData.getCursor();

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
        Image cursor = new Image(cursorPath);//changing cursor
        root = FXMLLoader.load(getClass().getResource(array[counter]));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        scene.setCursor(new ImageCursor(cursor));
        stage.setScene(scene);
        stage.centerOnScreen(); // Centering the stage on the screen
        stage.show(); 
    }

     public void loadOtherScenes(ActionEvent event) throws IOException
    {
        Image cursor = new Image(cursorPath);//changing cursor
        root = FXMLLoader.load(getClass().getResource(otherScenes[counter]));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        scene.setCursor(new ImageCursor(cursor));
        stage.setScene(scene);
        stage.centerOnScreen(); // Centering the stage on the screen
        stage.show(); 
    }

     public void switchToScene1(ActionEvent event) throws IOException 
    {
        counter = 0;
        loadScene(event);
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
        loadScene(event);
    }
    
    public void switchToSettings(ActionEvent event) throws IOException
    {
        counter = 0;
        loadOtherScenes(event);
    }

    public void switchToCredits(ActionEvent event) throws IOException
    {
        counter = 1;
        loadOtherScenes(event);
    }


   
}

