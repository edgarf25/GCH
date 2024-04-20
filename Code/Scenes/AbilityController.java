package Scenes;

import java.io.IOException;
import javafx.event.ActionEvent;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.ResourceBundle;
import java.util.Set;

import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.shape.Rectangle;
import javafx.scene.image.ImageView;
import javafx.fxml.FXML;
import javafx.collections.FXCollections;

public class AbilityController implements Initializable{

    public static int pointBuy;

    @FXML
    public Label strLabel;
    @FXML
    public Label dexLabel;
    @FXML
    public Label conLabel;
    @FXML
    public Label intLabel;
    @FXML
    public Label wisLabel;
    @FXML
    public Label chaLabel;
    @FXML
    public Label strVal1;
    @FXML
    public Label strVal2;
    @FXML
    public Label strVal3;
    @FXML
    public Label strVal4;
    @FXML
    public Label dexVal1;
    @FXML
    public Label dexVal2;
    @FXML
    public Label dexVal3;
    @FXML
    public Label dexVal4;
    @FXML
    public Label conVal1;
    @FXML
    public Label conVal2;
    @FXML
    public Label conVal3;
    @FXML
    public Label conVal4;
    @FXML
    public Label intVal1;
    @FXML
    public Label intVal2;
    @FXML
    public Label intVal3;
    @FXML
    public Label intVal4;
    @FXML
    public Label wisVal1;
    @FXML
    public Label wisVal2;
    @FXML
    public Label wisVal3;
    @FXML
    public Label wisVal4;
    @FXML
    public Label chaVal1;
    @FXML
    public Label chaVal2;
    @FXML
    public Label chaVal3;
    @FXML
    public Label chaVal4;
    @FXML
    public ChoiceBox<Integer> strDropdown;
    @FXML
    public ChoiceBox<Integer> dexDropdown;
    @FXML
    public ChoiceBox<Integer> conDropdown;
    @FXML
    public ChoiceBox<Integer> intDropdown;
    @FXML
    public ChoiceBox<Integer> wisDropdown;
    @FXML
    public ChoiceBox<Integer> chaDropdown;
    @FXML
    public Button strPlusButton;
    @FXML
    public Button dexPlusButton;
    @FXML
    public Button conPlusButton;
    @FXML
    public Button intPlusButton;
    @FXML
    public Button wisPlusButton;
    @FXML
    public Button chaPlusButton;
    @FXML
    public Button strSubButton;
    @FXML
    public Button dexSubButton;
    @FXML
    public Button conSubButton;
    @FXML
    public Button intSubButton;
    @FXML
    public Button wisSubButton;
    @FXML
    public Button chaSubButton;
    @FXML
    public Button diceButton;
    @FXML
    public Label pointBuyLabel;
    @FXML
    public Label pointsRemainingText;
    @FXML
    public Rectangle pointsRemaining;
    @FXML
    public Label diceRollLabel;
    @FXML
    public ImageView diceGif;
    @FXML
    private ChoiceBox<String> optionsChoiceBox;
    public int strChoice;
    public int dexChoice;
    public int conChoice;
    public int intChoice;
    public int wisChoice;
    public int chaChoice;

    private String[] options = {"Standard Array", "Point Buy", "Dice Roll"};
    private sceneController controller; //created a scenceController instance
    private Integer[] stdArray = {8, 10, 12, 13, 14, 15};
    private Integer[] finalValues = {8, 8, 8, 8, 8, 8};
    private Integer[] currentArray = {0, 0, 0, 0, 0, 0};
    private Integer[] uniqueArray;
    //List<Integer> stdList = new ArrayList<>(Arrays.asList(stdArray));
    public List<Integer> availableOptions;

    CharacterData characterData = CharacterData.getInstance(); //created a character data instance


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

    public void initialize(URL arg0, ResourceBundle arg1)
    {
        startAbilityScene(); //prepares scene when tab is opened
        optionsChoiceBox.getItems().addAll(options);    //adds options to top dropdown
        optionsChoiceBox.getSelectionModel().selectedItemProperty().addListener((observable, oldValue, newValue) ->
        {
            if (newValue != null) {             //different operations depending on the choice selected
                if (newValue.equals("Point Buy")) 
                {
                    pointBuy();
                    Arrays.fill(finalValues, 8); //setting the array back to 8's if changing scenes
                    characterData.setAbilities(finalValues);
                }
                else if (newValue.equals("Standard Array"))
                {
                    Arrays.fill(currentArray, 0);//filling array with 0 if changing ability option so they can re enter options again
                    standardArray();
                    setStandardArrayOptions(stdArray);
                    addChoiceBoxListeners();
                }
                else if (newValue.equals("Dice Roll"))
                {
                    diceRoll();
                }
            }
        });
    }

