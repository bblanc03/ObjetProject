package controller;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Accordion;
import javafx.scene.control.Button;
import javafx.scene.control.TitledPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import model.Registre;
import utils.GestionVue;

public class AccordionGestionController {
	private GestionVue gestionVue;
	private Registre registre;

	@FXML
	VBox root;

	@FXML
	Accordion accGestion;

	@FXML
	TitledPane titCatalogue;

	@FXML
	Button btnAjouterDoc;

	@FXML
	Button btnSupprimer;

	@FXML
	TitledPane titAdherent;

	@FXML
	Button btnAjouterAD;

	@FXML
	Button btnModifierAD;

	@FXML
	Button btnSupprimerAD;

	@FXML
	Button btnPayerSolde;

	@FXML
	TitledPane titPret;

	@FXML
	Button btnInscrirePret;

	@FXML
	Button btnInscrireRetour;

	@FXML
	Button btnDeconnexion;

	@FXML
	Button btnSupprimerDoc;

	public AccordionGestionController() {
		registre = Registre.getInstance();
	}

	@FXML
	protected void ouvrirAjouterDoc(ActionEvent e) throws IOException {
		gestionVue = GestionVue.getInstance();
		gestionVue.chargerDialogue("Ajouter un Document", "/fxml/AjouterDocument.fxml");
	}

	@FXML
	protected void ouvrirAjouterAD(ActionEvent e) throws IOException {
		gestionVue = GestionVue.getInstance();
		gestionVue.chargerDialogue("Ajouter un adhérent", "/fxml/AjouterAdherent.fxml");
	}

	@FXML
	protected void ouvrirModifierAD(ActionEvent e) throws IOException {
		gestionVue = GestionVue.getInstance();
		gestionVue.chargerDialogue("Modifier un adhérent", "/fxml/ModifierAdherent.fxml");
	}

	@FXML
	protected void ouvrirPret(ActionEvent e) throws IOException {
		gestionVue = GestionVue.getInstance();
		gestionVue.chargerDialogue("Effectuer un prêt", "/fxml/Pret.fxml");
	}

	@FXML
	protected void supprimerSelectedDoc(ActionEvent event) {
		registre.removeDoc();
		System.out.println(registre.getListeDocument());
	}

	@FXML
	protected void deconnexion(ActionEvent event) throws IOException {
		gestionVue = GestionVue.getInstance();
		Stage stage = (Stage) btnDeconnexion.getScene().getWindow();
		stage.close();
		gestionVue.chargerVuePrincipale("Mediatheque", "/fxml/MainView.fxml");
	}

	@FXML
	private void initialize() {
		accGestion.setExpandedPane(titCatalogue);
		registre.setTitledPane(titCatalogue);
		accGestion.expandedPaneProperty().addListener((obs, oldPane, newPane) -> {
			registre.setTitledPane(newPane);
		});
	}

}
