package model;

import java.io.Serializable;

import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

public class Pret implements Serializable{
	private static final long serialVersionUID = -5296672519460246263L;
	
	//Instances
	private SimpleStringProperty numAdherent;
	private SimpleStringProperty nom;
	private SimpleStringProperty prenom;
	private SimpleStringProperty adresse;
	private SimpleStringProperty tel;
	private SimpleIntegerProperty pretsActifs;
	private SimpleDoubleProperty soldeDu;
	
	//Constructor
	public Pret(
			SimpleStringProperty numAdherent, SimpleStringProperty nom, SimpleStringProperty prenom,
			SimpleStringProperty adresse, SimpleStringProperty tel, SimpleIntegerProperty pretsActifs,
			SimpleDoubleProperty soldeDu) {
		this.numAdherent = numAdherent;
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;
		this.tel = tel;
		this.pretsActifs = pretsActifs;
		this.soldeDu = soldeDu;
	}

	
	//Getters and Setters
	public SimpleStringProperty getNumAdherentProperty() {
		return numAdherent;
	}
	
	public String getNumAdherent() {
		return numAdherent.get();
	}

	public void setNumAdherent(SimpleStringProperty numAdherent) {
		this.numAdherent = numAdherent;
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

	public SimpleIntegerProperty getPretsActifsProperty() {
		return pretsActifs;
	}
	
	public int getPretsActifs() {
		return pretsActifs.get();
	}

	public void setPretsActifs(SimpleIntegerProperty pretsActifs) {
		this.pretsActifs = pretsActifs;
	}

	public SimpleDoubleProperty getSoldeDuProperty() {
		return soldeDu;
	}
	
	public double getSoldeDu() {
		return soldeDu.get();
	}

	public void setSoldeDu(SimpleDoubleProperty soldeDu) {
		this.soldeDu = soldeDu;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	
}
