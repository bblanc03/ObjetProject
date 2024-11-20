package controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Region;

public class CatalogueController {

	@FXML 
	AnchorPane anchorPane;
	
	@FXML
	Label lblRech;
	
	@FXML
	RadioButton radAuteur;
	
	@FXML
	RadioButton radMot;
	
	@FXML
	Button btnEffacer;
	
	@FXML
	TextField txtRech;
	
	@FXML
	TabPane paneElement;
	
	@FXML
	Tab tabTous;
	
	@FXML
	Tab tabLivre;
	
	@FXML
	Tab tabPeriodique;
	
	@FXML
	Tab tabDVD;
	
	@FXML
	Region regionID;
	
	@FXML
	Label lblID;
	
	@FXML
	Label lblNom;
	
	@FXML
	Label lblPrenom;
	
	@FXML
	Button btnConsulter;
	
	@FXML
	TextField txtNom;
	
	@FXML
	TextField txtPrenom;
	
	@FXML 
	RadioButton radNomPrenom;
	
	@FXML
	RadioButton radTel;
	
	@FXML
	Button btnQuitter;
	
	//Radio Group them
	//TextField search action
	//Effacer btn action
}
