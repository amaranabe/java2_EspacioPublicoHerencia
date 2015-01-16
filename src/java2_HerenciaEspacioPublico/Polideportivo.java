package java2_HerenciaEspacioPublico;

public class Polideportivo extends EspacioPublico {
	
	public Polideportivo() {
		
	}
	
	private String nombre;
	private int numactividad;
	
	public void setNombre (String idnombre){
		this.nombre=idnombre;
	}
	
	public String getNombre () {
		return this.nombre;
	}
	
	public void setNumActividad (int idnumero) {
		this.numactividad=idnumero;
	}
	
	public int getNumactividad() {
		return this.numactividad;
	}
}
