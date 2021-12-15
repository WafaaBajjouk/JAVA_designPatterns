package DaoImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import Dao.RvDao;
import FactorySingleton.MyConnexionSingleton;
import Models.Rv;


public class RvDaoImp implements RvDao{

	@Override
	public void addRv(Rv rv) {
	
		try {
			
			
			//cree une requete sql

			PreparedStatement stm= conn.prepareStatement("insert into rv (jour , ID_Client, ID_Creneaux ) values (?,?,?);");
			stm.setString(1,rv.getJour());
			stm.setInt(2,rv.getId_Client());
			stm.setInt(2,rv.getId_Creneaux());

			
			
			//ajouter a la DB
			
			stm.executeUpdate();
			System.out.println("Rendez Vous bien ajoute!");
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public List<Rv> getAllRvs() {
return null;
	}

	@Override
	public Rv getRvById(int id) {
		Rv rv=null;
		try {
			
			PreparedStatement stm= conn.prepareStatement("Select * from rv where ID="+id+";");
			
			ResultSet res= stm.executeQuery();
			
			
			while(res.next()) {
				int idr=res.getInt("id");

				String j=res.getString("Jour");
				int c=res.getInt("id_Client");
				int cr=res.getInt("Id_Creneaux");
		
				rv= new Rv(id,j,c,cr);
				System.out.println("Le Rendez vous  = "+idr+" Le Jour = "+j+" Le client="+c+ " Le creneaux "+cr);

			}
			
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
	
		return rv;
	}

	@Override
	public boolean UpdateRv(Rv rv) {
		
			int id=rv.getId();
		
		String sql=("UPDATE rv SET id=? , jour=? , id_client=? , id_creneaux=? WHERE ID="+id+";");
		
		try {
			
			PreparedStatement stm= conn.prepareStatement(sql);
			
			stm.setInt(1,rv.getId());
			stm.setString(2,rv.getJour());
			stm.setInt(3,rv.getId_Client());
			stm.setInt(4,rv.getId_Creneaux());


		
			stm.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return true;	
	}

	@Override
	public boolean DeleteRv(Rv rv) {
     int id=rv.getId();
		
		String sql=("DELETE FROM rv WHERE ID="+id+";");
		
		try {
			
			PreparedStatement stm= conn.prepareStatement(sql);
			stm.executeUpdate();
			System.out.println("Rendez Vous bien supprimme");
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return true;
		
	}

	
}
