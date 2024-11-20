package controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import model.Livre;
import model.Registre;
import utils.GestionIOLivre;

public class LivreController {
	ObservableList<Livre> lstLivre = FXCollections.observableArrayList();
	Registre registre;
	

	@FXML
	TableView<Livre> tvLivre;
	
	@FXML
	TableColumn<Livre, String> colNumLivre;
	
	@FXML
	TableColumn<Livre, String> colTitreLivre;
	
	@FXML
	TableColumn<Livre, String> colAuteurLivre;
	
	@FXML
	TableColumn<Livre, String> colDateLivre;
	
	@FXML
	TableColumn<Livre, String> colEtatLivre;
	
	@FXML
	TableColumn<Livre, Integer> colPretLivre;
	
	@FXML
	TableColumn<Livre, String> colEmprunteurLivre;
	
	public LivreController() {
		System.out.println("LivreController");
		registre = Registre.getInstance();
		lstLivre = GestionIOLivre.chargerFichier("Livres.txt");
		registre.setListeLivre(lstLivre); 
	}
	
	public void initialiserVueLivre() {
		System.out.println("initialiserVueLivre");
		
		colNumLivre.setCellValueFactory(col -> col.getValue().getNoDocumentProperty());
		colTitreLivre.setCellValueFactory(col -> col.getValue().getTitreProperty());
		colAuteurLivre.setCellValueFactory(col -> col.getValue().getAuteurProperty());
		colDateLivre.setCellValueFactory(col -> col.getValue().getDatePublicationProperty());
		colEtatLivre.setCellValueFactory(col -> col.getValue().getEtatProperty());
		colPretLivre.setCellValueFactory(col -> col.getValue().getPretProperty().asObject());
		//colEmprunteurLivre.setCellValueFactory(col -> col.getValue().getNoDocumentProperty());
	}
	
	//private void onSelSorcier() {
		
	//}
	
	@FXML 
	private void initialize() {
		initialiserVueLivre();
		tvLivre.setItems(lstLivre);
	}
	
	
	
}
