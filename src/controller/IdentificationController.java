package controller;

import java.io.IOException;

import application.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.TitledPane;
import javafx.stage.Stage;
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
	TextField tbNom;

	@FXML
	TextField tbPrenom;

	@FXML
	Button btnDossier;

	@FXML
	Button btnCatalogue;
	
	@FXML
	Button btnConnection;

	@FXML
	private void initialize() {
	}


//	@FXML
//	protected void ouvrirCatalogue(ActionEvent event) {
//		System.out.println("button Catalogue pressed");
//
//		
//	}


	@FXML
	protected void ouvrirDossier(ActionEvent event) {
		System.out.println("button Dossier pressed");
	}
	
	@FXML
	protected void ouvrirAdmin(ActionEvent event) throws IOException {
		
		
		
		gestionVue = GestionVue.getInstance();
		System.out.println("btn ajouter prepose");
		//Stage stage = new Stage();
		//gestionVue.initialiseStage(stage);
		//FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/AjouterPrepose.fxml"));
		gestionVue.chargerVuePrincipale("hi", "/fxml/Admin.fxml");
		
		//FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/Admin.fxml"));

		/*
		 * Parent root = loader.load(); Scene scene = new Scene(root);
		 * stage.setScene(scene); stage.setTitle("Médiatèque");
		 * System.out.println("page loaded"); stage.show();
		 */
	}
	
	@FXML
	protected void ouvrirCatalogue(ActionEvent event) throws IOException {
		
		gestionVue = GestionVue.getInstance();
		System.out.println("btn ajouter prepose");
		//Stage stage = new Stage();
		//gestionVue.initialiseStage(stage);
		//FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/AjouterPrepose.fxml"));
		gestionVue.chargerVuePrincipale("hi", "/fxml/catalogue.fxml");
		
		/*
		 * FXMLLoader loader = new
		 * FXMLLoader(getClass().getResource("/fxml/catalogue.fxml"));
		 * 
		 * Parent root = loader.load(); Scene scene = new Scene(root);
		 * stage.setScene(scene); stage.centerOnScreen(); stage.setTitle("Médiatèque");
		 * System.out.println("page loaded"); stage.show();
		 */
	}
}
