package ui;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        String homeSceneResource = "home.fxml";
        String title = "GitScheduler";
        int sceneHeight = 500, sceneWidth = 500;

        Parent root = FXMLLoader.load(getClass().getResource(homeSceneResource));
        primaryStage.setTitle(title);
        primaryStage.setScene(new Scene(root, sceneWidth, sceneHeight));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}