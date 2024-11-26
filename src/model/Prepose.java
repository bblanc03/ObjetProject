package model;

import java.io.Serializable;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Prepose extends Personne implements Serializable {
	private static final long serialVersionUID = -5296672519460246263L;


	// Instances
	private IntegerProperty numEmp;
	private StringProperty nom;
	private StringProperty prenom;
	private StringProperty adresse;
	private StringProperty tel;
	private StringProperty password;

public Prepose(String nom, String prenom, String adresse, String telephone) {
	super(nom, prenom, adresse, telephone);
}

	// Getters et Setters
	public IntegerProperty getNumEmpProperty() {
		return numEmp;
	}

	public int getNumEmp() {
		return numEmp.get();
	}

	public void setNumEmp(SimpleIntegerProperty numEmp) {
		this.numEmp = numEmp;
	}

	public StringProperty getNomProperty() {
		return nom;
	}

	public String getNom() {
		return nom.get();
	}

	public void setNom(SimpleStringProperty nom) {
		this.nom = nom;
	}

	public StringProperty getPrenomProperty() {
		return prenom;
	}

	public String getPrenom() {
		return prenom.get();
	}

	public void setPrenom(SimpleStringProperty prenom) {
		this.prenom = prenom;
	}

	public StringProperty getAdresseProperty() {
		return adresse;
	}

	public String getAdresse() {
		return adresse.get();
	}

	public void setAdresse(SimpleStringProperty adresse) {
		this.adresse = adresse;
	}

	public StringProperty getTelProperty() {
		return tel;
	}

	public String getTel() {
		return tel.get();
	}

	public void setTel(SimpleStringProperty tel) {
		this.tel = tel;
	}

	public StringProperty getPasswordProperty() {
		return password;
	}

	public String getPassword() {
		return password.get();
	}

	public void setPassword(SimpleStringProperty password) {
		this.password = password;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}


	
	
	

}
