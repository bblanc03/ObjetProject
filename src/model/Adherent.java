package model;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Adherent {
	private StringProperty nom;
	private StringProperty prenom;
	private StringProperty adresse;
	private StringProperty telephone;
	
	public Adherent(String nom, String prenom, String adresse, String telephone) {
		this.nom = new SimpleStringProperty(nom);
	}
}
