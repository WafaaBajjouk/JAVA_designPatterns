package FactorySingleton;

import java.util.Scanner;

import Dao.MedecinsDao;
import Models.Medecins;

public class MedecinMain {
	public static void main(String[] args){
		
		
		
		   Scanner sc = new Scanner(System.in);
		
			System.out.println("Gestion des Medecins:");
			MedecinsDao Cdao= new FactoryDao().getMedecinDAO();
			Medecins Medecin= new Medecins();

			System.out.println("------------------------------------------");
			System.out.println("Affichage des Medecins :");
			
			Cdao.getAllMedecins();
			
			System.out.println("------------------------------------------");
			System.out.println("Ajout D'un nouveau Medecin :");
			
			
			System.out.println("Donnez la Version");
			String version=sc.nextLine();
			Medecin.setVersion(Integer.parseInt(version));

			System.out.println("Donnez le Titre");
			String titre=sc.nextLine();
			Medecin.setTitre(titre);
		
			System.out.println("Donnez le Nom"); 
			String nom=sc.nextLine();
			Medecin.setNom(nom);
			
			System.out.println("Donnez le Prenom");	
			String prenom=sc.nextLine();
			Medecin.setPrenom(prenom);
		
			Cdao.addMedecin(Medecin);
			System.out.println("------------------------------------------");
			System.out.println("Affichage des Medecins :");
			
			Cdao.getAllMedecins();
			
			System.out.println("------------------------------------------");
			System.out.println("recherche d'un Medecin :");
			
			System.out.println("Donnez L'id du Medecin");
			int id=sc.nextInt();
			Cdao.getMedecinById(id);
			
			System.out.println("------------------------------------------");
			System.out.println("Modifier un Medecin :");
			Medecins MedecinM= new Medecins();

			System.out.println("Donnez L'id du Medecin que vous voulez modifier");
			int idm=sc.nextInt();
			Cdao.getMedecinById(idm);
			
			
			System.out.println("Donnez la Version");
			int versionm=sc.nextInt();
			MedecinM.setVersion((versionm));

			System.out.println("Donnez le Titre");
			String titrem=sc.nextLine();
			MedecinM.setTitre(titrem);
		
			System.out.println("Donnez le Nom"); 
			String nomm=sc.nextLine();
			MedecinM.setNom(nomm);
			
			System.out.println("Donnez le Prenom");	
			String prenomm=sc.nextLine();
			MedecinM.setPrenom(prenomm);
			
			Cdao.UpdateMedecin(MedecinM);
			Cdao.getMedecinById(idm);
			
			System.out.println("------------------------------------------");
			System.out.println("supprimmer un Medecin :");
		

			System.out.println("Donnez L'id du Medecin que vous voulez supprimmer");
			int ids=sc.nextInt();
			
			Cdao.DeleteMedecin(Cdao.getMedecinById(ids));
 

}
}
