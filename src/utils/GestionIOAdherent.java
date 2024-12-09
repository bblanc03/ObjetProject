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
import model.Adherent;
import model.DVD;
import model.Prepose;
import model.Registre;

public class GestionIOAdherent {
	

	static ArrayList<Adherent> toRead = new ArrayList<>();
	static ObservableList<Adherent> listesAdherents = FXCollections.observableArrayList();
	private static String pathFichierWrite = "data/Adherents.ser";
	static Registre registre = Registre.getInstance();

	
	public static void serealise(ObservableList<Adherent> lstAdherent) throws IOException {
		FileOutputStream file = new FileOutputStream(pathFichierWrite);
		ObjectOutputStream out = new ObjectOutputStream(file);
		toRead = new ArrayList<Adherent>();
		for (Adherent adherent : lstAdherent) {
			toRead.add(adherent);
		}
		out.writeObject(toRead);

		out.close();
		file.close();
	}
	
	public static ObservableList<Adherent> chargerFichier(String nomFichier){
		File written = new File(pathFichierWrite);
		if(written.length() > 0) {
			try {
				FileInputStream file = new FileInputStream(pathFichierWrite);
				ObjectInputStream in = new ObjectInputStream(file);
				toRead = (ArrayList<Adherent>)in.readObject();
				
				//for(Adherent adherent : toRead) {
					
					listesAdherents.addAll(toRead);
				//}
				
				in.close();
				file.close();
				
				return listesAdherents;
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return listesAdherents;
	}


}
