package Scenes;


import javafx.scene.control.ChoiceBox;
import javafx.fxml.FXML;

public class AbilityStandardArray implements AbilitySelection {
    public void setAbilities() {
        standardArray();
    }

    @FXML
    public ChoiceBox<Integer> strDropdown = new ChoiceBox<>();
    @FXML
    public ChoiceBox<Integer> dexDropdown = new ChoiceBox<>();
    @FXML
    public ChoiceBox<Integer> conDropdown = new ChoiceBox<>();
    @FXML
    public ChoiceBox<Integer> intDropdown = new ChoiceBox<>();
    @FXML
    public ChoiceBox<Integer> wisDropdown = new ChoiceBox<>();
    @FXML
    public ChoiceBox<Integer> chaDropdown = new ChoiceBox<>();





    public void standardArray()
    {
        strDropdown.setVisible(true);
        dexDropdown.setVisible(true);
        conDropdown.setVisible(true);
        intDropdown.setVisible(true);
        wisDropdown.setVisible(true);
        chaDropdown.setVisible(true);
        strDropdown.setValue(null);
        dexDropdown.setValue(null);
        conDropdown.setValue(null);
        intDropdown.setValue(null);
        wisDropdown.setValue(null);
        chaDropdown.setValue(null);

    }





}
