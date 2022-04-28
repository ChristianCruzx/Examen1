package Classes;

import java.util.List;

public abstract class OMS {//patron de diseno template
	private List<Paciente>  listPac;

	public OMS(List<Paciente>  listPac) {
		this.listPac=listPac;
	}
	protected abstract  boolean  isGamHospital();
	protected abstract  Hospital  getNombreHospital();
	
	
}
