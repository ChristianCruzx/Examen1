package Classes;

import java.util.List;

public  class HospitalNicoya extends OMS {
	private List<Paciente> listPacientes;
	
	HospitalNicoya(List<Paciente> pacientes){
		     super(pacientes);
			this.listPacientes=pacientes;
			
		}

	@Override
	protected boolean isGamHospital() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	protected Hospital getNombreHospital() {
		// TODO Auto-generated method stub
		return null;
	}

}
