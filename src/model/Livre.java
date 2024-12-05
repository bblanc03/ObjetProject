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

public class Livre extends Document implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -4907274974623063053L;
	private  transient StringProperty auteur;
	private  transient BooleanProperty etat;
	private  transient IntegerProperty pret;

	private static ObservableList<Livre> obsListLivre = FXCollections.observableArrayList();


	public Livre() {
        super("", "", "");
        this.auteur = new SimpleStringProperty("");
        this.etat = new SimpleBooleanProperty(true);
        this.pret = new SimpleIntegerProperty(0);
    }
	
	
	public Livre(String noLivre, String titre, String dateParution, String auteur) {
		super(noLivre, titre, dateParution);
		this.auteur = new SimpleStringProperty(auteur);
		this.etat = new SimpleBooleanProperty(true);
//		this.pret = new SimpleIntegerProperty(0);
	}

	
	private void writeObject(ObjectOutputStream out) throws IOException{
		out.defaultWriteObject();
		System.out.println("Serialiser livre: " + getTitre());
		out.writeUTF(getNoDocument());
		out.writeUTF(getTitre());
		out.writeUTF(getDatePublication());
		out.writeUTF(getAuteur());
		out.writeBoolean(getEtat());
		out.writeObject(getEmprunteur());
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
		this.setAuteur(in.readUTF());
		this.setEtat(in.readBoolean());
		this.setEmprunteur(in.readObject());
	}
	
	public StringProperty getAuteurProperty() {
		return auteur;
	}
	
	public String getAuteur() {
		return auteur.get();
	}
	
	public void setAuteur(String auteur) {
		this.auteur.set(auteur);
	}

	public BooleanProperty getEtatProperty() {
		return etat;
	}

	public IntegerProperty getPretProperty() {
		return pret;
	}

	public boolean isSelected() { 
		return false;
	}
	// ------------------------------------ObservableList------------------------------------------//

	public static void setLivre(Livre livre) {
		obsListLivre.add(livre);
	}

	public static ObservableList<Livre> getListLivre() {
		return obsListLivre;
	}

	public static void setListLire(ObservableList<Livre> list) {
		obsListLivre = list;
	}

	public static void removeLivre(Livre remove) {
		obsListLivre.remove(remove);
	}

	@Override
	public String toString() {
		return auteur.get();
	}
}
