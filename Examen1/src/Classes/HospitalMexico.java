package Classes;

import java.util.List;

public class HospitalMexico extends OMS {
	
	private List<Paciente> listPacientes;
	
	HospitalMexico(List<Paciente> pacientes){
		super(pacientes);
		this.listPacientes=pacientes;
	}

	@Override
	protected boolean isGamHospital() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	protected Hospital getNombreHospital() {
		// TODO Auto-generated method stub
		return Hospital.MEXICO;
	}

}
