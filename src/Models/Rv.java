package Models;

import java.sql.Date;

public class Rv {
	private int id;
	private Date jour;
	private int id_Client;
	private int id_Creneaux;
	
	public Rv(int id, Date jour, int id_Client, int id_Creneaux) {
		this.id = id;
		this.jour = jour;
		this.id_Client = id_Client;
		this.id_Creneaux = id_Creneaux;
	}

	public int getId() {
		return id;
	}

	public Date getJour() {
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

	public void setJour(Date jour) {
		this.jour = jour;
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
