package controller;

import java.util.ArrayList;
import java.util.List;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.AnchorPane;
import model.Document;
import model.Registre;

public class RechercheController {
	Registre registre;
	List<Document> listeDocOriginale;
	
	@FXML
	AnchorPane root;

	@FXML
	Label lblRech;
	
	@FXML
	RadioButton radAuteur;
	
	@FXML
	RadioButton radMot;
	
	@FXML
	Button btnEffacer;
	
	@FXML
	TextField txtRech;
	
	@FXML
	ToggleGroup filtre;
	
	@FXML
	private void effacer() {
		
	}
	
	public RechercheController() {
		registre = Registre.getInstance();
		listeDocOriginale = new ArrayList<>(registre.getListeDocument());
		System.out.println("Liste originale: " + listeDocOriginale);
	}
	
	@FXML
	private void initialize() {
		System.out.println("RechercheController initialize");
		
		txtRech.textProperty().addListener((obs, anc, text) -> {
			System.out.println(text);
		});
	}
}
