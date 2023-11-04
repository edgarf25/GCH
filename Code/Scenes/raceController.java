package Scenes;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;



public class raceController implements Initializable{
    @FXML
    private ChoiceBox<String> myChoiceBox;
    @FXML
    private ChoiceBox<String> subraceChoiceBox;
    @FXML 
    private Label raceLabel;
    @FXML
    private Label classLabel;
    @FXML
    private Label abilityLabel;
    @FXML
    private Label backgroundLabel;
    @FXML
    private Label equipmentLabel;
    @FXML
    private Label summaryLabel;

    private String[] racesArray = {"Dwarf", "Elf", "Halfling", "Human", "Dragonborn", "Gnome", "Half-Elf", "Half-Orc", "Tiefling"};
    private String[] dwarfSubraces = {"Hill Dwarf", "Mountain Dwarf"};
    private String[] elfSubraces = {"High Elf", "Wood Elf", "Eladrin Elf"};
    private String[] halflingSubraces = {"Lightfoot Halfling", "StoutHalfling"};
    private String[] gnomeSubraces = {"Rock Gnome", "Deep Gnome"};

    private sceneController controller; //created a scenceController instance

    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
        // Assuming racesArray and dwarfSubraces are ObservableLists or Lists of String

        // Add items to the first ChoiceBox
        myChoiceBox.getItems().addAll(racesArray);

        // Set up a listener for the first ChoiceBox
        myChoiceBox.getSelectionModel().selectedItemProperty().addListener((observable, oldValue, newValue) -> {
            if (newValue != null) {
                // Clear existing items in the second ChoiceBox
                subraceChoiceBox.getItems().clear();

                // Based on the selected race, add corresponding subraces to the second ChoiceBox
                if (newValue.equals("Dwarf")) {
                    subraceChoiceBox.getItems().addAll(dwarfSubraces);
                }
                else if (newValue.equals("Elf"))
                {
                    subraceChoiceBox.getItems().addAll(elfSubraces);
                }
                else if (newValue.equals("Halfling"))
                {
                    subraceChoiceBox.getItems().addAll(halflingSubraces);
                }
                else if (newValue.equals("Gnome"))
                {
                    subraceChoiceBox.getItems().addAll(gnomeSubraces);
                }
            }
        });

        // Add event handlers to the labels
        

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

    public void switchToScene3(ActionEvent event) throws IOException
    {
        controller = new sceneController();
        controller.switchToScene3(event); // Called the prev method with the empty event
    }

    public void switchToScene4(ActionEvent event) throws IOException
    {
        controller = new sceneController();
        controller.switchToScene4(event); // Called the prev method with the empty event
    }

    public void switchToScene5(ActionEvent event) throws IOException
    {
        controller = new sceneController();
        controller.switchToScene5(event); // Called the prev method with the empty event
    }

    public void switchToScene6(ActionEvent event) throws IOException
    {
        controller = new sceneController();
        controller.switchToScene6(event); // Called the prev method with the empty event
    }

    public void switchToScene7(ActionEvent event) throws IOException
    {
        controller = new sceneController();
        controller.switchToScene7(event); // Called the prev method with the empty event
    }
    


}
