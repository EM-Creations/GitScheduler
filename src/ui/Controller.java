package ui;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.MenuItem;

public class Controller {

    @FXML
    private MenuItem exitButton;

    @FXML
    void exit(ActionEvent event) {
        System.exit(0);
    }

}

