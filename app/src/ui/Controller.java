package ui;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.MenuItem;

public class Controller {
    private static Logger logger = LogManager.getLogger(Controller.class);

    @FXML
    private MenuItem exitButton;

    @FXML
    void exit(ActionEvent event) {
        logger.info("Closing GitScheduler..");

        System.exit(0);
    }

}

