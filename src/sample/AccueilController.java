package sample;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;

import java.io.IOException;

public class AccueilController {

    /*@FXML
    private BorderPane mainAccueilBorderPane;*/

    @FXML
    private Button btnEntrer;

    @FXML
    private Button btnEtudiant;

    @FXML
    private Button btnFermer;

    @FXML
    void handleEntrerAction(ActionEvent event) throws IOException {
        Main m = new  Main();
        m.changescene ("login.fxml");
    }

    @FXML
    void handleFermerAction(ActionEvent event) {
        System.out.println("Fin du programme");
        Platform.exit();
        System.exit(0);
    }

}




