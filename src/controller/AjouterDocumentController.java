package controller;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import utils.GestionVue;

public class AjouterDocumentController {
//	String types[] =
//        { "Livre", "Périodique", "DVD" };
	GestionVue gestionVue;
	
	@FXML
	AnchorPane root;
	
	@FXML
	Label lblType;
	
	@FXML
	Label lblTitre;
	
	@FXML
	Label lblAuteur;
	
	@FXML
	Label lblDate;
	
	@FXML
	Label lblMot;
	
	@FXML 
	TextField txtTitre;
	
	@FXML
	TextField txtAuteur;
	
	@FXML
	TextField txtDate;
	
	@FXML
	TextField txtMot;
	
	@FXML
	ComboBox<String> cboxType;
	
	@FXML
	Button btnConfirmer;
	
	@FXML
	Button btnAnnuler;
	
	@FXML
	protected void fermerFenetre(ActionEvent e) throws IOException {
//		gestionVue = GestionVue.getInstance();
//		gestionVue.fermerVue("AjouterDoc");
//		System.out.println("lala");
		btnAnnuler.getScene().getWindow().hide();
	}
}
