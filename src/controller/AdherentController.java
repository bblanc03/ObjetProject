package controller;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import model.Adherent;

public class AdherentController {

	@FXML
	TableView<Adherent> tvAD;
	
	@FXML
	TableColumn<Adherent, String> colNum;
	
	@FXML
	TableColumn<Adherent, String> colNom;
	
	@FXML
	TableColumn<Adherent, String> colPrenom;
	
	@FXML
	TableColumn<Adherent, String> colAdresse;
	
	@FXML
	TableColumn<Adherent, String> colTel;
	
	@FXML
	TableColumn<Adherent, Integer> colPret;
	
	@FXML
	TableColumn<Adherent, Double> colSolde;
	
	
}
