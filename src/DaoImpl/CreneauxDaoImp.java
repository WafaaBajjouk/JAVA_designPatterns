package DaoImpl;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import Dao.CreneauxDao;
import FactorySingleton.MyConnexionSingleton;
import Models.Clients;
import Models.Creneaux;

public class CreneauxDaoImp implements CreneauxDao {

	Connection conn= MyConnexionSingleton.getInstance();

	public void addCreneau(Creneaux creneau) {
		try {

		PreparedStatement stm= conn.prepareStatement("insert into Creneaux (Version, HDebut, MDebut,HFin,MFin, Id_medecin) values (?,?,?,?,?,?);");
		stm.setInt(1,creneau.getVersion());
		stm.setInt(2,creneau.getHdebut());
		stm.setInt(3,creneau.getMdebut());
		stm.setInt(4,creneau.getHfin());
		stm.setInt(5,creneau.getMfin());
		stm.setInt(6,creneau.getId_medecin());

		
		//ajouter a la DB
		
		stm.executeUpdate();
		System.out.println("Creneaux bien ajoute!");
		
	}catch(SQLException e) {
		e.printStackTrace();
	}}
	
	

	@Override
	public List<Creneaux> getAllCreneaux() {
		List<Creneaux> creneaux = new ArrayList<Creneaux>();
		
		
		try {
		
		Statement stm= conn.createStatement();
		
		
		ResultSet res= stm.executeQuery("Select * from Creneaux;");
		
		while(res.next()) {
			int id= res.getInt("ID");
			int v= res.getInt("Version");
			int hd=res.getInt("HDebut");
			int md=res.getInt("MDebut");
			int hf=res.getInt("HFin");
			int mf=res.getInt("MFin");
			int med=res.getInt("Id_medecin");


			
			Creneaux creneau= new Creneaux(id,v,hd,md,hf,mf,med);
			creneaux.add(creneau);
			
		}
		
		}catch(SQLException e) {
			
			
		}
		
		for(int i=0; i<creneaux.size() ; i++) {
		      System.out.println("Le Creneux : "+creneaux.get(i).getiD()+" VERSION : "+creneaux.get(i).getVersion()+
		    		  " HDEBUT "+creneaux.get(i).getHdebut()+" HFIN : "
		    		  +creneaux.get(i).getHfin()+" MDEBUT"+ creneaux.get(i).getMdebut()
		    		  +" MFIN"+creneaux.get(i).getMfin()+" Le Medecin : "
		    		  +creneaux.get(i).getId_medecin());
		}

	return creneaux;	} 

	@Override
	public Creneaux getCreneauById(int id) {
		Creneaux Creneau=null;
		try {
			
			PreparedStatement stm= conn.prepareStatement("Select * from Creneaux where ID="+id+";");
			
			ResultSet res= stm.executeQuery();
			
			
			while(res.next()) {
				
				int idc= res.getInt("ID");
				int v= res.getInt("Version");
				int hd=res.getInt("HDebut");
				int md=res.getInt("MDebut");
				int hf=res.getInt("HFin");
				int mf=res.getInt("MFin");
				int med=res.getInt("Id_medecin");
				
				Creneau= new Creneaux(idc,v,hd,md,hf,mf,med);
				System.out.println("Le Creneaux "+Creneau.getiD()+" Version "+
						Creneau.getVersion()+" HDebut :" +Creneau.getHdebut()+" MDEBUT "+
						Creneau.getHfin()+" MFIN :"+Creneau.getHfin()+
						Creneau.getId_medecin()
						);

			}
			
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
		
		
		return Creneau;
	}

	@Override
	public boolean UpdateCreneau(Creneaux Creneau) {
		int id=Creneau.getiD();
		
		String sql=("UPDATE Creneaux SET VERSION=? , hdebut=? , mdebut=? , hfin=? , mfin=? , id_medecin=? WHERE ID="+id+";");
		
		try {
			
			PreparedStatement stm= conn.prepareStatement(sql);
			
			stm.setInt(1,Creneau.getVersion());
			stm.setInt(2,Creneau.getHdebut());
			stm.setInt(3,Creneau.getMdebut());
			stm.setInt(4,Creneau.getHfin());
			stm.setInt(4,Creneau.getMfin());
			stm.setInt(4,Creneau.getId_medecin());
			stm.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return true;	}

	@Override
	public boolean DeleteCreneau(Creneaux Creneau) {
		
        int id=Creneau.getiD();
		
		String sql=("DELETE FROM Creneaux WHERE ID="+id+";");
		
		try {
			
			PreparedStatement stm= conn.prepareStatement(sql);
			stm.executeUpdate();
			System.out.println("Creneaux bien supprimme");
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return false;
	}
}
