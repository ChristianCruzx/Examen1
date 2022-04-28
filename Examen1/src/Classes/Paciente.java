package Classes;

public class Paciente {
	
	private final String nombre; //inmutable
	private final int edad; //inmutable
	private final int temperatura; //inmutable
	private final boolean vomito; //inmutable
	
	
	Paciente (String nom,int edad, int temp, boolean vomito){
		this.nombre=nom;
		this.edad=edad;
		this.temperatura= temp;
		this.vomito=vomito;
		
	}
	
	
	public boolean isVomito() {
		return vomito;
	}

	public int getTemperatura() {
		return temperatura;
	}

	public int getEdad() {
		return edad;
	}

	public String getNombre() {
		return nombre;
	}
	
	
	
	
	
	
	
	
	

}
