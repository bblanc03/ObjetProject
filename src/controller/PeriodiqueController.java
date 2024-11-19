package controller;

import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import model.Livre;
import model.Periodique;

public class PeriodiqueController {

	@FXML
	TableView<Periodique> tvPer;
	
	@FXML
	TableColumn<Periodique, String> colNumPer;
	
	@FXML
	TableColumn<Periodique, String> colTitrePer;
	
	@FXML
	TableColumn<Periodique, String> colAuteurPer;
	
	@FXML
	TableColumn<Periodique, String> colDatePer;
	
	@FXML
	TableColumn<Periodique, String> colEtatPer;
	
	@FXML
	TableColumn<Periodique, Integer> colPretPer;
	
	@FXML
	TableColumn<Periodique, String> colEmprunteurPer;
}
