package Scenes;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import java.net.URl;
import java.util.ResourceBundle;

public class sceneController2 implements Initializable {
    @FXML
    private Label myLabel;
    @FXML
    private ChoiceBox<String> myChoiceBox;

    private String[] Race = {"Elf", "Dwarf", "Dragonborn"};

    public void initialize(URL arg0, ResourceBundle arg1){
        myChoiceBox.getItems().addAll(Race);
    }


}
