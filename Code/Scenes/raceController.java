package Scenes;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextArea;


public class raceController implements Initializable{
    @FXML
    private ChoiceBox<String> myChoiceBox;
    @FXML
    private ChoiceBox<String> subraceChoiceBox;
    @FXML
    private TextArea backgroundDescription = new TextArea();
    private String[] racesArray = {"Dwarf", "Elf", "Halfling", "Human", "Dragonborn", "Gnome", "Half-Elf", "Half-Orc", "Tiefling"};
    private String[] dwarfSubraces = {"Hill Dwarf", "Mountain Dwarf"};
    private String[] elfSubraces = {"High Elf", "Wood Elf"};
    private String[] halflingSubraces = {"Lightfoot Halfling", "Stout Halfling"};
    private String[] gnomeSubraces = {"Rock Gnome", "Deep Gnome"};
    private String[] descriptions = {"Dwarves are well known for being strong and hardy creatures. Usually, they are portrayed as robust, muscular creatures with a stocky, powerful build. These diligent and hardworking animals are frequently connected to expert craftsmanship and a fondness for mining.",
                                     "You possess extraordinary resilience, strong intuition, and acute senses as a hill dwarf. In the Dragonlance setting, the debased Klar of Krynn and the banished Neidar are both hill dwarves, as are the gold dwarves of Faerûn in their powerful southern kingdom.",
                                     "You are tough and resilient as a mountain dwarf, used to living in harsh environments. As a dwarf, you are most likely taller than average and have a tendency toward lighter coloring. Mountain dwarves are the shield dwarves of northern Faerûn, the powerful Hylar clan, and the honorable Daewar clan of Dragonlance.",
                                     "Elves are renowned for being graceful and airy beings. They are frequently depicted as tall, lean creatures with exquisite features. These magical beings are usually linked to having a strong bond with the natural world and a penchant for magic.",
                                     "You are a high elf with a sharp mind and a rudimentary understanding of magic. High elves are often depicted as having a sense of superiority and can come across as aloof or reserved when dealing with other races. They take great pride in their heritage and culture.",
                                     "You have a strong bond with the natural world, forests, and wilderness as a wood elf. They are frequently portrayed as being attuned to their surroundings and possessing traits indicative of their forest-dwelling way of life.",
                                     "Halflings, often referred to as \"hobbits\" in some fantasy settings, are a small and unassuming race known for their love of simple pleasures, community, and a quiet, peaceful way of life.",
                                     "Lightfoot halflings are particularly skilled at being stealthy and nimble. They can easily blend into their surroundings and are often known for their innate ability to avoid notice, making them excellent thieves, spies, and rogues.",
                                     "You're a sturdy halfling with some resistance to poison, making you more resilient than most. Stouts are said to be descended from dwarves. These halflings are known as stronghearts in the Forgotten Realms, and they are primarily found in the southern regions.",
                                     "Among the common races, humans are the most ambitious and adaptive. Humans are the inventors, the achievers, the world's pioneers, whatever their motivations.",
                                     "Dragonborn are a humanoid race with dragon-like traits, including scaled skin, breath weapons, and ancestry tied to various dragon types. They often exhibit courage, honor, and a diverse array of abilities based on their dragon lineage.",
                                     "Gnomes are small, playful humanoid beings known for their inquisitive nature, creativity, and connection to both the natural world and magic. They are skilled artisans and tinkerers, often engaging in playful pranks and lighthearted humor.",
                                     "Rock gnomes are a subrace of gnomes known for their inventive and clever nature. They are skilled tinkerers, artisans, and craftsmen, often creating gadgets and devices. They possess an affinity for precious stones and a deep connection to the earth",
                                     "Deep gnomes, also known as \"svirfneblin,\" are a subrace of gnomes adapted to the underground world. They thrive in dark, subterranean environments, possessing stealth, resilience, and magical aptitude. Their close-knit communities, craftsmanship, and quest for knowledge make them intriguing inhabitants of the deep.",
                                     "Half-elves are a hybrid race with mixed human and elven heritage, resulting in a versatile and charismatic blend of physical features. Half-elves possess enhanced senses and a penchant for exploring the world, making them adaptable and intriguing individuals with a unique place in society.",
                                     "Half-orcs are a hardy race resulting from the mix of human and orc ancestry, known for their robust physique and physical prowess. Half-orcs excel in combat and are known for their pragmatic, resourceful nature, making them formidable warriors and adventurers.",
                                     "Tieflings are a distinctive race with infernal ancestry, marked by unique physical traits like horns and tails, as well as supernatural abilities tied to their fiendish lineage. They often face prejudice and struggle with their identity but are known for their resilience and determination."};

