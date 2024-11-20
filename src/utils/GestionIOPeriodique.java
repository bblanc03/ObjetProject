package utils;

import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import model.Periodique;

public class GestionIOPeriodique {

	// Constructeur prive qui empeche l'instanciation
			private GestionIOPeriodique() {
				throw new UnsupportedOperationException("classe utilitaire - ne peut etre instanciee");
			}

			public static ObservableList<Periodique> chargerFichier(String nomFichier) {

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
}
