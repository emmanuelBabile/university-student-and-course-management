package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import javafx.event.ActionEvent;
import javafx.scene.layout.BorderPane;

import java.io.IOException;

public class LoginController {

    /*@FXML
    private BorderPane loginBorderPane;*/

    @FXML
    private TextField txtfldNomdutilisateur;

    @FXML
    private PasswordField txtfldMotdepasse;

    @FXML
    private Label lblMessagevalidation;

    @FXML
    private Button btnSeconnecter;

    @FXML
    private Button btnRetourAccueil;

    @FXML
    void handleRetourAccueilAction(ActionEvent event) throws IOException {
        Main m = new  Main();
        m.changescene ("accueil.fxml");
    }

    @FXML
    void handleSeconnecterAction(ActionEvent event) throws IOException {
        checkLogIn();
    }

    private void checkLogIn() throws IOException {
        Main m = new Main();
        if (txtfldNomdutilisateur.getText().toString().equals("poojava") && txtfldMotdepasse.getText().toString().equals("1234")) {
            m.changescene("menuprincipal.fxml");
        }

        else if (txtfldNomdutilisateur.getText().isEmpty() && txtfldMotdepasse.getText().isEmpty()) {
            lblMessagevalidation.setText("Les champs sont vides. Entrer vos coordonnées");
        }

        else {
            lblMessagevalidation.setText("Nom d'utilisateur ou mot de passe incorrect");
        }
    }
}




