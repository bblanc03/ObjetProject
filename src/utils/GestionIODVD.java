package utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import model.DVD;
import model.Registre;

public class GestionIODVD {
	Registre registre;
	static Boolean fileRead = false;
	private static ArrayList<DVD> toRead = new ArrayList<>();
	private static String pathFichierWrite = "data/DVD.ser";

	// Constructeur prive qui empeche l'instanciation
	private GestionIODVD() {
		throw new UnsupportedOperationException("classe utilitaire - ne peut etre instanciee");
	}

	public static ObservableList<DVD> chargerFichier(String nomFichier) {

		File written = new File(pathFichierWrite);
		if (written.length() == 0) {
			if (!fileRead) {
				String pathFichierTexte = "/" + Constantes.REPERTOIRE_FICHIERS + "/" + nomFichier;

				ObservableList<DVD> listeDVD = FXCollections.observableArrayList();

				try (InputStream inStream = DVD.class.getResourceAsStream(pathFichierTexte);
						Scanner lecteur = new Scanner(inStream)) {

					lecteur.useDelimiter(",|\\n");

					while (lecteur.hasNextLine()) {
						String noDVD = lecteur.next().trim();
						String titre = lecteur.next().trim();
						String date = lecteur.next().trim();
						int nbrDisque = Integer.parseInt(lecteur.next().trim());
						String auteur = lecteur.next().trim();

						DVD dvd = new DVD(noDVD, titre, date, nbrDisque, auteur);

						listeDVD.add(dvd);
					}

				} catch (IOException e) {

					e.printStackTrace();
				}
				return listeDVD;
			}
		} else {
			try {
				FileInputStream file = new FileInputStream(pathFichierWrite);
				ObjectInputStream in = new ObjectInputStream(file);
				toRead = (ArrayList<DVD>) in.readObject();
				ObservableList<DVD> listesDVD = FXCollections.observableArrayList();

				for (DVD dvd : toRead) {
					listesDVD.add(dvd);
				}

				in.close();
				file.close();

				return listesDVD;
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		return null;

	}

	public static void serealise(ObservableList<DVD> lstDVD) throws IOException {
		FileOutputStream file = new FileOutputStream(pathFichierWrite);
		ObjectOutputStream out = new ObjectOutputStream(file);
		toRead = new ArrayList<DVD>();
		for (DVD dvd : lstDVD) {
			toRead.add(dvd);
		}
		out.writeObject(toRead);
		out.close();
		file.close();
	}

	public static void setFileRead() {
		fileRead = true;
	}
}
