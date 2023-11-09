package Scenes;

import java.io.IOException;
import javafx.event.ActionEvent;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ResourceBundle;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
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
    private Label pointBuyLabel;
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
        optionsChoiceBox.getItems().addAll(options);
        optionsChoiceBox.getSelectionModel().selectedItemProperty().addListener((observable, oldValue, newValue) ->
        {
            if (newValue != null)
            {
                if (newValue.equals("Point Buy")) 
                {
                    pointBuy = 27;
                    strLabel.setText("8");
                    dexLabel.setText("8");
                    conLabel.setText("8");
                    intLabel.setText("8");
                    wisLabel.setText("8");
                    chaLabel.setText("8");
                    pointBuyLabel.setText(String.valueOf(pointBuy));
                    pointBuyLabel.setVisible(true);
                }

                if (newValue.equals("Standard Array"))
                {
                    System.out.println("Hello");
                }
            }

        });
    };

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
        controller.switchToScene4(event); // Called the prev method with the empty event
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
