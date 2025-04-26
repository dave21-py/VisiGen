package app;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class MainWindow{

    @FXML
    private Button generateButton;
    
    @FXML
    private TextField promptField;

    @FXML
    private ImageView imageView;

    @FXML
    private void initialize(){
        generateButton.setOnAction(e -> generateImage());

    }

    @FXML
    private void generateImage() {
    String prompt = promptField.getText();
    Image generatedImage = HuggingFace.generateImageFromPrompt(prompt);

    if (generatedImage != null) {
        imageView.setImage(generatedImage);
    } else {
        System.out.println("Failed to generate image.");
    }
}

}
