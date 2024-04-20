package Scenes;

import java.io.IOException;
import java.net.URL;
import java.util.Objects;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.fxml.FXML;
import javafx.scene.image.ImageView;

public class SummaryController implements Initializable{
    @FXML
    private Label currentHealth;
    @FXML
    private TextField healthAmount;
    @FXML
    public Label nameS;
    @FXML
    private ImageView missingCircle;
    @FXML
    private ImageView barbCircle;
    @FXML
    private ImageView bardCircle;
    @FXML
    private ImageView clericCircle;
    @FXML
    private ImageView rangerCircle;
    @FXML
    private ImageView druidCircle;
    @FXML
    private ImageView fighterCircle;
    @FXML
    private ImageView monkCircle;
    @FXML
    private ImageView paladinCircle;
    @FXML
    private ImageView rogueCircle;
    @FXML
    private ImageView sorcererCircle;
    @FXML
    private ImageView warlockCircle;
    @FXML
    private ImageView wizardCircle;
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
    @FXML
    private Label backgroundTextLabel;
    @FXML
    private Label classDisplayLabel;
    @FXML
    private Label subclassDisplayLabel;
    @FXML
    private Label raceDisplay;
    @FXML
    private Label subraceDisplay;
    @FXML
    private Label animalHandlingLabel;
    @FXML
    private Label arcanaLabel;
    @FXML
    private Label athleticsLabel;
    @FXML
    private Label deceptionLabel;
    @FXML
    private Label insightLabel;
    @FXML
    private Label intimidationLabel;
    @FXML
    private Label investigationLabel;
    @FXML
    private Label medicineLabel;
    @FXML
    private Label natureLabel;
    @FXML
    private Label perceptionLabel;
    @FXML
    private Label performanceLabel;
    @FXML
    private Label persuasionLabel;
    @FXML
    private Label religionLabel;
    @FXML
    private Label sleightLabel;
    @FXML
    private Label stealthLabel;
    @FXML
    private Label survivalLabel;
    @FXML
    private Label acrobaticsLabel;
    @FXML
    private Label historyLabel;
    @FXML
    private Label strThrowLabel;
    @FXML
    private Label dexThrowLabel;
    @FXML
    private Label conThrowLabel;
    @FXML
    private Label intThrowLabel;
    @FXML
    private Label wisThrowLabel;
    @FXML
    private Label chaThrowLabel;
    @FXML
    private TextArea notesText;
    @FXML
    private TextArea equipmentArea;
    @FXML
    private TextArea spellsArea;
    @FXML
    private Label armorLabel;
    @FXML
    private TextArea backgroundTextArea;

    private int healthValue = 1;
    private Integer[] abilityValues;


