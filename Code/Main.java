import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.util.Random;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) {
        // Create a label to display the random number
        Label randomNumberLabel = new Label("Edgar Productions Presets");

        // Create a button
        Button generateButton = new Button("Generate Random Number");

        // Add an event handler to the button to generate and display a random number
        generateButton.setOnAction(event -> {
            int randomNumber = generateRandomNumber();
            randomNumberLabel.setText("Random Number: " + randomNumber);
        });

        // Create a VBox to hold the button and label, and center them
        VBox root = new VBox(10);
        root.getChildren().addAll(randomNumberLabel, generateButton);
        root.setAlignment(Pos.CENTER); // Center align the content vertically and horizontally
        root.setPrefSize(300, 200);

        // Create the scene and set it on the stage
        Scene scene = new Scene(root);

        // Set the title of the window
        primaryStage.setTitle("Random Number Generator");

        // Set the scene on the stage and show the window
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    // Method to generate a random number between 1 and 100
    private int generateRandomNumber() {
        Random random = new Random();
        return random.nextInt(100) + 1;
    }

    public static void main(String[] args) {
        launch(args);
    }
}
