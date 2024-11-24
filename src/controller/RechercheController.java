package controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.AnchorPane;

public class RechercheController {
	
	@FXML
	AnchorPane root;

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
	ToggleGroup filtre;
}
