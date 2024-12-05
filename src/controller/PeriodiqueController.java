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
	TableColumn<Periodique, Boolean> colEtatPer;
	
	@FXML
	TableColumn<Periodique, Integer> colPretPer;
	
	@FXML
	TableColumn<Periodique, String> colEmprunteurPer;
	
	public PeriodiqueController() {
		registre = Registre.getInstance();
	}
	
	public void initialiserVuePeriodique() {
		System.out.println("initialiserVuePeriodique");
		colNumPer.setCellValueFactory(col -> col.getValue().getNoDocumentProperty());
		colTitrePer.setCellValueFactory(col -> col.getValue().getTitreProperty());
		colDatePer.setCellValueFactory(col -> col.getValue().getDatePublicationProperty());
		colNumVol.setCellValueFactory(col -> col.getValue().getNumVolProperty().asObject());
		colNumPeriodique.setCellValueFactory(col -> col.getValue().getNumPeriodiqueProperty().asObject());
		colEtatPer.setCellValueFactory(col -> col.getValue().getEtatProperty());
		colPretPer.setCellValueFactory(col -> col.getValue().getPretProperty().asObject());
		
	}
	
	@FXML
	private void initialize() {
		initialiserVuePeriodique();
		tvPer.setItems(registre.getListePeriodique());
		tvPer.getSelectionModel().selectedItemProperty().addListener((bs, anc, nou) -> {
			registre.setDocument(nou);
		});;	
	}
}
