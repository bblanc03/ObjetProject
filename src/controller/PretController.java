package controller;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.layout.AnchorPane;
import model.Pret;
import utils.GestionVue;

public class PretController {
	GestionVue gestionVue;

	@FXML
	AnchorPane ancPret;

	@FXML
	TableView<Pret> tvPret;

	@FXML
	TableColumn<Pret, String> colNum;

	@FXML
	TableColumn<Pret, String> colNom;

	@FXML
	TableColumn<Pret, String> colPrenom;

	@FXML
	TableColumn<Pret, String> colAdresse;

	@FXML
	TableColumn<Pret, String> colTel;

	@FXML
	TableColumn<Pret, Integer> colPret;

	@FXML
	TableColumn<Pret, Double> colSolde;

	@FXML
	Button btnAnnuler;

	@FXML
	Button btnConfirmer;

}
