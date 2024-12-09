package controller;

import java.util.ArrayList;
import java.util.List;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.AnchorPane;
import model.Document;
import model.Registre;

//Do this later Not working properly

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
		registre.setListeDocument(FXCollections.observableArrayList(listeDocOriginale));
		txtRech.clear();
	}

	private void executerRecherche(String texte) {
		ObservableList<Document> listeDocumentFiltree = FXCollections.observableArrayList();

		for (Document document : listeDocOriginale) {
			if (document.getAuteur().toLowerCase().contains(texte.toLowerCase())) {
				listeDocumentFiltree.add(document);
			}
		}
		registre.setListeDocument(listeDocumentFiltree);
	}

	public RechercheController() {
		registre = Registre.getInstance();
		listeDocOriginale = new ArrayList<>(registre.getListeDocument());
	}

	@FXML
	private void initialize() {
		txtRech.textProperty().addListener((obs, anc, text) -> {
			executerRecherche(text);
		});

	}
}
