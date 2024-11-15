package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import model.Personne;

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
	Button btnAjouter;
	
	@FXML
	private void initialize() {
	
	}
	
	@FXML
	protected void ajouterPrepose(ActionEvent event) {
		System.out.println("button ajouter pressed");
		Personne personne = new Personne(tbNom.getText(), tbPrenom.getText(), tbAdresse.getText(), tbTelephone.getText());
		System.out.println("display person");
		System.out.println(personne);
	}
}
