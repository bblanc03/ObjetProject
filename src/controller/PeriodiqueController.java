package controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import model.Periodique;
import model.Registre;
import utils.GestionIOPeriodique;

public class PeriodiqueController {
	ObservableList<Periodique> lstPeriodique = FXCollections.observableArrayList();
	Registre registre;

	@FXML
	TableView<Periodique> tvPer;
	
	@FXML
	TableColumn<Periodique, String> colNumPer;
	
	@FXML
	TableColumn<Periodique, String> colTitrePer;
	
	@FXML
	TableColumn<Periodique, String> colDatePer;
	
	@FXML
	TableColumn<Periodique, Integer> colNumVol;
	
	@FXML
	TableColumn<Periodique, Integer> colNumPeriodique;
	
	@FXML
	TableColumn<Periodique, String> colEtatPer;
	
	@FXML
	TableColumn<Periodique, Integer> colPretPer;
	
	@FXML
	TableColumn<Periodique, String> colEmprunteurPer;
	
	public PeriodiqueController() {
		System.out.println("PeriodiqueController");
		registre = Registre.getInstance();
		lstPeriodique = GestionIOPeriodique.chargerFichier("Periodiques.txt");
		registre.setListePeriodique(lstPeriodique);
	}
	
	public void initialiserVuePeriodique() {
		System.out.println("initialiserVuePeriodique");
		colNumPer.setCellValueFactory(col -> col.getValue().getNumDocProperty());
		colTitrePer.setCellValueFactory(col -> col.getValue().getTitreProperty());
		colDatePer.setCellValueFactory(col -> col.getValue().getDateProperty());
		colNumVol.setCellValueFactory(col -> col.getValue().getNumVolProperty().asObject());
		colNumPeriodique.setCellValueFactory(col -> col.getValue().getNumPeriodiqueProperty().asObject());
		tvPer.setItems(lstPeriodique);
	}
	
	@FXML
	private void initialize() {
		initialiserVuePeriodique();
	}
}
