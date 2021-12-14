package Models;

public class Creneaux {

	private int iD;
	private int version;
	private int hdebut;
	private int mdebut;
	private int hfin;
	private int mfin;
	private int id_medecin;

	
	public Creneaux(int iD, int version, int hdebut, int mdebut, int hfin, int mfin, int id_medecin) {
		this.iD = iD;
		this.version = version;
		this.hdebut = hdebut;
		this.mdebut = mdebut;
		this.hfin = hfin;
		this.mfin = mfin;
		this.id_medecin = id_medecin;
	}
	
	public int getiD() {
		return iD;
	}
	public int getVersion() {
		return version;
	}
	public int getHdebut() {
		return hdebut;
	}
	public int getMdebut() {
		return mdebut;
	}
	public int getHfin() {
		return hfin;
	}
	public int getMfin() {
		return mfin;
	}
	public int getId_medecin() {
		return id_medecin;
	}
	public void setiD(int iD) {
		this.iD = iD;
	}
	public void setVersion(int version) {
		this.version = version;
	}
	public void setHdebut(int hdebut) {
		this.hdebut = hdebut;
	}
	public void setMdebut(int mdebut) {
		this.mdebut = mdebut;
	}
	public void setHfin(int hfin) {
		this.hfin = hfin;
	}
	public void setMfin(int mfin) {
		this.mfin = mfin;
	}
	public void setId_medecin(int id_medecin) {
		this.id_medecin = id_medecin;
	}

	@Override
	public String toString() {
		return "Creneaux [iD=" + iD + ", version=" + version + ", hdebut=" + hdebut + ", mdebut=" + mdebut + ", hfin="
				+ hfin + ", mfin=" + mfin + ", id_medecin=" + id_medecin + "]";
	}
	
	
	
}
