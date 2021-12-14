package DaoImpl;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import Dao.ClientDao;
import FactorySingleton.MyConnexionSingleton;
import Models.Clients;



public class ClientDaoImp implements ClientDao {
	
	Connection conn= new MyConnexionSingleton().getInstance();


	public void addClient(Clients client) {
		try {
			
			
		
		//cree une requete sql

		PreparedStatement stm= conn.prepareStatement("insert into clients (Version, Titre , Nom, Prenom ) values (?,?,?,?);");
//		stm.setInt(1,client.getId());
		stm.setInt(1,client.getVersion());
		stm.setString(2,client.getTitre());
		stm.setString(3,client.getNom());
		stm.setString(4,client.getPrenom());
		
		//ajouter a la DB
		
		stm.executeUpdate();
		System.out.println("Client bien ajoute!");
		
	}catch(SQLException e) {
		e.printStackTrace();
	}}

	
	public Clients getClientById(int id) {
		Clients client=null;
		try {
			
			PreparedStatement stm= conn.prepareStatement("Select * from clients where ID="+id+";");
			
			ResultSet res= stm.executeQuery();
			
			
			while(res.next()) {
//				client.setVersion(res.getInt("Version"));
//				client.setTitre(res.getString("Titre"));
//				client.setTitre(res.getString("Nom"));
//				client.setTitre(res.getString("Prenom"));
				int v= res.getInt("Version");
				String n=res.getString("Nom");
				String p=res.getString("Prenom");
				String t=res.getString("Titre");
				client= new Clients(id,v,t,n,p);
				System.out.println("La Version = "+v+" Le tire = "+t+" Le nom="+n+ " Le prenom "+p);

			}
			
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
		
		
		return client;
		
	}
	
	public List<Clients> getAllClients(){
		
		
		List<Clients> clients = new ArrayList<Clients>();
		
		
			try {
			
			Statement stm= conn.createStatement();
			
			
			ResultSet res= stm.executeQuery("Select * from clients;");
			
			while(res.next()) {
				int id= res.getInt("ID");

				int v= res.getInt("Version");
				String n=res.getString("Nom");
				String p=res.getString("Prenom");
				String t=res.getString("Titre");
				
				Clients client= new Clients(id,v,t,n,p);
				clients.add(client);
				
			}
			
			}catch(SQLException e) {
				
				
			}
			
			for(int i=0; i<clients.size() ; i++) {
			      System.out.println("Le Client "+clients.get(i).getId()+ ": La Version : "+clients.get(i).getVersion()+
			      " Le Nom Complet :"+clients.get(i).getNom()+" "+
			      clients.get(i).getPrenom()+" Le Titre: "+clients.get(i).getTitre());
			}

		return clients;
		
	}
	
	public boolean UpdateClient(Clients client){
		
		int id=client.getId();
		
		String sql=("UPDATE CLIENTS SET VERSION=? , TITRE=? , NOM=? , PRENOM=? WHERE ID="+id+";");
		
		try {
			
			PreparedStatement stm= conn.prepareStatement(sql);
			
			stm.setInt(1,client.getVersion());
			stm.setString(2,client.getTitre());
			stm.setString(3,client.getNom());
			stm.setString(4,client.getPrenom());
			
			stm.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
		
	}
	
public boolean DeleteClient(Clients client){
		
		int id=client.getId();
		
		String sql=("DELETE FROM CLIENTS WHERE ID="+id+";");
		
		try {
			
			PreparedStatement stm= conn.prepareStatement(sql);
			stm.executeUpdate();
			System.out.println("Client bien supprimme");
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return true;
		
	}
	
	
	
	
	}

	
