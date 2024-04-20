package Scenes;

import javafx.collections.FXCollections;

import java.util.*;

public class AbilityStandardArray {
    AbilityController a = new AbilityController();
    public void setAbilities(){

    }

    private void setStandardArrayOptions(Integer[] array)
    {
        a.availableOptions = new ArrayList<>(Arrays.asList(array));
        a.strDropdown.setItems(FXCollections.observableArrayList(a.availableOptions));
        a.dexDropdown.setItems(FXCollections.observableArrayList(a.availableOptions));
        a.conDropdown.setItems(FXCollections.observableArrayList(a.availableOptions));
        a.intDropdown.setItems(FXCollections.observableArrayList(a.availableOptions));
        a.wisDropdown.setItems(FXCollections.observableArrayList(a.availableOptions));
        a.chaDropdown.setItems(FXCollections.observableArrayList(a.availableOptions));
    }

    public static Integer[] compareArrays(Integer[] array1, Integer[] array2) {
        // Convert arrays to sets for efficient comparison
        Set<Integer> set2 = new HashSet<>(Arrays.asList(array2));

        // Create a list to store the unique values
        List<Integer> uniqueValues = new ArrayList<>();

        // Check each value in array1
        for (Integer value : array1) {
            if (!set2.contains(value)) {
                uniqueValues.add(value);
            }
        }

        // Convert the list of unique values to an array
        return uniqueValues.toArray(new Integer[0]);
    }

    public void standardArray()
    {
        a.startAbilityScene();
        a.strDropdown.setVisible(true);
        a.dexDropdown.setVisible(true);
        a.conDropdown.setVisible(true);
        a.intDropdown.setVisible(true);
        a.wisDropdown.setVisible(true);
        a.chaDropdown.setVisible(true);
        //setting the dropdowns to null so that if they change to another option those values won't be there
        a.strDropdown.setValue(null);
        a.dexDropdown.setValue(null);
        a.conDropdown.setValue(null);
        a.intDropdown.setValue(null);
        a.wisDropdown.setValue(null);
        a.chaDropdown.setValue(null);

    }
}
