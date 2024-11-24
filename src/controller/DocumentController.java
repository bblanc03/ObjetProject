package controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.TableCell;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import model.DVD;
import model.Document;
import model.Livre;
import model.Periodique;
import model.Registre;
import utils.GestionIODVD;
import utils.GestionIOLivre;
import utils.GestionIOPeriodique;

public class DocumentController {
	ObservableList<Document> lstDoc = FXCollections.observableArrayList();
	ObservableList<Livre> lstLivre = FXCollections.observableArrayList();
	ObservableList<Periodique> lstPeriodique = FXCollections.observableArrayList();
	ObservableList<DVD> lstDVD = FXCollections.observableArrayList();
	Registre registre;
	
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
	
	

	public DocumentController() {
		System.out.println("LivreDocument");
		
		registre = Registre.getInstance();
		lstLivre = GestionIOLivre.chargerFichier("Livres.txt");
		registre.setListeLivre(lstLivre); 
		
		registre = Registre.getInstance();
		lstDVD = GestionIODVD.chargerFichier("DVD.txt");
		registre.setListeDVD(lstDVD);
		
		registre = Registre.getInstance();
		lstPeriodique = GestionIOPeriodique.chargerFichier("Periodiques.txt");
		registre.setListePeriodique(lstPeriodique);
		
		lstDoc.addAll(lstLivre);
		lstDoc.addAll(lstPeriodique);
		lstDoc.addAll(lstDVD);
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
        colPretDoc.setCellValueFactory(col -> col.getValue().getPretProperty().asObject());
    }
	
	@FXML 
	private void initialize() {
		initialiserVueDocuments();
		tvDoc.setItems(lstDoc);
	}
}
