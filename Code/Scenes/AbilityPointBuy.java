package Scenes;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.shape.Rectangle;

import java.util.List;

public class AbilityPointBuy extends AbilityController implements AbilitySelection{
    AbilityController a = new AbilityController();
    public static int pointBuy;

    SummaryBuilder summaryBuilder = SummaryBuilder.getInstance(); //created a character data instance

    public void setAbilities(){
        /// Insert
    }
    public void pointBuy() {
        a.pointsRemainingText.setVisible(true);
        a.pointBuyLabel.setVisible(true);
        a.pointsRemaining.setVisible(true);
        a.strPlusButton.setVisible(true);
        a.strSubButton.setVisible(true);
        a.strLabel.setVisible(true);
        a.dexPlusButton.setVisible(true);
        a.dexSubButton.setVisible(true);
        a.dexLabel.setVisible(true);
        a.conPlusButton.setVisible(true);
        a.conSubButton.setVisible(true);
        a.conLabel.setVisible(true);
        a.intPlusButton.setVisible(true);
        a.intSubButton.setVisible(true);
        a.intLabel.setVisible(true);
        a.wisPlusButton.setVisible(true);
        a.wisSubButton.setVisible(true);
        a.wisLabel.setVisible(true);
        a.chaPlusButton.setVisible(true);
        a.chaSubButton.setVisible(true);
        a.chaLabel.setVisible(true);
        pointBuy = 27;
        a.strLabel.setText("8");
        a.dexLabel.setText("8");
        a.conLabel.setText("8");
        a.intLabel.setText("8");
        a.wisLabel.setText("8");
        a.chaLabel.setText("8");
        a.pointBuyLabel.setText(String.valueOf(pointBuy));
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
        a.finalValues[slot] = currentValue;
        a.pointBuyLabel.setText(String.valueOf(pointBuy));
    }
    public void plusPointBuy(ActionEvent event) //increases label
    {
        String buttonId = ((Button) event.getSource()).getId();
        if (pointBuy != 0 )
        {
            if ("strPlusButton".equals(buttonId) && !a.strLabel.getText().equals("15"))
            {
                updateValues(a.strLabel, +1, 'p', 0);
            }
            else if ("dexPlusButton".equals(buttonId) && !a.dexLabel.getText().equals("15"))
            {
                updateValues(a.dexLabel, +1, 'p', 1);
            }
            else if ("conPlusButton".equals(buttonId) && !a.conLabel.getText().equals("15"))
            {
                updateValues(a.conLabel, +1, 'p', 2);
            }
            else if ("intPlusButton".equals(buttonId) && !a.intLabel.getText().equals("15"))
            {
                updateValues(a.intLabel, +1, 'p', 3);
            }
            else if ("wisPlusButton".equals(buttonId) && !a.wisLabel.getText().equals("15"))
            {
                updateValues(a.wisLabel, +1, 'p', 4);
            }
            else if ("chaPlusButton".equals(buttonId) && !a.chaLabel.getText().equals("15"))
            {
                updateValues(a.chaLabel, +1, 'p', 5);
            }

            summaryBuilder.setAbilities(a.finalValues);
        }
    }
    public void subPointBuy(ActionEvent event) //decreases label
    {
        String buttonId = ((Button) event.getSource()).getId(); //to know which button was clicked
        if (pointBuy < 27)
        {
            if ("strSubButton".equals(buttonId) && !a.strLabel.getText().equals("8"))
            {
                updateValues(a.strLabel, -1, 's', 0);
            }
            else if ("dexSubButton".equals(buttonId) && !a.dexLabel.getText().equals("8"))
            {
                updateValues(a.dexLabel, -1, 's', 1);
            }
            else if ("conSubButton".equals(buttonId) && !a.conLabel.getText().equals("8"))
            {
                updateValues(a.conLabel, -1, 's', 2);
            }
            else if ("intSubButton".equals(buttonId) && !a.intLabel.getText().equals("8"))
            {
                updateValues(a.intLabel, -1, 's', 3);
            }
            else if ("wisSubButton".equals(buttonId) && !a.wisLabel.getText().equals("8"))
            {
                updateValues(a.wisLabel, -1, 's', 4);
            }
            else if ("chaSubButton".equals(buttonId) && !a.chaLabel.getText().equals("8"))
            {
                updateValues(a.chaLabel, -1, 's', 5);
            }
            summaryBuilder.setAbilities(a.finalValues);
        }
    }
}
