package Pruebas;

import Paciente.Paciente;

public final class PruebaRapida implements PruebaCovid19 { //Classe Inmutable(pero no 100% por que sus atributos no lo son)
	
	private  Paciente paciente; 
	
	public PruebaRapida(Paciente paciente){  //Inyeccion de dependencias
		this.paciente=paciente;//Composicion 
	}

	public Paciente getPaciente() {
		return paciente;
	}

	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}
	
	public boolean isPositiveCase() { 
		if(this.paciente.getTemperatura()>=37 && this.paciente.getEdad()>=60 ) {
           return  true;
		} else return false;
	}
	
	public String  getNombrePaciente() {
		return this.paciente.getNombre();
	}
	
	
}
