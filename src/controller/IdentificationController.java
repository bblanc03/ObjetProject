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

public class IdentificationController {
	
	private Stage stage = Main.getStage();

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
	private void initialize() {
	}

	@FXML
	protected void ouvrirCatalogue(ActionEvent event) throws IOException {
		System.out.println("button Catalogue pressed");

		FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/MainView.fxml"));

		Parent root = loader.load();
		Scene scene = new Scene(root);
		stage.setScene(scene);
		stage.setTitle("Médiatèque");
		System.out.println("page loaded");
		stage.show();
	}

	@FXML
	protected void ouvrirDossier(ActionEvent event) {
	}
}
