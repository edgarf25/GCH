package Scenes;

import java.io.IOException;
import javafx.event.ActionEvent;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.ResourceBundle;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.shape.Rectangle;
import javafx.scene.image.ImageView;
import javafx.fxml.FXML;

public class AbilityController implements Initializable{

    public static int pointBuy;

    @FXML
    private Label strLabel;
    @FXML
    private Label dexLabel;
    @FXML
    private Label conLabel;
    @FXML
    private Label intLabel;
    @FXML
    private Label wisLabel;
    @FXML
    private Label chaLabel;
    @FXML
    private ChoiceBox<String> strDropdown;
    @FXML
    private ChoiceBox<String> dexDropdown;
    @FXML
    private ChoiceBox<String> conDropdown;
    @FXML
    private ChoiceBox<String> intDropdown;
    @FXML
    private ChoiceBox<String> wisDropdown;
    @FXML
    private ChoiceBox<String> chaDropdown;
    @FXML
    private Button strPlusButton;
    @FXML
    private Button dexPlusButton;
    @FXML
    private Button conPlusButton;
    @FXML
    private Button intPlusButton;
    @FXML
    private Button wisPlusButton;
    @FXML
    private Button chaPlusButton;
    @FXML
    private Button strSubButton;
    @FXML
    private Button dexSubButton;
    @FXML
    private Button conSubButton;
    @FXML
    private Button intSubButton;
    @FXML
    private Button wisSubButton;
    @FXML
    private Button chaSubButton;
    @FXML
    private Button diceButton;
    @FXML
    private Label pointBuyLabel;
    @FXML
    private Label pointsRemainingText;
    @FXML
    private Rectangle pointsRemaining;
    @FXML
    private Label diceRollLabel;
    @FXML
    private ImageView diceGif;
    @FXML
    private ChoiceBox<String> optionsChoiceBox;
    private String[] options = {"Standard Array", "Point Buy", "Dice Roll"};
    private sceneController controller; //created a scenceController instance
    private Integer[] stdArray = {8, 10, 12, 13, 14, 15};
    List<Integer> stdList = new ArrayList<>(Arrays.asList(stdArray));


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
        startAbilityScene();
        optionsChoiceBox.getItems().addAll(options);
        optionsChoiceBox.getSelectionModel().selectedItemProperty().addListener((observable, oldValue, newValue) ->
        {
            if (newValue != null) {
                if (newValue.equals("Point Buy")) {
                    pointBuy();
                }
                else if (newValue.equals("Standard Array"))
                {
                    standardArray();
                }
                else if (newValue.equals("Dice Roll"))
                {
                    diceRoll();
                }
            }


        });
    };

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


        for (int i = 0; i < 4; i++) 
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

        strResult = strSum - strArray[1];
        dexResult = dexSum - dexArray[1];
        conResult = conSum - conArray[1];
        intResult = intSum - intArray[1];
        wisResult = wisSum - wisArray[1];
        chaResult= chaSum - chaArray[1];

        strLabel.setText(String.valueOf(strResult));
        dexLabel.setText(String.valueOf(dexResult));
        conLabel.setText(String.valueOf(conResult));
        intLabel.setText(String.valueOf(intResult));
        wisLabel.setText(String.valueOf(wisResult));
        chaLabel.setText(String.valueOf(chaResult));
    }

    public void plusPointBuy(ActionEvent event) //increases label 
    {
        String buttonId = ((Button) event.getSource()).getId();
        if (pointBuy != 0 )
        {
            if ("strPlusButton".equals(buttonId) && !strLabel.getText().equals("15"))
            {   
                updateValues(strLabel, +1, 'p');
            }
            else if ("dexPlusButton".equals(buttonId) && !dexLabel.getText().equals("15"))
            {   
                updateValues(dexLabel, +1, 'p');
            }
            else if ("conPlusButton".equals(buttonId) && !conLabel.getText().equals("15"))
            {   
                updateValues(conLabel, +1, 'p');
            }
            else if ("intPlusButton".equals(buttonId) && !intLabel.getText().equals("15"))
            {   
                updateValues(intLabel, +1, 'p');
            }
            else if ("wisPlusButton".equals(buttonId) && !wisLabel.getText().equals("15"))
            {   
                updateValues(wisLabel, +1, 'p');
            }
            else if ("chaPlusButton".equals(buttonId) && !chaLabel.getText().equals("15"))
            {   
                updateValues(chaLabel, +1, 'p');
            }
            
        }
    }

    public void subPointBuy(ActionEvent event) //decreases label 
    {
        String buttonId = ((Button) event.getSource()).getId(); //to know which button was clicked
        if (pointBuy < 27)
        {
            if ("strSubButton".equals(buttonId) && !strLabel.getText().equals("8"))
            {
                updateValues(strLabel, -1, 's');
            }
            else if ("dexSubButton".equals(buttonId) && !dexLabel.getText().equals("8"))
            {   
                updateValues(dexLabel, -1, 's');
            }
            else if ("conSubButton".equals(buttonId) && !conLabel.getText().equals("8"))
            {   
                updateValues(conLabel, -1, 's');
            }
            else if ("intSubButton".equals(buttonId) && !intLabel.getText().equals("8"))
            {   
                updateValues(intLabel, -1, 's');
            }
            else if ("wisSubButton".equals(buttonId) && !wisLabel.getText().equals("8"))
            {   
                updateValues(wisLabel, -1, 's');
            }
            else if ("chaSubButton".equals(buttonId) && !chaLabel.getText().equals("8"))
            {   
                updateValues(chaLabel, -1, 's');
            }
        }
    }
    
    private void updateValues(Label label, int change, char operator) //class that updates the actual values
    {
        int currentValue = Integer.parseInt(label.getText()) + change;
        label.setText(String.valueOf(currentValue));
        if (operator == 's')
        {
            pointBuy += 1;
        }
        else
            pointBuy -= 1;
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
