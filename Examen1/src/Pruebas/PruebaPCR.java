package Pruebas;

import Classes.Paciente;

public final class PruebaPCR implements PruebaCovid19{
	
	private Paciente paciente;

	PruebaPCR(Paciente paciente) { //composicion
		this.setPaciente(paciente);
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
