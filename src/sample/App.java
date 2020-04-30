package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;

public class App extends Application {
    private static Scene scene;
    @Override
    public void start(Stage stage) throws IOException{
       // Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
       // scene = new Scene (FXMLLoader.load(getClass().getResource("sample.fxml")));
        scene = new Scene(loadFXML("sample.fxml"));
        stage.setTitle("Chat");
        stage.setScene(scene);
        stage.show();
    }
    private static Parent loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource(fxml));
        return fxmlLoader.load();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
