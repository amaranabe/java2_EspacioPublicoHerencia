package java2_HerenciaEspacioPublico;

public class EspacioPublico {

	public EspacioPublico() {
		
	}
	
	private String nombreespacio;
	private int superficieespacio;
	String funcion;
	
	public void setNombreEspacio(String idnomespacio) {
		this.nombreespacio=idnomespacio;
	}
	
	public String getNombreEspacio() {
		return this.nombreespacio;
	}
	
	public void setSupEspacio(int idsuperficie) {
		this.superficieespacio=idsuperficie;
	}
	public int getSupEspacio (){
		return this.superficieespacio;
	}
	public void setFuncion (String idfuncion) {
		this.funcion=idfuncion;
	}
	
	public String getFuncion() {
		return funcion;
	}
}
