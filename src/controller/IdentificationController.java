package controller;

import java.io.IOException;

import application.Main;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.TitledPane;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.Alert.AlertType;
import javafx.stage.Stage;
import model.Prepose;
import utils.GestionVue;

public class IdentificationController {

	private Stage stage = Main.getStage();
	GestionVue gestionVue;

	@FXML
	TitledPane optionPane;

	@FXML
	TitledPane paneConnection;

	@FXML
	RadioButton radNomPrenom;

	@FXML
	RadioButton radTelephone;

	@FXML
	ToggleGroup Identification;

	@FXML
	TextField tbNom;

	@FXML
	TextField tbPrenom;

	@FXML
	TextField tbNoEmploye;

	@FXML
	TextField tbMotDePasse;

	@FXML
	Button btnDossier;

	@FXML
	Button btnCatalogue;

	@FXML
	Button btnConnection;

	@FXML
	private void initialize() {
	}

	@FXML
	protected void ouvrirAdmin(ActionEvent event) throws IOException {

		if (tbNoEmploye.getText().equals("Admin") && tbMotDePasse.getText().equals("234567")) {
			gestionVue = GestionVue.getInstance();
			gestionVue.chargerVuePrincipale("Médiatèque", "/fxml/Admin.fxml");
			// verificationPrepose();
		} else if (verificationPrepose(tbNoEmploye.getText(), tbMotDePasse.getText())) {
			gestionVue = GestionVue.getInstance();
			gestionVue.chargerVuePrincipale("Catalogue", "/fxml/catalogue.fxml");
		} else {
			Alert alert = new Alert(AlertType.NONE);
			alert.setAlertType(AlertType.ERROR);
			alert.setContentText("Votre numero ou mot de passe n'est pas valide");
			alert.show();
		}

	}

	@FXML
	protected void ouvrirCatalogue(ActionEvent event) throws IOException {

		gestionVue = GestionVue.getInstance();
		gestionVue.chargerVuePrincipale("Catalogue", "/fxml/catalogue.fxml");
	}

	@FXML
	protected void ouvrirCatalogueDoc(ActionEvent event) throws IOException {
		gestionVue = GestionVue.getInstance();
		gestionVue.chargerVuePrincipale("Catalogue", "/fxml/CatalogueDoc.fxml");
	}

	protected boolean verificationPrepose(String noEmp, String password) {
		ObservableList<Prepose> listPrepose = Prepose.getObservableListPrepose();
		for (Prepose prepose : listPrepose) {
			if (password.equals(prepose.getPassword()) && noEmp.equals(prepose.getNom())) {
				return true;
			}

		}
		return false;
	}
}
