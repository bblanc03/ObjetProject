package model;

import java.io.Serializable;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

public class Prepose implements Serializable {
	private static final long serialVersionUID = -5296672519460246263L;

	//Instances
	private SimpleIntegerProperty numEmp;
	private SimpleStringProperty nom;
	private SimpleStringProperty prenom;
	private SimpleStringProperty adresse;
	private SimpleStringProperty tel;
	private SimpleStringProperty password;
	
	
	//Constucteur
	public Prepose(SimpleStringProperty nom, SimpleStringProperty prenom, SimpleStringProperty adresse,
			SimpleStringProperty tel, SimpleStringProperty password) {
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;
		this.tel = tel;
		this.password = password;
	}


	
	//Getters et Setters
	public SimpleIntegerProperty getNumEmpProperty() {
		return numEmp;
	}
	
	public int getNumEmp() {
		return numEmp.get();
	}


	public void setNumEmp(SimpleIntegerProperty numEmp) {
		this.numEmp = numEmp;
	}


	public SimpleStringProperty getNomProperty() {
		return nom;
	}
	
	public String getNom() {
		return nom.get();
	}


	public void setNom(SimpleStringProperty nom) {
		this.nom = nom;
	}


	public SimpleStringProperty getPrenomProperty() {
		return prenom;
	}
	
	public String getPrenom() {
		return prenom.get();
	}


	public void setPrenom(SimpleStringProperty prenom) {
		this.prenom = prenom;
	}


	public SimpleStringProperty getAdresseProperty() {
		return adresse;
	}
	
	public String getAdresse() {
		return adresse.get();
	}


	public void setAdresse(SimpleStringProperty adresse) {
		this.adresse = adresse;
	}


	public SimpleStringProperty getTelProperty() {
		return tel;
	}
	
	public String getTel() {
		return tel.get();
	}


	public void setTel(SimpleStringProperty tel) {
		this.tel = tel;
	}


	public SimpleStringProperty getPasswordProperty() {
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
