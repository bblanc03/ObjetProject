package utils;

import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import model.DVD;

public class GestionIODVD {

	// Constructeur prive qui empeche l'instanciation
		private GestionIODVD() {
			throw new UnsupportedOperationException("classe utilitaire - ne peut etre instanciee");
		}

		public static ObservableList<DVD> chargerFichier(String nomFichier) {

			String pathFichierTexte = "/" + Constantes.REPERTOIRE_FICHIERS + "/" + nomFichier;

			ObservableList<DVD> listeDVD = FXCollections.observableArrayList();
			System.out.println("GestionIODVD");

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
}
