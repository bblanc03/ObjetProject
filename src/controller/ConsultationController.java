package controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Region;

public class ConsultationController {
	
	@FXML
	AnchorPane root;

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
		
}
