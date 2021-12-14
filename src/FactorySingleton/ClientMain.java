package FactorySingleton;

import Dao.ClientDao;
import DaoImpl.ClientDaoImp;
import Models.Clients;
import java.util.Scanner;

public class ClientMain {

	public static void main(String[] args){
		
		
		
		   Scanner sc = new Scanner(System.in);
		
			System.out.println("Gestion des Clients:");
			ClientDao Cdao= new FactoryDao().getClientDAO();
			Clients client= new Clients();
//
//			System.out.println("------------------------------------------");
//			System.out.println("Affichage des clients :");
//			
//			Cdao.getAllClients();
//			
//			System.out.println("------------------------------------------");
//			System.out.println("Ajout D'un nouveau client :");
//			
//			
//			System.out.println("Donnez la Version");
//			String version=sc.nextLine();
//			client.setVersion(Integer.parseInt(version));
//
//			System.out.println("Donnez le Titre");
//			String titre=sc.nextLine();
//			client.setTitre(titre);
//		
//			System.out.println("Donnez le Nom"); 
//			String nom=sc.nextLine();
//			client.setNom(nom);
//			
//			System.out.println("Donnez le Prenom");	
//			String prenom=sc.nextLine();
//			client.setPrenom(prenom);
//		
//			Cdao.addClient(client);
//			System.out.println("------------------------------------------");
//			System.out.println("Affichage des clients :");
//			
//			Cdao.getAllClients();
//			
//			System.out.println("------------------------------------------");
//			System.out.println("recherche d'un client :");
//			
//			System.out.println("Donnez L'id du client");
//			int id=sc.nextInt();
//			Cdao.getClientById(id);
//			
//			System.out.println("------------------------------------------");
//			System.out.println("Modifier un client :");
//			Clients clientM= new Clients();
//
//			System.out.println("Donnez L'id du client que vous voulez modifier");
//			int idm=sc.nextInt();
//			Cdao.getClientById(idm);
//			
//			
//			System.out.println("Donnez la Version");
//			int versionm=sc.nextInt();
//			clientM.setVersion((versionm));
//
//			System.out.println("Donnez le Titre");
//			String titrem=sc.nextLine();
//			clientM.setTitre(titrem);
//		
//			System.out.println("Donnez le Nom"); 
//			String nomm=sc.nextLine();
//			clientM.setNom(nomm);
//			
//			System.out.println("Donnez le Prenom");	
//			String prenomm=sc.nextLine();
//			clientM.setPrenom(prenomm);
//			
//			Cdao.UpdateClient(clientM);
//			Cdao.getClientById(idm);
//			
			System.out.println("------------------------------------------");
			System.out.println("supprimmer un client :");
		

			System.out.println("Donnez L'id du client que vous voulez supprimmer");
			int ids=sc.nextInt();
			
			Cdao.DeleteClient(Cdao.getClientById(ids));

		
			//=================================================================
			
			


		
	}
}
