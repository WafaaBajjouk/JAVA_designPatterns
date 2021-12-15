package Models;

import java.sql.Date;

public class Rv {
	private int id;
	private String jour;
	private int id_Client;
	private int id_Creneaux;
	
	public Rv(int id, String jour, int id_Client, int id_Creneaux) {
		this.id = id;
		this.jour = jour;
		this.id_Client = id_Client;
		this.id_Creneaux = id_Creneaux;
	}

	public Rv() {
		
	}
	public int getId() {
		return id;
	}

	public String getJour() {
		return jour;
	}

	public int getId_Client() {
		return id_Client;
	}

	public int getId_Creneaux() {
		return id_Creneaux;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setJour(String jour2) {
		this.jour = jour2;
	}

	public void setId_Client(int id_Client) {
		this.id_Client = id_Client;
	}

	public void setId_Creneaux(int id_Creneaux) {
		this.id_Creneaux = id_Creneaux;
	}

	@Override
	public String toString() {
		return "Rv [id=" + id + ", jour=" + jour + ", id_Client=" + id_Client + ", id_Creneaux=" + id_Creneaux + "]";
	}
	
	
	
	
	
}
