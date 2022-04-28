package Hospital;

import java.util.List;

import Paciente.Paciente;

public  class HospitalNicoya extends OMS {
	private List<Paciente> listPacientes;
	
	public HospitalNicoya(List<Paciente> pacientes){
		     super(pacientes);
			this.listPacientes=pacientes;
			
		}

	@Override
	protected boolean isGamHospital() { //Sobreescritura de metodos
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	protected Hospital getNombreHospital() { //Sobreescritura de metodos
		// TODO Auto-generated method stub
		return Hospital.NICOYA;
	}
	
	
	
	

}
