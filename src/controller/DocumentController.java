package controller;

import javafx.fxml.FXML;
import javafx.scene.control.TableCell;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import model.DVD;
import model.Document;
import model.Livre;
import model.Registre;


public class DocumentController {
	Registre registre;
	AccordionGestionController accordion = new AccordionGestionController();
	
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
	TableColumn<Document, Boolean> colEtatDoc;
	
	@FXML
	TableColumn<Document, Integer> colPretDoc;
	
	@FXML
	TableColumn<Document, String> colEmprunteurDoc;
	
	
	@FXML 
	private void initialize() {
		initialiserVueDocuments();
		tvDoc.setItems(registre.getListeDocument());
		tvDoc.getSelectionModel().selectedItemProperty().addListener((bs, anc, nou) -> {
			registre.setDocument(nou);
		});
	}

	
	public DocumentController() {
		registre = Registre.getInstance();
	}
	
	private void initialiserVueDocuments() {
		colNumDoc.setCellValueFactory(col -> col.getValue().getNoDocumentProperty());
        colTitreDoc.setCellValueFactory(col -> col.getValue().getTitreProperty());
        colAuteurDoc.setCellFactory(col -> new TableCell<Document, String>() {
            @Override
            protected void updateItem(String item, boolean empty) {
                super.updateItem(item, empty);
                if (empty || getTableRow() == null) {
                    setText(null);
                } else {
                    Document doc = getTableRow().getItem();
                    if (doc instanceof Livre) {
                        setText(((Livre) doc).getAuteur());
                    } else if (doc instanceof DVD) {
                        setText(((DVD) doc).getAuteur());
                    } else {
                        setText("");
                    }
                }
            }
        });
        colDateDoc.setCellValueFactory(col -> col.getValue().getDatePublicationProperty());
        colEtatDoc.setCellValueFactory(col -> col.getValue().getEtatProperty());
        //colPretDoc.setCellValueFactory(col -> col.getValue().getPretProperty().asObject());
    }
	
	
	
	
}
