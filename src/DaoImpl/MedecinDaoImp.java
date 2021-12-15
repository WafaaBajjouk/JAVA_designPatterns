package DaoImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import Dao.MedecinsDao;
import FactorySingleton.MyConnexionSingleton;
import Models.Medecins;

public class MedecinDaoImp implements MedecinsDao{

	 Connection conn= MyConnexionSingleton.getInstance();

	public void addMedecin(Medecins Medecin) {
		try {
			
		
		//cree une requete sql

		PreparedStatement stm= conn.prepareStatement("insert into Medecins (Version, Titre , Nom, Prenom ) values (?,?,?,?);");
//		stm.setInt(1,Medecin.getId());
		stm.setInt(1,Medecin.getVersion());
		stm.setString(2,Medecin.getTitre());
		stm.setString(3,Medecin.getNom());
		stm.setString(4,Medecin.getPrenom());
		
		//ajouter a la DB
		
		stm.executeUpdate();
		System.out.println("Medecin bien ajoute!");
		
	}catch(SQLException e) {
		e.printStackTrace();
	}}

	
	public Medecins getMedecinById(int id) {
		Medecins Medecin=null;
		try {
			
			PreparedStatement stm= conn.prepareStatement("Select * from Medecins where ID="+id+";");
			
			ResultSet res= stm.executeQuery();
			
			
			while(res.next()) {
//				Medecin.setVersion(res.getInt("Version"));
//				Medecin.setTitre(res.getString("Titre"));
//				Medecin.setTitre(res.getString("Nom"));
//				Medecin.setTitre(res.getString("Prenom"));
				int v= res.getInt("Version");
				String n=res.getString("Nom");
				String p=res.getString("Prenom");
				String t=res.getString("Titre");
				Medecin= new Medecins(id,v,t,n,p);
				System.out.println("La Version = "+v+" Le tire = "+t+" Le nom="+n+ " Le prenom "+p);

			}
			
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
		
		
		return Medecin;
		
	}
	
	public List<Medecins> getAllMedecins(){
		
		
		List<Medecins> Medecins = new ArrayList<Medecins>();
		
		
			try {
			
			Statement stm= conn.createStatement();
			
			
			ResultSet res= stm.executeQuery("Select * from Medecins;");
			
			while(res.next()) {
				int id= res.getInt("ID");

				int v= res.getInt("Version");
				String n=res.getString("Nom");
				String p=res.getString("Prenom");
				String t=res.getString("Titre");
				
				Medecins Medecin= new Medecins(id,v,t,n,p);
				Medecins.add(Medecin);
				
			}
			
			}catch(SQLException e) {
				
				
			}
			
			for(int i=0; i<Medecins.size() ; i++) {
			      System.out.println("Le Medecin "+Medecins.get(i).getId()+ ": La Version : "+Medecins.get(i).getVersion()+
			      " Le Nom Complet :"+Medecins.get(i).getNom()+" "+
			      Medecins.get(i).getPrenom()+" Le Titre: "+Medecins.get(i).getTitre());
			}

		return Medecins;
		
	}
	
	public boolean UpdateMedecin(Medecins Medecin){
		
		int id=Medecin.getId();
		
		String sql=("UPDATE Medecins SET VERSION=? , TITRE=? , NOM=? , PRENOM=? WHERE ID="+id+";");
		
		try {
			
			PreparedStatement stm= conn.prepareStatement(sql);
			
			stm.setInt(1,Medecin.getVersion());
			stm.setString(2,Medecin.getTitre());
			stm.setString(3,Medecin.getNom());
			stm.setString(4,Medecin.getPrenom());
			
			stm.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
		
	}
	
public boolean DeleteMedecin(Medecins Medecin){
		
		int id=Medecin.getId();
		
		String sql=("DELETE FROM Medecins WHERE ID="+id+";");
		
		try {
			
			PreparedStatement stm= conn.prepareStatement(sql);
			stm.executeUpdate();
			System.out.println("Medecin bien supprimme");
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return true;
		
	}
	
	
	
	
}
