package model;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Adherent implements Serializable {

	private static final long serialVersionUID = -2787433857964055053L;
	private transient StringProperty nom;
	private transient StringProperty prenom;
	private transient StringProperty adresse;
	private transient StringProperty telephone;
	private transient StringProperty num;

	public Adherent(String num, String nom, String prenom, String adresse, String telephone) {
		this.num = new SimpleStringProperty(num);
		this.nom = new SimpleStringProperty(nom);
		this.prenom = new SimpleStringProperty(prenom);
		this.adresse = new SimpleStringProperty(adresse);
		this.telephone = new SimpleStringProperty(telephone);
	}

	private void writeObject(ObjectOutputStream out) throws IOException {
		out.defaultWriteObject();
		out.writeUTF(this.num.get());
		out.writeUTF(this.nom.get());
		out.writeUTF(this.prenom.get());
		out.writeUTF(this.adresse.get());
		out.writeUTF(this.telephone.get());
	}

	private void readObject(ObjectInputStream in) throws ClassNotFoundException, IOException {
		in.defaultReadObject();
		setNum(in.readUTF());
		setNom(in.readUTF());
		setPrenom(in.readUTF());
		setAdrese(in.readUTF());
		setTel(in.readUTF());
	}

	public void setNum(String num) {
		this.num = new SimpleStringProperty(num);
	}

	public StringProperty getNumProperty() {
		return num;
	}

	public String getNum() {
		return num.get();
	}

	public void setNom(String nom) {
		this.nom = new SimpleStringProperty(nom);
	}

	public StringProperty getNomProperty() {
		return nom;
	}

	public String getNom() {
		return nom.get();
	}

	public StringProperty getPrenomProperty() {
		return prenom;
	}

	public String getPrenom() {
		return prenom.get();
	}

	public void setPrenom(String prenom) {
		this.prenom = new SimpleStringProperty(prenom);
	}

	public StringProperty getAdresseProperty() {
		return adresse;
	}

	public String getAdresse() {
		return adresse.get();
	}

	public void setAdrese(String adresse) {
		this.adresse = new SimpleStringProperty(adresse);
	}

	public StringProperty getTelephoneProperty() {
		return telephone;
	}

	public void setTel(String tel) {
		this.telephone = new SimpleStringProperty(tel);
	}

	public String getTelephone() {
		return telephone.get();
	}

	@Override
	public String toString() {
		return nom + " " + prenom + " " + adresse + " " + telephone;
	}
}