    // Initialize the options for the six ChoiceBox dropdowns with the values from the standard array
    private void setStandardArrayOptions(Integer[] array) 
    {
        availableOptions = new ArrayList<>(Arrays.asList(array));
        strDropdown.setItems(FXCollections.observableArrayList(availableOptions));
        dexDropdown.setItems(FXCollections.observableArrayList(availableOptions));
        conDropdown.setItems(FXCollections.observableArrayList(availableOptions));
        intDropdown.setItems(FXCollections.observableArrayList(availableOptions));
        wisDropdown.setItems(FXCollections.observableArrayList(availableOptions));
        chaDropdown.setItems(FXCollections.observableArrayList(availableOptions));
    }

    //method that helps determine which values are taken and which are not
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

    // Add listeners to the ChoiceBoxes to be able to change what options they can select
    private void addChoiceBoxListeners() 
    {
        
        strDropdown.getSelectionModel().selectedItemProperty().addListener((observable, oldValue, newValue) -> {
            if (newValue != null) {
                //addint newval to currentArray
                currentArray[0] = newValue;
                // calling compareArray function with the stdArray that has base options then setting the options available only to the ones not chosen
                uniqueArray = compareArrays(stdArray, currentArray);
                setStandardArrayOptions(uniqueArray);
                strDropdown.setValue(newValue);
                finalValues[0] = newValue;
                characterData.setAbilities(finalValues);//storing finalvalues in characterData
            }
        });

        dexDropdown.getSelectionModel().selectedItemProperty().addListener((observable, oldValue, newValue) -> {
            if (newValue != null) {
                // Handle the selection change for dexterity (dex) ChoiceBox
                currentArray[1] = newValue;
                // You can perform additional actions if needed
                uniqueArray = compareArrays(stdArray, currentArray);
                setStandardArrayOptions(uniqueArray);
                dexDropdown.setValue(newValue);
                finalValues[1] = newValue;
                characterData.setAbilities(finalValues);//storing finalvalues in characterData
            }
        });

        conDropdown.getSelectionModel().selectedItemProperty().addListener((observable, oldValue, newValue) -> {
            if (newValue != null) {
                // Handle the selection change for constitution (con) ChoiceBox
                currentArray[2] = newValue;
                // You can perform additional actions if needed
                uniqueArray = compareArrays(stdArray, currentArray);
                setStandardArrayOptions(uniqueArray);
                conDropdown.setValue(newValue);
                finalValues[2] = newValue;
                characterData.setAbilities(finalValues);//storing finalvalues in characterData
            }
        });

        intDropdown.getSelectionModel().selectedItemProperty().addListener((observable, oldValue, newValue) -> {
            if (newValue != null) {
                // Handle the selection change for intelligence (int) ChoiceBox
                currentArray[3] = newValue;
                // You can perform additional actions if needed
                uniqueArray = compareArrays(stdArray, currentArray);
                setStandardArrayOptions(uniqueArray);
                intDropdown.setValue(newValue);
                finalValues[3] = newValue;
                characterData.setAbilities(finalValues);//storing finalvalues in characterData
            }
        });

        wisDropdown.getSelectionModel().selectedItemProperty().addListener((observable, oldValue, newValue) -> {
            if (newValue != null) {
                // Handle the selection change for wisdom (wis) ChoiceBox
                currentArray[4] = newValue;
                // You can perform additional actions if needed
                uniqueArray = compareArrays(stdArray, currentArray);
                setStandardArrayOptions(uniqueArray);
                wisDropdown.setValue(newValue);
                finalValues[4] = newValue;
                characterData.setAbilities(finalValues);//storing finalvalues in characterData
            }
        });

        chaDropdown.getSelectionModel().selectedItemProperty().addListener((observable, oldValue, newValue) -> {
            if (newValue != null) {
                // Handle the selection change for charisma (cha) ChoiceBox
                currentArray[5] = newValue;
                // You can perform additional actions if needed
                uniqueArray = compareArrays(stdArray, currentArray);
                setStandardArrayOptions(uniqueArray);
                chaDropdown.setValue(newValue);
                finalValues[5] = newValue;
                characterData.setAbilities(finalValues);//storing finalvalues in characterData
            }
        });
    }
    
