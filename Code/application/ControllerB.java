package application;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label; // Import Label from javafx.scene.control
import java.net.URL;
import java.util.ResourceBundle;

public class ControllerB implements Initializable {
    @FXML
    private Label mylabel;
    @FXML
    private ChoiceBox<String> MyChoiceBox = new ChoiceBox<>();
    private final String[] race = {"Elf", "Dwarf", "Org"};

    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
        MyChoiceBox.getItems().addAll(race); // Use the correct variable name choiceBox
    }
}
