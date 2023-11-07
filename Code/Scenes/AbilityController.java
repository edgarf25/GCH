package Scenes;

import java.io.IOException;
import javafx.event.ActionEvent;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.fxml.FXML;

public class AbilityController implements Initializable{

    public static int pointBuy = 27;

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
                if (newValue == "Point Buy") 
                {
                    strLabel.setText("8");
                    dexLabel.setText("8");
                    conLabel.setText("8");
                    intLabel.setText("8");
                    wisLabel.setText("8");
                    chaLabel.setText("8");
                    System.out.println(String.valueOf(strLabel.getText()));
                }
            }

        });
    };

    public void plusPointBuy(ActionEvent event)
    {
        String buttonId = ((Button) event.getSource()).getId();
        int currentValue;
        if (pointBuy != 0)
        {
            if ("strPlusButton".equals(buttonId))
            {
            currentValue = Integer.parseInt(strLabel.getText()) + 1;
            strLabel.setText(String.valueOf(currentValue));
            pointBuy -= 1;
            pointBuyLabel.setText(String.valueOf(pointBuy));
            }
        }
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
