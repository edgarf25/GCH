package Scenes;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class EquipmentController implements Initializable {
    @FXML
    private ChoiceBox<String> weaponChoiceBox;        //WEAPON-DROP-DOWN
    @FXML
    private ChoiceBox<String> armorChoiceBox;        //ARMOR-DROP-DOWN
    @FXML
    private ChoiceBox<String> possessionChoiceBox;   //Possessions-DROP-DOWN
    @FXML
    private ChoiceBox<String> spellChoiceBox;        ///SPELL-DROP-DOWN
    @FXML
    private TextField GoldInput;  //GOLD  INPUT TEXT BOX
    @FXML
    private TextArea TextAreaList;  // DISPLAYING ITEMS ON LIST
    private static String ListText = "";
    private String weaponText = "";
    private String armorText = "";
    private String posText = "";
    private String spellText = "";
    private final String[] weaponArray = {"Club", "Dagger", "GreatClub", "HandAxe", "Javelin", "Light Hammer", "Mace", "Quarterstaff", "Sickle", "Spear"};
    // WEAPON ARRAY CONTAINING LIST OF ARRAY OF WEAPONS MELEE
    private final String[] armorArray = {"Light Armor", "Medium Armor", "Heavy Armor"};
    // ARMOR CONTAINING LIST OF ARRAY ARMOR
    private final String[] posArray = {"SHEMCKLES", "Shield", "Torch","Cloak",};
    private final String[] BarbArray = {"Vicious Mockery", "Thunderwave", "Healing Word"};
    private final String[] clericArray = {"Sacred Flame", "Cure Wounds ", "Spirit Guardians"};

    private final String[] druidArray = {"Druid-craft", "Entangle", "Moonbeam "};
    private final String[] sorcArray = {"Druid-craft", "Entangle", "Moonbeam "};
    private final String[] wizardArray = {"Mage Hand", "Detect Magic", "Fireball"};
    private final String[] warlockArray = {"Eldritch Blast", "Hex", "Doom"};
    private final String[] paladinArray = {"Divine Smite", "Lay on Hands"};
    private final String[] rangerArray = {"Hunter's Mark", "Cordon of Arrows"};

    private final String[] rogueArray = {"Arcane Trickster", "Mage Hand", " Mage Armor"};
    private final String[] monkArray = {"Fist of Unbroken Air", "Flowing River"};

    private int amountOfGold = 0;
    private String goldLine = "";
    CharacterBuilder characterBuilder = CharacterBuilder.getInstance();

    public void initialize(URL arg0, ResourceBundle arg1) {
        //  Weapons Array Lists of String
        // Add items to the first ChoiceBox
        specifySpells();
        weaponChoiceBox.getItems().addAll(weaponArray);   // GET ALL WEAPONS IN ARRAY
        armorChoiceBox.getItems().addAll(armorArray);     // GET ALL ARMOR   IN ARRAY
        possessionChoiceBox.getItems().addAll(posArray);  // GET ALL POS     IN ARRAY
        if (characterBuilder.getEquipment() != null)
        {
            if (characterBuilder.getSpells() != null)
            {
                TextAreaList.setText(characterBuilder.getEquipment() + characterBuilder.getSpells());
            }
            else
            {
                TextAreaList.setText(characterBuilder.getEquipment());
            }
        }
        else if (characterBuilder.getSpells() != null)
        {
            TextAreaList.setText(characterBuilder.getSpells());
        }

        weaponChoiceBox.getSelectionModel().selectedItemProperty().addListener((observable, oldValue, newValue) -> {
            if (newValue != null) {
                addToString("Weapon: " + newValue + "\n", 0);

            }
        });
        armorChoiceBox.getSelectionModel().selectedItemProperty().addListener((observable, oldValue, newValue) -> {
            if (newValue != null) {
                addToString("Armor: " + newValue + "\n", 1);

            }
        });
        possessionChoiceBox.getSelectionModel().selectedItemProperty().addListener((observable, oldValue, newValue) -> {
            if (newValue != null) {
                addToString("Possessions: " + newValue + "\n", 2);

            }
        });
        spellChoiceBox.getSelectionModel().selectedItemProperty().addListener((observable, oldValue, newValue) -> {
            if (newValue != null) {
                addToString("Spells: " + newValue + "\n", 3);

            }
        });

    }

    public void specifySpells() {
        if (ClassController.userClass != null) {

            if (ClassController.userClass.equals("Bard")) {
                spellChoiceBox.getItems().addAll(BarbArray);
            } else if (ClassController.userClass.equals("Cleric")) {
                spellChoiceBox.getItems().addAll(clericArray);
            } else if (ClassController.userClass.equals("Druid")) {
                spellChoiceBox.getItems().addAll(druidArray);
            } else if (ClassController.userClass.equals("Monk")) {
                spellChoiceBox.getItems().addAll(monkArray);
            } else if (ClassController.userClass.equals("Paladin")) {
                spellChoiceBox.getItems().addAll(paladinArray);
            } else if (ClassController.userClass.equals("Ranger")) {
                spellChoiceBox.getItems().addAll(rangerArray);
            } else if (ClassController.userClass.equals("Rogue")) {
                spellChoiceBox.getItems().addAll(rogueArray);
            } else if (ClassController.userClass.equals("Sorcerer")) {
                spellChoiceBox.getItems().addAll(sorcArray);
            } else if (ClassController.userClass.equals("Warlock")) {
                spellChoiceBox.getItems().addAll(warlockArray);
            } else if (ClassController.userClass.equals("Wizard")) {
                spellChoiceBox.getItems().addAll(wizardArray);
            }
        }
    }

    /// Inistialize  ArrayList
    public void addToString(String s, int e) {
        if (e == 0) {
            weaponText = s; // WEAPON
        } else if (e == 1) {
            armorText = s; // ARMOR
        } else if (e == 2) {
            posText = s;  // POS
        } else if (e == 3) {
            spellText = s; // SPELL
        }

    }

    public void addWeapon() {
        if (weaponText != null) {
            if (characterBuilder.getEquipment() != null) {
                characterBuilder.setEquipment(characterBuilder.getEquipment() + weaponText);
                if (characterBuilder.getSpells() == null) {
                    TextAreaList.setText(characterBuilder.getEquipment());
                } else {
                    TextAreaList.setText(characterBuilder.getEquipment() + characterBuilder.getSpells());
                }
            } else if (characterBuilder.getSpells() != null) {
                TextAreaList.setText(weaponText + characterBuilder.getSpells());
                characterBuilder.setEquipment(weaponText);
            } else {
                characterBuilder.setEquipment(weaponText);
                TextAreaList.setText(weaponText);
            }
            weaponText = "";
        }
    }

    public void addArmor() {
        if (armorText != null) {
            if (characterBuilder.getEquipment() != null) {
                characterBuilder.setEquipment(characterBuilder.getEquipment() + armorText);
                if (characterBuilder.getSpells() == null) {
                    TextAreaList.setText(characterBuilder.getEquipment());
                } else {
                    TextAreaList.setText(characterBuilder.getEquipment() + characterBuilder.getSpells());
                }
            } else if (characterBuilder.getSpells() != null) {
                characterBuilder.setEquipment(armorText);
                TextAreaList.setText(armorText + characterBuilder.getSpells());
            } else {
                characterBuilder.setEquipment(armorText);
                TextAreaList.setText(armorText);
            }
            armorText = "";
        }
    }

    public void addPossession() {
        if (posText != null) {
            if (characterBuilder.getEquipment() != null) {
                characterBuilder.setEquipment(characterBuilder.getEquipment() + posText);
                if (characterBuilder.getSpells() == null) {
                    TextAreaList.setText(characterBuilder.getEquipment());
                } else {
                    TextAreaList.setText(characterBuilder.getEquipment() + characterBuilder.getSpells());
                }
            } else if (characterBuilder.getSpells() != null) {
                characterBuilder.setEquipment(posText);
                TextAreaList.setText(posText + characterBuilder.getSpells());
            } else {
                characterBuilder.setEquipment(posText);
                TextAreaList.setText(posText);
            }
            posText = "";
        }
    }

    public void addSpell() {
        if (spellText != null) {
            if (characterBuilder.getSpells() != null) {
                characterBuilder.setSpells(characterBuilder.getSpells() + spellText);
                if (characterBuilder.getEquipment() == null) {
                    TextAreaList.setText(characterBuilder.getSpells());
                } else {
                    TextAreaList.setText(characterBuilder.getEquipment() + characterBuilder.getSpells());
                }
            } else if (characterBuilder.getEquipment() != null) {
                characterBuilder.setSpells(spellText);
                TextAreaList.setText(characterBuilder.getEquipment() + spellText);
            } else {
                characterBuilder.setSpells(spellText);
                TextAreaList.setText(spellText);
            }
            spellText = "";
        }
    }

    public void addGold() {
        // System.out.println(amountOfGold);
        String list = characterBuilder.getEquipment();
        if (GoldInput != null && !GoldInput.getText().isEmpty()) {
            if (list != null) {
                StringBuffer text = new StringBuffer(list);
                amountOfGold += Integer.valueOf(GoldInput.getText());
                String sub = "";
                if (list.contains("Gold")) {
                    goldLine = "Gold: " + amountOfGold + "g";
                    System.out.println(goldLine);
                    text.replace(list.indexOf("Gold"), list.indexOf("g") + 1, goldLine);
                    sub = list.substring(list.indexOf("Gold"), list.indexOf("g") + 1);
                    characterBuilder.setEquipment(list.replace(sub, goldLine));
                } else {
                    characterBuilder.setEquipment(list + "Gold: " + amountOfGold + "g\n");
                }
                if (characterBuilder.getSpells() == null) {
                    TextAreaList.setText(characterBuilder.getEquipment());
                } else {
                    TextAreaList.setText(characterBuilder.getEquipment() + characterBuilder.getSpells());
                }
            } else if (characterBuilder.getSpells() != null) {
                characterBuilder.setEquipment("Gold: " + GoldInput.getText() + "g\n");
                TextAreaList.setText("Gold: " + GoldInput.getText() + "g\n" + characterBuilder.getSpells());
                addGold();
            } else {
                characterBuilder.setEquipment("Gold: " + GoldInput.getText() + "g\n");
                TextAreaList.setText("Gold: " + GoldInput.getText() + "g\n");
                addGold();
            }
            GoldInput.setText("");
        }
    }

    public void checker() //checking that age only has number inputs
    {
        try {
            Integer.parseInt(GoldInput.getText());
        } catch (NumberFormatException nfe) {
            GoldInput.setText("");
        }
    }

    public void clear() {
        ListText = "";
        TextAreaList.setText("");
        weaponText = "";
        armorText = "";
        posText = "";
        spellText = "";
        amountOfGold = 0;
        weaponChoiceBox.getSelectionModel().clearSelection();
        armorChoiceBox.getSelectionModel().clearSelection();
        possessionChoiceBox.getSelectionModel().clearSelection();
        spellChoiceBox.getSelectionModel().clearSelection();
        characterBuilder.setEquipment("");
        characterBuilder.setSpells("");
    }

    private sceneController controller; //created a scenceControl7ler instance


    public void prev(ActionEvent event) throws IOException {
        controller = new sceneController();
        controller.prev(event); // Called the prev method with the empty event
    }

    public void next(ActionEvent event) throws IOException {
        controller = new sceneController();
        controller.next(event); // Called the prev method with the empty event
    }

    public void switchToScene2(ActionEvent event) throws IOException {
        controller = new sceneController();
        controller.switchToScene2(event); // Called the prev method with the empty event
    }

    public void switchToScene3(ActionEvent event) throws IOException {
        controller = new sceneController();
        controller.switchToScene3(event); // Called the prev method with the empty event
    }

    public void switchToScene4(ActionEvent event) throws IOException {
        controller = new sceneController();
        controller.switchToScene4(event); // Called the prev method with the empty event
    }

    public void switchToScene5(ActionEvent event) throws IOException {
        controller = new sceneController();
        controller.switchToScene5(event); // Called the prev method with the empty event
    }

    public void switchToScene6(ActionEvent event) throws IOException {
        controller = new sceneController();
        controller.switchToScene6(event); // Called the prev method with the empty event
    }

    public void switchToScene7(ActionEvent event) throws IOException {
        controller = new sceneController();
        controller.switchToScene7(event); // Called the prev method with the empty event
    }

}
