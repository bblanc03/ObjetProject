package model;

import java.io.Serializable;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

public class Periodique implements Serializable {

	private static final long serialVersionUID = -3862038457165840202L;

	// Instances

	private SimpleStringProperty numDoc;
	private SimpleStringProperty titre;
	private SimpleStringProperty date;
	private SimpleIntegerProperty numVol;
	private SimpleIntegerProperty numPer;
	private SimpleStringProperty etat;
	private SimpleIntegerProperty nbPret;
	private SimpleStringProperty emprunteur;
	
	
	
	
	// Constructeur
	public Periodique(SimpleStringProperty numDoc, SimpleStringProperty titre, SimpleStringProperty date,
			SimpleStringProperty etat, SimpleIntegerProperty nbPret) {
		this.numDoc = numDoc;
		this.titre = titre;
		this.date = date;
		this.etat = etat;
		this.nbPret = nbPret;
	}
	
	
	
	// Getters et setters

	public SimpleStringProperty getNumDocProperty() {
		return numDoc;
	}

	public String getNumDoc() {
		return numDoc.get();
	}

	public void setNumDoc(SimpleStringProperty numDoc) {
		this.numDoc = numDoc;
	}

	public SimpleStringProperty getTitreProperty() {
		return titre;
	}

	public String getTitre() {
		return titre.get();
	}

	public void setTitre(SimpleStringProperty titre) {
		this.titre = titre;
	}

	public SimpleStringProperty getDateProperty() {
		return date;
	}

	public String getDate() {
		return date.get();
	}

	public void setDate(SimpleStringProperty date) {
		this.date = date;
	}

	public SimpleIntegerProperty getNumVolProperty() {
		return numVol;
	}

	public int getNumVol() {
		return numVol.get();
	}

	public void setNumVol(SimpleIntegerProperty numVol) {
		this.numVol = numVol;
	}

	public SimpleIntegerProperty getNumPerProperty() {
		return numPer;
	}

	public int getNumPer() {
		return numPer.get();
	}

	public void setNumPer(SimpleIntegerProperty numPer) {
		this.numPer = numPer;
	}

	public SimpleStringProperty getEtatProperty() {
		return etat;
	}

	public String getEtat() {
		return etat.get();
	}

	public void setEtat(SimpleStringProperty etat) {
		this.etat = etat;
	}

	public SimpleIntegerProperty getNbPretProperty() {
		return nbPret;
	}

	public int getNbPret() {
		return nbPret.get();
	}

	public void setNbPret(SimpleIntegerProperty nbPret) {
		this.nbPret = nbPret;
	}

	public SimpleStringProperty getEmprunteurProperty() {
		return emprunteur;
	}

	public String getEmprunteur() {
		return emprunteur.get();
	}

	public void setEmprunteur(SimpleStringProperty emprunteur) {
		this.emprunteur = emprunteur;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
