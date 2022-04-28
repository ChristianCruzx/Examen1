package Hospital;

import java.util.List;

import Classes.Paciente;

public class HospitalMexico extends OMS {
	
	private List<Paciente> listPacientes;
	
	HospitalMexico(List<Paciente> pacientes){
		super(pacientes);
		this.listPacientes=pacientes;
	}

	@Override
	protected boolean isGamHospital() {  //Sobreescritura de metodos
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	protected Hospital getNombreHospital() { //Sobreescritura de metodos
		// TODO Auto-generated method stub
		return Hospital.MEXICO;
	}

}
