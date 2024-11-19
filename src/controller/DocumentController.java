package controller;

import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import model.Document;

public class DocumentController {
	@FXML
	TableView<Document> tvDoc;
	
	@FXML
	TableColumn<Document, String> colNumDoc;
	
	@FXML
	TableColumn<Document, String> colTitreDoc;
	
	@FXML
	TableColumn<Document, String> colAuteurDoc;
	
	@FXML
	TableColumn<Document, String> colDateDoc;
	
	@FXML
	TableColumn<Document, String> colEtatDoc;
	
	@FXML
	TableColumn<Document, Integer> colPretDoc;
	
	@FXML
	TableColumn<Document, String> colEmprunteurDoc;

}
