import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.ImageCursor;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;



public class Main extends Application {

    @Override
    public void start(Stage primaryStage) {
        try {
            Image cursor = new Image("/src/sword.png"); // loading custom cursor
            Parent root = FXMLLoader.load(getClass().getResource("/Scenes/Welcome.fxml"));
            
            // Load the CSS file
            Scene scene = new Scene(root);
            scene.getStylesheets().add(getClass().getResource("/styles.css").toExternalForm());

            primaryStage.setScene(scene);
            scene.setCursor(new ImageCursor(cursor));
            primaryStage.setResizable(false);
            primaryStage.show();
        } catch (Exception e) {
            e.printStackTrace();
    }
}

    public static void main(String[] args) {
        launch(args);
    }
}
