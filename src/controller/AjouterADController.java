package controller;


import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import utils.GestionVue;

public class AjouterADController {
	GestionVue gestionVue;

	@FXML
	AnchorPane ancAjouterAD;
	
	@FXML
	Label lblNom;
	
	@FXML
	Label lblPrenom;
	
	@FXML
	Label lblAdresse;
	
	@FXML
	Label lblTel;
	
	@FXML
	TextField txtAdresse;
	
	@FXML
	TextField txtTel;
	
	@FXML
	TextField txtPrenom;
	
	@FXML
	TextField txtNom;
	
	@FXML
	Button btnConfirmer;
	
	@FXML
	Button btnAnnuler;
	
	@FXML
	protected void fermerFenetre(ActionEvent e) throws IOException {
		btnAnnuler.getScene().getWindow().hide();
	}
	
	

}
