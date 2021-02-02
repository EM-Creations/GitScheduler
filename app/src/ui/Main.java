package ui;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
    private static Logger logger = LogManager.getLogger(Main.class);

    @Override
    public void start(Stage primaryStage) throws Exception {
        logger.info("Starting GitScheduler..");

        String homeSceneResource = "home.fxml";
        String title = "GitScheduler";
        int sceneHeight = 500, sceneWidth = 500;

        Parent root = FXMLLoader.load(getClass().getResource(homeSceneResource));
        primaryStage.setTitle(title);

        Scene scene = new Scene(root, sceneWidth, sceneHeight);
        primaryStage.setScene(scene);

        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