    private sceneController controller; //created a scenceController instance
    SummaryBuilder summaryBuilder = SummaryBuilder.getInstance(); //created a character data instance

    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
        // Assuming racesArray and dwarfSubraces are ObservableLists or Lists of String

        // Add items to the first ChoiceBox
        myChoiceBox.getItems().addAll(racesArray);
        saveData();
        // Set up a listener for the first ChoiceBox
        myChoiceBox.getSelectionModel().selectedItemProperty().addListener((observable, oldValue, newValue) -> {
            if (newValue != null) {
                // Clear existing items in the second ChoiceBox
                subraceChoiceBox.getItems().clear();

                // Based on the selected race, add corresponding subraces to the second ChoiceBox
                if (newValue.equals("Dwarf")) {
                    subraceChoiceBox.getItems().addAll(dwarfSubraces);
                    backgroundDescription.setText(descriptions[0]);
                    summaryBuilder.setSubrace("");
                }
                else if (newValue.equals("Elf"))
                {
                    subraceChoiceBox.getItems().addAll(elfSubraces);
                    backgroundDescription.setText(descriptions[3]);
                    summaryBuilder.setSubrace("");
                }
                else if (newValue.equals("Halfling"))
                {
                    subraceChoiceBox.getItems().addAll(halflingSubraces);
                    backgroundDescription.setText(descriptions[6]);
                    summaryBuilder.setSubrace("");
                }
                else if (newValue.equals("Human"))
                {
                    backgroundDescription.setText(descriptions[9]);
                    summaryBuilder.setSubrace("No Subrace");
                }
                else if (newValue.equals("Dragonborn"))
                {
                    backgroundDescription.setText(descriptions[10]);
                    summaryBuilder.setSubrace("No Subrace");
                }
                else if (newValue.equals("Gnome"))
                {
                    subraceChoiceBox.getItems().addAll(gnomeSubraces);
                    backgroundDescription.setText(descriptions[11]);
                    summaryBuilder.setSubrace("");
                }
                else if (newValue.equals("Half-Elf"))
                {
                    backgroundDescription.setText(descriptions[14]);
                    summaryBuilder.setSubrace("No Subrace");
                }
                else if (newValue.equals("Half-Orc"))
                {
                    backgroundDescription.setText(descriptions[15]);
                    summaryBuilder.setSubrace("No Subrace");
                }
                else if (newValue.equals("Tiefling"))
                {
                    backgroundDescription.setText(descriptions[16]);
                    summaryBuilder.setSubrace("No Subrace");
                }

                summaryBuilder.setRace(newValue); //setting the race on character data
                if (summaryBuilder.getSubrace() != null)
                {
                    if (summaryBuilder.getSubrace().equals("No Subrace"))
                    {
                        subraceChoiceBox.getSelectionModel().select("No Subrace");
                    }
                    else
                    {
                        subraceChoiceBox.getSelectionModel().select("");
                    }

                }

            }
        });
        subraceChoiceBox.getSelectionModel().selectedItemProperty().addListener((observable, oldValue, newValue) -> {
            if (newValue != null)
            {
                if (newValue.equals("Hill Dwarf")) {
                    backgroundDescription.setText(descriptions[1]);
                }
                else if (newValue.equals("Mountain Dwarf"))
                {
                    backgroundDescription.setText(descriptions[2]);
                }
                else if (newValue.equals("High Elf"))
                {
                    backgroundDescription.setText(descriptions[4]);
                }
                else if (newValue.equals("Wood Elf"))
                {
                    backgroundDescription.setText(descriptions[5]);
                }
                else if (newValue.equals("Lightfoot Halfling"))
                {
                    backgroundDescription.setText(descriptions[7]);
                }
                else if (newValue.equals("Stout Halfling"))
                {
                    backgroundDescription.setText(descriptions[8]);
                }
                else if (newValue.equals("Rock Gnome"))
                {
                    backgroundDescription.setText(descriptions[12]);
                }
                else if (newValue.equals("Deep Gnome"))
                {
                    backgroundDescription.setText(descriptions[13]);
                }

                summaryBuilder.setSubrace(newValue); //setting subrace on data class
            }
        });
    }


    private void saveData()
    {
        if (summaryBuilder.getRace() != null)
        {
            String newValue = summaryBuilder.getRace();
            myChoiceBox.getSelectionModel().select(newValue);
            if (newValue != null) {
                // Clear existing items in the second ChoiceBox
                subraceChoiceBox.getItems().clear();

                // Based on the selected race, add corresponding subraces to the second ChoiceBox
                if (newValue.equals("Dwarf")) {
                    subraceChoiceBox.getItems().addAll(dwarfSubraces);
                    backgroundDescription.setText(descriptions[0]);
                } else if (newValue.equals("Elf")) {
                    subraceChoiceBox.getItems().addAll(elfSubraces);
                    backgroundDescription.setText(descriptions[3]);
                } else if (newValue.equals("Halfling")) {
                    subraceChoiceBox.getItems().addAll(halflingSubraces);
                    backgroundDescription.setText(descriptions[6]);
                } else if (newValue.equals("Human")) {
                    backgroundDescription.setText(descriptions[9]);
                } else if (newValue.equals("Dragonborn")) {
                    backgroundDescription.setText(descriptions[10]);
                } else if (newValue.equals("Gnome")) {
                    subraceChoiceBox.getItems().addAll(gnomeSubraces);
                    backgroundDescription.setText(descriptions[11]);
                } else if (newValue.equals("Half-Elf")) {
                    backgroundDescription.setText(descriptions[14]);
                } else if (newValue.equals("Half-Orc")) {
                    backgroundDescription.setText(descriptions[15]);
                } else if (newValue.equals("Tiefling")) {
                    backgroundDescription.setText(descriptions[16]);
                }
            }
        }

        if (summaryBuilder.getSubrace() != null)
        {
            String newValue = summaryBuilder.getSubrace();
            subraceChoiceBox.getSelectionModel().select(newValue);
            if (newValue != null)
            {
                if (newValue.equals("Hill Dwarf")) {
                    backgroundDescription.setText(descriptions[1]);
                }
                else if (newValue.equals("Mountain Dwarf"))
                {
                    backgroundDescription.setText(descriptions[2]);
                }
                else if (newValue.equals("High Elf"))
                {
                    backgroundDescription.setText(descriptions[4]);
                }
                else if (newValue.equals("Wood Elf"))
                {
                    backgroundDescription.setText(descriptions[5]);
                }
                else if (newValue.equals("Lightfoot Halfling"))
                {
                    backgroundDescription.setText(descriptions[7]);
                }
                else if (newValue.equals("Stout Halfling"))
                {
                    backgroundDescription.setText(descriptions[8]);
                }
                else if (newValue.equals("Rock Gnome"))
                {
                    backgroundDescription.setText(descriptions[12]);
                }
                else if (newValue.equals("Deep Gnome"))
                {
                    backgroundDescription.setText(descriptions[13]);
                }
            }
        }

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
}
