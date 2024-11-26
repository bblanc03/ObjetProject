package controller;

import java.io.IOException;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import model.DVD;
import model.Livre;
import model.Periodique;
import model.Registre;
import utils.GestionVue;

public class AjouterDocumentController {
	String types[] =
        { "Livre", "Périodique", "DVD" };
	GestionVue gestionVue;
	Registre registre;
	
	ObservableList<Livre> lstLivre = FXCollections.observableArrayList();
	
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
	
	public AjouterDocumentController() {
		registre = Registre.getInstance();
	}
	
	@FXML
	protected void fermerFenetre(ActionEvent e) throws IOException {
//		gestionVue = GestionVue.getInstance();
//		gestionVue.fermerVue("AjouterDoc");
//		System.out.println("lala");
		btnAnnuler.getScene().getWindow().hide();
	}
	
	@FXML
	protected void ajouterDoc(ActionEvent e) throws IOException {
		if (cboxType.getValue() == "Livre") {
			Livre livre = new Livre(null, txtTitre.getText(), txtDate.getText(), txtAuteur.getText());
			registre.ajouterLivre(livre);
		}
		else if (cboxType.getValue() == "Périodique") {
			System.out.println("Periodique");
			Periodique per = new Periodique(null, txtTitre.getText(), txtDate.getText(), 0, 0);
			registre.ajouterPeriodique(per);
		}
		else if (cboxType.getValue() == "DVD") {
			DVD dvd = new DVD(null, txtTitre.getText(), txtDate.getText(), 0, txtAuteur.getText());
			registre.ajouterDVD(dvd);
		}
	}
	
	@FXML
	private void initialize() {
		cboxType.getItems().setAll("Livre", "Périodique", "DVD");
		cboxType.getSelectionModel().selectFirst();
		
	}

}