    private sceneController controller; //created a scenceController instance
    private skill skillController;
    CharacterBuilder characterBuilder = CharacterBuilder.getInstance();

    

    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {

        skillController = new skill();
        skillController.startSkills();


        if (characterBuilder.getName() != null)
        {
            nameS.setText(characterBuilder.getName());
        }
        System.out.println(characterBuilder.getName());

        if (characterBuilder.getUpdateAbilities() != null) //setting abilities
        {
            abilityValues = characterBuilder.getUpdateAbilities();
            strLabel.setText(String.valueOf(abilityValues[0]));
            dexLabel.setText(String.valueOf(abilityValues[1]));
            conLabel.setText(String.valueOf(abilityValues[2]));
            intLabel.setText(String.valueOf(abilityValues[3]));
            wisLabel.setText(String.valueOf(abilityValues[4]));
            chaLabel.setText(String.valueOf(abilityValues[5]));
        }
        if (characterBuilder.getCharacterClass() != null)
        {
            if (characterBuilder.getCharacterClass().equals("Barbarian"))
            {
                clearImg();
                barbCircle.setVisible(true);
            }
            else if (characterBuilder.getCharacterClass().equals("Bard"))
            {
                clearImg();
                bardCircle.setVisible(true);
            }
            else if (characterBuilder.getCharacterClass().equals("Cleric"))
            {
                clearImg();
                clericCircle.setVisible(true);
            }
            else if (characterBuilder.getCharacterClass().equals("Ranger"))
            {
                clearImg();
                rangerCircle.setVisible(true);
            }
            else if (characterBuilder.getCharacterClass().equals("Druid"))
            {
                clearImg();
                druidCircle.setVisible(true);
            }
            else if (characterBuilder.getCharacterClass().equals("Fighter"))
            {
                clearImg();
                fighterCircle.setVisible(true);
            }
            else if (characterBuilder.getCharacterClass().equals("Monk"))
            {
                clearImg();
                monkCircle.setVisible(true);
            }
            else if (characterBuilder.getCharacterClass().equals("Paladin"))
            {
                clearImg();
                paladinCircle.setVisible(true);
            }
            else if (characterBuilder.getCharacterClass().equals("Rogue"))
            {
                clearImg();
                rogueCircle.setVisible(true);
            }
            else if (characterBuilder.getCharacterClass().equals("Sorcerer"))
            {
                clearImg();
                sorcererCircle.setVisible(true);
            }
            else if (characterBuilder.getCharacterClass().equals("Warlock"))
            {
                clearImg();
                warlockCircle.setVisible(true);
            }
            else if (characterBuilder.getCharacterClass().equals("Wizard"))
            {
                clearImg();
                wizardCircle.setVisible(true);
            }
        }


        if (characterBuilder.getHair() != null) //setting hair
        {
            hairLabel.setText(characterBuilder.getHair());
        }

        if (characterBuilder.getEyes() != null) //setting eyes
        {
            eyesLabel.setText(characterBuilder.getEyes());
        }

        if (characterBuilder.getGender() != null) //setting gender
        {
            genderLabel.setText(characterBuilder.getGender());
        }

        if (characterBuilder.getSkin() != null) //setting skin
        {
            skinLabel.setText(characterBuilder.getSkin());
        }

        if (characterBuilder.getHeight() != null) //setting height
        {
            heightLabel.setText(characterBuilder.getHeight());
        }

        if (characterBuilder.getSkillsAndProficiencies1() != null)
        {
            skill1Label.setText(characterBuilder.getSkillsAndProficiencies1());
        }

        if (characterBuilder.getSkillsAndProficiencies2() != null)
        {
            skill2Label.setText(characterBuilder.getSkillsAndProficiencies2());
        }

        if (characterBuilder.getAge() !=  null)
        {
            ageLabel.setText(characterBuilder.getAge());
        }
        
        if (characterBuilder.getbackgroundText() != null)
        {
           backgroundTextArea.setText(characterBuilder.getbackgroundText());
        }
        if(characterBuilder.getCharacterClass() != null){
            classDisplayLabel.setText(characterBuilder.getCharacterClass());
        }
        if(characterBuilder.getSubclass() != null)
        {
            subclassDisplayLabel.setText(characterBuilder.getSubclass());
        }
        if(characterBuilder.getRace() != null)
        {
            raceDisplay.setText(characterBuilder.getRace());
        }
        if(characterBuilder.getSubrace() != null)
        {
            subraceDisplay.setText(characterBuilder.getSubrace());
        }
        if (characterBuilder.getEquipment() != null)
        {
            equipmentArea.setText(characterBuilder.getEquipment());
        }
        if (characterBuilder.getSpells() != null)
        {
            spellsArea.setText(characterBuilder.getSpells());
        }
        if (characterBuilder.getNotes() != null)
        {
            notesText.setText(characterBuilder.getNotes());
        }

        //setting the skill bonus to their values stored on data class
        animalHandlingLabel.setText(String.valueOf(characterBuilder.getAnimalHandlingBonus()));
        arcanaLabel.setText(String.valueOf(characterBuilder.getArcanaBonus()));
        athleticsLabel.setText(String.valueOf(characterBuilder.getAthleticsBonus()));
        deceptionLabel.setText(String.valueOf(characterBuilder.getDeceptionBonus()));
        insightLabel.setText(String.valueOf(characterBuilder.getInsightBonus()));
        intimidationLabel.setText(String.valueOf(characterBuilder.getIntimidationBonus()));
        investigationLabel.setText(String.valueOf(characterBuilder.getInvestigationBonus()));
        medicineLabel.setText(String.valueOf(characterBuilder.getMedicineBonus()));
        natureLabel.setText(String.valueOf(characterBuilder.getNatureBonus()));
        perceptionLabel.setText(String.valueOf(characterBuilder.getPerceptionBonus()));
        performanceLabel.setText(String.valueOf(characterBuilder.getPerceptionBonus()));
        persuasionLabel.setText(String.valueOf(characterBuilder.getAnimalHandlingBonus()));
        religionLabel.setText(String.valueOf(characterBuilder.getReligionBonus()));
        sleightLabel.setText(String.valueOf(characterBuilder.getSleightOfHandBonus()));
        stealthLabel.setText(String.valueOf(characterBuilder.getStealthBonus()));
        survivalLabel.setText(String.valueOf(characterBuilder.getSurvivalBonus()));
        acrobaticsLabel.setText(String.valueOf(characterBuilder.getAcrobaticsBonus()));
        historyLabel.setText(String.valueOf(characterBuilder.getHistoryBonus()));
        strThrowLabel.setText(String.valueOf(characterBuilder.getStrThrow()));
        dexThrowLabel.setText(String.valueOf(characterBuilder.getDexThrow()));
        conThrowLabel.setText(String.valueOf(characterBuilder.getConThrow()));
        intThrowLabel.setText(String.valueOf(characterBuilder.getIntThrow()));
        wisThrowLabel.setText(String.valueOf(characterBuilder.getWisThrow()));
        chaThrowLabel.setText(String.valueOf(characterBuilder.getChaThrow()));
        armorLabel.setText(String.valueOf(characterBuilder.getArmorAmount()));
    };

    public void clearImg()
    {
        barbCircle.setVisible(false);
        bardCircle.setVisible(false);
        monkCircle.setVisible(false);
        wizardCircle.setVisible(false);
        missingCircle.setVisible(false);
        warlockCircle.setVisible(false);
        paladinCircle.setVisible(false);
        druidCircle.setVisible(false);
        clericCircle.setVisible(false);
        fighterCircle.setVisible(false);
        rangerCircle.setVisible(false);
        rogueCircle.setVisible(false);
        sorcererCircle.setVisible(false);
    }
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

    public void updateNotes() {
        characterBuilder.setNotes(notesText.getText());}
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