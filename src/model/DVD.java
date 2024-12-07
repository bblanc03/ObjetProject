package model;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
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
	private transient StringProperty auteur;
	private transient IntegerProperty nbrDisque;
	private transient BooleanProperty etat;
	private transient IntegerProperty pret;
	private static ObservableList<DVD> obsListDVD = FXCollections.observableArrayList();
	//testing git push
	
	public DVD(String noDVD, String titre, String date, int nbrDisque, String auteur) {
		super(noDVD, titre, date);
		this.auteur = new SimpleStringProperty(auteur);
		this.nbrDisque = new SimpleIntegerProperty(nbrDisque);
		this.etat = new SimpleBooleanProperty(true);
		this.pret = new SimpleIntegerProperty(0);
	}
	
	private void writeObject(ObjectOutputStream out) throws IOException{
		out.defaultWriteObject();
		System.out.println("Serialiser livre: " + getTitre());
		out.writeUTF(getNoDocument());
		out.writeUTF(getTitre());
		out.writeUTF(getDatePublication());
		out.writeUTF(getAuteur());
//		out.writeBoolean(getEtat());
//		out.writeObject(getEmprunteur());
		System.out.println("writing objet");
	}
	
	private void readObject(ObjectInputStream in) throws ClassNotFoundException, IOException {
		System.out.println("Lecture de objet");
		in.defaultReadObject();
		this.setNoDoc(in.readUTF());
		this.setTitre(in.readUTF());
		this.setDate(in.readUTF());
		this.auteur = new SimpleStringProperty(in.readUTF());
		//this.setEtat(in.readBoolean());
		//this.setEmprunteur(in.readObject());
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
