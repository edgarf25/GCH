package Scenes;

import java.io.IOException;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Slider;
import javafx.scene.media.MediaPlayer;

public class Settings {
    @FXML
    private Slider volumeSlider;
    private MediaPlayer mediaPlayer;

    sceneController sceneController = new sceneController();
    SummaryBuilder summaryBuilder = SummaryBuilder.getInstance();

    public void initialize() {
        // Set a listener on the volume slider to update the MediaPlayer volume
        volumeSlider.valueProperty().addListener(new ChangeListener<Number>() {

            @Override
            public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
                mediaPlayer.setVolume(volumeSlider.getValue() * 0.01);
                summaryBuilder.setVolume(volumeSlider.getValue() * 0.01);
                System.out.println(summaryBuilder.getVolume());
            }
            
        });
    }

    public void candyCaneCursor(ActionEvent event) throws IOException
    {
        summaryBuilder.setCursor("/src/candycane.gif");
        System.out.println(summaryBuilder.getCursor());
        sceneController.switchToSettings(event);
    }

    public void swordCursor(ActionEvent event) throws IOException
    {
        summaryBuilder.setCursor("/src/sword.png");
        System.out.println(summaryBuilder.getCursor());
        sceneController.switchToSettings(event);
        
    }

    public void returnScene(ActionEvent event) throws IOException
    {
        System.out.println("switched");
        sceneController.switchToScene1(event); // Called the prev method with the empty event
    }

    public String getCursor()
    {
        return summaryBuilder.getCursor();
    }

    public Double getVolume()
    {
        return summaryBuilder.getVolume();
    }

    
}
