package model;

import java.io.Serializable;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class DVD extends Document implements Serializable {

	private static final long serialVersionUID = 3443381829226820383L;
	
	//private StringProperty noDVD;
	//private StringProperty titre;
	//private StringProperty date;
	private StringProperty auteur;
	private IntegerProperty nbrDisque;
	private StringProperty etat;
	private IntegerProperty pret;
	//testing git push
	
	public DVD(String noDVD, String titre, String date, int nbrDisque, String auteur) {
		super(noDVD, titre, date);
		this.auteur = new SimpleStringProperty(auteur);
		this.nbrDisque = new SimpleIntegerProperty(nbrDisque);
		this.etat = new SimpleStringProperty("disponible");
		this.pret = new SimpleIntegerProperty(0);
	}

	public IntegerProperty getNbrDisqueProperty() {
		return nbrDisque;
	}
	
	public void setNbrDisque(SimpleIntegerProperty nbrDisque) {
		this.nbrDisque = nbrDisque;
	}
	
	public StringProperty getAuteurProperty() {
		return auteur;
	}
	
	public String getAuteur() {
		return auteur.get();
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	public StringProperty getEtatProperty() {
		return etat;
	}
	
	public IntegerProperty getPretProperty() { 
		return pret;
	}
}
