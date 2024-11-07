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
	private StringProperty etat; // maybe a boolean property
	private IntegerProperty nbPrets;
	private StringProperty datePublication;
	private StringProperty Emprunteur;
	//maybe make a StringProperty for mots cles
	
	ObservableList<Document> lstObservDocument; // creer un tri comme enonce de probleme.
	
	public Document(String noDocument, String titre, String auteur, String datePublication) {
		this.noDocument = new SimpleStringProperty(noDocument);
		this.titre = new SimpleStringProperty(titre);
		this.auteur = new SimpleStringProperty(auteur);
		this.datePublication = new SimpleStringProperty(datePublication);
	}
	
}
