package Scenes;


import javafx.event.ActionEvent;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.fxml.FXML;

public class AbilityRollDice implements AbilitySelection {
    public void setAbilities() {
        diceRoll();
    }

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
    public Label strVal1 = new Label();
    @FXML
    public Label strVal2 = new Label();
    @FXML
    public Label strVal3 = new Label();
    @FXML
    public Label strVal4 = new Label();
    @FXML
    public Label dexVal1 = new Label();
    @FXML
    public Label dexVal2 = new Label();
    @FXML
    public Label dexVal3 = new Label();
    @FXML
    public Label dexVal4 = new Label();
    @FXML
    public Label conVal1 = new Label();
    @FXML
    public Label conVal2 = new Label();
    @FXML
    public Label conVal3 = new Label();
    @FXML
    public Label conVal4 = new Label();
    @FXML
    public Label intVal1 = new Label();
    @FXML
    public Label intVal2 = new Label();
    @FXML
    public Label intVal3 = new Label();
    @FXML
    public Label intVal4 = new Label();
    @FXML
    public Label wisVal1 = new Label();
    @FXML
    public Label wisVal2 = new Label();
    @FXML
    public Label wisVal3 = new Label();
    @FXML
    public Label wisVal4 = new Label();
    @FXML
    public Label chaVal1 = new Label();
    @FXML
    public Label chaVal2 = new Label();
    @FXML
    public Label chaVal3 = new Label();
    @FXML
    public Label chaVal4 = new Label();
    @FXML
    public Button diceButton = new Button();
    @FXML
    public Label diceRollLabel = new Label();
    @FXML
    public ImageView diceGif = new ImageView();

    private String[] options = {"Standard Array", "Point Buy", "Dice Roll"};
    private sceneController controller; //created a scenceController instance
    public Integer[] stdArray = {8, 10, 12, 13, 14, 15};
    public Integer[] finalValues = {8, 8, 8, 8, 8, 8};
    public Integer[] currentArray = {0, 0, 0, 0, 0, 0};
    public Integer[] uniqueArray;
    //List<Integer> stdList = new ArrayList<>(Arrays.asList(stdArray));
    public List<Integer> availableOptions;

    SummaryBuilder summaryBuilder = SummaryBuilder.getInstance(); //created a character data instance



    // Initialize the options for the six ChoiceBox dropdowns with the values from the standard array

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
    public void diceRoll()
    {
        diceGif.setVisible(true);
        diceRollLabel.setVisible(true);
        diceButton.setVisible(true);
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
        summaryBuilder.setAbilities(finalValues);//storing finalvalues in summaryBuilder

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







}
