package controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import model.DVD;
import model.Registre;
import utils.GestionIODVD;

public class DVDController {
	ObservableList<DVD> lstDVD = FXCollections.observableArrayList();
	Registre registre;
	
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
	
	public DVDController() {
		registre = Registre.getInstance();
	}
	
	public void initialiserVueDVD() {
		System.out.println("initialiserVueDVD");
		colNumDVD.setCellValueFactory(col -> col.getValue().getNoDocumentProperty());
		colTitreDVD.setCellValueFactory(col -> col.getValue().getTitreProperty());
		colAuteurDVD.setCellValueFactory(col -> col.getValue().getAuteurProperty());
		colDateDVD.setCellValueFactory(col -> col.getValue().getDatePublicationProperty());
		//colNbrDisque.setCellValueFactory(col -> col.getValue().getNbrDisqueProperty().asObject());
		colEtatDVD.setCellValueFactory(col -> col.getValue().getEtatProperty());
		colPretDVD.setCellValueFactory(col -> col.getValue().getPretProperty().asObject());
		//colEmprunteurDVD.setCellValueFactory(col -> col.getValue().getDatePublicationProperty());
	}
	
	@FXML
	private void initialize() {
		initialiserVueDVD();
		tvDVD.setItems(registre.getListeDVD());
		tvDVD.getSelectionModel().selectedItemProperty().addListener((bs, anc, nou) -> {
			registre.setDocument(nou);
		});;	
	}
}
