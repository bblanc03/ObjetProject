package controller;

import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import model.DVD;

public class DVDController {
	@FXML
	TableView<DVD> tvDVD;
	
	@FXML
	TableColumn<DVD, String> colNumDVD;
	
	@FXML
	TableColumn<DVD, String> colTitreDVD;
	
	@FXML
	TableColumn<DVD, String> colAuteurDVD;
	
	@FXML
	TableColumn<DVD, String> colDateDVD;
	
	@FXML 
	TableColumn<DVD, Integer> colNbrDisque;
	
	@FXML
	TableColumn<DVD, String> colEtatDVD;
	
	@FXML
	TableColumn<DVD, Integer> colPretDVD;
	
	@FXML
	TableColumn<DVD, String> colEmprunteurDVD;
}
