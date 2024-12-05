package controller;


import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import model.Adherent;
import model.Registre;
import utils.GestionVue;

public class AjouterADController {
	GestionVue gestionVue;
	Registre registre;

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
	
	public AjouterADController() {
		registre = Registre.getInstance();
	}
	
	@FXML
	protected void ajouterAD(ActionEvent e) throws IOException {
		int i = registre.getListeAdherent().size() + 1;
		Adherent adherent = new Adherent("AD" + i, txtNom.getText(), txtPrenom.getText(), txtAdresse.getText(), txtTel.getText());
		registre.ajouterAD(adherent);
		btnAnnuler.getScene().getWindow().hide();
	}
	
	@FXML
	protected void fermerFenetre(ActionEvent e) throws IOException {
		btnAnnuler.getScene().getWindow().hide();
	}
	
	

}
