package zadaca9;
import java.util.ArrayList;
import java.util.List;

public class fakultet {

	private String imeNaFakultetot;
	private int brojNaSmerovi;
	private int studenti;
	public fakultet(String imeNaFakultetot, int brojNaSmerovi, int studenti) {
		this.imeNaFakultetot=imeNaFakultetot;
		this.brojNaSmerovi=brojNaSmerovi;
		this.studenti=studenti;
		
	}
	public String getIme() {
		return imeNaFakultetot;
	}
	public void setIme(String imeNaFakultetot) {
		this.imeNaFakultetot = imeNaFakultetot;
	}
	public int getSmer() {
		return brojNaSmerovi;
	}
	public void setSmer(int brojNaSmerovi) {
		this.brojNaSmerovi = brojNaSmerovi;
	}
	public int getStudenti() {
		return studenti;
	}
	public void setIme(int studenti) {
		this.studenti = studenti;
	}
	
}
