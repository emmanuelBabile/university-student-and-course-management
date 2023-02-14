package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class MenuEtudiantController implements Initializable {

    @FXML
    private BorderPane mainMenuEtudiantBorderPane;

    @FXML
    private TextField txtfldCNE;

    @FXML
    private TextField txtfldNom;

    @FXML
    private TextField txtfldPrenom;

    @FXML
    private TextField txtfldDate;

    @FXML
    private TextField txtfldLieu;

    @FXML
    private TextField txtfldSexe;

    @FXML
    private Button btnAjouterEtudiant;

    @FXML
    private Button btnModifierEtudiant;

    @FXML
    private Button btnReinitialiserEtudiant;

    @FXML
    private Button btnSupprimerEtudiant;

    @FXML
    private TableView<Etudiant> tableEtudiant;

    @FXML
    private TableColumn<Etudiant, String> tbcne;

    @FXML
    private TableColumn<Etudiant, String> tbnom;

    @FXML
    private TableColumn<Etudiant, String> tbprenom;

    @FXML
    private TableColumn<Etudiant, String> tbdate;

    @FXML
    private TableColumn<Etudiant, String> tblieu;

    @FXML
    private TableColumn<Etudiant, String> tbsexe;

    @FXML
    private Button btnRetour;

    @FXML
    private Button btnCoursNote;

    ObservableList<Etudiant> etudiantListe = FXCollections.observableArrayList(
            new Etudiant("C001","Leclerc", "Albert", "07-04-1999", "Marseille", "M"),
            new Etudiant("C002","Smith", "Lana", "21-09-2002", "New York", "F"),
            new Etudiant("C003","Keïta", "Moussa", "03-01-2001", "Bamako", "M")
    );

    @FXML
    void handleAjouterEtudiantAction(ActionEvent event) {
        ajouterEtudiant();
    }

    @FXML
    void handleModifierEtudiantAction(ActionEvent event) {
        modifierEtudiant();
    }

    @FXML
    void handleReinitialiserEtudiantAction(ActionEvent event) {
        reinitialiserEtudiant();
    }

    @FXML
    void handleSupprimerEtudiantAction(ActionEvent event) {
        supprimerEtudiant();
    }

    @FXML
    void handleRetourAction(ActionEvent event) throws IOException {
        Main m = new  Main();
        m.changescene ("menuprincipal.fxml");
    }

    int index;

    public void ajouterEtudiant(){
        tableEtudiant.getItems().add(getData());
    }

    public void modifierEtudiant(){
        etudiantListe.set(index,getData());
    }

    public void supprimerEtudiant(){
        tableEtudiant.getSelectionModel().getSelectedIndex();
        etudiantListe.remove(index);
    }

    public void reinitialiserEtudiant(){
        tableEtudiant.getSelectionModel().getSelectedIndex();

        txtfldCNE.setText("");
        txtfldNom.setText("");
        txtfldPrenom.setText("");
        txtfldDate.setText("");
        txtfldLieu.setText("");
        txtfldSexe.setText("");
    }

    public Etudiant getData(){
        String cne = txtfldCNE.getText();
        String nom = txtfldNom.getText();
        String prenom = txtfldPrenom.getText();
        String dateDeNaissance = txtfldDate.getText();
        String lieuDeNaissance = txtfldLieu.getText();
        String sexe = txtfldSexe.getText();
        return new Etudiant(cne, nom, prenom, dateDeNaissance, lieuDeNaissance, sexe);
    }



    @FXML
    void getSelected(MouseEvent event) {
        index = tableEtudiant.getSelectionModel().getSelectedIndex();

        if(index <= -1){
            return;
        }

        txtfldCNE.setText(tbcne.getCellData(index));
        txtfldNom.setText(tbnom.getCellData(index));
        txtfldPrenom.setText(tbprenom.getCellData(index));
        txtfldDate.setText(tbdate.getCellData(index));
        txtfldLieu.setText(tblieu.getCellData(index));
        txtfldSexe.setText(tbsexe.getCellData(index));
    }


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        tbcne.setCellValueFactory(new PropertyValueFactory<Etudiant, String>("cne"));
        tbnom.setCellValueFactory(new PropertyValueFactory<Etudiant, String>("nom"));
        tbprenom.setCellValueFactory(new PropertyValueFactory<Etudiant, String>("prenom"));
        tbdate.setCellValueFactory(new PropertyValueFactory<Etudiant, String>("dateDeNaissance"));
        tblieu.setCellValueFactory(new PropertyValueFactory<Etudiant, String>("lieuDeNaissance"));
        tbsexe.setCellValueFactory(new PropertyValueFactory<Etudiant, String>("sexe"));

        tableEtudiant.setItems(etudiantListe);
    }

}
