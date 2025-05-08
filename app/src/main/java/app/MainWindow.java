package app;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class MainWindow {

    
    @FXML
    private Button sendButton; // "↑" button

    @FXML
    private TextField promptField;

    @FXML
    private ImageView imageView;

    @FXML
    private Label placeholderText;

    @FXML
    private void initialize() {
        
        if (sendButton != null) {
            sendButton.setOnAction(e -> generateImage()); 
        } else {
            System.err.println("Invalid");
        }

        
        if (promptField != null) {
            promptField.setOnAction(e -> generateImage());
        } else {
            System.err.println("No image found");
        }
    }

    @FXML
    private void generateImage() {
        if (promptField == null || imageView == null) {
            System.err.println("Cannot generate.");
            return;
        }

        String prompt = promptField.getText();
        if (prompt == null || prompt.trim().isEmpty()) {
            System.out.println("Prompt is empty. Please enter a description.");
            return;
        }

        System.out.println("Generating image for prompt: " + prompt);

        try {
            Image generatedImage = HuggingFace.generateImageFromPrompt(prompt); 

            if (generatedImage != null) {
                imageView.setImage(generatedImage);
                placeholderText.setVisible(false);
            } else {
                System.out.println("Failed to generate image. HuggingFace.generateImageFromPrompt returned null.");
            }
        } catch (Exception ex) {
            System.err.println("Error during image generation: " + ex.getMessage());
            ex.printStackTrace();
        }
    }
}