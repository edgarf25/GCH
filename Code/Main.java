import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.ImageCursor;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.stage.Stage;

import Scenes.Settings;

public class Main extends Application {

    private Media media;
    private MediaPlayer mediaPlayer;
    private Double volumeLevel; // Declare volumeLevel as an instance variable

    @Override
    public void start(Stage primaryStage) {
        try {
            Settings settings = new Settings();
            String cursorPath = settings.getCursor();
            volumeLevel = settings.getVolume();
            Image cursor = new Image(cursorPath); // loading custom cursor
            Parent root = FXMLLoader.load(getClass().getResource("/Scenes/Welcome.fxml"));
            Scene scene = new Scene(root);
            primaryStage.setScene(scene);
            scene.setCursor(new ImageCursor(cursor));
            primaryStage.setResizable(false);
            primaryStage.show();

            // Play background music
            playBackgroundMusic();

            // Handle application close event to stop the music
            //primaryStage.setOnCloseRequest(event -> stopBackgroundMusic());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void playBackgroundMusic() {
        String musicFilePath = "/src/song.mp3";
        media = new Media(getClass().getResource(musicFilePath).toExternalForm());
        //Media media = new Media(Paths.get(musicFilePath).toUri().toString());
        mediaPlayer = new MediaPlayer(media);
        mediaPlayer.setVolume(volumeLevel);
        mediaPlayer.setCycleCount(MediaPlayer.INDEFINITE); // Loop the music indefinitely
        mediaPlayer.play();
    }

    private void stopBackgroundMusic() {
        if (mediaPlayer != null) {
            mediaPlayer.stop();
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}
