package controller;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Accordion;
import javafx.scene.control.Button;
import javafx.scene.control.TitledPane;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
import utils.GestionVue;

public class AccordionGestionController {
	private CatalogueController catalogue;
	private GestionVue gestionVue;

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
	
	
	public AccordionGestionController() {
	    this.catalogue = new CatalogueController();
	}

	
	@FXML
	private void initialize() {
		accGestion.expandedPaneProperty().addListener((obs, oldPane, newPane) -> {
			if (newPane == titAdherent) {
					//catalogue.loadCatalogueAD();
			}
		});
	}
	
	
}
