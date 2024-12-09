package controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

import application.Main;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.stage.Stage;
import model.Personne;
import model.Prepose;
import utils.Constantes;
import utils.GestionIOPrepose;
import utils.GestionVue;

public class GestionPreposeController {
	GestionVue gestionVue;

	@FXML
	TableView<Prepose> vuePrepose;

	@FXML
	TableColumn<Prepose, String> colNoEmploye;

	@FXML
	TableColumn<Prepose, String> colNom;

	@FXML
	TableColumn<Prepose, String> colPrenom;

	@FXML
	TableColumn<Prepose, String> colAdresse;

	@FXML
	TableColumn<Prepose, String> colTelephone;

	@FXML
	Button btnAjouter;

	@FXML
	Button btnSupprimmer;

	@FXML
	Button btnDeconnection;

	@FXML
	private void initialize() throws IOException, ClassNotFoundException {
		FileInputStream file2 = null;
		ObjectInputStream in = null;
		String fichier = "Personne.txt";
		File written = new File(Constantes.REPERTOIRE_DATA + "/" + fichier);

		/*
		 * if (written.length() > 0) { GestionIOPrepose.lireFichierPrepose();
		 * GestionIOPrepose.setStateOuvert(true); }
		 */

		vuePrepose.setItems(Prepose.getObservableListPrepose());

		colNoEmploye.setCellValueFactory(cell -> cell.getValue().getNomProperty());
		colNom.setCellValueFactory(cell -> cell.getValue().getNomProperty());
		colPrenom.setCellValueFactory(cell -> cell.getValue().getPrenomProperty());
		colAdresse.setCellValueFactory(cell -> cell.getValue().getAdresseProperty());
		colTelephone.setCellValueFactory(cell -> cell.getValue().getTelephoneProperty());
	}

	@FXML
	private void ajouterPrepose() throws IOException {
		gestionVue = GestionVue.getInstance();
		Stage stage = new Stage();
		gestionVue.initialiseStage(stage);
		gestionVue.chargerVuePrincipale("hi", "/fxml/AjouterPrepose.fxml");
	}

	@FXML
	private void supprimerPrpose() throws IOException {
		Prepose employe = vuePrepose.getSelectionModel().getSelectedItem();
		Prepose.removePrepose(employe);
	}

	@FXML
	private void deconcection() throws IOException {
		GestionVue gestionVue = GestionVue.getInstance();
		Stage stage = (Stage) btnDeconnection.getScene().getWindow();
		stage.close();
		gestionVue.chargerVuePrincipale("Médiatèque", "/fxml/MainView.fxml");
	}

}
