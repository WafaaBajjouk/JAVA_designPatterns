package FactorySingleton;

import java.util.Scanner;

import Dao.RvDao;
import Models.Rv;


public class RvMain {
	public static void main(String[] args){
		
		
		
		   Scanner sc = new Scanner(System.in);
		
			System.out.println("Gestion des Rendez vous:");
			RvDao rdao= new FactoryDao().getRvDAO();
			Rv rv= new Rv();
//
			System.out.println("------------------------------------------");
			System.out.println("Affichage des Rendez vous:");
			
			rdao.getAllRvs();
			
			System.out.println("------------------------------------------");
			System.out.println("Ajout D'un nouveau Rendez vous :");
			
			
			System.out.println("Donnez le Jours");
			String jour=sc.nextLine();
			rv.setJour((jour));

			System.out.println("Donnez l'Id du client");
			int Idc=sc.nextInt();
			rv.setId_Client(Idc);
			
			System.out.println("Donnez l'Id du Creneaux");
			int Idcr=sc.nextInt();
			rv.setId_Client(Idcr);
		
			
		
			rdao.addRv(rv);
			System.out.println("------------------------------------------");
			System.out.println("Affichage des Rendez vous :");
			
			rdao.getAllRvs();
			
			System.out.println("------------------------------------------");
			System.out.println("recherche d'un Rendez vous :");
			
			System.out.println("Donnez L'id du Rendez vous");
			int id=sc.nextInt();
			rdao.getRvById(id);
			
			System.out.println("------------------------------------------");
			System.out.println("Modifier un Rendez vous :");
			Rv clientM= new Rv();

			System.out.println("Donnez L'id du Rendez vous que vous voulez modifier");
			int idm=sc.nextInt();
			rdao.getRvById(idm);
			
			
			System.out.println("Donnez le Jours");
			String joumr=sc.nextLine();
			rv.setJour((jour));

			System.out.println("Donnez l'Id du client");
			int Idcm=sc.nextInt();
			rv.setId_Client(Idcm);
			
			System.out.println("Donnez l'Id du Creneaux");
			int Idcrm=sc.nextInt();
			rv.setId_Client(Idcrm);
			
			System.out.println("------------------------------------------");
			System.out.println("supprimmer un Rendez vous :");
		

			System.out.println("Donnez L'id du Rendez vous que vous voulez supprimmer");
			int ids=sc.nextInt();
			
			rdao.DeleteRv(rdao.getRvById(ids));

		
			
			
	}


}
