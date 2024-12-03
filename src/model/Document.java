package model;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class Document {
	private StringProperty noDocument;
	private StringProperty titre;
	private StringProperty auteur;
	private StringProperty datePublication;
	private StringProperty etat;
	private IntegerProperty pret;
	private static ObservableList<Document> obsListDoc = FXCollections.observableArrayList();
	private String type;
	
	//this is a super class for the other classes
	
	public Document(String noDocument, String titre, String datePublication) {
		this.noDocument = new SimpleStringProperty(noDocument);
		this.titre = new SimpleStringProperty(titre);
		this.datePublication = new SimpleStringProperty(datePublication);
		this.etat = new SimpleStringProperty("disponible");
		this.pret = new SimpleIntegerProperty(0);
	}
	public StringProperty getNoDocumentProperty() {
		return noDocument;
	}
	
	public String getNoDocument() {
		return noDocument.get();
	}

	public StringProperty getTitreProperty() {
		return titre;
	}
	
	public String getTitre() {
		return titre.get();
	}

	public StringProperty getAuteurProperty() {
		return auteur;
	}
	
	public String getAuteur() {
		if (auteur != null) {
			return auteur.get();
		}
		return "";
	}

	public StringProperty getDatePublicationProperty() {
		return datePublication;
	}
	
	public String getDatePublication() {
		return datePublication.get();
	}
	
	public StringProperty getEtatProperty() {
		return etat;
	}
	
	public IntegerProperty getPretProperty() {
		return pret;
	}
	
	@Override
	public String toString() {
		return titre.get();
	}
	
	public String getType() {
		return type;
	}
	
	
	
	//------------------------------------ObservableList------------------------------------------//
	
	
	public static void setDoc(Document doc) {
		obsListDoc.add(doc);
	}

	public static ObservableList<Document> getListDoc(){
		return obsListDoc;
	}

	public static void setListDoc(ObservableList<Document> list) {
		obsListDoc = list;
	}

	public static void removeDoc(Document remove) {
		obsListDoc.remove(remove);
	}
	
}
