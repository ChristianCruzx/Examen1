package Pruebas;

import Paciente.Paciente;

public final class PruebaPCR implements PruebaCovid19{ //Classe Inmutable(pero no 100% por que sus atributos no lo son)
	
	private Paciente paciente;

	public PruebaPCR(Paciente paciente) {   //Inyeccion de dependencias
		this.paciente=paciente; //composicion 
	}

	
	@Override
	public boolean isPositiveCase() {
		
		return paciente.getTemperatura()>=39 && paciente.isVomito();
	}

	@Override
	public String getNombrePaciente() {
		
		return this.paciente.getNombre();
	}


	public Paciente getPaciente() {
		return paciente;
	}


	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}

}
