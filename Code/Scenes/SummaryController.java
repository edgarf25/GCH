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
    CharacterData characterData = CharacterData.getInstance();

    

    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {

        skillController = new skill();
        skillController.startSkills();
        if (characterData.getName() != null) 
        {
            nameS.setText(characterData.getName());
        }
        System.out.println(characterData.getName());

        if (characterData.getUpdateAbilities() != null) //setting abilities
        {
            abilityValues = characterData.getUpdateAbilities();
            strLabel.setText(String.valueOf(abilityValues[0]));
            dexLabel.setText(String.valueOf(abilityValues[1]));
            conLabel.setText(String.valueOf(abilityValues[2]));
            intLabel.setText(String.valueOf(abilityValues[3]));
            wisLabel.setText(String.valueOf(abilityValues[4]));
            chaLabel.setText(String.valueOf(abilityValues[5]));
        }
        if (characterData.getCharacterClass() != null)
        {
            if (characterData.getCharacterClass().equals("Barbarian"))
            {
                clearImg();
                barbCircle.setVisible(true);
            }
            else if (characterData.getCharacterClass().equals("Bard"))
            {
                clearImg();
                bardCircle.setVisible(true);
            }
            else if (characterData.getCharacterClass().equals("Cleric"))
            {
                clearImg();
                clericCircle.setVisible(true);
            }
            else if (characterData.getCharacterClass().equals("Ranger"))
            {
                clearImg();
                rangerCircle.setVisible(true);
            }
            else if (characterData.getCharacterClass().equals("Druid"))
            {
                clearImg();
                druidCircle.setVisible(true);
            }
            else if (characterData.getCharacterClass().equals("Fighter"))
            {
                clearImg();
                fighterCircle.setVisible(true);
            }
            else if (characterData.getCharacterClass().equals("Monk"))
            {
                clearImg();
                monkCircle.setVisible(true);
            }
            else if (characterData.getCharacterClass().equals("Paladin"))
            {
                clearImg();
                paladinCircle.setVisible(true);
            }
            else if (characterData.getCharacterClass().equals("Rogue"))
            {
                clearImg();
                rogueCircle.setVisible(true);
            }
            else if (characterData.getCharacterClass().equals("Sorcerer"))
            {
                clearImg();
                sorcererCircle.setVisible(true);
            }
            else if (characterData.getCharacterClass().equals("Warlock"))
            {
                clearImg();
                warlockCircle.setVisible(true);
            }
            else if (characterData.getCharacterClass().equals("Wizard"))
            {
                clearImg();
                wizardCircle.setVisible(true);
            }
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
        
        if (characterData.getbackgroundText() != null)
        {
           backgroundTextArea.setText(characterData.getbackgroundText());
        }
        if(characterData.getCharacterClass() != null){
            classDisplayLabel.setText(characterData.getCharacterClass());
        }
        if(characterData.getSubclass() != null)
        {
            subclassDisplayLabel.setText(characterData.getSubclass());
        }
        if(characterData.getRace() != null)
        {
            raceDisplay.setText(characterData.getRace());
        }
        if(characterData.getSubrace() != null)
        {
            subraceDisplay.setText(characterData.getSubrace());
        }
        if (characterData.getEquipment() != null)
        {
            equipmentArea.setText(characterData.getEquipment());
        }
        if (characterData.getSpells() != null)
        {
            spellsArea.setText(characterData.getSpells());
        }
        if (characterData.getNotes() != null)
        {
            notesText.setText(characterData.getNotes());
        }

        //setting the skill bonus to their values stored on data class
        animalHandlingLabel.setText(String.valueOf(characterData.getAnimalHandlingBonus()));
        arcanaLabel.setText(String.valueOf(characterData.getArcanaBonus()));
        athleticsLabel.setText(String.valueOf(characterData.getAthleticsBonus()));
        deceptionLabel.setText(String.valueOf(characterData.getDeceptionBonus()));
        insightLabel.setText(String.valueOf(characterData.getInsightBonus()));
        intimidationLabel.setText(String.valueOf(characterData.getIntimidationBonus()));
        investigationLabel.setText(String.valueOf(characterData.getInvestigationBonus()));
        medicineLabel.setText(String.valueOf(characterData.getMedicineBonus()));
        natureLabel.setText(String.valueOf(characterData.getNatureBonus()));
        perceptionLabel.setText(String.valueOf(characterData.getPerceptionBonus()));
        performanceLabel.setText(String.valueOf(characterData.getPerceptionBonus()));
        persuasionLabel.setText(String.valueOf(characterData.getAnimalHandlingBonus()));
        religionLabel.setText(String.valueOf(characterData.getReligionBonus()));
        sleightLabel.setText(String.valueOf(characterData.getSleightOfHandBonus()));
        stealthLabel.setText(String.valueOf(characterData.getStealthBonus()));
        survivalLabel.setText(String.valueOf(characterData.getSurvivalBonus()));
        acrobaticsLabel.setText(String.valueOf(characterData.getAcrobaticsBonus()));
        historyLabel.setText(String.valueOf(characterData.getHistoryBonus()));
        strThrowLabel.setText(String.valueOf(characterData.getStrThrow()));
        dexThrowLabel.setText(String.valueOf(characterData.getDexThrow()));
        conThrowLabel.setText(String.valueOf(characterData.getConThrow()));
        intThrowLabel.setText(String.valueOf(characterData.getIntThrow()));
        wisThrowLabel.setText(String.valueOf(characterData.getWisThrow()));
        chaThrowLabel.setText(String.valueOf(characterData.getChaThrow()));
        armorLabel.setText(String.valueOf(characterData.getArmorAmount()));
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

    public void updateNotes() {characterData.setNotes(notesText.getText());}
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