package FactorySingleton;

import java.sql.Connection;


import Dao.ClientDao;
import Dao.CreneauxDao;
import Dao.MedecinsDao;
import Dao.RvDao;
import DaoImpl.ClientDaoImp;
import DaoImpl.CreneauxDaoImp;
import DaoImpl.MedecinDaoImp;
import DaoImpl.RvDaoImp;

public class FactoryDao {
	
	 Connection conn= MyConnexionSingleton.getInstance();
	
	 public static ClientDao getClientDAO(){
		    return new ClientDaoImp();
		  }
	 
	 public static MedecinsDao getMedecinDAO(){
		    return new MedecinDaoImp();
		  }
	 
	 public static CreneauxDao getCreaneauxDAO(){
		    return new CreneauxDaoImp();
		  }
	 
	 public static RvDao getRvDAO(){
		    return new RvDaoImp();
		  }

}
