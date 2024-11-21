package controller;

import java.io.IOException;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import model.Personne;
import utils.GestionIOPersonne;

public class AjouterPreposeCOntroller {
	
	@FXML
	TextField tbNom;

	@FXML
	TextField tbPrenom;

	@FXML
	TextField tbAdresse;

	@FXML
	TextField tbTelephone;
	
	@FXML
	TextField tbMotDePasse;

	@FXML
	Button btnAjouter;
	
	@FXML 
	Button btnQuitter;

	@FXML
	private void initialize() {

	}

	@FXML
	protected void ajouterPrepose(ActionEvent event) throws IOException, ClassNotFoundException {
		Alert alert = new Alert(AlertType.NONE);

		if (tbNom.getText().equals("")) {
			alert.setAlertType(AlertType.ERROR);
			alert.setContentText("Vous n'avez pas tapé votre nom");
			alert.show();
		} else if (tbPrenom.getText().equals("")) {
			alert.setAlertType(AlertType.ERROR);
			alert.setContentText("Vous n'avez pas tapé votre prénom");
			alert.show();
		} else if (tbAdresse.getText().equals("")) {
			alert.setAlertType(AlertType.ERROR);
			alert.setContentText("Vous n'avez pas tapé votre adresse");
			alert.show();
		} else if (tbTelephone.getText().equals("")) {
			alert.setAlertType(AlertType.ERROR);
			alert.setContentText("Vous n'avez pas tapé votre téléphone");
			alert.show();
		} else if (tbMotDePasse.getText().equals("")) {
			alert.setAlertType(AlertType.ERROR);
			alert.setContentText("Vous n'avez pas tapé votre mot de passe");
			alert.show();
		} else {
			System.out.println("button ajouter pressed");
			Personne personne = new Personne(tbNom.getText(), tbPrenom.getText(), tbAdresse.getText(),
					tbTelephone.getText());
			// Personne.ajouterPersonne();
			Personne.setPersonne(personne);
			GestionIOPersonne.ecrireFichierPersonne(personne);
			System.out.println(Personne.getObservableList());
		}
		
	}
	
	@FXML
	protected void ajouterQuitter() {
		System.out.println("closing");
		Stage stage = (Stage) btnQuitter.getScene().getWindow();
		stage.close();
	}

}
