package Dao;

import java.sql.Connection;
import java.util.List;

import FactorySingleton.MyConnexionSingleton;
import Models.Clients;

public interface ClientDao {
	
	  
	Connection conn= new MyConnexionSingleton().getInstance();

	public void addClient(Clients client);
	public List<Clients> getAllClients();
	public Clients getClientById(int id);
	public boolean UpdateClient(Clients client);
	public boolean DeleteClient(Clients client);
}
