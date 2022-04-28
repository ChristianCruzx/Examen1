package Classes;

public final class PruebaRapida implements PruebaCovid19 {
	
	private  Paciente paciente;
	
	PruebaRapida(Paciente paciente){
		this.setPaciente(paciente);
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
