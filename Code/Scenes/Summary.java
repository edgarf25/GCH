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

public class Summary implements Initializable{

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
    private Skill skillController;
    SummaryBuilder summaryBuilder = SummaryBuilder.getInstance();
    Summary(SummaryBuilder builder)
    {

    }

    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {


        skillController = new Skill();
        skillController.startSkills();


        if (summaryBuilder.getName() != null)
        {
            nameS.setText(summaryBuilder.getName());
        }
        System.out.println(summaryBuilder.getName());

        if (summaryBuilder.getUpdateAbilities() != null) //setting abilities
        {
            abilityValues = summaryBuilder.getUpdateAbilities();
            strLabel.setText(String.valueOf(abilityValues[0]));
            dexLabel.setText(String.valueOf(abilityValues[1]));
            conLabel.setText(String.valueOf(abilityValues[2]));
            intLabel.setText(String.valueOf(abilityValues[3]));
            wisLabel.setText(String.valueOf(abilityValues[4]));
            chaLabel.setText(String.valueOf(abilityValues[5]));
        }
        if (summaryBuilder.getCharacterClass() != null)
        {
            if (summaryBuilder.getCharacterClass().equals("Barbarian"))
            {
                clearImg();
                barbCircle.setVisible(true);
            }
            else if (summaryBuilder.getCharacterClass().equals("Bard"))
            {
                clearImg();
                bardCircle.setVisible(true);
            }
            else if (summaryBuilder.getCharacterClass().equals("Cleric"))
            {
                clearImg();
                clericCircle.setVisible(true);
            }
            else if (summaryBuilder.getCharacterClass().equals("Ranger"))
            {
                clearImg();
                rangerCircle.setVisible(true);
            }
            else if (summaryBuilder.getCharacterClass().equals("Druid"))
            {
                clearImg();
                druidCircle.setVisible(true);
            }
            else if (summaryBuilder.getCharacterClass().equals("Fighter"))
            {
                clearImg();
                fighterCircle.setVisible(true);
            }
            else if (summaryBuilder.getCharacterClass().equals("Monk"))
            {
                clearImg();
                monkCircle.setVisible(true);
            }
            else if (summaryBuilder.getCharacterClass().equals("Paladin"))
            {
                clearImg();
                paladinCircle.setVisible(true);
            }
            else if (summaryBuilder.getCharacterClass().equals("Rogue"))
            {
                clearImg();
                rogueCircle.setVisible(true);
            }
            else if (summaryBuilder.getCharacterClass().equals("Sorcerer"))
            {
                clearImg();
                sorcererCircle.setVisible(true);
            }
            else if (summaryBuilder.getCharacterClass().equals("Warlock"))
            {
                clearImg();
                warlockCircle.setVisible(true);
            }
            else if (summaryBuilder.getCharacterClass().equals("Wizard"))
            {
                clearImg();
                wizardCircle.setVisible(true);
            }
        }


        if (summaryBuilder.getHair() != null) //setting hair
        {
            hairLabel.setText(summaryBuilder.getHair());
        }

        if (summaryBuilder.getEyes() != null) //setting eyes
        {
            eyesLabel.setText(summaryBuilder.getEyes());
        }

        if (summaryBuilder.getGender() != null) //setting gender
        {
            genderLabel.setText(summaryBuilder.getGender());
        }

        if (summaryBuilder.getSkin() != null) //setting skin
        {
            skinLabel.setText(summaryBuilder.getSkin());
        }

        if (summaryBuilder.getHeight() != null) //setting height
        {
            heightLabel.setText(summaryBuilder.getHeight());
        }

        if (summaryBuilder.getSkillsAndProficiencies1() != null)
        {
            skill1Label.setText(summaryBuilder.getSkillsAndProficiencies1());
        }

        if (summaryBuilder.getSkillsAndProficiencies2() != null)
        {
            skill2Label.setText(summaryBuilder.getSkillsAndProficiencies2());
        }

        if (summaryBuilder.getAge() !=  null)
        {
            ageLabel.setText(summaryBuilder.getAge());
        }
        
        if (summaryBuilder.getbackgroundText() != null)
        {
           backgroundTextArea.setText(summaryBuilder.getbackgroundText());
        }
        if(summaryBuilder.getCharacterClass() != null){
            classDisplayLabel.setText(summaryBuilder.getCharacterClass());
        }
        if(summaryBuilder.getSubclass() != null)
        {
            subclassDisplayLabel.setText(summaryBuilder.getSubclass());
        }
        if(summaryBuilder.getRace() != null)
        {
            raceDisplay.setText(summaryBuilder.getRace());
        }
        if(summaryBuilder.getSubrace() != null)
        {
            subraceDisplay.setText(summaryBuilder.getSubrace());
        }
        if (summaryBuilder.getEquipment() != null)
        {
            equipmentArea.setText(summaryBuilder.getEquipment());
        }
        if (summaryBuilder.getSpells() != null)
        {
            spellsArea.setText(summaryBuilder.getSpells());
        }
        if (summaryBuilder.getNotes() != null)
        {
            notesText.setText(summaryBuilder.getNotes());
        }

        //setting the Skill bonus to their values stored on data class
        animalHandlingLabel.setText(String.valueOf(summaryBuilder.getAnimalHandlingBonus()));
        arcanaLabel.setText(String.valueOf(summaryBuilder.getArcanaBonus()));
        athleticsLabel.setText(String.valueOf(summaryBuilder.getAthleticsBonus()));
        deceptionLabel.setText(String.valueOf(summaryBuilder.getDeceptionBonus()));
        insightLabel.setText(String.valueOf(summaryBuilder.getInsightBonus()));
        intimidationLabel.setText(String.valueOf(summaryBuilder.getIntimidationBonus()));
        investigationLabel.setText(String.valueOf(summaryBuilder.getInvestigationBonus()));
        medicineLabel.setText(String.valueOf(summaryBuilder.getMedicineBonus()));
        natureLabel.setText(String.valueOf(summaryBuilder.getNatureBonus()));
        perceptionLabel.setText(String.valueOf(summaryBuilder.getPerceptionBonus()));
        performanceLabel.setText(String.valueOf(summaryBuilder.getPerceptionBonus()));
        persuasionLabel.setText(String.valueOf(summaryBuilder.getAnimalHandlingBonus()));
        religionLabel.setText(String.valueOf(summaryBuilder.getReligionBonus()));
        sleightLabel.setText(String.valueOf(summaryBuilder.getSleightOfHandBonus()));
        stealthLabel.setText(String.valueOf(summaryBuilder.getStealthBonus()));
        survivalLabel.setText(String.valueOf(summaryBuilder.getSurvivalBonus()));
        acrobaticsLabel.setText(String.valueOf(summaryBuilder.getAcrobaticsBonus()));
        historyLabel.setText(String.valueOf(summaryBuilder.getHistoryBonus()));
        strThrowLabel.setText(String.valueOf(summaryBuilder.getStrThrow()));
        dexThrowLabel.setText(String.valueOf(summaryBuilder.getDexThrow()));
        conThrowLabel.setText(String.valueOf(summaryBuilder.getConThrow()));
        intThrowLabel.setText(String.valueOf(summaryBuilder.getIntThrow()));
        wisThrowLabel.setText(String.valueOf(summaryBuilder.getWisThrow()));
        chaThrowLabel.setText(String.valueOf(summaryBuilder.getChaThrow()));
        armorLabel.setText(String.valueOf(summaryBuilder.getArmorAmount()));
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
        summaryBuilder.setNotes(notesText.getText());}
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