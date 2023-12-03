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
    @FXML
    public Label nameS;
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
    private Label hairLabel;
    @FXML
    private Label skinLabel;
    @FXML
    private Label eyesLabel;
    @FXML
    private Label heightLabel;
    @FXML
    private Label weightLabel;
    @FXML
    private Label genderLabel;
    @FXML
    private Label ageLabel;
    @FXML
    private Label skill1Label;
    @FXML
    private Label skill2Label;

    private int healthValue = 1;
    private Integer[] abilityValues;


    private sceneController controller; //created a scenceController instance
    CharacterData characterData = CharacterData.getInstance();

    

    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
        if (characterData.getName() != null) 
        {
            nameS.setText(characterData.getName());
        }
        System.out.println(characterData.getName());

        if (characterData.getAbilities() != null) //setting abilities
        {
            abilityValues = characterData.getAbilities();
            strLabel.setText(String.valueOf(abilityValues[0]));
            dexLabel.setText(String.valueOf(abilityValues[1]));
            conLabel.setText(String.valueOf(abilityValues[2]));
            intLabel.setText(String.valueOf(abilityValues[3]));
            wisLabel.setText(String.valueOf(abilityValues[4]));
            chaLabel.setText(String.valueOf(abilityValues[5]));
        }

        if (characterData.getHair() != null) //setting hair
        {
            hairLabel.setText(characterData.getHair());
        }

        if (characterData.getEyes() != null) //setting eyes
        {
            eyesLabel.setText(characterData.getEyes());
        }

        if (characterData.getGender() != null) //setting gender
        {
            genderLabel.setText(characterData.getGender());
        }

        if (characterData.getSkin() != null) //setting skin
        {
            skinLabel.setText(characterData.getSkin());
        }

        if (characterData.getHeight() != null) //setting height
        {
            heightLabel.setText(characterData.getHeight());
        }

        if (characterData.getSkillsAndProficiencies1() != null)
        {
            skill1Label.setText(characterData.getSkillsAndProficiencies1());
        }

        if (characterData.getSkillsAndProficiencies2() != null)
        {
            skill2Label.setText(characterData.getSkillsAndProficiencies2());
        }

        if (characterData.getAge() !=  null)
        {
            ageLabel.setText(characterData.getAge());
        }
        

        
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

    public void switchToScene2(ActionEvent event) throws IOException
    {
        controller = new sceneController();
        controller.switchToScene2(event); // Called the prev method with the empty event
    }
}