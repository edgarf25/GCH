package Scenes;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ChoiceBox;


public class raceController implements Initializable{
    @FXML
    private ChoiceBox<String> myChoiceBox;
    private String[] racesArray = {"Dwarf", "Elf", "Halfling", "Human", "Dragonborn", "Gnome", "Half-Elf", "Half-Orc", "Tiefling"};
    private sceneController controller; //created a scenceController instance

    @Override
    public void initialize(URL arg0, ResourceBundle arg1) 
    {
        myChoiceBox.getItems().addAll(racesArray);
        System.out.println(myChoiceBox.getValue());
    }
    
    public void prev(ActionEvent event) throws IOException
    {
        controller = new sceneController();
        controller.prev(event); // Called the prev method with the empty event
    }

    public void next(ActionEvent event) throws IOException
    {
        controller = new sceneController();
        controller.next(event); // Called the prev method with the empty event
    }


}
