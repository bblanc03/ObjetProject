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
import model.Livre;
import model.Periodique;
import model.Registre;

public class GestionIOPeriodique {
	Registre registre;
	static Boolean fileRead = false;
	private static String pathFichierWrite = "data/Periodiques.ser";
	static ArrayList<Periodique> toRead = new ArrayList<>();

	// Constructeur prive qui empeche l'instanciation
	private GestionIOPeriodique() {
		throw new UnsupportedOperationException("classe utilitaire - ne peut etre instanciee");
	}

	public static void serealise(ObservableList<Periodique> lstPeriodiques) throws IOException {
		FileOutputStream file = new FileOutputStream(pathFichierWrite);
		ObjectOutputStream out = new ObjectOutputStream(file);
		toRead = new ArrayList<Periodique>();
		for (Periodique periodique : lstPeriodiques) {
			toRead.add(periodique);
		}
		out.writeObject(toRead);

		out.close();
		file.close();
	}

	public static ObservableList<Periodique> chargerFichier(String nomFichier) {

		File written = new File(pathFichierWrite);
		if (written.length() == 0) {
			if (!fileRead) {
				String pathFichierTexte = "/" + Constantes.REPERTOIRE_FICHIERS + "/" + nomFichier;

				ObservableList<Periodique> listePeriodique = FXCollections.observableArrayList();
				System.out.println("GestionIODVD");

				try (InputStream inStream = Periodique.class.getResourceAsStream(pathFichierTexte);
						Scanner lecteur = new Scanner(inStream)) {

					lecteur.useDelimiter(",|\\n");

					while (lecteur.hasNextLine()) {
						String noPer = lecteur.next().trim();
						String titre = lecteur.next().trim();
						String date = lecteur.next().trim();
						int numVol = Integer.parseInt(lecteur.next().trim());
						int numPeriodique = Integer.parseInt(lecteur.next().trim());

						Periodique dvd = new Periodique(noPer, titre, date, numVol, numPeriodique);

						listePeriodique.add(dvd);
					}

				} catch (IOException e) {

					e.printStackTrace();
				}
				return listePeriodique;
			}
		} else {
			try {
				System.out.println("other file Periodiques");
				FileInputStream file = new FileInputStream(pathFichierWrite);
				ObjectInputStream in = new ObjectInputStream(file);
				System.out.println("lecture de fichier");
				toRead = (ArrayList<Periodique>)in.readObject();
				ObservableList<Periodique> listesPeriodiques = FXCollections.observableArrayList();
				
				for(Periodique periodique : toRead) {
					listesPeriodiques.add(periodique);
				}
				
				in.close();
				file.close();
				
				return listesPeriodiques;
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		return null;

	}

	public static void setFileRead() {
		fileRead = true;
	}
}
