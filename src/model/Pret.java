package model;

import java.io.Serializable;

import javafx.beans.property.DoubleProperty;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Pret implements Serializable {
	private static final long serialVersionUID = -5296672519460246263L;

	// Instances
	private StringProperty numAdherent;
	private StringProperty nom;
	private StringProperty prenom;
	private StringProperty adresse;
	private StringProperty tel;
	private IntegerProperty pretsActifs;
	private DoubleProperty soldeDu;

	// Constructor
	public Pret(String numAdherent, String nom, String prenom, String adresse, String tel, int pretsActifs,
			double soldeDu) {
		this.numAdherent = new SimpleStringProperty(numAdherent);
		this.nom = new SimpleStringProperty(nom);
		this.prenom = new SimpleStringProperty(prenom);
		;
		this.adresse = new SimpleStringProperty(adresse);
		;
		this.tel = new SimpleStringProperty(tel);
		;
		this.pretsActifs = new SimpleIntegerProperty(pretsActifs);
		;
		this.soldeDu = new SimpleDoubleProperty(soldeDu);
		;
	}

	// Getters and Setters
	public StringProperty getNumAdherentProperty() {
		return numAdherent;
	}

	public String getNumAdherent() {
		return numAdherent.get();
	}

	public void setNumAdherent(StringProperty numAdherent) {
		this.numAdherent = numAdherent;
	}

	public StringProperty getNomProperty() {
		return nom;
	}

	public String getNom() {
		return nom.get();
	}

	public void setNom(StringProperty nom) {
		this.nom = nom;
	}

	public StringProperty getPrenomProperty() {
		return prenom;
	}

	public String getPrenom() {
		return prenom.get();
	}

	public void setPrenom(StringProperty prenom) {
		this.prenom = prenom;
	}

	public StringProperty getAdresseProperty() {
		return adresse;
	}

	public String getAdresse() {
		return adresse.get();
	}

	public void setAdresse(StringProperty adresse) {
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

	public IntegerProperty getPretsActifsProperty() {
		return pretsActifs;
	}

	public int getPretsActifs() {
		return pretsActifs.get();
	}

	public void setPretsActifs(IntegerProperty pretsActifs) {
		this.pretsActifs = pretsActifs;
	}

	public DoubleProperty getSoldeDuProperty() {
		return soldeDu;
	}

	public double getSoldeDu() {
		return soldeDu.get();
	}

	public void setSoldeDu(DoubleProperty soldeDu) {
		this.soldeDu = soldeDu;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
