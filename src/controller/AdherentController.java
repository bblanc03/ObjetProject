package controller;

import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import model.Adherent;
import model.Registre;

public class AdherentController {
	Registre registre;

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
	
	public AdherentController() {
		registre = Registre.getInstance();
	}
	
	private void initialiserVueAdherent() {
		colNum.setCellValueFactory(col -> col.getValue().getNumProperty());
		colNom.setCellValueFactory(col -> col.getValue().getNomProperty());
		colPrenom.setCellValueFactory(col -> col.getValue().getPrenomProperty());
		colAdresse.setCellValueFactory(col -> col.getValue().getAdresseProperty());
		colTel.setCellValueFactory(col -> col.getValue().getTelephoneProperty());
		tvAD.setItems(registre.getListeAdherent());
	}
	
	@FXML
	private void initialize() {
		initialiserVueAdherent();
		tvAD.getSelectionModel().selectedItemProperty().addListener((bs, anc, nou) -> {
			registre.setAdherent(nou);
		});;
	}
	
	
}
