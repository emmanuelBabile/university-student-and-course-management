package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

import java.io.IOException;

public class MenuPrincipalController {

    @FXML
    private Button btnNoteCours;

    @FXML
    private Button btnListeEtudiant;

    @FXML
    private Button btnListeCours;

    @FXML
    private Button btnDeconnexionEtRetour;

    @FXML
    void handleDeconnexionEtRetourAction(ActionEvent event) throws IOException {
        Main m = new  Main();
        m.changescene ("accueil.fxml");
    }

    @FXML
    void handleListeCoursAction(ActionEvent event) throws IOException{
        Main m = new  Main();
        m.changescene ("menucours.fxml");
    }

    @FXML
    void handleListeEtudiantAction(ActionEvent event) throws IOException {
        Main m = new  Main();
        m.changescene ("menuetudiant.fxml");
    }

}
