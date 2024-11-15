package controller;

import java.io.IOException;

import application.Main;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.stage.Stage;
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
		vuePrepose.setItems(Personne.getObservableList());
		
		colNoEmploye.setCellValueFactory(cell -> cell.getValue().getNomProperty());
		colNom.setCellValueFactory(cell -> cell.getValue().getNomProperty());
		colPrenom.setCellValueFactory(cell -> cell.getValue().getPrenomProperty());
		colAdresse.setCellValueFactory(cell -> cell.getValue().getAdresseProperty());
		colTelephone.setCellValueFactory(cell -> cell.getValue().getTelephoneProperty());
	}
	
	@FXML
	private void ajouterPrepose() throws IOException {
		System.out.println("btn ajouter prepose");
		
		FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/AjouterPrepose.fxml"));

		Parent root = loader.load();
		Scene scene = new Scene(root);
		Stage stage = new Stage();
		stage.setScene(scene);
		stage.setTitle("Médiatèque");
		stage.show();
	}
	
	
}
