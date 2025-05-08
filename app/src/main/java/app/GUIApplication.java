package app;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class GUIApplication extends Application{

    @Override
    public void start(Stage primaryStage) throws Exception {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/MainWindow.fxml"));
        Parent root = loader.load();

        MainWindow controller = loader.getController();
        // controller.setPrimaryStage(primaryStage);

        var scene = new Scene(root, 1200, 800);

        primaryStage.setScene(scene);
        primaryStage.setTitle("Hugging Face Image Generator"); // Title of main window
        primaryStage.show();
    }
    public static void main(String[] args){
        launch(args);
    }
}