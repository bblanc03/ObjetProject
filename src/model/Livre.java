package model;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Livre extends Document{
	private StringProperty auteur;
	private StringProperty etat;
	private IntegerProperty pret;
	
	public Livre(String noLivre, String titre, String dateParution, String auteur) {
		super(noLivre, titre, dateParution);
		this.auteur = new SimpleStringProperty(auteur);
		this.etat = new SimpleStringProperty("disponnible");
		this.pret = new SimpleIntegerProperty(0);
	}
	
	public StringProperty getAuteurProperty() {
		return auteur;
	}
	
	public String getAuteur() {
		return auteur.get();
	}
	
	public StringProperty getEtatProperty() {
		return etat;
	}
	
	public IntegerProperty getPretProperty() {
		return pret;
	}
	
}
