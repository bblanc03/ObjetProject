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
	private SimpleIntegerProperty numPeriodique;
	private SimpleStringProperty etat;
	private SimpleIntegerProperty nbPret;
	private SimpleStringProperty emprunteur;
	
	// Constructeur
	public Periodique(String numDoc, String titre, String date,
			int numVol, int numPeriodique) {
		this.numDoc = new SimpleStringProperty(numDoc);
		this.titre = new SimpleStringProperty(titre);
		this.date = new SimpleStringProperty(date);
		this.numVol = new SimpleIntegerProperty(numVol);
		this.numPeriodique = new SimpleIntegerProperty(numPeriodique);
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

	public SimpleIntegerProperty getNumPeriodiqueProperty() {
		return numPeriodique;
	}

	public int getNumPeriodique() {
		return numPeriodique.get();
	}

	public void setNumPer(SimpleIntegerProperty numPer) {
		this.numPeriodique = numPer;
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
