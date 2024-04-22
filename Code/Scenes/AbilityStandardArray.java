package Scenes;

import javafx.collections.FXCollections;

import java.util.*;

public class AbilityStandardArray extends AbilityController implements AbilitySelection {



    public void setAbilities() {
        standardArray();
    }

    private void setStandardArrayOptions(Integer[] array) {
        availableOptions = new ArrayList<>(Arrays.asList(array));
        strDropdown.setItems(FXCollections.observableArrayList(availableOptions));
        dexDropdown.setItems(FXCollections.observableArrayList(availableOptions));
        conDropdown.setItems(FXCollections.observableArrayList(availableOptions));
        intDropdown.setItems(FXCollections.observableArrayList(availableOptions));
        wisDropdown.setItems(FXCollections.observableArrayList(availableOptions));
        chaDropdown.setItems(FXCollections.observableArrayList(availableOptions));
    }

    public void standardArray() {
        startAbilityScene();
        strDropdown.setVisible(true);
        dexDropdown.setVisible(true);
        conDropdown.setVisible(true);
        intDropdown.setVisible(true);
        wisDropdown.setVisible(true);
        chaDropdown.setVisible(true);
        //setting the dropdowns to null so that if they change to another option those values won't be there
        strDropdown.setValue(null);
        dexDropdown.setValue(null);
        conDropdown.setValue(null);
        intDropdown.setValue(null);
        wisDropdown.setValue(null);
        chaDropdown.setValue(null);
    }
}
