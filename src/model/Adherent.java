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
		this.prenom = new SimpleStringProperty(prenom);
		this.adresse = new SimpleStringProperty(adresse);
		this.telephone = new SimpleStringProperty(telephone);
	}

	public StringProperty getNomProperty() {
		return nom;
	}
	
	public String getNom() {
		return nom.get();
	}

	public StringProperty getPrenomProperty() {
		return prenom;
	}
	
	public String getPrenom() {
		return prenom.get();
	}

	public StringProperty getAdresseProperty() {
		return adresse;
	}
	
	public String getAdresse() {
		return adresse.get();
	}

	public StringProperty getTelephoneProperty() {
		return telephone;
	}
	
	public String getTelephone() {
		return telephone.get();
	}
}
