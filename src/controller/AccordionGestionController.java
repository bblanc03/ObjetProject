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
import model.Document;
import model.Livre;
import model.Registre;
import utils.GestionVue;

public class AccordionGestionController {
	private GestionVue gestionVue;
	private Registre registre;
	private LivreController livreController;
	private Document doc;
	
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

	public void setLivreController(LivreController livreController) {
		this.livreController = livreController;
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
	}

	@FXML
	private void initialize() {
		accGestion.expandedPaneProperty().addListener((obs, oldPane, newPane) -> {
			if (newPane == titAdherent) {
				// catalogue.loadCatalogueAD();
			}
		});
	}
	
//	public void setDoc(Document doc) {
//		this.doc = doc;
//		//System.out.println(this.doc);
//	}
//	
//	public Document getDoc() {
//		return doc;
//	}
	
	public void supprimer(Document doc) {
		
	}

}
