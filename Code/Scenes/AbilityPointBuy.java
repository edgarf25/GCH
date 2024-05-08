package Scenes;

import javafx.event.ActionEvent;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.shape.Rectangle;
import javafx.fxml.FXML;

public class AbilityPointBuy implements AbilitySelection {
    public void setAbilities() {
        pointBuy();
    }
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
    public Button strPlusButton = new Button();
    @FXML
    public Button dexPlusButton = new Button();
    @FXML
    public Button conPlusButton = new Button();
    @FXML
    public Button intPlusButton = new Button();
    @FXML
    public Button wisPlusButton = new Button();
    @FXML
    public Button chaPlusButton = new Button();
    @FXML
    public Button strSubButton = new Button();
    @FXML
    public Button dexSubButton = new Button();
    @FXML
    public Button conSubButton = new Button();
    @FXML
    public Button intSubButton = new Button();
    @FXML
    public Button wisSubButton = new Button();
    @FXML
    public Button chaSubButton = new Button();
    @FXML
    public Label pointBuyLabel = new Label();
    @FXML
    public Label pointsRemainingText = new Label();
    @FXML
    public Rectangle pointsRemaining = new Rectangle();
    public Integer[] finalValues = {8, 8, 8, 8, 8, 8};



    SummaryBuilder summaryBuilder = SummaryBuilder.getInstance(); //created a character data instance


    public void pointBuy()
    {
        pointsRemainingText.setVisible(true);
        pointBuyLabel.setVisible(true);
        pointsRemaining.setVisible(true);
        strPlusButton.setVisible(true);
        strSubButton.setVisible(true);
        dexPlusButton.setVisible(true);
        dexSubButton.setVisible(true);
        conPlusButton.setVisible(true);
        conSubButton.setVisible(true);
        intPlusButton.setVisible(true);
        intSubButton.setVisible(true);
        wisPlusButton.setVisible(true);
        wisSubButton.setVisible(true);
        chaPlusButton.setVisible(true);
        chaSubButton.setVisible(true);
        pointBuy = 27;
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


}
