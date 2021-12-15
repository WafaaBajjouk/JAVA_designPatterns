package FactorySingleton;

import java.util.Scanner;


import Dao.CreneauxDao;
import Models.Creneaux;


public class CreneauxMain {

	public static void main(String[] args){
		
		
		
		   Scanner sc = new Scanner(System.in);
		
			System.out.println("Gestion des Creneaux:");
			CreneauxDao Cdao= new FactoryDao().getCreaneauxDAO();
			Creneaux creneau= new Creneaux();

			System.out.println("------------------------------------------");
			System.out.println("Affichage des Creneaux :");
			
			Cdao.getAllCreneaux();
			
			System.out.println("------------------------------------------");
			System.out.println("Ajout D'un nouveau Creneaux :");
			
			
			System.out.println("Donnez la Version");
			int version=sc.nextInt();
			creneau.setVersion(version);
			
			System.out.println("Donnez la HDEBUT");
			int hd=sc.nextInt();
			creneau.setHdebut(hd);
			
			System.out.println("Donnez la MDEBUT");
			int md=sc.nextInt();
			creneau.setMdebut(md);
			
			System.out.println("Donnez la HFIN");
			int hf=sc.nextInt();
			creneau.setHfin(hf);
			
			System.out.println("Donnez la MFIN");
			int mf=sc.nextInt();
			creneau.setMfin(mf);
			
			System.out.println("Donnez l'ID de Medecin");
			int med=sc.nextInt();
			creneau.setId_medecin(med);
			

			Cdao.addCreneau(creneau);
			System.out.println("------------------------------------------");
			System.out.println("Affichage des Creneaux :");
			
			Cdao.getAllCreneaux();
			
			
			System.out.println("------------------------------------------");
			System.out.println("recherche d'un Creneaux :");
			
			System.out.println("Donnez L'id du Creneaux");
			int id=sc.nextInt();
			Cdao.getCreneauById(id);
			
			System.out.println("------------------------------------------");
			System.out.println("Modifier un Creneau :");
			Creneaux CreneauxM= new Creneaux();

			System.out.println("Donnez L'id du Creneau que vous voulez modifier");
			int idm=sc.nextInt();
			Cdao.getCreneauById(idm);
			
			
			System.out.println("Donnez la Version");
			int versionm=sc.nextInt();
			creneau.setVersion(versionm);
			
			System.out.println("Donnez la HDEBUT");
			int hdm=sc.nextInt();
			creneau.setHdebut(hdm);
			
			System.out.println("Donnez la MDEBUT");
			int mdm=sc.nextInt();
			creneau.setMdebut(mdm);
			
			System.out.println("Donnez la HFIN");
			int hfm=sc.nextInt();
			creneau.setHfin(hfm);
			
			System.out.println("Donnez la MFIN");
			int mfm=sc.nextInt();
			creneau.setMfin(mfm);
			
			System.out.println("Donnez l'ID de Medecin");
			int medm=sc.nextInt();
			creneau.setId_medecin(medm);
			
			System.out.println("------------------------------------------");
			System.out.println("supprimmer un Creneau :");
		

			System.out.println("Donnez L'id du Creneau que vous voulez supprimmer");
			int ids=sc.nextInt();
			
			Cdao.DeleteCreneau(Cdao.getCreneauById(ids));

			
}
}
