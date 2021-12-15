package Dao;

import java.sql.Connection;
import java.util.List;

import FactorySingleton.MyConnexionSingleton;
import Models.Creneaux;

public interface CreneauxDao {

	
	Connection conn= MyConnexionSingleton.getInstance();
	public void addCreneau(Creneaux Creneau);
	public List<Creneaux> getAllCreneaux();
	public Creneaux getCreneauById(int id);
	public boolean UpdateCreneau(Creneaux Creneau);
	public boolean DeleteCreneau(Creneaux Creneau);
}
