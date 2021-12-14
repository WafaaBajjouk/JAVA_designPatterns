package FactorySingleton;

import java.sql.Connection;

import Dao.ClientDao;
import DaoImpl.ClientDaoImp;

public class FactoryDao {
	
	 Connection conn= new MyConnexionSingleton().getInstance();
	
	 public static ClientDao getClientDAO(){
		    return new ClientDaoImp();
		  }
	 
	 

}
