package model;

import java.io.Serializable;

import javafx.beans.property.BooleanProperty;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class DVD extends Document implements Serializable {

	private static final long serialVersionUID = 3443381829226820383L;
	
	//private StringProperty noDVD;
	//private StringProperty titre;
	//private StringProperty date;
	private StringProperty auteur;
	private IntegerProperty nbrDisque;
	private BooleanProperty etat;
	private IntegerProperty pret;
	private static ObservableList<DVD> obsListDVD = FXCollections.observableArrayList();
	//testing git push
	
	public DVD(String noDVD, String titre, String date, int nbrDisque, String auteur) {
		super(noDVD, titre, date);
		this.auteur = new SimpleStringProperty(auteur);
		this.nbrDisque = new SimpleIntegerProperty(nbrDisque);
		this.etat = new SimpleBooleanProperty(true);
		this.pret = new SimpleIntegerProperty(0);
	}

	public IntegerProperty getNbrDisqueProperty() {
		return nbrDisque;
	}
	
	public void setNbrDisque(IntegerProperty nbrDisque) {
		this.nbrDisque = nbrDisque;
	}
	
	public StringProperty getAuteurProperty() {
		return auteur;
	}
	
	public String getAuteur() {
		return auteur.get();
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	public BooleanProperty getEtatProperty() {
		return etat;
	}
	
	public IntegerProperty getPretProperty() { 
		return pret;
	}
	
	
	//------------------------------------ObservableList------------------------------------------//
	
	
	public static void setDVD(DVD dvd) {
		obsListDVD.add(dvd);
	}

	public static ObservableList<DVD> getListDVD(){
		return obsListDVD;
	}

	public static void setListDVD(ObservableList<DVD> list) {
		obsListDVD = list;
	}

	public static void removeDVD(DVD remove) {
		obsListDVD.remove(remove);
	}

}
