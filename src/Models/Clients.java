package Models;

public class Clients {
	private int id;
	private int version;
	private String titre;
	private String nom;
	private String prenom;
	
	public Clients( int id,int version, String titre, String nom, String prenom) {
		this.id = id;
		this.version = version;
		this.titre = titre;
		this.nom = nom;
		this.prenom = prenom;
	}
	 
	public Clients() {
	}

	public int getId() {
		return id;
	}
	public int getVersion() {
		return version;
	}
	public String getTitre() {
		return titre;
	}
	public String getNom() {
		return nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setVersion(int version) {
		this.version = version;
	}
	public void setTitre(String titre) {
		this.titre = titre;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String toString( Clients client) {
		return "Clients [id=" + id + ", version=" + version + ", titre=" + titre + ", nom=" +nom + ", prenom=" + prenom
				+ "]";
	}
	
	
}
