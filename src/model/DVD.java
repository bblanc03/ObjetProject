package model;

import java.io.Serializable;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class DVD extends Document implements Serializable {

	private static final long serialVersionUID = 3443381829226820383L;
	
	//private StringProperty noDVD;
	//private StringProperty titre;
	//private StringProperty date;
	//private StringProperty auteur;
	
	//testing git push
	
	public DVD(String noDVD, String titre, String date, String auteur) {
		super(noDVD, titre, date, auteur);
	}
	
	public StringProperty getNoDvdProperty() {
		return noDVD;
	}
	
	public String getNoDVD() {
		return noDVD.get();
	}
	
	public StringProperty getTitrePropetrty() {
		return titre;
	}
	public StringProperty getDateProperty() {
		return date;
	}
	public StringProperty getAuteurProperty() {
		return auteur;
	}
	
}
