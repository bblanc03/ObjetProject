package controller;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import model.Livre;
import model.Registre;
import utils.GestionIOLivre;

public class LivreController {
    private Registre registre;

    @FXML
    private TableView<Livre> tvLivre;
    @FXML
    private TableColumn<Livre, String> colNumLivre;
    @FXML
    private TableColumn<Livre, String> colTitreLivre;
    @FXML
    private TableColumn<Livre, String> colAuteurLivre;
    @FXML
    private TableColumn<Livre, String> colDateLivre;
    @FXML
    private TableColumn<Livre, Boolean> colEtatLivre;
    @FXML
    private TableColumn<Livre, Integer> colPretLivre;

    @FXML
    private void initialize() throws ClassNotFoundException, IOException {
        initialiserVueLivre();
        GestionIOLivre.lireFichierLivre();
        tvLivre.setItems(registre.getListeLivre());
        tvLivre.getSelectionModel().selectedItemProperty().addListener((bs, anc, nou) -> {
			registre.setDocument(nou);
		});;	
    }
    
    
    public LivreController() {
        registre = Registre.getInstance();
    }

    private void initialiserVueLivre() {
        colNumLivre.setCellValueFactory(col -> col.getValue().getNoDocumentProperty());
        colTitreLivre.setCellValueFactory(col -> col.getValue().getTitreProperty());
        colAuteurLivre.setCellValueFactory(col -> col.getValue().getAuteurProperty());
        colDateLivre.setCellValueFactory(col -> col.getValue().getDatePublicationProperty());
        colEtatLivre.setCellValueFactory(col -> col.getValue().getEtatProperty());
       // colPretLivre.setCellValueFactory(col -> col.getValue().getPretProperty().asObject());
    }

    public Livre getSelectedLivre() {
        return tvLivre.getSelectionModel().getSelectedItem();
    }
    
    
}
