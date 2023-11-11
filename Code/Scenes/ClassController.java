package Scenes;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.scene.control.TextArea;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.ChoiceBox;
import javafx.scene.image.ImageView;
import javafx.fxml.FXML;

public class ClassController implements Initializable{


    @FXML
    private ChoiceBox<String> classChoiceBox;
    private String[] classes = {"Barbarian","Bard","Cleric","Druid","Fighter","Monk","Paladin","Ranger","Rogue","Sorcerer","Warlock","Wizard"};
    @FXML
    private TextArea classDescription;
    @FXML
    private ImageView barbIcon;
    @FXML
    private ImageView missingIcon;
    @FXML
    private ImageView bardIcon;
    @FXML
    private ImageView wizardIcon;
    @FXML
    private ImageView monkIcon;
    @FXML
    private ImageView warlockIcon;
    @FXML
    private ImageView paladinIcon;
    @FXML
    private ImageView druidIcon;
    @FXML
    private ImageView clericIcon;
    @FXML
    private ImageView fighterIcon;
    @FXML
    private ImageView rangerIcon;
    @FXML
    private ImageView rogueIcon;
    @FXML
    private ImageView sorcererIcon;

    private String[] descriptions = {"Barbarians tap into their inner rage to become fierce melee fighters, using abilities like \"Rage\" for increased strength and toughness. They often wield two-handed weapons, have high hit points, and can choose different paths, like the \"Totem Warrior.\" In a party, they serve as front-line damage dealers and can fill roles as scouts or survivalists.",
                                     "Bards are charismatic and versatile. They use music and performance to cast spells and inspire allies. They come from diverse backgrounds and can excel in combat, magic, or social roles. Bards choose Bardic Colleges to specialize in their abilities. In a party, they provide utility, healing, and support. Bards are known for their charm, creativity, and adaptability, making them valuable in various situations.",
                                     "Clerics are spellcasters known for healing magic and protection spells. Clerics choose a Divine Domain that reflects their deity's nature, and they can excel in combat and support roles. Their alignment aligns with their deity's values. In a party, clerics are crucial healers, spiritual guides, and versatile contributors to various aspects of the game.",
                                     "Druids are nature-focused with a deep connection to the natural world. They have the ability to cast nature-based spells, speak with animals, and shape-shift into animals using \"Wild Shape.\" Druids choose a Circle, which can emphasize spellcasting or shape-shifting abilities. They typically serve as healers, casters, and controllers in a party and are known for their neutral alignment and love for nature.",
                                     "Fighters come from various backgrounds and are proficient in various weapons and armor. Fighters have multiple attacks per turn, unique class features like \"Action Surge,\" and can choose combat styles and martial archetypes. They excel in physical combat, making them reliable front-line combatants, and their role-playing often reflects discipline and combat expertise.",
                                     "Monks come from monastic traditions, using their bodies as weapons and harnessing \"Ki\" energy for extraordinary feats. Monks have unique abilities, such as \"Unarmored Defense\" and \"Martial Arts,\" and choose monastic traditions that further refine their skills. They excel in melee combat, possess incredible speed and evasion, and may serve as scouts or support characters.",
                                     "Paladins excel in combat and divine magic, with unique abilities like \"Divine Smite\" and \"Lay on Hands.\" Paladins choose a sacred oath, such as Oath of Devotion or Oath of Vengeance, which further defines their principles. They serve as versatile characters, capable of being tanks, melee fighters, and support characters, often embodying the ideals of goodness and righteousness.",
                                     "Rangers are skilled wilderness experts and trackers with proficiency in archery and melee combat. They possess unique abilities such as \"Favored Enemy\" and \"Natural Explorer\" for advantages against specific creatures and in specific terrains. Rangers can cast nature-related spells, choose archetypes like the Hunter or Beast Master, and excel in reconnaissance and survival",
                                     "Rogues often come from backgrounds associated with illicit activities. Rogues have abilities like \"Sneak Attack\" for extra damage and proficiency with thieves' tools. They serve as scouts, trap experts, and damage dealers in a party. Rogues can have a variety of alignments and often embody street smarts and cunning wit. They add versatility and covert expertise to the party.",
                                     "Sorcerers are spellcasters with innate and raw magical abilities. They use \"Sorcery Points\" to manipulate spells and can alter and empower spells through \"Metamagic.\" Sorcerers choose a sorcerous origin, such as Draconic Bloodline or Wild Magic, to define the source of their magic. They serve as spellcasters in a party, specializing in damage, control, or support based on their spells and choices.",
                                     "Warlocks are spellcasters who form pacts with powerful otherworldly entities for magical abilities. They have unique spellcasting mechanics, choose abilities called \"Eldritch Invocations,\" and are defined by their patrons, such as Archfey or Fiends. Warlocks serve as versatile spellcasters in a party, specializing in various roles. Their character alignment and motivations vary, often shaped by their patrons.",
                                     "Wizards are spellcasters known for their scholarly pursuit of magic through study and spellbook knowledge. They use their spellbook to cast a variety of magical spells, prepare spells daily, and recover spell slots through \"Arcane Recovery.\" Wizards choose an \"Arcane Tradition\" that defines their magical focus. They excel in roles like damage dealing, control, utility, and support."};
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
        clearImg();
        missingIcon.setVisible(true);
        classChoiceBox.getItems().addAll(classes);
        classChoiceBox.getSelectionModel().selectedItemProperty().addListener((observable, oldValue, newValue) ->
        {
            if (newValue != null)
            {
                if (newValue.equals("Barbarian")) 
                {
                    classDescription.setText(descriptions[0]);
                    clearImg();
                    barbIcon.setVisible(true);
                }
                else if (newValue.equals("Bard")) 
                {
                    classDescription.setText(descriptions[1]);
                    clearImg();
                    bardIcon.setVisible(true);
                }
                else if (newValue.equals("Cleric")) 
                {
                    classDescription.setText(descriptions[2]);
                    clearImg();
                    clericIcon.setVisible(true);
                }
                else if (newValue.equals("Druid")) 
                {
                    classDescription.setText(descriptions[3]);
                    clearImg();
                    druidIcon.setVisible(true);
                }
                else if (newValue.equals("Fighter")) 
                {
                    classDescription.setText(descriptions[4]);
                    clearImg();
                    fighterIcon.setVisible(true);
                }
                else if (newValue.equals("Monk")) 
                {
                    classDescription.setText(descriptions[5]);
                    clearImg();
                    monkIcon.setVisible(true);
                }
                else if (newValue.equals("Paladin")) 
                {
                    classDescription.setText(descriptions[6]);
                    clearImg();
                    paladinIcon.setVisible(true);
                }
                else if (newValue.equals("Ranger")) 
                {
                    classDescription.setText(descriptions[7]);
                    clearImg();
                    rangerIcon.setVisible(true);
                }
                else if (newValue.equals("Rogue")) 
                {
                    classDescription.setText(descriptions[8]);
                    clearImg();
                    rogueIcon.setVisible(true);
                }
                else if (newValue.equals("Sorcerer")) 
                {
                    classDescription.setText(descriptions[9]);
                    clearImg();
                    sorcererIcon.setVisible(true);
                }
                else if (newValue.equals("Warlock")) 
                {
                    classDescription.setText(descriptions[10]);
                    clearImg();
                    warlockIcon.setVisible(true);
                }
                else if (newValue.equals("Wizard")) 
                {
                    classDescription.setText(descriptions[11]);
                    clearImg();
                    wizardIcon.setVisible(true);
                }
            }
        });
    };

    public void clearImg()
    {
        barbIcon.setVisible(false);
        bardIcon.setVisible(false);
        monkIcon.setVisible(false);
        wizardIcon.setVisible(false);
        missingIcon.setVisible(false);
        warlockIcon.setVisible(false);
        paladinIcon.setVisible(false);
        druidIcon.setVisible(false);
        clericIcon.setVisible(false);
        fighterIcon.setVisible(false);
        rangerIcon.setVisible(false);
        rogueIcon.setVisible(false);
        sorcererIcon.setVisible(false);
    }
    public void switchToScene3(ActionEvent event) throws IOException
    {
        controller = new sceneController();
        controller.switchToScene3(event); // Called the prev method with the empty event
    }

    public void switchToScene2(ActionEvent event) throws IOException
    {
        controller = new sceneController();
        controller.switchToScene2(event); // Called the prev method with the empty event
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
