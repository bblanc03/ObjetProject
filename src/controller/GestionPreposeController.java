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
import utils.Constantes;
import utils.GestionIOPersonne;
import utils.GestionVue;

public class GestionPreposeController {
	GestionVue gestionVue;

	@FXML
	TableView<Personne> vuePrepose;

	@FXML
	TableColumn<Personne, String> colNoEmploye;

	@FXML
	TableColumn<Personne, String> colNom;

	@FXML
	TableColumn<Personne, String> colPrenom;

	@FXML
	TableColumn<Personne, String> colAdresse;

	@FXML
	TableColumn<Personne, String> colTelephone;

	@FXML
	Button btnAjouter;

	@FXML
	Button btnSupprimmer;

	@FXML
	private void initialize() throws IOException, ClassNotFoundException {
		FileInputStream file2 = null;
		ObjectInputStream in = null;
		String fichier = "Personne.txt";
		File written = new File(Constantes.REPERTOIRE_DATA + "/" + fichier);
		System.out.println("reading");

		 if (written.length() > 0) {
			 GestionIOPersonne.lireFichierPersonne();
		 } 
		
		

		vuePrepose.setItems(Personne.getObservableList());

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
	private void supprimerPrpose() {
		System.out.println("deleting");
		Personne employe = vuePrepose.getSelectionModel().getSelectedItem();
		Personne.removePersonne(employe);
	}

}
