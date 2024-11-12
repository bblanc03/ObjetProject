package model;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.collections.ObservableList;

public class Document {
	private StringProperty noDocument;
	private StringProperty titre;
	private StringProperty auteur;
	private StringProperty datePublication;
	
	//this is a super class for the other classes
	
	public Document(String noDocument, String titre, String datePublication, String auteur) {
		this.noDocument = new SimpleStringProperty(noDocument);
		this.titre = new SimpleStringProperty(titre);
		this.auteur = new SimpleStringProperty(auteur);
		this.datePublication = new SimpleStringProperty(datePublication);
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
		return auteur.get();
	}

	public StringProperty getDatePublicationProperty() {
		return datePublication;
	}
	
	public String getDatePublication() {
		return datePublication.get();
	}
	
}
