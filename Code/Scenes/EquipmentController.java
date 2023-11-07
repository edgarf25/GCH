package Scenes;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextArea;

public class EquipmentController implements Initializable {
     @FXML
     private ChoiceBox<String> myChoiceBox0;   //WEAPON-DROP-DOWN
     @FXML
     private ChoiceBox<String> myChoiceBox1;   //ARMOR-DROP-DOWN
     @FXML
     private ChoiceBox<String>  myChoiceBox11;  //Possessions-DROP-DOWN
    @FXML
    private TextArea TextAreaList;  // DISPLAYING ITEMS ON LIST
    private static String ListText = "";
    private final String[] weaponArray = {"Club","Dagger", "GreatClub", "HandAxe", "Javelin","Light Hammer", "Mace", "Quarterstaff", "Sickle", "Spear"};
    // WEAPON ARRAY CONTAINING LIST OF ARRAY OF WEAPONS MELEE
    private final String[] armorArray ={"Light Armor","Medium Armor","Heavy Armor","Shield"};
    // ARMOR CONTAINING LIST OF ARRAY ARMOR
    private final String[] posArray = {"DINGLE"};
    // WILL UPDATE POS

    public void initialize(URL arg0, ResourceBundle arg1){
        //  Weapons Array Lists of String
        // Add items to the first ChoiceBox
        myChoiceBox0.getItems().addAll(weaponArray);  // GET ALL WEAPONS IN ARRAY
        myChoiceBox1.getItems().addAll(armorArray);  //  GET ALL ARMOR   IN ARRAY
        myChoiceBox11.getItems().addAll(posArray);  //   GET ALL POS     IN ARRAY
        myChoiceBox0.getSelectionModel().selectedItemProperty().addListener((observable, oldValue, newValue) -> {
            if (newValue != null) {
                addToString("Weapon: " + newValue + "\n");

            }
        });
        myChoiceBox1.getSelectionModel().selectedItemProperty().addListener((observable, oldValue, newValue) -> {
            if (newValue != null) {
                addToString("Armor: " + newValue + "\n");

            }
        });
        myChoiceBox11.getSelectionModel().selectedItemProperty().addListener((observable, oldValue, newValue) -> {
            if (newValue != null) {
                addToString("Possessions: " + newValue + "\n");

            }
        });

    }
    public void addToString(String s)
    {
        if (s != null)
        {
            ListText += s;

        }
    }
     public  void addAll() {
        if(ListText != null ){
            TextAreaList.setText(ListText);
        }
     }
    private sceneController controller; //created a scenceController instance

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

    public void switchToScene2(ActionEvent event) throws IOException
    {
        controller = new sceneController();
        controller.switchToScene2(event); // Called the prev method with the empty event
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
