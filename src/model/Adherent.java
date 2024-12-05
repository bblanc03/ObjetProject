package model;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Adherent {
	private StringProperty nom;
	private StringProperty prenom;
	private StringProperty adresse;
	private StringProperty telephone;
	private StringProperty num;
	
	public Adherent(String num ,String nom, String prenom, String adresse, String telephone) {
		this.num = new SimpleStringProperty(num);
		this.nom = new SimpleStringProperty(nom);
		this.prenom = new SimpleStringProperty(prenom);
		this.adresse = new SimpleStringProperty(adresse);
		this.telephone = new SimpleStringProperty(telephone);
	}
	
	public StringProperty getNumProperty() {
		return num;
	}
	
	public String getNum() {
		return num.get();
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
	
	public void setAdrese(String adresse) {
		this.adresse = new SimpleStringProperty(adresse);
	}

	public StringProperty getTelephoneProperty() {
		return telephone;
	}
	
	public void setTel(String tel) {
		this.telephone = new SimpleStringProperty(tel);
	}
	
	public String getTelephone() {
		return telephone.get();
	}
	
	@Override
	public String toString() {
		return adresse + " " + telephone;
	}
}
