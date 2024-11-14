package controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import model.Personne;

public class GestionPreposeController {

	@FXML
	TableView<Personne> vuePrepose;
	
	@FXML
	TableColumn<Personne, String> colNoEmploye;
	
	@FXML
	TableColumn<Personne, String> colNom;
	
	@FXML
	TableColumn<Personne, String> colPrenom;
	
	@FXML
	TableColumn<Personne, String> colAdresse;
	
	@FXML
	TableColumn<Personne, String> colTelephone;
	
	@FXML
	Button btnAjouter;
	
	@FXML
	Button btnSupprimmer;
	
	@FXML
	private void initialize() {
		
	}
	
	
}
