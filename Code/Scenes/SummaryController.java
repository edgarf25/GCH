package Scenes;

import java.io.IOException;
import java.net.URL;
import java.util.Objects;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.fxml.FXML;

public class SummaryController implements Initializable{
    @FXML
    private Label currentHealth;
    @FXML
    private TextField healthAmount;
    private int healthValue = 1;
    private sceneController controller; //created a scenceController instance

    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
    };

    public void heal() // Heal Control
    {
        if (!Objects.equals(healthAmount.getText(), ""))
        {
            healthValue += Integer.parseInt(healthAmount.getText());
        }
        else
        {
            healthValue++;
        }
        currentHealth.setText(Integer.toString(healthValue));
        healthAmount.setText("");
    }
    public void dmg()  // Damage Control
    {
        if (!Objects.equals(healthAmount.getText(), ""))
        {
            healthValue -= Integer.parseInt(healthAmount.getText());
        }
        else
        {
            healthValue--;
        }
        currentHealth.setText(Integer.toString(healthValue));
        healthAmount.setText("");
    }


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

    public void switchToScene3(ActionEvent event) throws IOException
    {
        controller = new sceneController();
        controller.switchToScene3(event); // Called the prev method with the empty event
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

    public void switchToScene2(ActionEvent event) throws IOException
    {
        controller = new sceneController();
        controller.switchToScene2(event); // Called the prev method with the empty event
    }
}