    public void startAbilityScene()
    {
        pointsRemainingText.setVisible(false);
        pointBuyLabel.setVisible(false);
        pointsRemaining.setVisible(false);
        diceGif.setVisible(false);
        diceRollLabel.setVisible(false);
        strPlusButton.setVisible(false);
        strSubButton.setVisible(false);
        strLabel.setVisible(false);
        dexPlusButton.setVisible(false);
        dexSubButton.setVisible(false);
        dexLabel.setVisible(false);
        conPlusButton.setVisible(false);
        conSubButton.setVisible(false);
        conLabel.setVisible(false);
        intPlusButton.setVisible(false);
        intSubButton.setVisible(false);
        intLabel.setVisible(false);
        wisPlusButton.setVisible(false);
        wisSubButton.setVisible(false);
        wisLabel.setVisible(false);
        chaPlusButton.setVisible(false);
        chaSubButton.setVisible(false);
        chaLabel.setVisible(false);
        strDropdown.setVisible(false);
        dexDropdown.setVisible(false);
        conDropdown.setVisible(false);
        intDropdown.setVisible(false);
        wisDropdown.setVisible(false);
        chaDropdown.setVisible(false);
        diceButton.setVisible(false);
        strVal1.setVisible(false);
        strVal2.setVisible(false);
        strVal3.setVisible(false);
        strVal4.setVisible(false);
        dexVal1.setVisible(false);
        dexVal2.setVisible(false);
        dexVal3.setVisible(false);
        dexVal4.setVisible(false);
        conVal1.setVisible(false);
        conVal2.setVisible(false);
        conVal3.setVisible(false);
        conVal4.setVisible(false);
        intVal1.setVisible(false);
        intVal2.setVisible(false);
        intVal3.setVisible(false);
        intVal4.setVisible(false);
        wisVal1.setVisible(false);
        wisVal2.setVisible(false);
        wisVal3.setVisible(false);
        wisVal4.setVisible(false);
        chaVal1.setVisible(false);
        chaVal2.setVisible(false);
        chaVal3.setVisible(false);
        chaVal4.setVisible(false);
    }
    public void standardArray()
    {
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


    public void pointBuy()
    {
        startAbilityScene();
        pointsRemainingText.setVisible(true);
        pointBuyLabel.setVisible(true);
        pointsRemaining.setVisible(true);
        strPlusButton.setVisible(true);
        strSubButton.setVisible(true);
        strLabel.setVisible(true);
        dexPlusButton.setVisible(true);
        dexSubButton.setVisible(true);
        dexLabel.setVisible(true);
        conPlusButton.setVisible(true);
        conSubButton.setVisible(true);
        conLabel.setVisible(true);
        intPlusButton.setVisible(true);
        intSubButton.setVisible(true);
        intLabel.setVisible(true);
        wisPlusButton.setVisible(true);
        wisSubButton.setVisible(true);
        wisLabel.setVisible(true);
        chaPlusButton.setVisible(true);
        chaSubButton.setVisible(true);
        chaLabel.setVisible(true);
        pointBuy = 27;
        strLabel.setText("8");
        dexLabel.setText("8");
        conLabel.setText("8");
        intLabel.setText("8");
        wisLabel.setText("8");
        chaLabel.setText("8");
        pointBuyLabel.setText(String.valueOf(pointBuy));
    }
    public void diceRoll()
    {
        startAbilityScene();
        diceGif.setVisible(true);
        diceRollLabel.setVisible(true);
        strLabel.setVisible(true);
        dexLabel.setVisible(true);
        conLabel.setVisible(true);
        intLabel.setVisible(true);
        wisLabel.setVisible(true);
        chaLabel.setVisible(true);
        diceButton.setVisible(true);
        strLabel.setText("?");
        dexLabel.setText("?");
        conLabel.setText("?");
        intLabel.setText("?");
        wisLabel.setText("?");
        chaLabel.setText("?");
        strVal1.setVisible(true);
        strVal2.setVisible(true);
        strVal3.setVisible(true);
        strVal4.setVisible(true);
        dexVal1.setVisible(true);
        dexVal2.setVisible(true);
        dexVal3.setVisible(true);
        dexVal4.setVisible(true);
        conVal1.setVisible(true);
        conVal2.setVisible(true);
        conVal3.setVisible(true);
        conVal4.setVisible(true);
        intVal1.setVisible(true);
        intVal2.setVisible(true);
        intVal3.setVisible(true);
        intVal4.setVisible(true);
        wisVal1.setVisible(true);
        wisVal2.setVisible(true);
        wisVal3.setVisible(true);
        wisVal4.setVisible(true);
        chaVal1.setVisible(true);
        chaVal2.setVisible(true);
        chaVal3.setVisible(true);
        chaVal4.setVisible(true);
        strVal1.setText("?");
        strVal2.setText("?");
        strVal3.setText("?");
        strVal4.setText("?");
        dexVal1.setText("?");
        dexVal2.setText("?");
        dexVal3.setText("?");
        dexVal4.setText("?");
        conVal1.setText("?");
        conVal2.setText("?");
        conVal3.setText("?");
        conVal4.setText("?");
        intVal1.setText("?");
        intVal2.setText("?");
        intVal3.setText("?");
        intVal4.setText("?");
        wisVal1.setText("?");
        wisVal2.setText("?");
        wisVal3.setText("?");
        wisVal4.setText("?");
        chaVal1.setText("?");
        chaVal2.setText("?");
        chaVal3.setText("?");
        chaVal4.setText("?");
    }

    public void RollDice(ActionEvent event)
    {
        int[] strArray = new int[4];
        int[] dexArray = new int[4];
        int[] conArray = new int[4];
        int[] intArray = new int[4];
        int[] wisArray = new int[4];
        int[] chaArray = new int[4];
        Random random = new Random();
        int strSum = 0, dexSum = 0, conSum = 0, intSum = 0, wisSum = 0, chaSum = 0;
        int strResult, dexResult, conResult, intResult, wisResult, chaResult;


        for (int i = 0; i < 4; i++) //generating an array with 4 random values
        {
            strArray[i] = random.nextInt(6) + 1; // Generates random values from 1 to 6
            dexArray[i] = random.nextInt(6) + 1;
            conArray[i] = random.nextInt(6) + 1;
            intArray[i] = random.nextInt(6) + 1;
            wisArray[i] = random.nextInt(6) + 1;
            chaArray[i] = random.nextInt(6) + 1;
            strSum += strArray[i];
            dexSum += dexArray[i];
            conSum += conArray[i];
            intSum += intArray[i];
            wisSum += wisArray[i];
            chaSum += chaArray[i];
        }

        Arrays.sort(strArray);
        Arrays.sort(dexArray);
        Arrays.sort(conArray);
        Arrays.sort(intArray);
        Arrays.sort(wisArray);
        Arrays.sort(chaArray);

        strResult = strSum - strArray[0];
        dexResult = dexSum - dexArray[0];
        conResult = conSum - conArray[0];
        intResult = intSum - intArray[0];
        wisResult = wisSum - wisArray[0];
        chaResult= chaSum - chaArray[0];

        //setting main labels to the final value
        strLabel.setText(String.valueOf(strResult));
        dexLabel.setText(String.valueOf(dexResult));
        conLabel.setText(String.valueOf(conResult));
        intLabel.setText(String.valueOf(intResult));
        wisLabel.setText(String.valueOf(wisResult));
        chaLabel.setText(String.valueOf(chaResult));

        //adding final values to the final values array
        finalValues[0] = strResult;
        finalValues[1] = dexResult;
        finalValues[2] = conResult;
        finalValues[3] = intResult;
        finalValues[4] = wisResult;
        finalValues[5] = chaResult;
        characterData.setAbilities(finalValues);//storing finalvalues in characterData

        for (int i = 4; i > 0; i--) //this shows the 4 values rolled
        {
            if (i == 4)
            {
                strVal1.setText(String.valueOf(strArray[i - 1]));
                dexVal1.setText(String.valueOf(dexArray[i - 1]));
                conVal1.setText(String.valueOf(conArray[i - 1]));
                intVal1.setText(String.valueOf(intArray[i - 1]));
                wisVal1.setText(String.valueOf(wisArray[i - 1]));
                chaVal1.setText(String.valueOf(chaArray[i - 1]));
            }

            if (i == 3) 
            {
                strVal2.setText(String.valueOf(strArray[i - 1]));
                dexVal2.setText(String.valueOf(dexArray[i - 1]));
                conVal2.setText(String.valueOf(conArray[i - 1]));
                intVal2.setText(String.valueOf(intArray[i - 1]));
                wisVal2.setText(String.valueOf(wisArray[i - 1]));
                chaVal2.setText(String.valueOf(chaArray[i - 1]));
            }

            if (i == 2)
            {
                strVal3.setText(String.valueOf(strArray[i - 1]));
                dexVal3.setText(String.valueOf(dexArray[i - 1]));
                conVal3.setText(String.valueOf(conArray[i - 1]));
                intVal3.setText(String.valueOf(intArray[i - 1]));
                wisVal3.setText(String.valueOf(wisArray[i - 1]));
                chaVal3.setText(String.valueOf(chaArray[i - 1]));
            }

            if (i == 1)
            {
                strVal4.setText(String.valueOf(strArray[i - 1]));
                dexVal4.setText(String.valueOf(dexArray[i - 1]));
                conVal4.setText(String.valueOf(conArray[i - 1]));
                intVal4.setText(String.valueOf(intArray[i - 1]));
                wisVal4.setText(String.valueOf(wisArray[i - 1]));
                chaVal4.setText(String.valueOf(chaArray[i - 1]));
            }

        }
    }

    public void plusPointBuy(ActionEvent event) //increases label 
    {
        String buttonId = ((Button) event.getSource()).getId();
        if (pointBuy != 0 )
        {
            if ("strPlusButton".equals(buttonId) && !strLabel.getText().equals("15"))
            {   
                updateValues(strLabel, +1, 'p', 0);
            }
            else if ("dexPlusButton".equals(buttonId) && !dexLabel.getText().equals("15"))
            {   
                updateValues(dexLabel, +1, 'p', 1);
            }
            else if ("conPlusButton".equals(buttonId) && !conLabel.getText().equals("15"))
            {   
                updateValues(conLabel, +1, 'p', 2);
            }
            else if ("intPlusButton".equals(buttonId) && !intLabel.getText().equals("15"))
            {   
                updateValues(intLabel, +1, 'p', 3);
            }
            else if ("wisPlusButton".equals(buttonId) && !wisLabel.getText().equals("15"))
            {   
                updateValues(wisLabel, +1, 'p', 4);
            }
            else if ("chaPlusButton".equals(buttonId) && !chaLabel.getText().equals("15"))
            {   
                updateValues(chaLabel, +1, 'p', 5);
            }
            
            characterData.setAbilities(finalValues);
        }
    }

    public void subPointBuy(ActionEvent event) //decreases label 
    {
        String buttonId = ((Button) event.getSource()).getId(); //to know which button was clicked
        if (pointBuy < 27)
        {
            if ("strSubButton".equals(buttonId) && !strLabel.getText().equals("8"))
            {
                updateValues(strLabel, -1, 's', 0);
            }
            else if ("dexSubButton".equals(buttonId) && !dexLabel.getText().equals("8"))
            {   
                updateValues(dexLabel, -1, 's', 1);
            }
            else if ("conSubButton".equals(buttonId) && !conLabel.getText().equals("8"))
            {   
                updateValues(conLabel, -1, 's', 2);
            }
            else if ("intSubButton".equals(buttonId) && !intLabel.getText().equals("8"))
            {   
                updateValues(intLabel, -1, 's', 3);
            }
            else if ("wisSubButton".equals(buttonId) && !wisLabel.getText().equals("8"))
            {   
                updateValues(wisLabel, -1, 's', 4);
            }
            else if ("chaSubButton".equals(buttonId) && !chaLabel.getText().equals("8"))
            {   
                updateValues(chaLabel, -1, 's', 5);
            }
            characterData.setAbilities(finalValues);
        }
    }
    
    private void updateValues(Label label, int change, char operator, int slot) //class that updates the actual values
    {
        int currentValue = Integer.parseInt(label.getText());

        if (currentValue > 13 & operator == 's')//adding or subtracting an extra point if value > 13
        {
            pointBuy += 1;
        }
        else if (currentValue >= 13 & operator != 's')
        {
            pointBuy -= 1;
        }

        if (operator == 's')
        {
            pointBuy += 1;
        }
        else
            pointBuy -= 1;

        currentValue = currentValue + change;
        label.setText(String.valueOf(currentValue));
        finalValues[slot] = currentValue;
        pointBuyLabel.setText(String.valueOf(pointBuy));
    }


    public void switchToScene3(ActionEvent event) throws IOException
    {
        controller = new sceneController();
        controller.switchToScene3(event); // Called the prev method with the empty event
    }

    public void switchToScene2(ActionEvent event) throws IOException
    {
        controller = new sceneController();
        controller.switchToScene2(event); // Called the prev method with the empty event
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
