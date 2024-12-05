package controller;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.control.Accordion;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.TitledPane;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Region;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import model.Adherent;
import model.Registre;
import utils.GestionVue;

public class CatalogueController {
	private Registre registre;
	private GestionVue gestionVue;
	
	

	@FXML
	TableView<Adherent> tvAD;
	
	@FXML
	AnchorPane ancDoc;
	
	@FXML
	AnchorPane ancRecherche;

	@FXML
	TabPane paneElement;

	@FXML
	Tab tabTous;

	@FXML
	Tab tabLivre;

	@FXML
	Tab tabPeriodique;

	@FXML
	Tab TabPeriodique;

	@FXML
	Tab tabDVD;
	
	@FXML
	AnchorPane anchorPane;

	@FXML
	AnchorPane ancOption;

	@FXML
	StackPane sPaneView;

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
	
	public CatalogueController() {
		registre = Registre.getInstance();
	}

	// Radio Group Radio
	// TextField search action
	// Effacer btn action

	public void clearAncDoc() {
		if (ancDoc != null) {
			System.out.println("Before clearing: " + ancDoc.getChildren());
			ancDoc.getChildren().clear();
			ancDoc.layout();
			System.out.println("After clearing: " + ancDoc.getChildren());
		} else {
			System.out.println("ancDoc is null!");
		}
	}

	public void loadCatalogueDoc() {
		try {
			FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/CatalogueDoc.fxml"));
			Parent docContent = loader.load();
			ancDoc.getChildren().setAll(docContent);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void loadCatalogueAD() {
		try {
			FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/Adherent.fxml"));
			Parent docContent = loader.load();
			ancDoc.getChildren().setAll(docContent);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void loadAccGestion() {
		try {
			FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/AccordionGestion.fxml"));
			Parent docContent = loader.load();
			ancOption.getChildren().setAll(docContent);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void loadLogin() {
		try {
			FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/Consultation.fxml"));
			Parent docContent = loader.load();
			ancOption.getChildren().setAll(docContent);
		} catch (IOException e) {
			e.printStackTrace();
		}
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
	protected void supprimerSelectedAD(ActionEvent event) {
		registre.removeAD();
	}
	
	@FXML
	protected void modifierSelectedAD(ActionEvent event) {
		if (registre.getAD() != null) {
			gestionVue = GestionVue.getInstance();
			gestionVue.chargerDialogue("Modifier un adhérent", "/fxml/ModifierAdherent.fxml");
		}
		else {
			//do alert warning
		}
		
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
		System.out.println("Initialiser CatalogueController");
		accGestion.setExpandedPane(titCatalogue);
		registre.setTitledPane(titCatalogue);
		accGestion.expandedPaneProperty().addListener((obs, oldPane, newPane) -> {
			if (newPane == titCatalogue) {
				ancDoc.setVisible(true);
				ancDoc.setDisable(false);
				tvAD.setVisible(false);
				tvAD.setDisable(true);
			} else if (newPane == titAdherent) {
				ancDoc.setVisible(false);
				ancDoc.setDisable(true);
				tvAD.setVisible(true);
				tvAD.setDisable(false);
			} else if (newPane == titPret) {
				ancDoc.setVisible(true);
				ancDoc.setDisable(false);
				tvAD.setVisible(false);
				tvAD.setDisable(true);
			}
		});
	}
}
