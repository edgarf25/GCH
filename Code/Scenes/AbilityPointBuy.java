package Scenes;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.shape.Rectangle;

import java.util.List;

public class AbilityPointBuy implements AbilitySelection{
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
    private Label strVal1;
    @FXML
    private Label strVal2;
    @FXML
    private Label strVal3;
    @FXML
    private Label strVal4;
    @FXML
    private Label dexVal1;
    @FXML
    private Label dexVal2;
    @FXML
    private Label dexVal3;
    @FXML
    private Label dexVal4;
    @FXML
    private Label conVal1;
    @FXML
    private Label conVal2;
    @FXML
    private Label conVal3;
    @FXML
    private Label conVal4;
    @FXML
    private Label intVal1;
    @FXML
    private Label intVal2;
    @FXML
    private Label intVal3;
    @FXML
    private Label intVal4;
    @FXML
    private Label wisVal1;
    @FXML
    private Label wisVal2;
    @FXML
    private Label wisVal3;
    @FXML
    private Label wisVal4;
    @FXML
    private Label chaVal1;
    @FXML
    private Label chaVal2;
    @FXML
    private Label chaVal3;
    @FXML
    private Label chaVal4;
    @FXML
    private ChoiceBox<Integer> strDropdown;
    @FXML
    private ChoiceBox<Integer> dexDropdown;
    @FXML
    private ChoiceBox<Integer> conDropdown;
    @FXML
    private ChoiceBox<Integer> intDropdown;
    @FXML
    private ChoiceBox<Integer> wisDropdown;
    @FXML
    private ChoiceBox<Integer> chaDropdown;
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
    private List<Integer> availableOptions;

    SummaryBuilder summaryBuilder = SummaryBuilder.getInstance(); //created a character data instance

    public void setAbilities(){
        /// Insert
    }
    public void pointBuy() {
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

            summaryBuilder.setAbilities(finalValues);
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
            summaryBuilder.setAbilities(finalValues);
        }
    }
}
