package model;

import java.io.Serializable;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class Periodique extends Document implements Serializable {

	private static final long serialVersionUID = -3862038457165840202L;

	// Instances

	private SimpleIntegerProperty numVol;
	private SimpleIntegerProperty numPeriodique;
	private SimpleStringProperty etat;
	private SimpleStringProperty emprunteur;
	private IntegerProperty pret;
	private static ObservableList<Periodique> obsListPer = FXCollections.observableArrayList();

	// Constructeur
	public Periodique(String numDoc, String titre, String date, int numVol, int numPeriodique) {
		super(numDoc, titre, date);
		this.numVol = new SimpleIntegerProperty(numVol);
		this.numPeriodique = new SimpleIntegerProperty(numPeriodique);
		this.etat = new SimpleStringProperty("disponnible");
		this.pret = new SimpleIntegerProperty(0);
	}

	// Getters et setters

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

	public StringProperty getEtatProperty() {
		return etat;
	}

	public String getEtat() {
		return etat.get();
	}

	public void setEtat(SimpleStringProperty etat) {
		this.etat = etat;
	}

	public IntegerProperty getPretProperty() {
		return pret;
	}

	public int getPret() {
		return pret.get();
	}

	public void setPret(SimpleIntegerProperty pret) {
		this.pret = pret;
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
	
	
	//------------------------------------ObservableList------------------------------------------//
	
	
			public static void setPeriodique(Periodique periodique) {
				obsListPer.add(periodique);
			}

			public static ObservableList<Periodique> getListPeriodique(){
				return obsListPer;
			}

			public static void setListPeriodique(ObservableList<Periodique> list) {
				obsListPer = list;
			}

			public static void removePeriodique(Periodique remove) {
				obsListPer.remove(remove);
			}

}
