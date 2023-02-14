package sample;


import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class MenuCoursController implements Initializable {

    @FXML
    private BorderPane mainMenuCoursBorderPane;

    @FXML
    private TextField txtfldCode;

    @FXML
    private TextField txtfldNomCours;

    @FXML
    private TextField txtfldCoefficient;

    @FXML
    private TextField txtfldNiveau;

    @FXML
    private TextField txtfldFiliere;

    @FXML
    private Button btnAjouterCours;

    @FXML
    private Button btnModifierCours;

    @FXML
    private Button btnReinitialiserCours;

    @FXML
    private Button btnSupprimerCours;

    @FXML
    private TableView<Cours> tableCours;

    @FXML
    private TableColumn<Cours, String> tbcode;

    @FXML
    private TableColumn<Cours, String> tbnomcours;

    @FXML
    private TableColumn<Cours, Integer> tbcoefficient;

    @FXML
    private TableColumn<Cours, String> tbniveau;

    @FXML
    private TableColumn<Cours, String> tbfiliere;

    @FXML
    private Button btnRetour;

    int index;

    ObservableList<Cours> coursListe = FXCollections.observableArrayList(
            new Cours("A0001", "Info", 2, "1A", "CP"),
            new Cours("A0002", "Maths", 2, "2A", "CI"),
            new Cours("A0003", "Anglais", 2, "1a", "GLA")

    );



    @FXML
    void handleAjouterCoursAction(ActionEvent event) {
        ajouterEtudiant();
    }

    @FXML
    void handleModifierCoursAction(ActionEvent event) {
        modifierCours();
    }

    @FXML
    void handleReinitialiserCoursAction(ActionEvent event) {
        reinitialiserCours();
    }

    @FXML
    void handleRetourAction(ActionEvent event) throws IOException{
        Main m = new  Main();
        m.changescene ("menuprincipal.fxml");
    }

    @FXML
    void handleSupprimerCoursAction(ActionEvent event) {
        supprimerCours();
    }

    public void ajouterEtudiant(){
        tableCours.getItems().add(getData());
    }

    public void modifierCours(){
        coursListe.set(index,getData());
    }

    public void supprimerCours(){
        tableCours.getSelectionModel().getSelectedIndex();
        coursListe.remove(index);
    }

    public void reinitialiserCours(){
        tableCours.getSelectionModel().getSelectedIndex();

        txtfldCode.setText("");
        txtfldNomCours.setText("");
        txtfldCoefficient.setText("");
        txtfldNiveau.setText("");
        txtfldFiliere.setText("");
    }



    @FXML
    void getSelected(MouseEvent event) {
        index = tableCours.getSelectionModel().getSelectedIndex();

        if(index <= -1){
            return;
        }

        txtfldCode.setText(tbcode.getCellData(index));
        txtfldNomCours.setText(tbnomcours.getCellData(index));
        txtfldCoefficient.setText(tbcoefficient.getCellData(index).toString());
        txtfldNiveau.setText(tbniveau.getCellData(index));
        txtfldFiliere.setText(tbfiliere.getCellData(index));
    }

    public Cours getData(){
        String codeCours = txtfldCode.getText();
        String nomCours = txtfldNomCours.getText();
        Integer coeffCours = Integer.parseInt(txtfldCoefficient.getText());
        String niveau = txtfldNiveau.getText();
        String filiere = txtfldFiliere.getText();

        return new Cours(codeCours, nomCours, coeffCours, niveau, filiere);
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        tbcode.setCellValueFactory(new PropertyValueFactory<Cours, String>("codeCours"));
        tbnomcours.setCellValueFactory(new PropertyValueFactory<Cours, String>("nomCours"));
        tbcoefficient.setCellValueFactory(new PropertyValueFactory<Cours, Integer>("coeffCours"));
        tbniveau.setCellValueFactory(new PropertyValueFactory<Cours, String>("niveau"));
        tbfiliere.setCellValueFactory(new PropertyValueFactory<Cours, String>("filiere"));

        tableCours.setItems(coursListe);
    }
}
