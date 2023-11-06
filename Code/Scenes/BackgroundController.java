package Scenes;

import java.io.IOException;
import java.net.URL;
import java.util.Objects;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextArea;
import javafx.scene.text.Font;

public class BackgroundController implements Initializable {
    @FXML
    private ChoiceBox<String> backgroundChoiceBox;
    @FXML
    private TextArea backgroundTextBox = new TextArea();



    private String[] backgrounds = {"Custom Background", "Acolyte", "Criminal/Spy", "Folk Hero", "Haunted One", "Noble", "Sage", "Soldier"};

    private String[] descriptions = {"You have spent your life in the service of a temple to a specific god or pantheon of gods. You act as an intermediary between the realm of the holy and the mortal world, performing sacred rites and offering sacrifices in order to conduct worshipers into the presence of the divine. You are not necessarily a cleric—performing sacred rites is not the same thing as channeling divine power.\n" +
                                     "\n" +
                                     "Choose a god, a pantheon of gods, or some other quasi-divine being, and work with your DM to detail the nature of your religious service. The Gods of the Multiverse section contains a sample pantheon, from the Forgotten Realms setting. Were you a lesser functionary in a temple, raised from childhood to assist the priests in the sacred rites? Or were you a high priest who suddenly experienced a call to serve your god in a different way? Perhaps you were the leader of a small cult outside of any established temple structure, or even an occult group that served a fiendish master that you now deny.",
                                     "You are an experienced criminal with a history of breaking the law. You have spent a lot of time among other criminals and still have contacts within the criminal underworld. You’re far closer than most people to the world of murder, theft, and violence that pervades the underbelly of civilization, and you have survived up to this point by flouting the rules and regulations of society.",
                                     "You are haunted by something so terrible that you dare not speak of it. You’ve tried to bury it and run away from it, to no avail. Whatever this thing is that haunts you can’t be slain with a sword or banished with a spell. It might come to you as a shadow on the wall, a bloodcurdling nightmare, a memory that refuses to die, or a demonic whisper in the dark. The burden has taken its toll, isolating you from most people and making you question your sanity. You must find a way to overcome it before it destroys you.",
                                     "You come from a humble social rank, but you are destined for so much more. Already the people of your home village regard you as their champion, and your destiny calls you to stand against the tyrants and monsters that threaten the common folk everywhere.",
                                     "You understand wealth, power, and privilege. You carry a noble title, and your family owns land, collects taxes, and wields significant political influence. You might be a pampered aristocrat unfamiliar with work or discomfort, a former merchant just elevated to the nobility, or a disinherited scoundrel with a disproportionate sense of entitlement. Or you could be an honest, hard-working landowner who cares deeply about the people who live and work on your land, keenly aware of your responsibility to them.\n" +
                                             "\n" +
                                             "Work with your DM to come up with an appropriate title and determine how much authority that title carries. A noble title doesn’t stand on its own—it’s connected to an entire family, and whatever title you hold, you will pass it down to your own children. Not only do you need to determine your noble title, but you should also work with the DM to describe your family and their influence on you.\n" +
                                             "\n" +
                                             "Is your family old and established, or was your title only recently bestowed? How much influence do they wield, and over what area? What kind of reputation does your family have among the other aristocrats of the region? How do the common people regard them?\n" +
                                             "\n" +
                                             "What’s your position in the family? Are you the heir to the head of the family? Have you already inherited the title? How do you feel about that responsibility? Or are you so far down the line of inheritance that no one cares what you do, as long as you don’t embarrass the family? How does the head of your family feel about your adventuring career? Are you in your family’s good graces, or shunned by the rest of your family?\n" +
                                             "\n" +
                                             "Does your family have a coat of arms? An insignia you might wear on a signet ring? Particular colors you wear all the time? An animal you regard as a symbol of your line or even a spiritual member of the family?\n" +
                                             "\n" +
                                             "These details help establish your family and your title as features of the world of the campaign.",
                                             "You spent years learning the lore of the multiverse. You scoured manuscripts, studied scrolls, and listened to the greatest experts on the subjects that interest you. Your efforts have made you a master in your fields of study.",
                                             "War has been your life for as long as you care to remember. You trained as a youth, studied the use of weapons and armor, learned basic survival techniques, including how to stay alive on the battlefield. You might have been part of a standing national army or a mercenary company, or perhaps a member of a local militia who rose to prominence during a recent war.\n" +
                                                     "\n" +
                                                     "When you choose this background, work with your DM to determine which military organization you were a part of, how far through its ranks you progressed, and what kind of experiences you had during your military career. Was it a standing army, a town guard, or a village militia? Or it might have been a noble’s or merchant’s private army, or a mercenary company."};

    private sceneController controller; //created a scenceController instance

    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
        backgroundTextBox.setWrapText(true);
        backgroundTextBox.setFont(Font.font("Impact", 18));
        backgroundChoiceBox.getItems().addAll(backgrounds);
        backgroundChoiceBox.setOnAction(this::getBackground);
    }

    public void getBackground(ActionEvent event) 
    {
        String myBackground = backgroundChoiceBox.getValue();
        if (Objects.equals(myBackground, "Acolyte")) 
        {
            backgroundTextBox.setText(descriptions[0]);
            backgroundTextBox.setEditable(false);
        }
        else if (Objects.equals(myBackground, "Criminal/Spy")) 
        {
            backgroundTextBox.setText(descriptions[1]);
            backgroundTextBox.setEditable(false);
        }
        else if (Objects.equals(myBackground, "Folk Hero")) 
        {
            backgroundTextBox.setText(descriptions[2]);
            backgroundTextBox.setEditable(false);
        }
        else if (Objects.equals(myBackground, "Haunted One")) 
        {
            backgroundTextBox.setText(descriptions[3]);
            backgroundTextBox.setEditable(false);
        }
        else if (Objects.equals(myBackground, "Noble")) 
        {
            backgroundTextBox.setText(descriptions[4]);
            backgroundTextBox.setEditable(false);
        }
        else if (Objects.equals(myBackground, "Sage")) 
        {
            backgroundTextBox.setText(descriptions[5]);
            backgroundTextBox.setEditable(false);
        }
        else if (Objects.equals(myBackground, "Soldier")) 
        {
            backgroundTextBox.setText(descriptions[6]);
            backgroundTextBox.setEditable(false);
        }
        else
        {
            backgroundTextBox.setEditable(true);
            backgroundTextBox.setText(""); 
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

    public void switchToScene2(ActionEvent event) throws IOException
    {
        controller = new sceneController();
        controller.switchToScene2(event); // Called the prev method with the empty event
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
