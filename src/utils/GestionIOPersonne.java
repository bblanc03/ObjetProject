package utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import model.Personne;

public class GestionIOPersonne {
	private GestionIOPersonne() {

	}

	private static String fichier = "Personne.txt";
	static String pathFichierTexte = Constantes.REPERTOIRE_DATA + "/" + fichier;
	static ArrayList<Personne> toWrite = new ArrayList<>();
	static ArrayList<Personne> toRead = new ArrayList<>();

	public static void ecrireFichierPersonne(Personne personne) throws IOException, ClassNotFoundException {
		 

		FileOutputStream file = new FileOutputStream(pathFichierTexte);
		ObjectOutputStream out = new ObjectOutputStream(file);
		toWrite = new ArrayList<>(Personne.getObservableList());
		toWrite.add(personne);
		out.writeObject(toWrite);

		out.close();
		file.close();

	}

	public static void lireFichierPersonne() throws ClassNotFoundException, IOException {
		// ArrayList<Personne> test = null;
		FileInputStream file = new FileInputStream(pathFichierTexte);
		ObjectInputStream in = new ObjectInputStream(file);
		toRead = (ArrayList<Personne>) in.readObject();

		for (Personne pers : toRead) {
			Personne.setPersonne(pers);
		}

		// toWrite.add(testing);
		// System.out.println(toWrite);

		in.close();
		file.close();
	}
}
