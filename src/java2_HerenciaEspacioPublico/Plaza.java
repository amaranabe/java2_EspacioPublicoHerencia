package java2_HerenciaEspacioPublico;

public class Plaza extends EspacioPublico{

	public Plaza() {
		
	}
	
	private int numbancos;
	private boolean fuente;//si tiene fuente o no
	
	public void setNumbancos (int idnumbancos) {
		this.numbancos=idnumbancos;
	}
	
	public int getNumbancos () {
		return numbancos;
	}
	
	public void setFuente (boolean idfuente) {
		this.fuente=idfuente;
	}
	
	public boolean getFuente() {
		return fuente;
	}
	
}
