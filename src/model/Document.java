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
	//maybe make a StringProperty for mots cles
	
	//this is a super class for the other classes
	
	//ObservableList<Document> lstObservDocument; // creer un tri comme enonce de probleme.
	
	public Document(String noDocument, String titre, String datePublication, String auteur) {
		this.noDocument = new SimpleStringProperty(noDocument);
		this.titre = new SimpleStringProperty(titre);
		this.auteur = new SimpleStringProperty(auteur);
		this.datePublication = new SimpleStringProperty(datePublication);
	}
	
}
