package Scenes;

import java.io.IOException;

import javafx.event.ActionEvent;

public class Settings {

    sceneController sceneController = new sceneController();

    public void candyCaneCursor()
    {
        
    }

    public void returnScene(ActionEvent event) throws IOException
    {
        sceneController.switchToScene1(event); // Called the prev method with the empty event
    }

    
}
