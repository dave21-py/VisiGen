package app;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

import javafx.scene.image.Image;



public class HuggingFace{
    private static final String API_URL="https://api-inference.huggingface.co/models/stabilityai/stable-diffusion-xl-base-1.0";

    private static String API_KEY;

    static {
        try {
            Scanner scanner = new Scanner(new File("api-key.txt"));
            API_KEY = scanner.nextLine().trim();
            scanner.close();
        } catch (FileNotFoundException e) {
            System.err.println("apikey.txt not found!");
            API_KEY = "";
        }
    }

    public static Image generateImageFromPrompt(String prompt){
        try {
            URL url = new URL(API_URL);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("POST");
            connection.setRequestProperty("Authorization", "Bearer " + API_KEY);
            connection.setRequestProperty("Content-Type", "application/json");
            connection.setDoOutput(true);

            String requestBody = "{\"inputs\":\"" + prompt + "\"}"; //Json format

            try (OutputStream outputStream = connection.getOutputStream()) {
                outputStream.write(requestBody.getBytes());
            }

            InputStream inputStream = connection.getInputStream();
            return new Image(inputStream);

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}