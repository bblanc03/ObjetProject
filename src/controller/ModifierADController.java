package controller;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import model.Registre;

public class ModifierADController {
	Registre registre;
	
	@FXML
	AnchorPane ancModifier;
	
	@FXML
	Label lblAdresse;
	
	@FXML
	Label lblTel;
	
	@FXML
	TextField txtAdresse;
	
	@FXML
	TextField txtTel;

	@FXML
	Button btnConfirmer;
	
	@FXML
	Button btnAnnuler;
	
	public ModifierADController() {
		registre = Registre.getInstance();
	}
	
	@FXML
	protected void modifierAD(ActionEvent e) throws IOException {
		registre.modifierAdherent(txtAdresse.getText(), txtTel.getText());
		btnAnnuler.getScene().getWindow().hide();
	}
	
	@FXML
	protected void fermerFenetre(ActionEvent e) throws IOException {
		btnAnnuler.getScene().getWindow().hide();
	}
}
