package Dao;

import java.sql.Connection;
import java.util.List;

import FactorySingleton.MyConnexionSingleton;
import Models.Medecins;

public interface MedecinsDao {
	
	 Connection conn= MyConnexionSingleton.getInstance();
	public void addMedecin(Medecins med);
	public List<Medecins> getAllMedecins();
	public Medecins getMedecinById(int id);
	public boolean UpdateMedecin(Medecins med);
	public boolean DeleteMedecin(Medecins  med);
}
