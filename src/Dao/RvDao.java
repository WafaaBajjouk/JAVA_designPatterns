package Dao;

import java.sql.Connection;
import java.util.List;

import FactorySingleton.MyConnexionSingleton;
import Models.Rv;

public interface RvDao {
	 Connection conn= MyConnexionSingleton.getInstance();
		public void addRv(Rv rv);
		public List<Rv> getAllRvs();
		public Rv getRvById(int id);
		public boolean UpdateRv(Rv rv);
		public boolean DeleteRv(Rv  rv);
}
