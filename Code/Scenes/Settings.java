package Scenes;

import java.io.IOException;

import javafx.event.ActionEvent;

public class Settings {

    sceneController sceneController = new sceneController();
    CharacterData characterData = CharacterData.getInstance();

    public void candyCaneCursor(ActionEvent event) throws IOException
    {
        characterData.setCursor("/src/candycane.gif");
        System.out.println(characterData.getCursor());
        sceneController.switchToSettings(event);
    }

    public void swordCursor(ActionEvent event) throws IOException
    {
        characterData.setCursor("/src/sword.png");
        System.out.println(characterData.getCursor());
        sceneController.switchToSettings(event);
        
    }

    public void returnScene(ActionEvent event) throws IOException
    {
        System.out.println("switched");
        sceneController.switchToScene1(event); // Called the prev method with the empty event
    }

    public String getCursor()
    {
        return characterData.getCursor();
    }

    
}
